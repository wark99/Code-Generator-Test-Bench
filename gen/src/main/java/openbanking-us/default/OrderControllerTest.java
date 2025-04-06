// OrderControllerTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderControllerTest {

    @Autowired
    private OrderController orderController;

    @Test
    public void testAddOrder() {
        Order order = new Order(1, "John Doe", 100.0);
        String response = orderController.addOrder(order);
        assertEquals("Order added successfully", response);
        assertTrue(orderService.getAllOrders().contains(order));
    }
}

