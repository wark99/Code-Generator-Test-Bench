package controllers;
import java.io.*;
import java.util.*';

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype>@SpringBootApplication;

import org.springframework.web.servlet.http.ResponseEntity;

import static org.springframework.test.web.servlet.MockMvc;

public class OrderController {
    @Autowired
    private OrderDAO orderDao;

    public ResponseEntity<Order> createOrder(@RequestBody Order order) {
        return orderDao.createOrder(order);
    }

    public ResponseEntity<Order> updateOrder(@RequestId rid, @RequestBody Order updatedOrder) {
        return orderDao.updateOrder(rid, updatedOrder);
    }

    public ResponseEntity<Order> deleteOrder(@RequestId rid) {
        return orderDao.deleteOrder(rid);
    }
}

