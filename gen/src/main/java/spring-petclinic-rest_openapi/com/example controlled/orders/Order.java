package com.example controlled.orders;

public class Order extends POJO {
    private String orderId;
    private String orderDate;
    private String customerId;
    private String productCategoryId;
    private String status; // "processing", "shipped", "delivered"

    public String getOrderId() {
        return orderId;
    }

    public void setOrderId(String orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getClientId() {
        return customerId;
    }

    public void setClientId(String customerId) {
        this.customerId = customerId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}

