// src/main/java/com/example/ecommerce/controllers/CartController.java
package com.example.ecommerce.controllers;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import com.example.ecommerce.models.CartItem;
import com.example.ecommerce.services.CartService;

@RestController
@RequestMapping("/cart")
public class CartController {

    private final CartService cartService;

    @Autowired
    public CartController(CartService cartService) {
        this.cartService = cartService;
    }

    @PostMapping("/items")
    public ResponseEntity<CartItem> addItemToCart(@RequestBody CartItem cartItem) {
        CartItem addedItem = cartService.addItem(cartItem);
        return ResponseEntity.status(HttpStatus.CREATED).body(addedItem);
    }

    @GetMapping
    public Iterable<CartItem> getCartItems() {
        return cartService.getAllCartItems();
    }
}

