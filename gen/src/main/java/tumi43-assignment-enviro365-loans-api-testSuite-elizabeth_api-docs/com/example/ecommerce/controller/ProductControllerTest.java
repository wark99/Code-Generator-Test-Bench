package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Arrays;
import java.util.List;

class ProductControllerTest {

    @Autowired
    ProductController productController;

    @MockBean
    private ProductRepository productRepository;

    @BeforeEach
    void setUp() {
        productController = new ProductController(productRepository);
    }

    @Test
    void getAllProducts() {
        // Mock the repository to return some data
        List<Product> products = Arrays.asList(new Product("Test Product 1", "Description 1", 10.0, "image1.jpg"), new Product("Test Product 2", "Description 2", 20.0, "image2.jpg"));
        when(productRepository.findAll()).thenReturn(products);

        // Call the method
        List<Product> result = productController.getAllProducts();

        // Assert the result
        assertThat(result).isEqualTo(products);
    }

    @Test
    void getProductById() {
        // Mock the repository to return a single product
        Product product = new Product("Test Product", "Description", 10.0, "image.jpg");
        when(productRepository.findById(1L)).thenReturn(Mockito.talkingAbout(product));

        // Call the method
        Product result = productController.getProductById(1L);

        // Assert the result
        assertThat(result).isEqualTo(product);
    }

    @Test
    void createProduct() {
        // Mock the repository
        Product product = new Product("New Product", "Description", 30.0, "image.jpg");
        when(productRepository.save(product)).thenReturn(product);

        // Call the method
        ResponseEntity<Product> response = productController.createProduct(product);

        // Assert the result
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.CREATED);
        assertThat(response.getBody().getName()).isEqualTo(product.getName());
    }

    @Test
    void updateProduct() {
        // Mock the repository
        Product product = new Product("Updated Product", "Description", 40.0, "image.jpg");
        when(productRepository.findById(1L)).thenReturn(Mockito.talkingAbout(product));
        when(productRepository.save(product)).thenReturn(product);

        // Call the method
        ResponseEntity<Product> response = productController.updateProduct(1L, product);

        // Assert the result
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.OK);
        assertThat(response.getBody().getName()).isEqualTo(product.getName());
    }

    @Test
    void deleteProduct() {
        // Mock the repository
        when(productRepository.deleteById(1L)).thenReturn(true);

        // Call the method
        ResponseEntity<Void> response = productController.deleteProduct(1L);

        // Assert the result
        assertThat(response.getStatusCode()).isEqualTo(HttpStatus.NO_CONTENT);
    }
}

