// src/main/java/com/example/ecommerce/controllers/ProductController.java
package com.example.ecommerce.controllers;

import com.example.ecommerce.models.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/products")
public class ProductController {

    @Autowired
    private ProductService productService;

    @GetMapping
    public List<Product> getAllProducts() {
        return productService.getAllProducts();
    }

    @GetMapping("/{id}")
    public Product getProductById(@PathVariable Long id) {
        return productService.getProductById(id);
    }

    // Add more endpoints here (e.g., create, update, delete)
}


// src/main/java/com/example/ecommerce/controllers/CartController.java
package com.example.ecommerce.controllers;

import com.example.ecommerce.models.CartItem;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private CartService cartService;

    @PostMapping
    public CartItem addItemToCart(@RequestBody CartItem cartItem) {
        return cartService.addItem(cartItem);
    }

    @GetMapping
    public List<CartItem> getCartItems() {
        return cartService.getAllCartItems();
    }

    // Add more endpoints here (e.g., remove item, update quantity)
}

