package com.example.travelcredittracker.models;

import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.Digits;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

@SuppressWarnings("unused")
@Entity
public class Credit {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @Size(min=5, message="Traveler's name must be at least 5 characters")
    private String traveler;

    @NotNull(message="This field cannot be left blank")
    @Size(min=3)
    private String airline;

    @NotNull
    @Size(min=6, message="This field must have at least 6 characters")
    private String confirmationNumber;

    @NotNull
    private int ticketNumber;

    @NotNull(message="This field cannot be left blank")
    @NotBlank(message="Field must not be empty")
    private String purchaseDate;

    @NotNull(message="This field cannot be left blank")
    @NotBlank(message="Email must not be empty")
    private String cancelDate;

    @NotNull(message="This field cannot be left blank")
    @NotBlank(message="Email must not be empty")
    private String expirationDate;

    @NotNull(message="This field cannot be left blank")
    @Digits(integer=2, fraction=0)
    private double creditAmount;

    private String creditNotes;

    @ManyToOne
    private User user;

    public Credit() {
    }

    public Credit(String traveler, String airline, String confirmationNumber, int ticketNumber, String purchaseDate, String cancelDate, String expirationDate, double creditAmount, String creditNotes) {
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
