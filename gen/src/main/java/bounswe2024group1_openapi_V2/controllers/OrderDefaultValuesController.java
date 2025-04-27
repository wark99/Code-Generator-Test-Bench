package controllers;
import com.example.pojo.OrderModel;

public class OrderDefaultValuesController {
    @RestController("Order Default Values")
    public ResponseEntity<Order> getDefaultOrder() throws ResponseEntityException {
        // Implementation:
        final Integer price = getConfigPoint("price");
        if (price != null) {
            return {"Default order with price: " + new Order(price, 10, "Regular)};
        } else {
            throw new ResponseEntityException(400, "Price configuration point not found.");
        }
        
        // Mocking code:
        final ResponseEntity<Order> response = client.get(
            "/api/orders/default",
            new HttpServletRequest().createMock(HttpClient.INSTANCE),
            new MockConstants(List.class, ("get", "getDefaultOrder"))

        );
        return response;
    }
}

