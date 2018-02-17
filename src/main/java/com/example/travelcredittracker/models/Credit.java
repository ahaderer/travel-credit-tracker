package com.example.travelcredittracker.models;

import javax.validation.constraints.NotNull;
import java.util.Date;

public class Credit {

    private int id;

    @NotNull
    private String traveler;

    @NotNull
    private String airline;

    @NotNull
    private String confirmationNumber;

    @NotNull
    private int ticketNumber;

    @NotNull
    private Date purchDate;

    @NotNull
    private Date cancelDate;

    @NotNull
    private Date expirationDate;

    @NotNull
    private int creditAmount;

    private String creditNotes;

    public Credit() {
    }

    // TODO: regular constructor??
    public Credit(String traveler, String airline, String confirmationNumber, int ticketNumber, Date purchDate, Date cancelDate, Date expirationDate, int creditAmount, String creditNotes) {
        this.traveler = traveler;
        this.airline = airline;
        this.confirmationNumber = confirmationNumber;
        this.ticketNumber = ticketNumber;
        this.purchDate = purchDate;
        this.expirationDate = expirationDate;
        this.creditAmount = creditAmount;
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

    public Date getPurchDate() {
        return purchDate;
    }

    public void setPurchDate(Date purchDate) {
        this.purchDate = purchDate;
    }

    public Date getCancelDate() {
        return cancelDate;
    }

    public void setCancelDate(Date cancelDate) {
        this.cancelDate = cancelDate;
    }

    public Date getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(Date expirationDate) {
        this.expirationDate = expirationDate;
    }

    public int getCreditAmount() {
        return creditAmount;
    }

    public void setCreditAmount(int creditAmount) {
        this.creditAmount = creditAmount;
    }

    public String getCreditNotes() {
        return creditNotes;
    }

    public void setCreditNotes(String creditNotes) {
        this.creditNotes = creditNotes;
    }
}
