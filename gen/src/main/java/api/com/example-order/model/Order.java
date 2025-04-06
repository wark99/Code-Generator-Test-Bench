package com.example-order.model;

import java.time.LocalDate;
import org.junit.jupiter.api.Test;

public class Order extends AbstractEntity {
    private String customerId;
    private Product product;
    private int quantity;
    private double totalAmount;

    @Test
    public void getOrder() throws Exception {
        return this;
    }

    // Other getters and setters as needed...
}

