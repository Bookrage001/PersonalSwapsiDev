package swapsi.model.dao;

import org.junit.Test;

import static org.junit.Assert.*;

public class FollowerDbConnectorTest {

    @Test
    public void getMongoDB() {

    }

    @Test
    public void addFollowers() {
        FollowerDbConnector db = new FollowerDbConnector();
        db.addFollower("AUser", "AnotherUser");

    }

    @Test
    public void getFollower() {
    }

    @Test
    public void update() {
    }
}