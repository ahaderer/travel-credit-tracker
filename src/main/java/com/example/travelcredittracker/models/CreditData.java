package com.example.travelcredittracker.models;

import java.util.ArrayList;

public class CreditData {

    static ArrayList<Credit> credits = new ArrayList<>();

    // method to get all
    public static ArrayList<Credit> getAll() {
        return credits;
    }

    // method to add
    public static void add(Credit newCredit) {
        credits.add(newCredit);
    }

    public static void remove(int id) {
        Credit creditToRemove = getById(id);
        credits.remove(creditToRemove);
    }

    // method to getById
    public static Credit getById(int id) {

        Credit theCredit = null;

        for (Credit candidateCredit : credits) {
            if (candidateCredit.getId() == id) {
                theCredit = candidateCredit;
            }
        }
        return theCredit;
    }

}
