package com.example.tests;

import com.example.models.*;
import com.example.controllers.*;
import static org.junit.jupiter.api.Assertions.*;

public class CategoryControllerTest {

    @BeforeEach
    void setUp() {
        initialize();
    }

    @AfterEach
    void tearDown() {
        super.tearDown();
    }

    @Test
    public void testGetCategories() throws Exception {
        var controller = new CategoryController();
        var response = controller.getAction("GET", "/categories");
        assertEquals(200, response.getStatusCodeValue());
        assertEquals(1.0, response.getBody());
    }

    @Test
    public void testGetCategoryById() throws Exception {
        var controller = new CategoryController();
        String category;
        var response = controller.getAction("GET", "/categories/1");
        assertTrue(response.getBody().contains(category));
    }
}

