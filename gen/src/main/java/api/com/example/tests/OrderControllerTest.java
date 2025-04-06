package com.example.tests;

import com.example.models.*;
import com.example.controllers.*;

public class OrderControllerTest {

    @Test
    public void testGetOrders() throws Exception {
        var controller = new OrderController();
        var response = controller.getAction("GET", "/orders");
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(1.0, response.getBody());
    }
}

