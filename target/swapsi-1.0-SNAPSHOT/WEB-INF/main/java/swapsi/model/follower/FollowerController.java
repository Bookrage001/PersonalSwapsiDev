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

import org.bson.Document;
import swapsi.model.dao.mLabMongoDbConnector;

//import javax.print.Doc;

public class FollowerController {

    private List<Document> data = new ArrayList<Document>();
    private Followers followers = new Followers();
    private String collectionName = "Followers";
    private mLabMongoDbConnector connection;

    /**
     * Initiates the DB connection.
     */
    public FollowerController() {
        connection = new mLabMongoDbConnector(this.collectionName);
    }

    /**
     * The class used by external classes to add/create a follower to a user
     * @param user_Id
     * @param follower_Id
     */
    public void addFollower(String user_Id, String follower_Id) {
        Follower couple = new Follower(user_Id, follower_Id);
        followers.addUser(couple);
        // If the user exists already add the follower to an existing follower
         Follower existing  = getFollower(user_Id);
        if (getFollower(user_Id)  != null) {
//        addDoc();
        } else {
            // If the user does not have a followers list then create it
            createFollower(couple);
        }

    }

    /**
     * The class used by this controller to add a follower to an existing follower list.
     * @param follower
     */
    private void updateFollower(Follower follower) {

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
     * Will get the Follower from the DB
     * @param user_Id UniqueId - Search key
     * @return Follower
     */
    public Follower getFollower(String user_Id) {
        Document query = new Document();
        Document order = new Document();
//        connection.get(query, order);
        return null;
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