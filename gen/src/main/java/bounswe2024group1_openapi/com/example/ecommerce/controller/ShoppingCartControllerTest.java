package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.security.test.context.TestSecurityContext;
import org.springframework.test.context.ActiveProfiles;

import java.util.ArrayList;
import java.util.List;

@ActiveProfiles
@WebMvcTest(ShoppingCartController.class)
@TestSecurityContext
public class ShoppingCartControllerTest {

    @Autowired
    private ShoppingCartController shoppingCartController;

    @BeforeEach
    void setUp() {
        // Reset the shopping cart for each test
        shoppingCartController.addProduct(new Product(), "testuser");
    }

    @Test
    void addProductToCart() {
        // Add a product to the cart
        // Assertions would go here to verify the cart is updated correctly
    }

    @Test
    void removeProductFromCart() {
        // Assertions would go here to verify the cart is updated correctly
    }
}

