package swapsi.model;

import java.io.Serializable;
import java.util.*;
import org.bson.Document;

public class Showcase implements Serializable {

    private ArrayList<Showcase> list = new ArrayList<>();
    private String project_id;

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

    public Showcase getProject(String project_id) {
        for (Showcase project : list) {
            if (project.getproject_id().equals(project_id)) {
                return project;
            }
        }
        return null;
    }

    public ArrayList<Showcase> getMatches(String project_id) {
        ArrayList<Showcase> matches = new ArrayList<>();
        for (Showcase project : list) {
            if (project.getproject_id().equals(project_id)) {
                matches.add(project);
            }
        }
        return matches;
    }

    public void deleteProject(String project_id, Showcase project) {
        project = getProject(project_id);
        if (project != null) {
            removeProject(project);
        } else {
            System.out.println("Project Doesn't exist!");
        }
    }

    public String getproject_id() {
        return this.project_id;
    }

    public void add(Document document) {
        throw new UnsupportedOperationException("Not supported yet."); // To change body of generated methods, choose
                                                                       // Tools | Templates.
    }

}
