import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest 
public class OrderTest {

    @BeforeEach
    void setUp() {
        orderMapper = new OrderMapper();
    }

    @Test 
    public void testCreateOrder_ShouldReturnNewOrderWithCorrectAttributes() {
        User user = mapper.getUserById(8);
        
        // Implementation to create orders if needed
        Order order = orderMapper.createOrder(null, 10, "Test order");
        
        assertNotNull(order);
        assertEquals("Test order", order.getTitle());
        assertEquals(10, order.getQuantity());
    }

    @Test 
    public void testGetOrderByOrderNumber_ShouldReturnCorrectOrder() {
        // Test data setup here
    }
}

