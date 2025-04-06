// OrderService.java

import java.util.ArrayList;
import java.util.List;

public class OrderService {
    private List<Order> orders;

    public OrderService() {
        this.orders = new ArrayList<>();
    }

    // Add a new order
    public void addOrder(Order order) {
        orders.add(order);
    }

    // Get all orders
    public List<Order> getAllOrders() {
        return orders;
    }
}

