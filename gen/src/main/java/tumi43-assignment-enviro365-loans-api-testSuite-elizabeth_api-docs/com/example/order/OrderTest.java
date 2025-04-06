package com.example.order;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.Assertions;
import java.util.List;

public class OrderTest {

    @Test
    public void testGetAllOrders() {
        OrderService orderService = new OrderService();
        List<Order> orders = orderService.getAllOrders();
        Assertions.assertEquals(0, orders.size());
    }

    @Test
    public void testGetOrderById() {
        OrderService orderService = new OrderService();
        Order order = new Order("John Doe", "2023-01-01", 100.00);
        orderService.createOrder(order);
        Order retrievedOrder = orderService.getOrderById(order.getId());
        Assertions.assertNotNull(retrievedOrder);
    }

    @Test
    public void testCreateOrder() {
        OrderService orderService = new OrderService();
        Order order = new Order("John Doe", "2023-01-01", 100.00);
        String orderId = UUID.randomUUID().toString();
        order.setId(Long.parseLong(orderId));
        Assertions.assertEquals(0, orderService.getAllOrders().size());
        orderService.createOrder(order);
        List<Order> orders = orderService.getAllOrders();
        Assertions.assertNotNull(orders);
    }

    @Test
    public void testUpdateOrder() {
        OrderService orderService = new OrderService();
        Order order = new Order("John Doe", "2023-01-01", 100.00);
        String orderId = UUID.randomUUID().toString();
        order.setId(Long.parseLong(orderId));
        Assertions.assertEquals(0, orderService.getAllOrders().size());
        orderService.createOrder(order);
        Order updatedOrder = new Order("Jane Doe", "2023-02-01", 200.00);
        updatedOrder.setId(Long.parseLong(orderId));
        boolean success = orderService.updateOrder(order.getId(), updatedOrder);
        Assertions.assertTrue(success);
    }

    @Test
    public void testDeleteOrder() {
        OrderService orderService = new OrderService();
        Order order = new Order("John Doe", "2023-01-01", 100.00);
        String orderId = UUID.randomUUID().toString();
        order.setId(Long.parseLong(orderId));
        Assertions.assertEquals(0, orderService.getAllOrders().size());
        orderService.createOrder(order);
        boolean success = orderService.deleteOrder(order.getId());
        Assertions.assertTrue(success);
    }
}

