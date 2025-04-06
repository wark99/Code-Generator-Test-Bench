package com.example.ecommerce.controller;

import com.example.ecommerce.model.Order;
import com.example.ecommerce.model.Product;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.ModelAndViewResolver;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/cart")
public class ShoppingCartController {

    @Autowired
    private ShoppingCartService shoppingCartService;

    @GetMapping
    public String viewCart() {
        return "cart.html"; // Assuming you have a cart.html template
    }

    @PostMapping
    public String addProductToCart(@ModelAttribute Product product, Authentication authentication) {
        shoppingCartService.addProduct(product, authentication.getName());
        return "redirect:/cart"; // Redirect to the cart view
    }

    @GetMapping("/remove/{id}")
    public String removeProductFromCart(@PathVariable Long id, Authentication authentication) {
        shoppingCartService.removeProduct(id, authentication.getName());
        return "redirect:/cart";
    }

    @GetMapping("/summary")
    public String cartSummary() {
        return "cart_summary.html"; // Assuming you have a cart_summary.html template
    }
}

