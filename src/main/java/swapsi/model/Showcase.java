package swapsi.model;

import java.io.Serializable;
import java.util.*;
import org.bson.Document;

public class Showcase implements Serializable {

    private ArrayList<Showcase> list = new ArrayList<>();
    private String projectID;

    public Showcase() {
    }

    public Showcase(String string, int i, String string0, String string1, String string2) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

    public ArrayList<Showcase> getList() {
        return list;
    }

    public void addProject(Showcase project) {
        list.add(project);
    }

    public void removeProject(Showcase project) {
        list.remove(project);
    }

    public Showcase getProject(String projectID) {
        for (Showcase project : list) {
            if (project.getProjectID().equals(projectID)) {
                return project;
            }
        }
        return null;
    }

    public ArrayList<Showcase> getMatches(String projectID) {
        ArrayList<Showcase> matches = new ArrayList<>();
        for (Showcase project : list) {
            if (project.getProjectID().equals(projectID)) {
                matches.add(project);
            }
        }
        return matches;
    }

    public void deleteProject(String projectID, Showcase project) {
        project = getProject(projectID);
        if (project != null) {
            removeProject(project);
        } else {
            System.out.println("Project Doesn't exist!");
        }
    }

    public String getProjectID() {
        return this.projectID;
    }

    public void add(Document document) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
