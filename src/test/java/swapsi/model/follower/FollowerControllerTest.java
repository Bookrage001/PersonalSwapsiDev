package swapsi.model.follower;

import org.junit.Test;

public class FollowerControllerTest {

    @Test
    public void getMongoDB() {

    }

    @Test
    public void addFollowers() {
        FollowerController db = new FollowerController();
        System.out.println("Created DB");
        db.addFollower("AnewUser", "AnotherUser3");
    }

    @Test
    public void getFollower() {
        FollowerController db = new FollowerController();
        Follower follower = db.getFollower("AnewUser");
        System.out.println(follower.toString());
    }

    @Test
    public void update() {
    }
}