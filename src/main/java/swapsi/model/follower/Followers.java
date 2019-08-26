
package swapsi.model.follower;

import java.io.Serializable;
import java.util.ArrayList;

public class Followers implements Serializable {

    // add follower
//        Add user to follower list
    // remove follower

    private ArrayList<Follower> list = new ArrayList<>();

    public Followers() {

    }

    public ArrayList<Follower> getList() {
        return list;
    }

    private void addUser(Follower user) {
        list.add(user);
    }

    public void removeUser(Follower user) {
        list.remove(user);
    }

    public Follower getUser(String Id) {
        for (Follower follower : list) {
            if (follower.getuser_id().equals(Id)) {
                return follower;
            }
        }
        return null;
    }

    public void addFollower(String user_Id, String follower_Id) {
        if (getUser(user_Id) == null) {
            Follower f = new Follower(user_Id);
            f.addFollower(follower_Id);
            addUser(f);
        } else {
            getUser(user_Id).addFollower(follower_Id);
        }
    }
}