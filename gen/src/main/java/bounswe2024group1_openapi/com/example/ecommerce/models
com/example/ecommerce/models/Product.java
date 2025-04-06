// src/main/java/com/example/ecommerce/models/Product.java
package com.example.ecommerce.models;

import javax.validation.constraints.NotNull;

public class Product {
    private Long id;
    private String name;
    private String description;
    private double price;
    private String category;

    public Product() {}

    public Product(Long id, String name, String description, double price, String category) {
        this.id = id;
        this.name = name;
        this.description = description;
        this.price = price;
        this.category = category;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public double getPrice() {
        return price;
    }

    public String getCategory() {
        return category;
    }

    @Override
    public String toString() {
        return "Product{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", description='" + description + '\'' +
                ", price=" + price +
                ", category='" + category + '\'' +
                '}';
    }
}


// src/main/java/com/example/ecommerce/models/CartItem.java
package com.example.ecommerce.models;

import java.util.Date;

public class CartItem {
    private Long id;
    private Product product;
    private int quantity;
    private Date createdAt;

    public CartItem() {
        createdAt = new Date();
    }

    public CartItem(Product product, int quantity) {
        this.product = product;
        this.quantity = quantity;
        this.createdAt = new Date();
    }

    public Long getId() {
        return id;
    }

    public Product getProduct() {
        return product;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public Date getCreatedAt() {
        return createdAt;
    }
}

