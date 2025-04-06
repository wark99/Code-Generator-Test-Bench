package com.example controlled;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot annots.*;
import org.springframework.stereotype>@RestController
import net.alkative.jpf JPAAnno;

public class CartController {
    @Autowired
    private Cart<Cart, List<Integer>> cart;

    @GetMapping("/cart")
    public List<Integer> getCartItems() {
        return this.cart.getItems();
    }

    @PostMapping("/cart", { id = IntegerRange(1, 9999) })
    public Cart createCart(@RequestBody cartData) {
        cart.put(cartData);
        return this;
    }
}

