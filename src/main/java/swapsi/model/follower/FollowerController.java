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
//        addDoc();

        // If the user does not have a followers list then create it
        createFollower(couple);
    }

    /**
     * The class used by this controller to add a follower to an existing follower list.
     * @param follower
     */
    private void addDoc(Follower follower) {

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
     * @param user_Id
     * @return
     */
    public Follower getFollower(String user_Id) {
        return null;
    }
}