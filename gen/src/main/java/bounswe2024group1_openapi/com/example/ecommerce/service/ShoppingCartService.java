package com.example.ecommerce.service;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.OrderRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.User;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ShoppingCartService {

    @Autowired
    private OrderRepository orderRepository;

    public void addProduct(Product product, String username) {
        // In a real application, you'd likely check if the product is already in the cart.
        // This is a simplified example.
        Order order = new Order();
        order.setUser(userRepository.findByUsername(username)); // Assuming you have a UserDetailsService
        order.getOrderItemList().add(new OrderItem(product, 1)); // Add one of the product
        orderRepository.save(order);
    }

    public void removeProduct(Long id, String username) {
        // Find the order containing the product with the given ID
        List<Order> orders = orderRepository.findByUser(username);
        for (Order order : orders) {
            List<OrderItem> orderItems = order.getOrderItemList();
            for (OrderItem orderItem : orderItems) {
                if (orderItem.getProduct().getId() == id) {
                    orderItems.remove(orderItem);
                    break;
                }
            }
            if (!orderItems.isEmpty()) {
                orderRepository.save(order);
            }
        }
    }
}

