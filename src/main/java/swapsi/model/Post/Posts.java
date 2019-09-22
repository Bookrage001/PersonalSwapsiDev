/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package swapsi.model.Post;

import java.util.ArrayList;

/**
 *
 * @author Mark Galulu
 */
public class Posts {

    private ArrayList<Post> list = new ArrayList<>();

    public Posts() {
        super();
    }

    public ArrayList<Post> getList() {
        return list;
    }
    
    /**
     * add post in the list     
     */     
    public void addPost(Post post) {
        if (getUser(post.getUSER_ID()) != null) {
            list.add(post);
        }
    }

    /**
     * get userid to get post from user
     */
    public Post getUser(String USER_ID) {
        for (Post post : list) {
            if (post.getUSER_ID().equals(USER_ID)) {
                return post;
            }
        }
        return null;
    }

    /**
     * gets a specific Post with post_id
     */
    public ArrayList<Post> getMatches(int post_id) {
        ArrayList<Post> matches = new ArrayList<>();
        for (Post post : list) {
            if (post.getPOST_ID() == post_id) {
                matches.add(post);
            }
        }
        return matches;
    }

}