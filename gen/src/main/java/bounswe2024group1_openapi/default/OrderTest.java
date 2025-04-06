@SpringBootTest
public class OrderTest {
    
    @Autowired
    private TestOrderRepository testOrderRepository;
    
    @Test
    public void testGetAllOrders() {
        List<Order> orders = testOrderRepository.findAll();
        assertEquals(0, orders.size());
    }
    
    @Test
    public void testGetOrderById() {
        Order order = new Order(new Customer("John Doe", "john.doe@example.com"));
        testOrderRepository.save(order);
        Order foundOrder = testOrderRepository.findById(1L).orElseThrow();
        assertEquals(order.getCustomer().getName(), foundOrder.getCustomer().getName());
    }
    
    @Test
    public void testCreateOrder() {
        Customer customer = new Customer("John Doe", "john.doe@example.com");
        Order order = new Order(customer);
        Order createdOrder = testOrderRepository.save(order);
        assertEquals(customer.getName(), createdOrder.getCustomer().getName());
    }
}

