package com.example.travelcredittracker.models;

import java.util.Date;

public class Credit {

    private int id;

    private String traveler;

    private String airline;

    private String confirmationNumber;

    private int ticketNumber;

    private Date expirationDate;

    private int originalAmount;

    public Credit() {
    }

    // TODO: regular constructor??
    public Credit(String traveler, String airline, String confirmationNumber, int ticketNumber, Date expirationDate, int originalAmount) {
        this.traveler = traveler;
        this.airline = airline;
        this.confirmationNumber = confirmationNumber;
        this.ticketNumber = ticketNumber;
        this.expirationDate = expirationDate;
        this.originalAmount = originalAmount;
    }

    public int getId() {
        return id;
    }

    public String getTraveler() {
        return traveler;
    }

    public void setTraveler(String traveler) {
        this.traveler = traveler;
    }

    public String getAirline() {
        return airline;
    }

    public void setAirline(String airline) {
        this.airline = airline;
    }

    public String getConfirmationNumber() {
        return confirmationNumber;
    }

    public void setConfirmationNumber(String confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public int getTicketNumber() {
        return ticketNumber;
    }

    public void setTicketNumber(int ticketNumber) {
        this.ticketNumber = ticketNumber;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getOriginalAmount() {
        return originalAmount;
    }

    public void setOriginalAmount(int originalAmount) {
        this.originalAmount = originalAmount;
    }
}
