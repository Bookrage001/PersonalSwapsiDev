/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package asd.SWAPSI.model;

import java.util.ArrayList;

/**
 *
 * @author Mark Galulu
 */
public class Posts {

    
    private ArrayList<Post> list = new ArrayList<>();

    private Posts(){
        super();
    }

    public ArrayList<Post> getList() {
        return list;
    }

    public void createPost(Post post){
        list.add(post);
    }
    
    public void deletePost(Post post){
        list.remove(post);
    }
    
    public Post fetchPost(int post_id, int user_id){
        for(Post post : list){
            if(post.getPOST_ID() == post_id && post.getUSER_ID().equals(user_id)){
                return post;
            }
        }
        return null;
    }
    
}
