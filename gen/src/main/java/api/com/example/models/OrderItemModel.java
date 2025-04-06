package com.example.models;

import com.example.utils.ImageModel;
import com.example.utils.StatusModel;

public class OrderItemModel extends Serializable {
    private String product;
    private int positionInCart;
    private double quantity;
    
    public OrderItemModel(String product, int positionInCart, double quantity) {
        this.product = product;
        this.positionInCart = positionInCart;
        this.quantity = quantity;
    }

    // getters and setters
}

