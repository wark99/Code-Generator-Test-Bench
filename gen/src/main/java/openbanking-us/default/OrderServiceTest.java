// OrderServiceTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderServiceTest {

    @Autowired
    private OrderService orderService;

    @Test
    public void testAddOrder() {
        Order order = new Order(1, "John Doe", 100.0);
        orderService.addOrder(order);
        assertTrue(orderService.getAllOrders().contains(order));
    }
}

