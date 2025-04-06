import java.util.List;

public class OrderController {
    private List<Order> orders;

    // Constructor
    public OrderController() {
        this.orders = new ArrayList<>();
    }

    // Add Product to Order
    public void addProductToOrder(String orderId, String productId) {
        Order order = findOrderById(orderId);
        if (order != null) {
            Product product = findProductById(productId);
            if (product != null) {
                order.addProduct(product);
            }
        } else {
            System.out.println("Order not found");
        }
    }

    // Find Order by ID
    private Order findOrderById(String orderId) {
        for (Order order : orders) {
            if (order.getId().equals(orderId)) {
                return order;
            }
        }
        return null;
    }

    // Find Product by ID
    private Product findProductById(String productId) {
        for (Product product : products) {
            if (product.getId().equals(productId)) {
                return product;
            }
        }
        return null;
    }

    // Process Order
    public void processOrder() {
        List<Order> processedOrders = new ArrayList<>();
        for (Order order : orders) {
            double totalPrice = order.getTotalPrice();
            System.out.println("Processing Order " + order.getId());
            System.out.println("Total Price: " + totalPrice);
            processedOrders.add(order);
        }
    }

    // Add Product to Products List
    public void addProduct(Product product) {
        this.products.add(product);
    }

    // Get Orders
    public List<Order> getOrders() { return orders; }
}

