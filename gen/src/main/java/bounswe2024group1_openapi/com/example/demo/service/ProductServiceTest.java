package com.example.demo.service;

import com.example.demo.model.Product;
import com.example.demo.repository.ProductRepository;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.boot.test.context.SpringBootTest;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest
public class ProductServiceTest {

    @Mock
    private ProductRepository productRepository;

    @InjectMocks
    private ProductServiceImpl productService;

    private List<Product> products;

    @BeforeEach
    public void setUp() {
        products = Arrays.asList(
                new Product(1L, "Product 1", 10.0),
                new Product(2L, "Product 2", 20.0)
        );
    }

    @Test
    public void whenFindAll_thenReturnAllProducts() {
        when(productRepository.findAll()).thenReturn(products);

        List<Product> retrievedProducts = productService.findAllProducts();

        assertEquals(2, retrievedProducts.size());
        verify(productRepository).findAll();
    }

    @Test
    public void whenFindById_thenReturnProduct() {
        Product product = products.get(0);
        when(productRepository.findById(product.getId())).thenReturn(Optional.of(product));

        Optional<Product> retrievedProduct = productService.findProductById(product.getId());

        assertTrue(retrievedProduct.isPresent());
        assertEquals(product.getName(), retrievedProduct.get().getName());
        verify(productRepository).findById(product.getId());
    }

    @Test
    public void whenSave_thenReturnSavedProduct() {
        Product newProduct = new Product(null, "New Product", 15.0);
        Product savedProduct = new Product(3L, "New Product", 15.0);

        when(productRepository.save(any(Product.class))).thenReturn(savedProduct);

        Product result = productService.saveProduct(newProduct);

        assertEquals("New Product", result.getName());
        verify(productRepository).save(any(Product.class));
    }

    @Test
    public void whenDelete_thenReturnVoid() {
        Long productId = 1L;
        productService.deleteProduct(productId);

        verify(productRepository).deleteById(productId);
    }
}

