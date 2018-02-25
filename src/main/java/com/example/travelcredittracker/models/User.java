package com.example.travelcredittracker.models;

import org.hibernate.validator.constraints.Email;
import org.hibernate.validator.constraints.NotBlank;

import javax.persistence.*;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import java.util.ArrayList;
import java.util.List;

@SuppressWarnings("unused")
@Entity
public class User {

    @Id
    @GeneratedValue
    private int id;

    @NotNull
    @NotBlank(message="Email must not be empty")
    @Email
    private String email;

    // TODO: Improve validation on "email" field (allie@allie is currently valid)

    @NotNull
    @Size(min=6, message="Password must be at least 6 characters")
    private String password;

    @NotNull(message="Passwords must match")
    private String verifyPassword;

    @OneToMany
    @JoinColumn(name =  "user_id")
    private List<User> credits = new ArrayList<>();

    public User() {
    }

    public User(String email, String password, String verifyPassword) {
        this.email = email;
        this.password = password;
        this.verifyPassword = verifyPassword;
    }

    public int getId() {
        return id;
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

    public String getVerifyPassword() {
        return password;
    }

    private void checkPassword() {
        if (!verifyPassword.equals(password)) {
            verifyPassword = null;
        }
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setVerifyPassword(String verifyPassword) {
        this.verifyPassword = verifyPassword;
        checkPassword();
    }

}
