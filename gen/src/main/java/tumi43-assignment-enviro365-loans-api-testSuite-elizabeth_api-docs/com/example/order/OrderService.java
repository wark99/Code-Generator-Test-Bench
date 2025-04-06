package com.example.order;

import java.util.List;
import java.util.ArrayList;
import java.util.UUID;

public class OrderService {

    private List<Order> orders = new ArrayList<>();

    public List<Order> getAllOrders() {
        return orders;
    }

    public Order getOrderById(Long id) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                return order;
            }
        }
        return null;
    }

    public boolean createOrder(Order order) {
        orders.add(order);
        order.setId(UUID.randomUUID().toString());
        return true;
    }

    public boolean updateOrder(Long id, Order updatedOrder) {
        for (Order order : orders) {
            if (order.getId().equals(id)) {
                order.setCustomerName(updatedOrder.getCustomerName());
                order.setOrderDate(updatedOrder.getOrderDate());
                order.setTotalCost(updatedOrder.getTotalCost());
                return true;
            }
        }
        return false;
    }

    public boolean deleteOrder(Long id) {
        for (int i = orders.size() - 1; i >= 0; i--) {
            if (orders.get(i).getId().equals(id)) {
                orders.remove(i);
                return true;
            }
        }
        return false;
    }
}

