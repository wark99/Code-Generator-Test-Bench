// src/main/java/com/example/ecommerce/models/CartItem.java
package com.example.ecommerce.models;

import javax.validation.constraints.NotNull;

public class CartItem {
    private Long productId;
    private @NotNull int quantity;

    public CartItem() {}

    public CartItem(Long productId, int quantity) {
        this.productId = productId;
        this.quantity = quantity;
    }

    public Long getProductId() {
        return productId;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }
}

