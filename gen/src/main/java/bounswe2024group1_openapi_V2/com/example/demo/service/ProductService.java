package com.example.demo.service;

import com.example.demo.model.Product;
import java.util.List;

public interface ProductService {

    List<Product> findAll();

    Product findById(Long id);

    Product save(Product product);

    void delete(Product product);
}

