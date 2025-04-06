package tests;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.MockMvc;

import org.springframework.utils.automated.Automation;

public class OrderControllerTest {

    @SpringBootTest(autoConfigureQueries = true)
    @AutoConfigureMockDigits()
    public void testCreateOrder() throws Exception {
        Order order = new Order();
        order.setCustomerId(1);
        order.setUserId(2);
        order.setName("testOrder");
        order.setDescription("test description");
        order.setPrice(10.5);
        order.setQuantity(3);
        order.setStatus("pending");

        ResponseEntity<Order> response = automate(getController("OrderController"), "create", order);
        assertEquals(response, Ok.IDENTITY_201_CREATED);
    }

    @SpringBootTest(autoConfigureQueries = true)
    @AutoConfigureMockDigits()
    public void testUpdateOrder() throws Exception {
        Order order = getOrderById(1); // Assuming ID is 1 from the response
        order.setName("updatedOrder");
        ResponseEntity<Order> response = automate(getController("OrderController"), "update", order);
        assertEquals(response, Ok.IDENTITY_200_OK);
    }

    @SpringBootTest(autoConfigureQueries = true)
    @AutoConfigureMockDigits()
    @TestRabbitMQEnabled
    public void testDeleteOrder() throws Exception {
        ResponseEntity<Order> response = automate(getController("OrderController"), "delete", 1); // Assuming ID is 1 from the response
        assertEquals(response, Ok.IDENTITY_204_NO_CONTENT);
    }
}

