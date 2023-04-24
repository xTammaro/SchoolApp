package com.readyToHighSchool.model;
/**
 * @author Bo Dai
 * Just parent of all types of user in the system
 */
public abstract class User {
    private String id;
    private String username;
    private String email;
    private String password;
    private String gender;

    public User(String id, String username, String email, String password, String gender) {
        this.id = id;
        this.username = username;
        this.email = email;
        this.password = password;
        this.gender = gender;
    }
}
