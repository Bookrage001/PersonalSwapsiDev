package swapsi.asd.student.uts.edu.au.swapsi.model;

import java.io.Serializable;

public class Project implements Serializable{

    private String name;
    private String tag;
    private String description;


    public Project() {
    
    }

    public Project(String name, String tag, String description) {
        this.name = name;
        this.tag = tag;
        this.description= description;
    }

    
    public String getName() {
        return name;
    }
}

