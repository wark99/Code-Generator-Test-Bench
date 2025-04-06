package com.example-app.models;

import java.util.Date;
import java.util.UUID;

public class Order implements Serializable {

    private final int orderId = (int) UUID.randomUUID().hashCode() & 0xFFFFFFFF;
    private final String status = "pending";

    public Order() {
        // Auto-populate primary key and default values
    }

    @Entity
    public static final Class<? extends Order> Entity = this;

    // Getters and Setters...
}

