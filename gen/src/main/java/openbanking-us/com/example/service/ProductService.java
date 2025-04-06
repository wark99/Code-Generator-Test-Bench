// ProductService.java

package com.example.service;

import com.example.model.Product;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;
import java.util.Random;

@Service
public class ProductService {
    private List<Product> products = new ArrayList<>();

    public ProductService() {
        // Initialize products with some sample data
        for (int i = 0; i < 10; i++) {
            Product product = new Product(i, "Product " + i, 10.99 * i, i);
            products.add(product);
        }
    }

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        for (Product product : products) {
            if (product.getId().equals(id)) {
                return product;
            }
        }
        return null;
    }

    public Product createProduct(Product product) {
        // Add new product to the list
        int id = Math.max(1, getNewId()) + 1;
        product.setId(id);
        products.add(product);
        return product;
    }

    public Product updateProduct(Long id, Product product) {
        for (Product p : products) {
            if (p.getId().equals(id)) {
                // Update existing product
                p.setName(product.getName());
                p.setPrice(product.getPrice());
                break;
            }
        }
        return null;
    }

    public void deleteProduct(Long id) {
        for (int i = 0; i < products.size(); i++) {
            if (products.get(i).getId().equals(id)) {
                products.remove(i);
                break;
            }
        }
    }

    private int getNewId() {
        Random random = new Random();
        return random.nextInt(1000000) + 1;
    }
}

