/*@author Mark Galulu
 * To change this license header, author Mark Galulu choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swapsi.model.dao;

import com.mongodb.*;
import com.mongodb.client.*;
import com.mongodb.util.JSON;
import org.bson.Document;


/**
 * 
 * @author Mark Galulu
 */
public class SwapsiMongoDBConnector {

    private String dbName = "heroku_pfsd0sj5";
    private String dbUrl = "ds163517.mlab.com:63517" + "/" + this.dbName;
    protected String owner;
    protected String password;
    protected String collection;
    private String url;

    public SwapsiMongoDBConnector(String collection) {
        this.collection = collection;
        url = "mongodb://AdminMark:swapsi1@" + this.dbUrl;
    }
    
    /**
     * Initiate the connection to the db and returns the collection
     * @return MongoDB Collection
     */
    public MongoCollection<Document> collection(){
        System.out.println("Fetching MongoDB");
        System.out.println(this.toString());
        
        MongoClient mongoClient = new MongoClient(new MongoClientURI(url));
        MongoDatabase db = mongoClient.getDatabase(this.dbName);
        
        MongoCollection<Document> collectionDoc = db.getCollection(this.collection);
        return collectionDoc;
    }
    
    /**
     * Adds a single item to the collection.
     * @param document
     */
    public void add(Document document) {
        MongoCollection<Document> collection = collection();
        System.out.println(JSON.serialize(document));
        collection.insertOne(document);
    }
    
    /**
     * Established Connection and collecting all document 
     * @param document
     * @return 
     */
    public FindIterable<Document> view(Document document){
        MongoCollection<Document> collection = collection();
        FindIterable<Document> iterDoc = collection.find(document);
        
        return iterDoc;
    }
    
    /**
      * Update a single document in the collection
      * @param old
      * @param replace 
      */
     public void update(Document old, Document replace) {
        MongoCollection<Document> collection = collection();
        collection.updateOne(old, replace);
    }
     
     public void delete(Document document){
         MongoCollection<Document> collection = collection();
         collection.deleteOne(document);
     }
     
    /**
     * gets items from the collection depending on the provided parameters
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
                retrunData.put( x + "" , doc);
                x++;
            }
        } finally {
            cursor.close();
        }
        return retrunData;
    }
    
    /**
     * Some useful information about how this class is running.
     * @return
     */
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