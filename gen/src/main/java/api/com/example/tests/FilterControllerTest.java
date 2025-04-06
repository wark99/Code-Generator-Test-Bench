package com.example.tests;

import com.example.models.*;
import com.example.controllers.*;
import static org.junit.jupiter.api.Assertions.*;

public class FilterControllerTest {

    @BeforeEach
    void setUp() {
        initialize();
    }

    @AfterEach
    void tearDown() {
        super.tearDown();
    }

    @Test
    public void testGetProductByName() throws Exception {
        var controller = new FilterController();
        var response = controller.getAction("GET", "/filter?name=test");
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(1.0, response.getBody());
    }

    @Test
    public void testGetProductRangeByPrice() throws Exception {
        var controller = new FilterController();
        var response = controller.getAction("GET", "/filter?price=10,20");
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(1.0, response.getBody());
    }
}

