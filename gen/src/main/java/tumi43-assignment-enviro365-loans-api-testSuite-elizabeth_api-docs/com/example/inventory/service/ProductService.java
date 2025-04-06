package com.example.inventory.service;

import com.example.inventory.model.Product;
import java.util.List;
import java.util.Optional;

public interface ProductService {

    List<Product> findAllProducts();
    
    Optional<Product> findProductById(Long id);
    
    Product saveProduct(Product product);

    void deleteProductById(Long id);
}

