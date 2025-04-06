package com.example.demo.service.impl;

import static org.junit.jupiter.api.Assertions.*;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Optional;

import static org.mockito.Mockito.*;
@SpringBootTest
public class ProductServiceImplTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    private Product product = new Product(1L, "Product 1", 10.0, 5);

    @BeforeEach
    public void setUp() {
        when(productRepository.save(any(Product.class))).thenReturn(product);
        when(productRepository.findAll()).thenReturn(List.of(product));
        when(productRepository.findById(1L)).thenReturn(Optional.of(product));
    }

    @Test
    public void testSaveProduct() {
        Product savedProduct = productService.saveProduct(new Product());

        assertNotNull(savedProduct.getId());
        verify(productRepository, times(1)).save(any(Product.class));
    }

    @Test
    public void testGetAllProducts() {
        assertTrue(!productService.getAllProducts().isEmpty());
        verify(productRepository, times(1)).findAll();
    }

    @Test
    public void testGetProductById() {
        Product retrievedProduct = productService.getProductById(1L).orElse(null);

        assertEquals("Product 1", retrievedProduct.getName());
        verify(productRepository, times(1)).findById(1L);
    }
}

