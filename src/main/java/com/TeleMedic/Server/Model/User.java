package com.TeleMedic.Server.Model;

import org.springframework.data.mongodb.core.mapping.Document;

import java.util.Date;

public class User {
    private String id;
    private String username;
    private String date;
    private String status;
    private String unit;
    private double weight;

    public User(String id, String username , String date, String status, String unit, double weight) {
        this.id = id;
        this.username = username;
        this.date = date;
        this.status = status;
        this.unit = unit;
        this.weight = weight;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setUnit(String unit) {
        this.unit = unit;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public String getId() {
        return id;
    }

    public String getUsername() {
        return username;
    }

    public String getDate() {
        return date;
    }

    public String getStatus() {
        return status;
    }

    public String getUnit() {
        return unit;
    }

    public double getWeight() {
        return weight;
    }
}
