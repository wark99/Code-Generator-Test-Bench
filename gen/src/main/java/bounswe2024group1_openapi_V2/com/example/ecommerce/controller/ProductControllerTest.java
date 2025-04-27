package com.example.ecommerce.controller;

import com.example.ecommerce.model.Category;
import com.example.ecommerce.model.Product;
import com.example.ecommerce.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

class ProductControllerTest {

    private ProductController productController;
    private ProductService productServiceMock;

    @BeforeEach
    void setUp() {
        productServiceMock = Mockito.mock(ProductService.class);
        productController = new ProductController(productServiceMock);
    }

    @Test
    void getProductById_returnsProduct() {
        // Mock the productService to return a product
        Product product = new Product("Test Product", "Test Description", 10.0, new Category("Test Category"));
        Mockito.when(productServiceMock.getProductById(1L)).thenReturn(product);

        // Call the method
        ResponseEntity<Product> response = productController.getProductById(1L);

        // Assert the response
        org.assertj.core.api.Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        org.assertj.core.api.Assertions.assertThat(response.getBody().getName()).isEqualTo("Test Product");
    }

    @Test
    void getProductById_returnsNotFound() {
        Mockito.when(productServiceMock.getProductById(1L)).thenReturn(null);

        ResponseEntity<Void> response = productController.getProductById(1L);

        org.assertj.core.api.Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NOT_FOUND);
    }

    @Test
    void createProduct_returnsCreatedProduct() {
        // Mock the productService to return a product
        Product product = new Product("New Product", "New Description", 20.0, new Category("New Category"));
        Mockito.when(productServiceMock.createProduct(product)).thenReturn(product);

        // Call the method
        ResponseEntity<Product> response = productController.createProduct(product);

        // Assert the response
        org.assertj.core.api.Assertions.assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        org.assertj.core.api.Assertions.assertThat(response.getBody().getName()).isEqualTo("New Product");
    }
}

