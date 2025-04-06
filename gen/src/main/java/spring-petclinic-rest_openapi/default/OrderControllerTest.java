@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllOrders() {
        List<Order> orders = restTemplate.getForEntity("/api/orders", Order.class).getBody();
        Assert.assertTrue(orders != null);
    }

    @Test
    public void testGetOrderById() {
        Order order = restTemplate.getForEntity("/api/orders/1", Order.class).getBody();
        Assert.assertNotNull(order);
    }

    @Test
    public void testCreateOrder() {
        Order order = new Order(1L, "John Doe");
        Order createdOrder = restTemplate.postForEntity("/api/orders", order, Order.class).getBody();
        Assert.assertEquals(createdOrder.getId(), 1L);
    }

    @Test
    public void testUpdateOrder() {
        Order order = new Order(1L, "Jane Doe");
        Order updatedOrder = restTemplate.putForEntity("/api/orders/1", order, Order.class).getBody();
        Assert.assertEquals(updatedOrder.getName(), "Jane Doe");
    }

    @Test
    public void testDeleteOrder() {
        restTemplate.delete("/api/orders/1");
        // No response expected
    }
}

