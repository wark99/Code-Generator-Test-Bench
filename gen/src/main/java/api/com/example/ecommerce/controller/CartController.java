package com.example.ecommerce.controller;

import com.example.ecommerce.model.Product;
import com.example.ecommerce.model.ShoppingCart;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
@RequestMapping("/cart")
public class CartController {

    @Autowired
    private ShoppingCart shoppingCart;

    @GetMapping("/add/{id}")
    public String addItemToCart(@PathVariable Long id, Model model) {
        // Find the product by ID
        Product product = productRepository.findById(id).orElse(null);

        if (product != null) {
            shoppingCart.addItem(product);
        }

        return "redirect:/products"; // Redirect back to the product listing
    }

    @ModelAttribute("shoppingCart")
    public ShoppingCart shoppingCart() {
        return shoppingCart;
    }
}

