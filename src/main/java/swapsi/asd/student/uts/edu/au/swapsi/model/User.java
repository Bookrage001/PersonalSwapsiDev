package swapsi.asd.student.uts.edu.au.swapsi.model;

import java.io.Serializable;

public class User implements Serializable {

<<<<<<< HEAD
    public String name;
=======
    private int id;
    private String username;
    private String firstName;
    private String lastName;
>>>>>>> origin/master
    private String email;
    private String password;
    private String DOB;
    private String Location;

    public User() {

    }

    public User(int id, String username, String firstName, String lastName ,  String email, String password, String DOB, String Location) {
        this.username = username;
        this.email = email;
        this.password = password;
    }

    public String getUsername() {
        return this.username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getDOB() {
        return this.DOB;
    }

    public void setDOB(String DOB) {
        this.DOB = DOB;
    }

    public String getLocation() {
        return this.Location;
    }

    public void setLocation(String Location) {
        this.Location = Location;
    }

    public String getEmail() {
        return this.email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return this.password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

}
