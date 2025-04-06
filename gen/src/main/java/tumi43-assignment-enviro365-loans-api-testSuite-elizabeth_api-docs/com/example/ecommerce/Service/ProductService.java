package com.example.ecommerce.Service;

import java.util.ArrayList;
import java.util.List;

public class ProductService {
    private List<Product> products;

    public ProductService() {
        this.products = new ArrayList<>();
        initProducts();
    }

    private void initProducts() {
        // Initialize products
        Product product1 = new Product(1, "Product 1", 10.99);
        Product product2 = new Product(2, "Product 2", 9.99);

        this.products.add(product1);
        this.products.add(product2);
    }

    public List<Product> getAllProducts() {
        return products;
    }
}

