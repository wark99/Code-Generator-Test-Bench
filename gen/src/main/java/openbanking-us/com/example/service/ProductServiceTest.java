// ProductServiceTest.java

package com.example.service;

import com.example.model.Product;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.when;

@ExtendWith(MockitoExtension.class)
public class ProductServiceTest {
    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductService productService;

    @Test
    public void testGetAllProducts() {
        when(productRepository.findAll()).thenReturn(List.of(new Product(1, "Product 1", 10.99 * 1, 1)));
        assertEquals(1, productService.getAllProducts().size());
    }

    @Test
    public void testGetProductById() {
        Product product = new Product(1, "Product 1", 10.99 * 1, 1);
        when(productRepository.findById(1L)).thenReturn(java.util.Optional.of(product));
        assertEquals(1, productService.getProductById(1L).getId());
    }

    @Test
    public void testCreateProduct() {
        Product product = new Product(0, "Product 0", 10.99 * 0, 0);
        when(productRepository.save(product)).thenReturn(product);
        assertEquals(1, productService.createProduct(new Product(0, "", "", "")).getId());
    }

    @Test
    public void testUpdateProduct() {
        Product product = new Product(1, "Product 1", 10.99 * 1, 1);
        when(productRepository.findById(1L)).thenReturn(java.util.Optional.of(product));
        when(productRepository.save(product)).thenReturn(product);
        assertEquals(1, productService.updateProduct(1L, new Product(2, "", 0, "")));
    }

    @Test
    public void testDeleteProduct() {
        Product product = new Product(1, "Product 1", 10.99 * 1, 1);
        when(productRepository.findById(1L)).thenReturn(java.util.Optional.of(product));
        productService.deleteProduct(1L);
        assertEquals(null, productService.getProductById(1L));
    }
}

