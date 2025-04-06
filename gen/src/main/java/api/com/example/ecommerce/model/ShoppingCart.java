package com.example.ecommerce.model;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {

    private List<Product> items = new ArrayList<>();

    public void addItem(Product product) {
        items.add(product);
    }

    public void removeItem(Product product) {
        items.remove(product);
    }

    public List<Product> getItems() {
        return items;
    }

    public double getTotal() {
        double total = 0;
        for (Product product : items) {
            total = total + product.getPrice();
        }
        return total;
    }
}

