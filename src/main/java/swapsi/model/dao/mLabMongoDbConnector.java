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
import java.net.UnknownHostException;

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

    public void add(Document document) {
        System.out.println("Getting Mongo DB");
        System.out.println(this.toString());
        try (MongoClient mongoClient = new MongoClient(new MongoClientURI(url))) {
            MongoDatabase db = mongoClient.getDatabase(this.dbName);
            MongoCollection<Document> collectionDoc = db.getCollection(this.collection);
            System.out.println(JSON.serialize(document));
            collectionDoc.insertOne(document);
//            System.out.println(collection.;
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
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