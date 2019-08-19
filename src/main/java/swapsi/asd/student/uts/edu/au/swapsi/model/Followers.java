package swapsi.asd.student.uts.edu.au.swapsi.model;

import java.io.Serializable;
import java.util.ArrayList;

public class Followers  implements Serializable{

    private ArrayList<User> list = new ArrayList<>();

    public Followers() {
    }

    public ArrayList<User> getList() {
        return list;
    }

    public void addUser(User user) {
        list.add(user);
    }

    public void removeUser(User user) {
        list.remove(user);
    }

}
