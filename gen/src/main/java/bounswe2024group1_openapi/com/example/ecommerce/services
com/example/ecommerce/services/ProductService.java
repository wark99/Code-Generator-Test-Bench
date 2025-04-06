// src/main/java/com/example/ecommerce/services/ProductService.java
package com.example.ecommerce.services;

import com.example.ecommerce.models.Product;
import org.springframework.stereotype.Service;

@Service
public class ProductService {

    // In a real application, this would interact with a database.
    // For this example, we'll use a simple in-memory list.
    private static java.util.List<Product> products = java.util.Arrays.asList(
            new Product(1L, "Laptop", "Powerful laptop", 1200.00, "Electronics"),
            new Product(2L, "T-Shirt", "Cotton T-Shirt", 25.00, "Clothing")
    );

    public List<Product> getAllProducts() {
        return products;
    }

    public Product getProductById(Long id) {
        return products.stream()
                .filter(product -> product.getId().equals(id))
                .findFirst()
                .orElse(null);
    }
}


// src/main/java/com/example/ecommerce/services/CartService.java
package com.example.ecommerce.services;

import com.example.ecommerce.models.CartItem;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CartService {

    // In a real application, this would interact with a database.
    // For this example, we'll use a simple in-memory list.
    private static java.util.List<CartItem> cartItems = new ArrayList<>();

    public CartItem addItem(CartItem cartItem) {
        cartItems.add(cartItem);
        return cartItem;
    }

    public List<CartItem> getAllCartItems() {
        return cartItems;
    }
}

