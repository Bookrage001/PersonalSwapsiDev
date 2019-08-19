/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapsi.model.dao;

import java.net.UnknownHostException;
import com.mongodb.client.MongoCollection;
import org.bson.Document;
import java.util.*;
import swapsi.model.*;
import com.mongodb.MongoClient;
import com.mongodb.MongoClientURI;
import com.mongodb.client.MongoCursor;
import com.mongodb.client.MongoDatabase;
import static com.mongodb.client.model.Filters.and;
import static com.mongodb.client.model.Filters.eq;

public class MongoDBConnector2 {

    private List<Document> showcase = new ArrayList();
    private String owner;
    private String password;
    private String url = "@ds163517.mlab.com:63517/heroku_pfsd0sj5";
    private String collection = "Showcase";
    // mongodb://<dbuser>:<dbpassword>@ds163517.mlab.com:63517/heroku_pfsd0sj5

    public MongoDatabase getMongoDB() {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        MongoDatabase db;
        try (MongoClient client = new MongoClient(uri)) {
            db = client.getDatabase(uri.getDatabase());
        }
        return db;
    }

    public MongoDBConnector2(String owner, String password) throws UnknownHostException {
        this.owner = owner;
        this.password = password;
    }

    public void showall(Showcase showcase) {
        for (Showcase s : showcase.getList()) {
            System.out.println(s.getproject_id());
        }
    }

    public void add(Showcase showcase) {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        try (MongoClient client = new MongoClient(uri)) {
            MongoDatabase db = client.getDatabase(uri.getDatabase());
            showcase.add(new Document("project_id", showcase.getproject_id()));
            MongoCollection<Document> showcaselist = db.getCollection(collection); // Create a collection
            showcaselist.insertMany((List<? extends Document>) showcase);
        }
    }

    public void showShowcase() {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        try (MongoClient client = new MongoClient(uri)) {
            MongoDatabase db = client.getDatabase(uri.getDatabase());
            MongoCollection<Document> showcaselist = db.getCollection(collection);
            try (MongoCursor<Document> cursor = showcaselist.find().iterator()) {
                while (cursor.hasNext()) {
                    System.out.println(cursor.next().toJson());
                }
            }
        }
    }

    public Showcase loadShowcases() {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        Showcase projects;
        try (MongoClient client = new MongoClient(uri)) {
            MongoDatabase db = client.getDatabase(uri.getDatabase());
            Showcases showcases = new Showcases();
            MongoCollection<Document> showcaselist = db.getCollection(collection);
            for (Document doc : showcaselist.find()) {
                Showcase showcase = new Showcase((String) doc.get("project_id"), (int) doc.get("user_id"),
                        (String) doc.get("Name"), (String) doc.get("Tag"), (String) doc.get("Description"));
                showcases.add(showcase);
            }
        }
        Showcase showcases = null;
        return showcases;
    }

    public Showcase showcase(String project_id, String name) {
        MongoClientURI uri = new MongoClientURI("mongodb://" + this.owner + ":" + this.password + this.url);
        User user;
        try (MongoClient client = new MongoClient(uri)) {
            MongoDatabase db = client.getDatabase(uri.getDatabase());
            MongoCollection<Document> showcaselist = db.getCollection(collection);
            Document doc = showcaselist.find(and(eq("project_id", project_id), eq("Name", name))).first();
            showcase = (List<Document>) new Showcase((String) doc.get("project_id"), (int) doc.get("user_id"),
                    (String) doc.get("Name"), (String) doc.get("Tag"), (String) doc.get("Description"));
        }
        return (Showcase) showcase;
    }

    public int add(int a, int b) {
        return a + b;
    }

    public int subtract(int a, int b) {
        return a - b;
    }

    private static class Showcases {

        public Showcases() {
        }

        private void add(Showcase showcase) {
            throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods,
                                                                           // choose Tools | Templates.
        }
    }

    private static class project {

        private static Object getproject_id() {
            throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods,
                                                                           // choose Tools | Templates.
        }

        public project() {
        }
    }
}
