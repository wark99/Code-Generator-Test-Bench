package com.example.tests;

import com.example.controllers.ProductController;
import com.example.models.Product;
import com.example.repositories.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {
    
    ProductRepository productRepository = new ProductRepository();
    
    @BeforeEach
    void setUp() {
        productRepository.put(new Product("Test Product", 99.99, 5, "Electronics"));
    }
    
    @Test
    public void testCreateProduct_ShouldReturnNewProduct() throws Exception {
        final Product result = new ProductController_productRepository.create(new Product(
            "Test Name", 
            99.99, 
            5, 
            "Electronics"
        ));
        
        assertEquals(result.getName(), "Test Name");
        assertEquals(result.getPrice(), 99.99);
        assertEquals(result.getQuantity(), 5);
        assertEquals(result.getCategory(), "Electronics");
    }
    
    @Test
    public void testGetProduct_ShouldReturnSingleProduct() throws Exception {
        final Product product = new ProductController_productRepository.findById(1);
        
        assertEquals("Test Product", product.getName());
        assertEquals(99.99, product.getPrice());
        assertEquals(5, product.getQuantity());
        assertEquals("Electronics", product.getCategory());
    }
}

