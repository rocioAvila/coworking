package com.appcoworking.Demo.de.appCoworking.models;

import jakarta.persistence.*;

import java.time.LocalDate;

@Entity
public class User {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long idUser;
    private String rolUser = "client";
    private String nameUser;
    private String lastNameUser;
    private String password;

    @Temporal(TemporalType.DATE)
    private LocalDate birthday;

    private String dni;
    private String email;
    private String phoneNumber;

    public User() {
    }

    public User(Long idUser, String rolUser, String nameUser, String lastNameUser, String password, LocalDate birthday, String dni, String email, String phoneNumber) {
        this.idUser = idUser;
        this.rolUser = rolUser;
        this.nameUser = nameUser;
        this.lastNameUser = lastNameUser;
        this.password = password;
        this.birthday = birthday;
        this.dni = dni;
        this.email = email;
        this.phoneNumber = phoneNumber;
    }

    public Long getIdUser() {
        return idUser;
    }

    public String getRolUser() {
        return rolUser;
    }

    public String getNameUser() {
        return nameUser;
    }

    public String getLastNameUser() {
        return lastNameUser;
    }

    public String getPassword() { return password; }

    public LocalDate getBirthday() {
        return birthday;
    }

    public String getDni() {
        return dni;
    }

    public String getEmail() {
        return email;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setIdUser(Long idUser) {
        this.idUser = idUser;
    }

    public void setRolUser(String rolUser) {
        this.rolUser = rolUser;
    }

    public void setNameUser(String nameUser) {
        this.nameUser = nameUser;
    }

    public void setLastNameUser(String lastNameUser) {
        this.lastNameUser = lastNameUser;
    }

    public void setPassword(String password) { this.password = password; }

    public void setBirthday(LocalDate birthday) {
        this.birthday = birthday;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
}
