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

public class FollowerDbConnector {
    // This class inherits from mLabMongoDbConnector
    private List<Document> followers = new ArrayList<Document>();
    private String collectionName = "Followers";
//    private MongoCollection<Document> db;
    private mLabMongoDbConnector connecton;

    public  FollowerDbConnector () {
        connecton = new mLabMongoDbConnector(this.collectionName);
    }


    private void add(String user_Id, String follower_Id) {

            followers.add(new Document( "user_Id", user_Id).append("Followers", follower_Id));
            Document doc = new Document("user_Id", user_Id).append("Followers", follower_Id);
            connecton.add(doc);
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