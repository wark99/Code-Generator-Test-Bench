// src/main/java/com/example/ecommerce/services/ProductService.java
package com.example.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ecommerce.models.Product;
import com.example.ecommerce.repositories.ProductRepository;

public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    public Iterable<Product> getAllProducts() {
        return productRepository.findAll();
    }

    public Product getProductById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    public Product createProduct(Product product) {
        return productRepository.save(product);
    }
}

