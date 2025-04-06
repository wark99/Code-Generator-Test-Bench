package com.example.models;

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

package com.example.models;

import com.example.utils.StatusModel;

public class OrderModel extends Serializable {
    private String customer;
    private String product;
    private double price;
    private int quantity;
    
    public OrderModel(String customer, String product, double price, int quantity) {
        this.customer = customer;
        this.product = product;
        this.price = price;
        this.quantity = quantity;
    }

    // getters and setters
}

