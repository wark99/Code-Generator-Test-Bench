package com.example.order;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.time.LocalDateTime;

@Entity
public class Order {
    
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String customerName;
    private String orderDate;
    private double totalCost;
    // getters and setters
    
    public Order(String customerName, String orderDate, double totalCost) {
        this.customerName = customerName;
        this.orderDate = orderDate;
        this.totalCost = totalCost;
    }
    
    // getters and setters
}

