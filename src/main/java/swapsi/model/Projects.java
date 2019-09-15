package swapsi.model;

import java.io.Serializable;
import java.util.*;

public class Projects implements Serializable {

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

    public Project getProject(int project_id) {
        for (Project project : list) {
            if (project.getProject_id() == project_id) {
                return project;
            }
        }
        return null;
    }

    public ArrayList<Project> getMatches(int project_id) {
        ArrayList<Project> matches = new ArrayList<>();
        for (Project project : list) {
            if (project.getProject_id() == project_id) {
                matches.add(project);
            }
        }
        return matches;
    }

    public void deleteProject(int project_id) {
        Project project = getProject(project_id);
        if (project != null) {
            removeProject(project);
        } else {
            System.out.println("Project Doesn't exist!");
        }
    }
}
