package com.example.ecommerce.Controller;

import java.util.List;
import com.example.ecommerce.Service.OrderService;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import com.example.ecommerce.Model.Order;

@Path("/orders")
public class OrderController {
    private OrderService orderService;

    public OrderController() {
        this.orderService = new OrderService();
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}

