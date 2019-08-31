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

import com.mongodb.client.MongoCollection;
import com.mongodb.client.MongoDatabase;
import org.bson.Document;
import swapsi.model.follower.Follower;

//import javax.print.Doc;

public class FollowerDbConnector extends mLabMongoDbConnector {
    // This class inherits from mLabMongoDbConnector
    private List<Document> followers = new ArrayList<Document>();

    public FollowerDbConnector(String owner, String password) {
        this.owner = owner;
        this.password = password;
        System.out.println("UserName and password added");
    }

//    public MongoDatabase getMongoDB() {
//        MongoDatabase db;
//        try (MongoClient client = new MongoClient(this.uri)) {
//            db = client.getDatabase(uri.getDatabase());
//        }
//        return db;
//    }

    private void add(String user_Id, String follower_Id) {
        MongoDatabase db = getMongoDB("heroku_pfsd0sj5");
        MongoCollection<Document> collection = db.getCollection("Followers");

//        System.out.println();
//        followers.add(new Document( "user_Id", user_Id).append("Followers", follower_Id));
        followers.add(new Document( "user_Id", user_Id).append("Followers", follower_Id));
        Document doc = new Document("user_Id", user_Id).append("Followers", follower_Id);
        collection.insertOne(doc);
//        MongoCollection<Document> userlist = db.getCollection("Followers"); //Create a collection ASD-Demo-app-users on mLab
//        ((MongoCollection) userlist).insertMany(followers);
    }
    public void addFollower(String user_Id, String follower_Id ) {
        add(user_Id, follower_Id);
    }
    public Document getFollower(String user_Id) {
        return null;
    }

    public void update() {

    }

}