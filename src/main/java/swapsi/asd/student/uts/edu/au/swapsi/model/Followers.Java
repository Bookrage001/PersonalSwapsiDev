package swapsi.asd.student.uts.edu.au.swapsi.model;

import java.io.Serializable;
import java.util.*;

public class Followers implements Serializable {

    private ArrayList<Follower> followers = new ArrayList<Follower>();

    public Followers() {

    }

    public ArrayList<Follower> getFollowers(Follower follower) {
        return followers;
    }

    public void addFollower(int userId, int followerId) {
        for (Follower follower : followers) {
            if (follower.getUserId() == userId) {
                follower.addFollower(followerId);
                return;
            }
        }
        followers.add(new Follower(userId, followerId));
    }

    public

    public ArrayList<Integer> getFollowers(int userId) {
        for (Follower follower : followers) {
            if (follower.getUserId() == userId) {
                return follower.getFolowers();
            }
        }
        return null;
    }

}
