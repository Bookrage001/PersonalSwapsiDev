/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package swapsi.model.Post;

import java.io.Serializable;

/**
 *
 * @author Mark Galulu
 */
public class Post implements Serializable {

    private int POST_ID;
    private String POST_TEXT;
    private int POST_COMMENT_NUM;
    private int POST_LIKE_NUM;
    private String POST_PHOTO;
    private String POST_PRIVACY;
    private String USER_ID;

    public Post() {
        super();
    }

    public Post(int POST_ID, String POST_TEXT, int POST_COMMENT_NUM, int POST_LIKE_NUM, String POST_PRIVACY,
            String USER_ID) {
        this.POST_ID = POST_ID;
        this.POST_TEXT = POST_TEXT;
        this.POST_COMMENT_NUM = POST_COMMENT_NUM;
        this.POST_LIKE_NUM = POST_LIKE_NUM;
        this.POST_PRIVACY = POST_PRIVACY;
        this.USER_ID = USER_ID;
    }

    public int getPOST_ID() {
        return POST_ID;
    }

    public void setPOST_ID(int POST_ID) {
        this.POST_ID = POST_ID;
    }

    public String getPOST_TEXT() {
        return POST_TEXT;
    }

    public void setPOST_TEXT(String POST_TEXT) {
        this.POST_TEXT = POST_TEXT;
    }

    public int getPOST_COMMENT_NUM() {
        return POST_COMMENT_NUM;
    }

    public void setPOST_COMMENT_NUM(int POST_COMMENT_NUM) {
        this.POST_COMMENT_NUM = POST_COMMENT_NUM;
    }

    public int getPOST_LIKE_NUM() {
        return POST_LIKE_NUM;
    }

    public void setPOST_LIKE_NUM(int POST_LIKE_NUM) {
        this.POST_LIKE_NUM = POST_LIKE_NUM;
    }

    public String getPOST_PHOTO() {
        return POST_PHOTO;
    }

    public void setPOST_PHOTO(String POST_PHOTO) {
        this.POST_PHOTO = POST_PHOTO;
    }

    public String getPOST_PRIVACY() {
        return POST_PRIVACY;
    }

    public void setPOST_PRIVACY(String POST_PRIVACY) {
        this.POST_PRIVACY = POST_PRIVACY;
    }

    public String getUSER_ID() {
        return USER_ID;
    }

    public void setUSER_ID(String USER_ID) {
        this.USER_ID = USER_ID;
    }

}