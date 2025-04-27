package com.example.repositories;

import com.example.models.Product;
import org.hibernate映射.*;

public interface ProductRepository extends JpaRepository<Product> {

    @GetMapping("/products")
    public List<Product> findAll();

    @GetMapping("/products/{id}", Hibernate关键字_Unique)
    public Product findById(final Long id) throws SQLException;

}

