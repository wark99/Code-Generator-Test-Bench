// src/test/java/com/example/ecommerce/controllers/CartControllerTest.java
package com.example.ecommerce.controllers;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;

import com.example.ecommerce.models.CartItem;

import java.util.Arrays;
import java.util.List;

public class CartControllerTest {

    private CartController cartController;
    private CartService cartServiceMock;

    @BeforeEach
    void setUp() {
        cartServiceMock = Mockito.mock(CartService.class);
        cartController = new CartController(cartServiceMock);
    }

    @Test
    void addItemToCart() {
        CartItem cartItem = new CartItem(1L, 1);
        when(cartServiceMock.addItem(cartItem)).thenReturn(cartItem);
        ResponseEntity<CartItem> result = cartController.addItemToCart(cartItem);
        assertNotNull(result);
        assertEquals(HttpStatus.CREATED, result.getStatusCode());
    }

    @Test
    void getCartItems() {
        List<CartItem> cartItems = Arrays.asList(new CartItem(1L, 1), new CartItem(2L, 2));
        when(cartServiceMock.getAllCartItems()).thenReturn(cartItems);
        Iterable<CartItem> result = cartController.getCartItems();
        assertNotNull(result);
        assertEquals(2, result.size());
    }
}

