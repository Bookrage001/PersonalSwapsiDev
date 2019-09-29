package swapsi.model.dao;

import com.mongodb.*;
import com.mongodb.client.FindIterable;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

import com.mongodb.util.JSON;
import org.bson.Document;
import com.mongodb.client.*;

public class mLabMongoDbConnector {
    private String dbName = "heroku_pfsd0sj5";
    private String dbUrl = "ds163517.mlab.com:63517" + "/" + this.dbName;
    protected String owner;
    protected String password;
    protected String collectionName;
    protected String collection;
    private String url;

    public mLabMongoDbConnector(String collectionName) {
        // this.owner = System.getenv("ADMINEMAIL");
        System.out.println(System.getenv("ADMINEMAIL"));
        // this.password = System.getenv("ADMINPASSWORD");
        this.owner = "swapsiAdmin";
        this.password = "TJVv58JmWmdPTX5jaM5T5RwXyp7n7xQAd8U2wGt";
        this.collectionName = collectionName;
        url = "mongodb://" + this.owner + ":" + this.password + "@" + this.dbUrl;
    }

    /**
     * Initiate the conection to the db and returns the collection
     * 
     * @return MongoDB Collection
     */
    public MongoCollection<Document> collection() {
        System.out.println("Fetching MongoDB");
        System.out.println(this.toString());

        MongoClient mongoClient = new MongoClient(new MongoClientURI(url));
        MongoDatabase db = mongoClient.getDatabase(this.dbName);
        MongoCollection<Document> collectionDoc = db.getCollection(this.collectionName);
        return collectionDoc;
    }

    /**
     * Adds a single item to the collection.
     * 
     * @param document
     */
    public void add(Document document) {
        MongoCollection<Document> collection = collection();
        System.out.println("Adding following document to " + collectionName);
        System.out.println(JSON.serialize(document));
        collection.insertOne(document);
    }

    public void delete(Document document) {
        MongoCollection<Document> collection = collection();
        collection.deleteOne(document);
    }

    /**
     * gets items from the collection depending on the provided parameters
     * 
     * @param query
     */
    public BasicDBObject get(Document query) {
        MongoCollection<Document> collection = collection();
        MongoCursor<Document> cursor = collection.find(query).iterator();

        BasicDBObject retrunData = new BasicDBObject();
        int x = 0;
        try {
            while (cursor.hasNext()) {
                Document doc = cursor.next();
                retrunData.put(x + "", doc);
                x++;
            }
        } finally {
            cursor.close();
        }
        return retrunData;
    }

    /**
     * Update a single document in the collection
     * 
     * @param old
     * @param replace
     */
    public void update(Document old, Document replace) {
        MongoCollection<Document> collection = collection();
        collection.updateOne(old, replace);
    }

    public void replace(Document search, Document replace) {
        MongoCollection<Document> collection = collection();
        collection.replaceOne(search, replace);
    }

    /**
     * Established Connection and collecting all document
     * 
     * @param document
     * @return
     */
    public FindIterable<Document> view(Document document) {
        MongoCollection<Document> collection = collection();
        FindIterable<Document> iterDoc = collection.find(document);

        return iterDoc;
    }

    /**
     * Some useful information about how this class is running.
     * 
     * @return
     */
    @Override
    public String toString() {
        String passwordstatus;
        if (this.password == null) {
            passwordstatus = "No password Provided";
        } else {
            passwordstatus = "Password Hidden";
        }
        return "Owner: " + this.owner + " Password: " + passwordstatus + " Collection: " + this.collectionName + "\n"
                + this.dbUrl;
    }
}