package Java20240328EduServer;

import java.util.Scanner;

public class User {
    private String name;
    private String userid;
    private String password;
    private String email;

    public User() {
    }

    public User(String name, String userid, String password, String email) {
        this.name = name;
        this.userid = userid;
        this.password = password;
        this.email = email;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUserid() {
        return userid;
    }

    public void setUserid(String userid) {
        this.userid = userid;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
