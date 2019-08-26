/*
 * Author: Caleb Ardern
 *
 * This class provides the methods to establish a connection between swapsi  
 * and the mlab MongoDBLab cloud Database. The data is saved dynamically on mLab cloud database as
 * as JSON format.
 */

package swapsi.model.dao;

import java.util.ArrayList;
import java.util.List;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import swapsi.model.follower.Follower;

import javax.print.Doc;

public class FollowerDbConnector extends mLabMongoDbConnector {
    // This class inherits from mLabMongoDbConnector
    private List<Document> followers = new ArrayList<Document>();

    public FollowerDbConnector(String owner, String password) {
        this.owner = owner;
        this.password = password;

    }

    public MongoDatabase getMongoDB() {
        MongoDatabase db;
        try (MongoClient client = new MongoClient(this.uri)) {
            db = client.getDatabase(uri.getDatabase());
        }
        return db;
    }

    private void add(String user_Id, String follower_Id) {
        MongoDatabase db = getMongoDB();
        followers.add(new Document(
                "user_Id", user_Id).append("Followers", follower_Id));
        MongoCollection<Document> userlist = db.getCollection("SwapsiFollowers"); //Create a collection ASD-Demo-app-users on mLab
        ((MongoCollection) userlist).insertMany(followers);
    }
    public void addFollower(String user_Id, String follower_Id ) {

    }
    public Document getFollower(String user_Id) {

    }

    public void update() {

    }

}