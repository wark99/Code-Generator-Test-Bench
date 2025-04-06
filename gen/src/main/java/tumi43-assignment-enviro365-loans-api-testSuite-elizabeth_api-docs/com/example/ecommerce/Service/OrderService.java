package com.example.ecommerce.Service;

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders;

    public OrderService() {
        this.orders = new ArrayList<>();
        initOrders();
    }

    private void initOrders() {
        // Initialize orders
        Order order1 = new Order(1, new Product(1, "Product 1", 10.99), 10.99);
        Order order2 = new Order(2, new Product(2, "Product 2", 9.99), 9.99);

        this.orders.add(order1);
        this.orders.add(order2);
    }

    public List<Order> getAllOrders() {
        return orders;
    }
}

