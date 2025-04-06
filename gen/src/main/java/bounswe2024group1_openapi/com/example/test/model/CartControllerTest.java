package com.example.test.model;

import com.example.model.CartModel;
import com.example.model.User;
import com.example.service.UserService;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

/**
 * Test class for testing cart operations.
 */
public class CartControllerTest {

    @BeforeEach
    void setUp() {
        // Bootstrap the application
        SpringApplication.bootstrapApplication(new CartController, new CartService, new UserService);
    }

    @Test
    void testSaveMultipleProducts() throws Exception {
        User user = userService.createUser("Admin", "admin@example.com");
        
        // Setup product data
        Product product1 = new Product();
        product1.setName("Laptop");
        product1.setPrice(999.99);

        Product product2 = new Product();
        product2.setName("Phone");
        product2.setPrice(699.99);

        Product product3 = new Product();
        product3.setName("Headphones");
        product3.setPrice(149.99);

        CartModel cartModel = new CartModel();
        cartModel.setUser(user);
        cartModel.addProduct(product1);
        cartModel.addProduct(product2);
        cartModel.addProduct(product3);

        // Now, the saveNetworkRequest will be called for each product with their respective name and price.
    }
}

