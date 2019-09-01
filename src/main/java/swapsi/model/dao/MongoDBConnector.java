/*
 * Author: Georges Bou Ghantous
 *
 * This class provides the methods to establish connection between ASD-Demo-app
 * and MongoDBLab cloud Database. The data is saved dynamically on mLab cloud database as
 * as JSON format.
 */
// package asd.demo.model.dao;
package swapsi.model.dao;

import swapsi.model.*;
import java.net.UnknownHostException;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.*;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

public class MongoDBConnector {

    private List<Document> users = new ArrayList();
    private String owner;
    private String password;
    private String url = "@ds163517.mlab.com:63517/heroku_pfsd0sj5";
    private String collection = "Users";
    // mongodb://<dbuser>:<dbpassword>@ds163517.mlab.com:63517/heroku_pfsd0sj5

    public MongoDatabase getMongoDB() {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        MongoDatabase db;
        try (MongoClient client = new MongoClient(uri)) {
            db = client.getDatabase(uri.getDatabase());
        }
        return db;
    }

    public MongoDBConnector(String owner, String password) throws UnknownHostException {
        this.owner = owner;
        this.password = password;
    }

    public void showall(Users users) {
        for (User u : users.getList()) {
            System.out.println(u.getUsername());
        }
    }

    //newww
    public void add(User user) {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        try (MongoClient client = new MongoClient(uri)) {
            MongoDatabase db = client.getDatabase(uri.getDatabase());
            users.add(new Document("Id", user.getId()).append("Username", user.getUsername())
                    .append("FirstName", user.getFirstName()).append("Lastname", user.getLastName())
                    .append("Email", user.getEmail()).append("Password", user.getPassword())
                    .append("DOB", user.getDOB()).append("location", user.getLocation()));
            MongoCollection<Document> userlist = db.getCollection(collection); // Create a collection
            userlist.insertMany(users);
        }
    }

    public void showUsers() {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        try (MongoClient client = new MongoClient(uri)) {
            MongoDatabase db = client.getDatabase(uri.getDatabase());
            MongoCollection<Document> userlist = db.getCollection(collection);
            try (MongoCursor<Document> cursor = userlist.find().iterator()) {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            }
        }
    }

    public Users loadUsers() {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        Users users;
        try (MongoClient client = new MongoClient(uri)) {
            MongoDatabase db = client.getDatabase(uri.getDatabase());
            users = new Users();
            MongoCollection<Document> userlist = db.getCollection(collection);
            for (Document doc : userlist.find()) {
                User user = new User((String) doc.get("Id"), (String) doc.get("Username"), (String) doc.get("FirstName"),
                        (String) doc.get("LastName"), (String) doc.get("Email"), (String) doc.get("Password"),
                        (String) doc.get("DOB"), (String) doc.get("location"));
                users.addUser(user);
            }
        }
        return users;
    }

    public User user(String email, String password) {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        User user;
        try (MongoClient client = new MongoClient(uri)) {
            MongoDatabase db = client.getDatabase(uri.getDatabase());
            MongoCollection<Document> userlist = db.getCollection(collection);
            Document doc = userlist.find(and(eq("Username", email), eq("Password", password))).first();
            user = new User((String) doc.get("Id"), (String) doc.get("Username"), (String) doc.get("FirstName"),
                    (String) doc.get("LastName"), (String) doc.get("Email"), (String) doc.get("Password"),
                    (String) doc.get("DOB"), (String) doc.get("location"));
        }
        return user;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }
}
