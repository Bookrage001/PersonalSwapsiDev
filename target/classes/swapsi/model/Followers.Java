package swapsi.asd.student.uts.edu.au.swapsi.model;

import java.io.Serializable;

public class Followers  implements Serializable{

    private ArrayList<User> list = new ArrayList<>();

    public Users() {
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

    public void unfollow(String email) {
        User user = getUser(email);
        if (user != null) {
            removeUser(user);
        } else {
            System.out.println("User Doesn't exist!");
        }
    }
}