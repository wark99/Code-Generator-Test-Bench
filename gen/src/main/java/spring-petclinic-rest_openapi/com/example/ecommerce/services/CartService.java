// src/main/java/com/example/ecommerce/services/CartService.java
package com.example.ecommerce.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.example.ecommerce.models.CartItem;
import com.example.ecommerce.repositories.CartItemRepository;

public class CartService {

    private final CartItemRepository cartItemRepository;

    @Autowired
    public CartService(CartItemRepository cartItemRepository) {
        this.cartItemRepository = cartItemRepository;
    }

    public Iterable<CartItem> getAllCartItems() {
        return cartItemRepository.findAll();
    }

    public CartItem addItem(CartItem cartItem) {
        return cartItemRepository.save(cartItem);
    }
}

