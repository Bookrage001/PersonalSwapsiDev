/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapsi.model.User;

import java.util.*;
import org.bson.Document;
import swapsi.model.dao.SwapsiMongoDBConnector;

/**
 *
 * @author Hayley
 */
public class UserController {

    private List<Document> data = new ArrayList<Document>();
    private Users users = new Users();
    private String collectionName = "USERS";
    private SwapsiMongoDBConnector connection;

    public UserController() {
        connection = new SwapsiMongoDBConnector(this.collectionName);
    }

    /**
     * Method that adds Users to the database
     */
    public void addUser(String USER_ID, String USERNAME, String FIRST_NAME, String LAST_NAME, String EMAIL, String PASSWORD, String DOB, String LOCATION) {

        User newUser = new User(USER_ID, USERNAME, FIRST_NAME, LAST_NAME, EMAIL, PASSWORD, DOB, LOCATION);
        users.addUser(newUser);

        Document user = new Document("USER_ID", newUser.getUSER_ID())
                .append("USERNAME", newUser.getUSERNAME())
                .append("FIRST_NAME", newUser.getFIRST_NAME())
                .append("LAST_NAME", newUser.getLAST_NAME())
                .append("EMAIL", newUser.getEMAIL())
                .append("PASSWORD", newUser.getPASSWORD())
                .append("DOB", newUser.getDOB())
                .append("LOCATION", newUser.getLOCATION());
//        
//        Post newPost = new Post(POST_ID, POST_TEXT, POST_COMMENT_NUM, POST_LIKE_NUM,  POST_PRIVACY, USER_ID);
//        posts.addPost(newPost);
//        
//        Document post = new Document("POST_ID", newPost.getPOST_ID())
//                            .append("USER_ID", newPost.getUSER_ID());
//        
//        Document postDesc = new Document("Text", newPost.getPOST_TEXT())
//                            .append("Privacy", newPost.getPOST_PRIVACY());
//        
//        Document postRes = new Document("Comment num", newPost.getPOST_COMMENT_NUM())
//                            .append("Like num", newPost.getPOST_LIKE_NUM());
//        
//        post.put("Details", postDesc);
//        post.put("Response", postRes);
//        
//    
        data.add(user);
        connection.add(user);

    }
}
