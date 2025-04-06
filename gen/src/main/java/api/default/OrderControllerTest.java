import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class OrderControllerTest {
    private OrderController orderController;

    @Test
    public void testAddProductToOrder() {
        orderController = new OrderController();
        Product product1 = new Product("P1", "Product 1", 10.0);
        Product product2 = new Product("P2", "Product 2", 20.0);

        orderController.addProduct(product1);
        orderController.addProduct(product2);

        Order order = orderController.getOrders().get(0);
        assertEquals(30.0, order.getTotalPrice());

    }

    @Test
    public void testFindOrderById() {
        OrderController orderController = new OrderController();
        Product product1 = new Product("P1", "Product 1", 10.0);

        orderController.addProduct(product1);
        orderController.processOrder();

        Order foundOrder = orderController.findOrderById("O1");
        assertNotNull(foundOrder);
    }

    @Test
    public void testFindProductById() {
        OrderController orderController = new OrderController();
        Product product1 = new Product("P1", "Product 1", 10.0);

        orderController.addProduct(product1);
        orderController.processOrder();

        Product foundProduct = orderController.findProductById("P1");
        assertNotNull(foundProduct);
    }

    @Test
    public void testProcessOrder() {
        OrderController orderController = new OrderController();
        Product product1 = new Product("P1", "Product 1", 10.0);
        Product product2 = new Product("P2", "Product 2", 20.0);

        orderController.addProduct(product1);
        orderController.addProduct(product2);

        Order processedOrder = orderController.processOrder();
        assertEquals(30.0, processedOrder.getTotalPrice());
    }
}

