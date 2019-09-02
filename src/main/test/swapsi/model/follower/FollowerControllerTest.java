package swapsi.model.follower;

import org.junit.Test;

public class FollowerControllerTest {

    @Test
    public void getMongoDB() {

    }

    @Test
    public void addFollowers() {
        FollowerController db = new FollowerController();
        db.addFollower("AnewUser", "AnotherUser");
    }

    @Test
    public void getFollower() {
    }

    @Test
    public void update() {
    }
}