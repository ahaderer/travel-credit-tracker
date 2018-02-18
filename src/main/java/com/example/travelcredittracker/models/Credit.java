package com.example.travelcredittracker.models;

import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
// import java.sql.Date;

@SuppressWarnings("unused")
public class Credit {

    private int id;

    private static int nextId = 1;

    @NotNull
    @Size(min=5, message="Name must be at least 5 characters")
    private String traveler;

    @NotNull
    @Size(min=1)
    private String airline;

    @NotNull
    @Size(min=6, message="This field cannot be left blank")
    private String confirmationNumber;

    @NotNull
    private int ticketNumber;

    @NotNull
    @Size(min=1, message="This field cannot be left blank")
    private String purchaseDate;

    @NotNull
    @Size(min=1, message="This field cannot be left blank")
    private String cancelDate;

    @NotNull
    @Size(min=1, message="This field cannot be left blank")
    private String expirationDate;

    @NotNull
    private double creditAmount;

    private String creditNotes;

    public Credit(String traveler, String airline, String confirmationNumber, int ticketNumber, String purchaseDate, String cancelDate, String expirationDate, double creditAmount, String creditNotes) {
        this();
        this.traveler = traveler;
        this.airline = airline;
        this.confirmationNumber = confirmationNumber;
        this.ticketNumber = ticketNumber;
        this.purchaseDate = purchaseDate;
        this.cancelDate = cancelDate;
        this.expirationDate = expirationDate;
        this.creditAmount = creditAmount;
        this.creditNotes = creditNotes;
    }

    public Credit() {
        id = nextId;
        nextId++;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
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

    public String getPurchaseDate() {
        return purchaseDate;
    }

    public void setPurchaseDate(String purchaseDate) {
        this.purchaseDate = purchaseDate;
    }

    public String getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(String cancelDate) {
        this.cancelDate = cancelDate;
    }

    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public double getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(double creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditNotes() {
        return creditNotes;
    }

    public void setCreditNotes(String creditNotes) {
        this.creditNotes = creditNotes;
    }
}
