// src/test/java/com/example/ecommerce/controllers/ProductControllerTest.java
package com.example.ecommerce.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.ecommerce.models.Product;

import java.util.Arrays;
import java.util.List;

public class ProductControllerTest {

    private ProductController productController;
    private ProductService productServiceMock;

    @BeforeEach
    void setUp() {
        productServiceMock = Mockito.mock(ProductService.class);
        productController = new ProductController(productServiceMock);
    }

    @Test
    void getAllProducts() {
        List<Product> products = Arrays.asList(new Product(1L, "Product 1", "Desc 1", 10.0, "image1.jpg"), new Product(2L, "Product 2", "Desc 2", 20.0, "image2.jpg"));
        when(productServiceMock.getAllProducts()).thenReturn(products);
        Iterable<Product> result = productController.getAllProducts();
        assertNotNull(result);
        assertEquals(2, result.size());
    }

    @Test
    void getProductById() {
        Product product = new Product(1L, "Product 1", "Desc 1", 10.0, "image1.jpg");
        when(productServiceMock.getProductById(1L)).thenReturn(product);
        Product result = productController.getProductById(1L);
        assertNotNull(result);
        assertEquals("Product 1", result.getName());
    }
}

