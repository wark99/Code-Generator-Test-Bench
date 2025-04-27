package com.example.demo.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.List;
import javax.transaction.Transactional;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.http.MediaType;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;

@AutoConfigureMockMvc
@DataJpaTest
public class ProductControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private ProductRepository productRepository;

    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product();
        product.setName("Sample Product");
        product.setPrice(9.99);
        product.setDescription("This is a sample product.");
        productRepository.save(product);
    }

    @Test
    public void getAllProducts() throws Exception {
        mockMvc.perform(get("/api/products"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$", hasSize(1)))
                .andExpect(jsonPath("$[0].name").value("Sample Product"));
    }

    @Test
    public void getProductById() throws Exception {
        mockMvc.perform(get("/api/products/{id}", product.getId()))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.name").value("Sample Product"))
                .andExpect(jsonPath("$.price").value(9.99));
    }

    @Test
    public void createProduct() throws Exception {
        Product newProduct = new Product();
        newProduct.setName("New Product");
        newProduct.setPrice(19.99);
        newProduct.setDescription("This is a new product.");

        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"" + newProduct.getName() +
                         "\",\"price\":" + newProduct.getPrice() +
                         ",\"description\":\"" + newProduct.getDescription() + "\"}"))
                .andExpect(status().isCreated());
    }

    @Test
    public void updateProduct() throws Exception {
        String newName = "Updated Product";

        mockMvc.perform(put("/api/products/{id}", product.getId())
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"" + newName +
                         "\",\"price\":" + product.getPrice() +
                         ",\"description\":\"" + product.getDescription() + "\"}"))
                .andExpect(status().isOk());

        Product updatedProduct = productRepository.findById(product.getId()).orElse(null);
        assert updatedProduct != null;
        assertEquals(newName, updatedProduct.getName());
    }

    @Test
    public void deleteProduct() throws Exception {
        mockMvc.perform(delete("/api/products/{id}", product.getId()))
                .andExpect(status().isNoContent());

        List<Product> products = productRepository.findAll();
        assertTrue(products.isEmpty());
    }
}

