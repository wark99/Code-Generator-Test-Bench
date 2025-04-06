package com.example-order.Tests;

import com.example-order.OrderUserModel;
import com.example-order.OrderUserModelTest;
import com.springframework.beans.factory.annotation.Autowired;
import com.springframework.boot.test.context.SpringBootTest;
import com.springframework.boot.test.web.servlet.—
import com.springframework.test.util.junitResourceForWeb;

public class OrderUserModelTest {
    @Autowired
    private OrderUserModel user;
    @MockMvc
    public @InjectMocks User mockUser;

    @Test
    public void testGetUser() throws Exception {
        // Test case to retrieve the user and verify data
    }
}

