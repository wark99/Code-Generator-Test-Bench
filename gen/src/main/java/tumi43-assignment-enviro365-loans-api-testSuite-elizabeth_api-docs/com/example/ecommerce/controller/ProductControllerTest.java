// src/test/java/com/example/ecommerce/controller/ProductControllerTest.java

package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.fasterxml.jackson.databind.ObjectMapper;
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
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ObjectMapper objectMapper;

    @Test
    public void testCreateProduct() throws Exception {
        Product product = new Product(1L, "Test", 10.99, "Description");
        String json = objectMapper.writeValueAsString(product);
        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testGetAllProducts() throws Exception {
        mockMvc.perform(get("/api/products"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetProductById() throws Exception {
        Product product = new Product(1L, "Test", 10.99, "Description");
        String json = objectMapper.writeValueAsString(product);
        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andReturn();

        mockMvc.perform(get("/api/products/1"))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testUpdateProduct() throws Exception {
        Product product = new Product(1L, "Test", 10.99, "Description");
        String json = objectMapper.writeValueAsString(product);
        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andReturn();

        Product updatedProduct = new Product(1L, "Updated Test", 11.99, "Updated Description");
        String updatedJson = objectMapper.writeValueAsString(updatedProduct);
        mockMvc.perform(put("/api/products/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(updatedJson))
                .andExpect(status().isOk())
                .andReturn();
    }

    @Test
    public void testDeleteProduct() throws Exception {
        Product product = new Product(1L, "Test", 10.99, "Description");
        String json = objectMapper.writeValueAsString(product);
        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andReturn();

        mockMvc.perform(delete("/api/products/1"))
                .andExpect(status().isOk())
                .andReturn();
    }
}

