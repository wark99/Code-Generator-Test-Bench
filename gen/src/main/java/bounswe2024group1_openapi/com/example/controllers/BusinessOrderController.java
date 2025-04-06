package com.example.controllers;

import com.example.models.BusinessOrderModel;
import com.example.repositories.BusinessOrderRepository;
import org.junit.jupiter.api.Test;

public class BusinessOrderController extends ControllerBase {
    @GetMapping("/business_orders")
    public List<com.example.models.BusinessOrder> index() throws NotFoundException {
        return get();
    }

    // Other actions...
}

