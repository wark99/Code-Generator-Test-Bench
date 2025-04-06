package com.example-order.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.time.LocalDate;

@Service
public class OrderService {
    @Autowired
    private EasyUI eaiLookup;
    @Autowired
    private ProductService productService;

    public static <T> T createOrder(Product product) throws Exception {
        return productService.createProduct(product);
    }

    public static <T> T createOrder(Customer customer, Product product) throws Exception {
        return productService.createProduct(customer, product);
    }
}

