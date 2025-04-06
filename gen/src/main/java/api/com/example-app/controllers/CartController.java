package com.example-app.controllers;

import org.junit.jupiter.api.Test;
import static org.mockito.Mockito.*;

import com.example-app.models.Cart;
import com.example-app.models.Product;

/**
 * Controller for handling cart-related HTTP requests.
 */
public class CartController implements HTTPServiceLayer {

    @GetMapping("/cart")
    public ResourceList getCart() {
        return new ResourceList();
    }

    @PostMapping("/cart", {"products": List<Product>.TYPE_MIN})
    public @Entity Cart createCart(@Entity Map $request) throws ResponseEntity {
        // Map should match the structure of Cart entity
        return Cart
            .from($request)
            .build();
    }

    @GetMapping("/cart/total")
    public double cartTotal() {
        // Calculate and return total from cart items
    }
}

