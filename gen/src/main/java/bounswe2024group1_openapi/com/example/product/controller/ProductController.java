// src/main/java/com/example/product/controller/ProductController.java

package com.example.product.controller;

import com.example.product.model.Product;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductController {
  
  private final Product productRepository;
  
  public ProductController(Product productRepository) {
    this.productRepository = productRepository;
  }
  
  @GetMapping("/products")
  public Iterable<Product> getAllProducts() {
    return productRepository.findAll();
  }
  
  @GetMapping("/products/{id}")
  public Product getProductById(@PathVariable Long id) {
    return productRepository.findById(id).orElseThrow();
  }
}

