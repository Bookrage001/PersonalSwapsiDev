package swapsi.model.follower;

import java.io.Serializable;
import java.util.*;

public class Follower implements Serializable {

    private String user_id;
    private ArrayList<String> followers = new ArrayList<String>();

    public Follower(String user_id) {
        this.user_id = user_id;
    }

    public Follower(String user_id, ArrayList<String> followers) {
        this.user_id = user_id;
        this.followers = followers;
    }

    public Follower(String user_id, String followerId) {
        this.user_id = user_id;
        this.followers.add(followerId);
    }

    public ArrayList<String> getFolowers() {
        return followers;
    }

    public void addFollower(String uid) {
        followers.add(uid);
    }

    public void removeFollower(int uid) {
        followers.remove(uid);
    }

    public String getuser_id() {
        return this.user_id;
    }
    public ArrayList<String> getFollowers_id() {
        return followers;
    }

}
