package swapsi.model.follower;

import java.io.Serializable;
import java.util.*;

public class Follower implements Serializable {

    private int user_id;
    private ArrayList<Integer> followers = new ArrayList<Integer>();

    public Follower() {
    }

    public Follower(int user_id, ArrayList<Integer> followers) {
        this.user_id = user_id;
        this.followers = followers;
    }

    public Follower(int user_id, int followerId) {
        this.user_id = user_id;
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

    public int getuser_id() {
        return user_id;
    }

}
