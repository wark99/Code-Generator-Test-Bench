// src/test/java/com/example/ecommerce/controller/ProductControllerIntegrationTest.java

package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class ProductControllerIntegrationTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateProductIntegration() throws Exception {
        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"id\":1,\"name\":\"Test\",\"price\":10.99,\"description\":\"Description\"}"))
                .andExpect(status().isOk())
                .andReturn();

        Product product = new Product(1L, "Test", 10.99, "Description");
        mockMvc.perform(get("/api/products/1"))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testGetAllProductsIntegration() throws Exception {
        mockMvc.perform(get("/api/products"))
                .andExpect(status().isOk());
    }
}

