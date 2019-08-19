package swapsi.model;

import java.io.Serializable;

public class Project implements Serializable {

    private String projectID;
    private int userID;
    private String name;
    private String tag;
    private String description;

    public Project() {

    }

    public Project(String projectID, int userID, String name, String tag, String description) {
        this.projectID = projectID;
        this.userID = userID;
        this.name = name;
        this.tag = tag;
        this.description = description;
    }

    public String getProjectID() {
        return this.projectID;
    }

    public void setProjectID() {
        this.projectID = projectID;
    }

    public int getUserID() {
        return this.userID;
    }

    public void setID() {
        this.userID = userID;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTag() {
        return this.tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getDescription() {
        return this.description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
