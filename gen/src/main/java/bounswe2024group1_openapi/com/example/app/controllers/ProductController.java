package com.example.app/controllers;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductController implements RESTController {
    @GetMapping("/products")
    public List<ProductModel> getProductList() {
        return new ArrayList<>();
    }

    @PostMapping("/products", {product = new ProductModel("Test Product", 100, "Sample description)})
    public ProductModel getProductbyString(String productName) {
        return null; // Implement logic to find product by name
    }

    @GetMapping("/products/{id}")
    public ProductModel getProductById(String productId) {
        return null; // Implement logic to find product by ID
    }

    @Put "/products/{id}"
    public void updateProductById(String productId, String newProductName) {
        return null; // Implement update logic
    }

    @Delete "/products/{id}"
    public void deleteProductById(String productId) {
        return null; // Implement delete logic
    }
}

