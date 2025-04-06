package com.example.e commerce;

import com.example.utils.ImageModel;
import com.example.utils.StatusModel;

public class ProductModel extends Serializable {
    private String name;
    private String description;
    private double price;
    private int quantityAvailable;
    private CategoryModel category;
    private StatusModel status;
    private String user_id;

    public ProductModel() {
        super();
    }

    public void setName(String name) { this.name = name; }
    public String getName() { return name; }

    public void setDescription(String description) { this.description = description; }
    public String getDescription() { return description; }

    public void setPrice(double price) { this.price = price; }
    public double getPrice() { return price; }

    public void setQuantityAvailable(int quantityAvailable) {
        this.quantityAvailable = quantityAvailable;
    }

    public int getQuantityAvailable() {
        return quantityAvailable;
    }

    public void setCategory(CategoryModel category) { this.category = category; }
    public CategoryModel getCategory() { return category; }

    public void setStatus(StatusModel status) { this.status = status; }
    public StatusModel getStatus() { return status; }

    public void setUserId(String user_id) { this.user_id = user_id; }
    public String getUserId() { return user_id; }
}

package com.example.models;

import com.example.utils.ImageModel;
import com.example.utils.StatusModel;

public class InventoryModel extends Serializable {
    private int id;
    private ProductModel product;
    private int stock;

    public InventoryModel() {
        super();
    }

    public void setId(int id) { this.id = id; }
    public int getId() { return id; }

    public void setProduct(ProductModel product) { this.product = product; }
    public ProductModel getProduct() { return product; }

    public void setStock(int stock) {
        if (stock < 0) {
            throw new IllegalArgumentException("Stock cannot be negative");
        }
        this.stock = stock;
    }

    public int getStock() {
        return stock >= 0 ? stock : 0;
    }
}

public class OrderModel extends Serializable {
    private String user_id;
    private CartModel cart;
    private List<OrderItemModel> orderItems;
    private String date;

    public OrderModel() {
        super();
    }

    public void setUserId(String user_id) { this.user_id = user_id; }
    public String getUserId() { return user_id; }

    public void setCart(CartModel cart) { this.cart = cart; }
    public CartModel getCart() { return cart; }

    public void addOrderItem(OrderItemModel orderItem) {
        if (cart.getAvailableSpace() < 0 || cart.getAvailableSpace() == null) {
            throw new IllegalStateException("No space in cart");
        }
        this.orderItems.add(orderItem);
    }

    public List<OrderItemModel> getOrderItems() { return orderItems; }

    public String getDate() { return date; }
}

