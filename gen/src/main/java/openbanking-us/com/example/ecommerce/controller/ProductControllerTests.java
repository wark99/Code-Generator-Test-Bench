package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Objects;

@WebMvcTest(ProductController.class)
public class ProductControllerTests {

    @Autowired
    private ProductController productController;

    @BeforeEach
    void setUp() {
        // No need to do anything here, Spring Boot handles dependency injection.
    }

    @Test
    void getProductById() {
        // Arrange
        Long productId = 1L;
        Product product = new Product("Test Product", 20.0, "Test Description");
        productRepository.save(product);

        // Act
        ResponseEntity<Product> response = productController.getProductById(productId);

        // Assert
        assertNotNull(response.getBody());
        assertEquals(productId, response.getBody().getId());
        assertEquals("Test Product", response.getBody().getName());
        assertEquals(20.0, response.getBody().getPrice(), 0.001);
        assertEquals("Test Description", response.getBody().getDescription());
    }

    @Test
    void createProduct() {
        // Arrange
        Product product = new Product("New Product", 30.0, "New Description");

        // Act
        ResponseEntity<Product> response = productController.createProduct(product);

        // Assert
        assertNotNull(response.getBody());
        assertEquals(1L, response.getBody().getId());
        assertEquals("New Product", response.getBody().getName());
        assertEquals(30.0, response.getBody().getPrice(), 0.001);
        assertEquals("New Description", response.getBody().getDescription());
    }

    @Test
    void updateProduct() {
        // Arrange
        Long productId = 1L;
        Product product = new Product("Updated Product", 40.0, "Updated Description");
        Product existingProduct = new Product("Original Product", 20.0, "Original Description");
        existingProduct.setId(productId);
        productRepository.save(existingProduct);

        // Act
        ResponseEntity<Product> response = productController.updateProduct(productId, product);

        // Assert
        assertNotNull(response.getBody());
        assertEquals(productId, response.getBody().getId());
        assertEquals("Updated Product", response.getBody().getName());
        assertEquals(40.0, response.getBody().getPrice(), 0.001);
        assertEquals("Updated Description", response.getBody().getDescription());
    }

    @Test
    void deleteProduct() {
        // Arrange
        Long productId = 1L;
        Product product = new Product("Product to Delete", 50.0, "Description");
        productRepository.save(product);

        // Act
        productController.deleteProduct(productId);

        // Assert
        boolean exists = productRepository.findById(productId).isPresent();
        assertFalse(exists);
    }
}

