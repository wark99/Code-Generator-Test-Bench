// src/main/java/com/example/product/service/ProductService.java

package com.example.product.service;

import com.example.product.model.Product;
import com.example.product.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
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
    return productRepository.findById(id).orElseThrow();
  }
}

