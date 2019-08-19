package swapsi.model;

import java.io.Serializable;
import java.util.*;

public class Follower implements Serializable {

    private int userId;
    private ArrayList<Integer> followers = new ArrayList<Integer>();

    public Follower() {
    }

    public Follower(int userId, ArrayList<Integer> followers) {
        this.userId = userId;
        this.followers = followers;
    }

    public Follower(int userId, int followerId) {
        this.userId = userId;
        this.followers.add(followerId);
    }

    public ArrayList<Integer> getFolowers() {
        return followers;
    }

    public void addFollower(int uid) {
        followers.add(uid);
    }

    public void removeFollower(int uid) {
        followers.remove(uid);
    }

    public int getUserId() {
        return userId;
    }

}
