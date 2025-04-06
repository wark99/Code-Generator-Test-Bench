package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.web.servlet.ModelAndViewaddObject;

import java.util.Arrays;
import java.util.List;

public class ProductControllerTest {

    @Autowired
    @MockBean
    private ProductRepository productRepository;

    private ProductController productController;

    @BeforeEach
    void setUp() {
        productController = new ProductController(productRepository);
    }

    @Test
    void listProducts() {
        // Mock the productRepository to return some data
        List<Product> products = Arrays.asList(new Product(1L, "Product 1", 10.0), new Product(2L, "Product 2", 20.0));
        when(productRepository.findAll()).thenReturn(products);

        // Call the method
        String result = productController.listProducts(null);

        // Assert the result
        assertEquals("products", result);
    }
}

