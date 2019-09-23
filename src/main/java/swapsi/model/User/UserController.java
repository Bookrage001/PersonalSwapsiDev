/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapsi.model.User;

import java.util.*;
import org.bson.Document;
import swapsi.model.dao.mLabMongoDbConnector;

/**
 *
 * @author Hayley
 */
public class UserController {

    private List<Document> data = new ArrayList<Document>();
    private Users users = new Users();
    private String collectionName = "USERS";
    private mLabMongoDbConnector connection;

    public UserController() {
        connection = new mLabMongoDbConnector(this.collectionName);
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
      
        data.add(user);
        connection.add(user);

    }
    
    /**
     * Method that deletes Users from the database
     * @param USERNAME
     */
    
    public void deleteUser(String USERNAME){        
        Document remove = new Document ("USERNAME", USERNAME);
        connection.delete(remove);        
    }
}
