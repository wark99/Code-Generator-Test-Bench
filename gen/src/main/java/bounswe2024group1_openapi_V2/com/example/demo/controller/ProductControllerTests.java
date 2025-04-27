package com.example.demo.controller;

import static org.mockito.Mockito.*;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;
import org.springframework.test.web.servlet.MockMvc;

import com.example.demo.model.Product;
import com.example.demo.service.ProductService;

@ExtendWith(SpringExtension.class)
@WebMvcTest(ProductController.class)
public class ProductControllerTests {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private ProductService productService;

    @InjectMocks
    private ProductController productController;

    private List<Product> products;
    private Product product1, product2;

    @BeforeEach
    public void setup() {
        MockitoAnnotations.openMocks(this);
        
        product1 = new Product(1L, "Product 1", 10.0, 100);
        product2 = new Product(2L, "Product 2", 20.0, 200);

        products = Arrays.asList(product1, product2);
    }

    @Test
    public void testGetAllProducts() throws Exception {
        when(productService.findAll()).thenReturn(products);

        mockMvc.perform(get("/api/products"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$[0].name", is("Product 1")))
            .andExpect(jsonPath("$[1].price").value(20.0))
            .andExpect(jsonPath("$.length()").value(2));

        verify(productService, times(1)).findAll();
    }

    @Test
    public void testGetProductById() throws Exception {
        when(productService.findById(1L)).thenReturn(product1);

        mockMvc.perform(get("/api/products/{id}", 1))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name", is("Product 1")));

        verify(productService, times(1)).findById(1L);
    }

    @Test
    public void testCreateProduct() throws Exception {
        when(productService.save(any(Product.class))).thenReturn(product1);

        mockMvc.perform(post("/api/products")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\": \"New Product\", \"price\": 30.0, \"stockQuantity\": 300}"))
            .andExpect(status().isCreated())
            .andExpect(jsonPath("$.name", is("New Product")));

        verify(productService, times(1)).save(any(Product.class));
    }

    @Test
    public void testUpdateProduct() throws Exception {
        when(productService.findById(1L)).thenReturn(product1);

        mockMvc.perform(put("/api/products/{id}", 1)
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\": \"Updated Product\", \"price\": 35.0, \"stockQuantity\": 350}"))
            .andExpect(status().isOk())
            .andExpect(jsonPath("$.name", is("Updated Product")));

        verify(productService, times(1)).findById(1L);
    }

    @Test
    public void testDeleteProduct() throws Exception {
        doNothing().when(productService).delete(any(Product.class));

        mockMvc.perform(delete("/api/products/{id}", 1))
            .andExpect(status().isNoContent());

        verify(productService, times(1)).delete(any(Product.class));
    }
}

