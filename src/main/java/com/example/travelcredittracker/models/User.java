package com.example.travelcredittracker.models;

@SuppressWarnings("unused")
public class User {

    private int id;

    private static int nextId = 1;

    private String email;

    private String password;

    private String verifyPassword;

    public User(int id, String email, String password, String verifyPassword) {
        this();
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public User() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getVerifyPassword() {
        return password;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
    }

}
