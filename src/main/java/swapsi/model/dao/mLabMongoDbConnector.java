/*
 * Author: Caleb Ardern
 *
 * This class provides the methods to establish a connection between swapsi  
 * and the mlab MongoDBLab cloud Database. The data is saved dynamically on mLab cloud database as
 * as JSON format.
 */

package swapsi.model.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientException;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

import com.mongodb.util.JSON;
import org.bson.Document;
import com.mongodb.client.MongoCollection;

public class mLabMongoDbConnector {
    private String dbName = "heroku_pfsd0sj5";
    private String dbUrl = "ds163517.mlab.com:63517" + "/" + this.dbName;
    protected String owner;
    protected String password;
    protected String collection;
    private String url;


    public mLabMongoDbConnector(String collection) {
        this.owner = System.getenv("ADMINEMAIL");;
        System.out.println(System.getenv("ADMINEMAIL"));
        this.password = System.getenv("ADMINPASSWORD");
        this.collection = collection;
        url = "mongodb://" + this.owner + ":" + this.password + "@" + this.dbUrl;
    }

    public MongoCollection<Document> collection() {
        System.out.println("Getting Mongo DB");
        System.out.println(this.toString());
        MongoClient mongoClient = new MongoClient(new MongoClientURI(url));
        MongoDatabase db = mongoClient.getDatabase(this.dbName);
        MongoCollection<Document> collectionDoc = db.getCollection(this.collection);
        return collectionDoc;
    }

    public void add(Document document) {
        MongoCollection<Document> collection = collection();
        System.out.println(JSON.serialize(document));
        collection.insertOne(document);
    }

    /**
     *
     * @param query
     * @param order
     */
    public Document get(Document query, Document order) {
        MongoCollection<Document> collection = collection();

        MongoCursor<Document> cursor = collection.find(query).sort(order).iterator();

        Document retrunData = new Document();
        int x = 0;
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                retrunData.append( x + "" , doc);
                x++;
            }
        } finally {
            cursor.close();
        }
        return retrunData;
    }

    @Override
    public String toString(){
        String passwordstatus;
        if (this.password == null) {
            passwordstatus = "No password Provided";
        } else {
            passwordstatus = "Password Hidden";
        }
        return "Owner: " + this.owner + " Password: " + passwordstatus
                + " Collection: " + this.collection + "\n"
                + this.dbUrl;
    }

}