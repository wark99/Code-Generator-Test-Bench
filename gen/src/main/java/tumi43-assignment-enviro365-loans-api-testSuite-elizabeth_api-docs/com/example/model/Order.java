package com.example.model;

public class Order {
    @Entity
    private Integer userId;
    @Entity
    private List<CartItem> items;
    
    // getters and setters...
}

