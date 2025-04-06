package com.example-order;

import java.util.List;
import java.util.ArrayList;

public class OrderUserModel {
    private String userId;
    private List<Order> orders = new ArrayList<>();
    private String name;
    private String email;
    private Integer phone;
    private String createdAt;
    private String updatedAt;

    public OrderUserModel(String userId, String name, String email, Integer phone) {
        this.userId = userId;
        this.name = name;
        this.email = email;
        this.phone = phone;
        this.createdAt = new java.util.Date();
        this.updatedAt = new java.util.Date();
    }

    // getters and setters...
}

