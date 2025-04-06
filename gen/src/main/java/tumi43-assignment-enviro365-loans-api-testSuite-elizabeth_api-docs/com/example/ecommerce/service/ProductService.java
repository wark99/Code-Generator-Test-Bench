// src/main/java/com/example/ecommerce/service/ProductService.java

package com.example.ecommerce.service;

import com.example.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

@Service
public class ProductService {

    private final ProductRepository productRepository;

    @Autowired
    public ProductService(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    // Create a new product
    public Product create(Product product) {
        return productRepository.save(product);
    }

    // Get all products
    public Iterable<Product> getAll() {
        return productRepository.findAll();
    }

    // Get a product by ID
    public Product findById(Long id) {
        return productRepository.findById(id).orElse(null);
    }

    // Update a product
    public Product update(Long id, Product updatedProduct) {
        Product existingProduct = findById(id);
        if (existingProduct != null) {
            existingProduct.setName(updatedProduct.getName());
            existingProduct.setPrice(updatedProduct.getPrice());
            existingProduct.setDescription(updatedProduct.getDescription());

            return productRepository.save(existingProduct);
        }
        return null;
    }

    // Delete a product by ID
    public void delete(Long id) {
        productRepository.deleteById(id);
    }
}

