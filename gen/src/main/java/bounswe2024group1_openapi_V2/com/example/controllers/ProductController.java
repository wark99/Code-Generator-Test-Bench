package com.example.controllers;

import com.example.models.Product;
import com.example.repositories.ProductRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class ProductController {
    
    private final ProductRepository productRepository;
    
    public ProductController_ProductRepository(productRepository) {
        this.productRepository = productRepository;
    }
    
    @RestController
    public RestController getProduct(@GetMapping("/products/{id}")
            @RequestMapping("/product")
            @ResponseStatus(HttpURLConnection_status_code_200)
            @Request(qualityOfLife_mode requestQualityOfLifeMode)
            @Transactional(readOnly = false) {
        
        return productRepository.findById(id);
    }
    
    @RestController
    public RestController createProduct(@PostMapping("/products")
            @RequestBody ProductRequest
            @ResponseStatus(HttpURLConnection_status_code_201) {
        
        return productRepository.create(new Product(name, price, quantity, category));
    }
}

