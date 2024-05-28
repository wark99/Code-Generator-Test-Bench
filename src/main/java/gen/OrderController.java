package gen;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/order")
public class OrderController {

    @GetMapping
    public List<Order> getAllOrders() {
        // Logic to fetch all orders
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        // Logic to create a new order
    }

    @GetMapping("/{orderId}")
    public Order getOrderById(@PathVariable int orderId) {
        // Logic to get an order by ID
    }

    @PutMapping("/{orderId}")
    public void updateOrder(@PathVariable int orderId, @RequestBody Order order) {
        // Logic to update an existing order
    }

    @PatchMapping("/{orderId}")
    public void partialUpdateOrder(@PathVariable int orderId, @RequestBody Order order) {
        // Logic to update an existing order partially
    }

    @DeleteMapping("/{orderId}")
    public void deleteOrder(@PathVariable int orderId) {
        // Logic to delete an order
    }
}

