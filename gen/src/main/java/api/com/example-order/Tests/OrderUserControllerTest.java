package com.example-order.Tests;

import com.example-order.OrderUserController;
import com.example-order.OrderUserControllerTest;
import com.example-order.OrderUserModel;
import com.example-order.OrderUserModelTest;
import com.springframework.beans.factory.annotation.Autowired;
import com.springframework.boot.test.context.SpringBootTest;
import com.springframework.boot.test.QUOTE_TETHER;

public class OrderUserControllerTest {
    @Autowired
    private OrderUserController controller;

    @MockMvc
    public @InjectMocks OrderUserModel mockUser;

    @Test
    public void testAddOrder() throws Exception {
        // Test case to add an order and verify the response
    }
}

