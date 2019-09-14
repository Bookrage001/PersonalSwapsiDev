/*
 * Author: Caleb Ardern
 *
 * This class provides the methods to establish a connection between swapsi
 * and the mlab MongoDBLab cloud Database. The data is saved dynamically on mLab cloud database as
 * as JSON format.
 */

package swapsi.model.follower;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.mongodb.BasicDBObject;
import org.bson.Document;
import swapsi.model.dao.mLabMongoDbConnector;

//import javax.print.Doc;

public class FollowerController {

    private List<Document> data = new ArrayList<Document>();
    private Followers followers = new Followers();
    private String collectionName = "Followers";
    private mLabMongoDbConnector connection;
    private String user;

    /**
     * Initiates the DB connection.
     */
    public FollowerController() {
        connection = new mLabMongoDbConnector(this.collectionName);
    } public FollowerController( String user) {
        connection = new mLabMongoDbConnector(this.collectionName);
        this.user = user;
    }

    /**
     * The class used by external classes to add/create a follower to a user
     * @param user_Id
     * @param follower_Id
     */
    public void addFollower(String follower_Id) {
        System.out.println("Adding Follower");
        /**
         * Security check
         * Make sure that it is this user that is adding followers
         */
        if(this.user != null) {
            Follower couple = new Follower(this.user, follower_Id);
            followers.addUser(couple);
            // If the user exists already add the follower to an existing follower
            Follower existing  = getFollower(this.user);
            if (existing  != null) {
                System.out.println("There is an existing follower Add new follower");
                updateFollower(existing, follower_Id);
            } else {
                System.out.println("There is no existing follower Create one");
                // If the user does not have a followers list then create it
                createFollower(couple);
            }
        } else {
            return;
        }

    }

    /**
     * The class used by this controller to add a follower to an existing follower list.
     * @param follower
     */
    private void updateFollower(Follower follower , String user_Id) {
        follower.addFollower(user_Id);
        Document find = new Document("user_Id", follower.getuser_id());
        Document doc = new Document(this.parseFollower(follower));
        connection.update(find, doc );
    }

    /**
     * Creates a new user list with a follower in the DB
     * @param follower
     */
    private void createFollower(Follower follower) {
        Document doc = new Document("user_Id", follower.getuser_id()).append("Followers", follower.getFolowers());
        data.add(doc);
        connection.add(doc);
    }

    /**
     * Will get the Follower from the DB and return as a java Follower object
     * @param user_Id UniqueId - Search key
     * @return Follower
     */
    public Follower getFollower(String user_Id) {
        Document query = new Document("user_Id", user_Id);
        return this.parseFollower(connection.get(query));
    }
    public Follower getFollower() {
        System.out.println("Getting Follower");
        Document query = new Document("user_Id", this.user);
        return this.parseFollower(connection.get(query));
    }

    /**
     * Converts follower to a doc
     * @param follower
     * @return Document
     */
    private Document parseFollower(Follower follower){
        return new Document("user_Id", follower.getuser_id()).append("Followers", follower.getFolowers());
    }

    /**
     * Converts A document into a follower
     * @param doc
     * @return
     */
    private Follower parseFollower(BasicDBObject doc) {
        System.out.println("parseFollower");
        Map<String, Map> data = doc.toMap();
        if (!data.isEmpty()) {
            System.out.println((String) data.get("0").get("user_Id"));
            Follower follower = new Follower((String)data.get("0").get("user_Id"));
            ArrayList<String> users = new ArrayList<String>((ArrayList)data.get("0").get("Followers"));
            for (String user: users
            ) {
                follower.addFollower(user);
            }
        } else {
            Follower follower = new Follower();
        }
        return follower;

    }

    /**
     * Will list the followers that this user has.
     * @param user_Id
     * @return
     */
    public ArrayList<String> listUserFollower(String user_Id) {
        Follower following = getFollower(user_Id);
        return following.getFolowers();
    }
}