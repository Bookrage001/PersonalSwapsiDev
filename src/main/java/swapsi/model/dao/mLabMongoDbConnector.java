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
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;
import org.bson.Document;
import com.mongodb.client.MongoCollection;
import java.net.UnknownHostException;

public class mLabMongoDbConnector {
    private String url = "@ds163517.mlab.com:63517/heroku_pfsd0sj5";
    // private String collection = "Users";
    protected String owner;
    protected String password;

    protected MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);

    public MongoDatabase getMongoDB() {
        MongoDatabase db;
        try (MongoClient client = new MongoClient(this.uri)) {
            db = client.getDatabase(uri.getDatabase());
        }
        return db;
    }

}