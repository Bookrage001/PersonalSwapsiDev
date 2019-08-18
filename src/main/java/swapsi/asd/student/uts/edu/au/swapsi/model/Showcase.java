package swapsi.asd.student.uts.edu.au.swapsi.model;

import java.io.Serializable;
import java.util.*;

public class Showcase implements Serializable{
   
    private ArrayList<Showcase> list = new ArrayList<>();

    public Showcase() {
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
}
