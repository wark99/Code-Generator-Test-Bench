package com.example.ecommerce.Test;

import java.util.List;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import com.example.ecommerce.Controller.OrderController;
import com.example.ecommerce.Service.OrderService;

public class OrderControllerTest {
    private OrderController orderController = new OrderController();
    private OrderService orderService = new OrderService();

    @Test
    public void testGetAllOrders() {
        List<Order> orders = orderController.getAllOrders();
        assertEquals(orderService.getAllOrders(), orders);
    }
}

