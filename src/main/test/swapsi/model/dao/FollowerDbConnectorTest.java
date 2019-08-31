package swapsi.model.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class FollowerDbConnectorTest {

    @Test
    public void getMongoDB() {

    }

    @Test
    public void addFollower() {
        FollowerDbConnector db = new FollowerDbConnector("swapsiAdmin", "TJVv58JmWmdPTX5jaM5T5RwXyp7n7xQAd8U2wGt");
        db.addFollower("User1", "User2");

    }

    @Test
    public void getFollower() {
    }

    @Test
    public void update() {
    }
}