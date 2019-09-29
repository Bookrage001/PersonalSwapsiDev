/* @author Mark Galulu
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swapsi.model.Post;

import java.util.*;
import org.bson.Document;
import swapsi.model.dao.mLabMongoDbConnector;

/**
 *
 * @author Mark Galulu
 */
public class PostController {

    private List<Document> data = new ArrayList<Document>();
    private Posts posts = new Posts();
    private String collectionName = "POST";
    private mLabMongoDbConnector connection;

    /**
     * Initialise the connection between controller to mongoDB connector
     */
    public PostController() {
        connection = new mLabMongoDbConnector(this.collectionName);
    }

    /**
     * Method that adds Posts to the database
     */
    public void addPost(int POST_ID, String POST_TEXT, int POST_COMMENT_NUM, int POST_LIKE_NUM, String POST_PRIVACY,
            String USER_ID) {
        // Constants are set for a new post as a default
        POST_COMMENT_NUM = 0;
        POST_LIKE_NUM = 0;
        POST_PRIVACY = "";

        Post newPost = new Post(POST_ID, POST_TEXT, POST_COMMENT_NUM, POST_LIKE_NUM, POST_PRIVACY, USER_ID);
        posts.addPost(newPost);

        Document post = new Document("POST_ID", newPost.getPOST_ID()).append("USER_ID", newPost.getUSER_ID())
                .append("Text", newPost.getPOST_TEXT()).append("Privacy", newPost.getPOST_PRIVACY());

        Document postRes = new Document("Comment num", newPost.getPOST_COMMENT_NUM()).append("Like num",
                newPost.getPOST_LIKE_NUM());

        post.put("Response", postRes);

        data.add(post);
        connection.add(post);
    }

    /**
     * Method that retrieves Posts of a specific user in the database
     */
    public Iterator retrievePost() {
        Document query = new Document();
        Iterator it = connection.view(query).iterator();
        return it;
    }

    /**
     * Method that updates a specific post
     * 
     * @param POST_ID
     * @param POST_TEXT
     */
    public void updatePost(int POST_ID, String POST_TEXT) {
        Document filter = new Document("POST_ID", POST_ID);

        Document newValue = new Document();
        newValue.append("Text", POST_TEXT);

        Document updateDoc = new Document();
        updateDoc.append("$set", newValue);

        connection.update(filter, updateDoc);
    }

    /**
     * Creates iteration to get specific post
     * 
     * @param POST_ID
     * @return
     */
    public Iterator getPost(int POST_ID) {
        Document query = new Document("POST_ID", POST_ID);
        Iterator it = connection.view(query).iterator();
        return it;
    }

    public void deletePost(int POST_ID) {
        Document filter = new Document("POST_ID", POST_ID);
        connection.delete(filter);
    }
}