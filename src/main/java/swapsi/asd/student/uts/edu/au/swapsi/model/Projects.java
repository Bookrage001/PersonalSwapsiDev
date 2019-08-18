package swapsi.asd.student.uts.edu.au.swapsi.model;

import java.io.Serializable;
import java.util.*;

public class Projects implements Serializable{
   
    private ArrayList<Project> list = new ArrayList<>();

    public Projects() {
    }

    public ArrayList<Project> getList() {
        return list;
    }

    public void addProject(Project project) {
        list.add(project);
    }

    public void removeProject(Project project) {
        list.remove(project);
    }

    public Project getProject(String projectID) {
        for (Project project : list) {
            if (project.getProjectID().equals(projectID)) {
                return project;
            }
        }
        return null;
    }

    public ArrayList<Project> getMatches(String projectID) {
        ArrayList<Project> matches = new ArrayList<>();
        for (Project project : list) {
            if (project.getProjectID().equals(projectID)) {
                matches.add(project);
            }
        }
        return matches;
    }

    public void deleteProject(String projectID) {
        Project project = getProject(projectID);
        if (project != null) {
            removeProject(project);
        } else {
            System.out.println("Project Doesn't exist!");
        }
    }
}

