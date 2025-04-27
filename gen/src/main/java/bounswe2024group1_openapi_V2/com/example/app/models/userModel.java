package com.example.app.models;

public class userModel {
    private String username;
    private int id;
    private boolean isAdmin;

    public userModel(String username, int id, boolean isAdmin) {
        this.username = username;
        this.id = id;
        this.isAdmin = isAdmin;
    }

    // getters and setters (omitted for brevity)
}

