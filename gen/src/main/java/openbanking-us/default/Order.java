// Order.java

public class Order {
    private int id;
    private String customerName;
    private String orderDate;
    private double totalPrice;

    public Order(int id, String customerName, double totalPrice) {
        this.id = id;
        this.customerName = customerName;
        this.orderDate = new java.util.Date().toString();
        this.totalPrice = totalPrice;
    }

    // Getters and Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}

