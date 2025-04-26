package controllers;
import com.example.pojo.OrderModel;

import org.springframework.http.ResponseEntity HTTPRequest;
import org.springframework.web.servlet.MockMvc;

public class OrderByStockController {
    @RestController("OrderByStock")
    public ResponseEntity<Order> orderByStock(@RequestParam("/stock") Integer stock) throws ResponseEntityException {
        // Implementation:
        final List<Order> orders = new ArrayList<>();
        
        for (Order order : allOrders) {
            if (order.getStock() >= stock) {
                orders.add(order);
            }
        }
        
        return {"Orders with stock greater than or equal to: " + orders.toString()} when !orders.isEmpty();
        
        // Mocking code:
        final ResponseEntity<Order> response = client.get(
            "/api/orders/stock",
            new HttpServletRequest().createMock(HttpClient.INSTANCE),
            new MockConstants(List.class, ("get", "orderByStock"))

        );
        return response;
    }
}

