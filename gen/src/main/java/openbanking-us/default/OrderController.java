// OrderController.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/orders")
public class OrderController {

    @Autowired
    private OrderService orderService;

    // Add a new order
    @PostMapping
    public String addOrder(@RequestBody Order order) {
        orderService.addOrder(order);
        return "Order added successfully";
    }

    // Get all orders
    @GetMapping
    public List<Order> getAllOrders() {
        return orderService.getAllOrders();
    }
}

