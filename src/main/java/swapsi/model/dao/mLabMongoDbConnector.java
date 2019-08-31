/*
 * Author: Caleb Ardern
 *
 * This class provides the methods to establish a connection between swapsi  
 * and the mlab MongoDBLab cloud Database. The data is saved dynamically on mLab cloud database as
 * as JSON format.
 */

package swapsi.model.dao;

import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.MongoCredential;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import java.net.UnknownHostException;

public class mLabMongoDbConnector {
    private String dbUrl = "ds163517.mlab.com:63517/heroku_pfsd0sj5";
    // private String collection = "Users";
    protected String owner = "swapsiAdmin";
    protected String password = "TJVv58JmWmdPTX5jaM5T5RwXyp7n7xQAd8U2wGt";

//    protected MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + "@"+  this.url);


    String url = "mongodb://" + this.owner + ":" + this.password + "@" + this.dbUrl;


    public MongoDatabase getMongoDB(String DB_Name) {
        System.out.println("gettingMongoDb");
        MongoClient mongoClient = new MongoClient(new MongoClientURI(url));
        MongoDatabase db = mongoClient.getDatabase(DB_Name);
        System.out.println(db.listCollections().toString());
        System.out.println("List should be above");
        return db;
    }

}