package swapsi.asd.student.uts.edu.au.swapsi.model;

import java.io.Serializable;
import java.util.*;

public class Followers implements Serializable {

    private ArrayList<Follower> Followers = new ArrayList<Follower>();

    public Followers() {
    }

    public ArrayList<Integer> getFollowers(int userId) {
        for (Follower follower : Followers) {
            if (follower.getUserId() == userId) {
                return follower.getFolowers();
            }
        }
        return null;
    }

}
