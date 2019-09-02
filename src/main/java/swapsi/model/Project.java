package swapsi.model;

import java.io.Serializable;

public class Project implements Serializable {

    private int project_id;
    private int user_id;
    private String name;
    private String tag;
    private String description;

    public Project() {

    }

    public Project(int project_id, int user_id, String name, String tag, String description) {
        this.project_id = project_id;
        this.user_id = user_id;
        this.name = name;
        this.tag = tag;
        this.description = description;
    }

    public int getProject_id() {
        return this.project_id;
    }

    public void setProject_id(int project_id) {
        this.project_id = project_id;
    }

    public int getUser_id() {
        return this.user_id;
    }

    public void setId(int user_id) {
        this.user_id = user_id;
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
