package com.example.demo.controller;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import java.util.Collections;
import java.util.Optional;

import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

public class ProductControllerTest {

    @Mock
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    private Product testProduct;

    @BeforeEach
    public void setup() {
        testProduct = new Product();
        testProduct.setId(1L);
        testProduct.setName("Sample Product");
        testProduct.setDescription("This is a sample product.");
        testProduct.setPrice(9.99);
    }

    @Test
    public void whenGetAllProducts_thenStatus200AndListIsReturned() throws Exception {
        when(productService.getAllProducts()).thenReturn(Collections.singletonList(testProduct));

        // MockMvc setup and request handling would go here.

        // Assertions would go here.
        verify(productService, times(1)).getAllProducts();
    }

    @Test
    public void whenGetProductByIdAndFound_thenStatus200() throws Exception {
        when(productService.getProductById(any(Long.class))).thenReturn(testProduct);

        ResponseEntity<Product> response = productController.getProductById(1L);
        
        assertThat(response.getStatusCode(), is(HttpStatus.OK));
        assertThat(response.getBody().getName(), is("Sample Product"));
    }

    @Test
    public void whenGetProductByIdAndNotFound_thenStatus404() throws Exception {
        doThrow(new RuntimeException()).when(productService).getProductById(any(Long.class));

        ResponseEntity<Product> response = productController.getProductById(1L);
        
        assertThat(response.getStatusCode(), is(HttpStatus.NOT_FOUND));
    }
}

