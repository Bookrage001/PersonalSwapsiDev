/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapsi.model.User;

import java.io.Serializable;
import java.util.*;

/**
 *
 * @author Hayley
 */

public class Users implements Serializable{
   
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
    
}
