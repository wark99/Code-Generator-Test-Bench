// OrderTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderTest {

    @Test
    public void testOrderCreation() {
        Order order = new Order(1, "John Doe", 100.0);
        assertEquals(1, order.getId());
        assertEquals("John Doe", order.getCustomerName());
        assertEquals(100.0, order.getTotalPrice(), 0.01);
    }
}

