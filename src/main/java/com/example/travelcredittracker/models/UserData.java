package com.example.travelcredittracker.models;

import java.util.ArrayList;

public class UserData {

    static ArrayList<User> users = new ArrayList<>();

    // method to get all
    public static ArrayList<User> getAll() {
        return users;
    }

    // method to add
    public static void add(User newUser) {
        users.add(newUser);
    }

    // method to getById
    public static User getById(int id) {

        User theUser = null;

        for (User candidateUser : users) {
            if (candidateUser.getId() == id) {
                theUser = candidateUser;
            }
        }
        return theUser;
    }

}
