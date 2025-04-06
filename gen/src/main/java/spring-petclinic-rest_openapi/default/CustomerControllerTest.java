@RunWith(SpringRunner.class)
@SpringBootTest
public class CustomerControllerTest {

    @Autowired
    private TestRestTemplate restTemplate;

    @Test
    public void testGetAllCustomers() {
        List<Customer> customers = restTemplate.getForEntity("/api/customers", Customer.class).getBody();
        Assert.assertTrue(customers != null);
    }

    @Test
    public void testGetCustomerById() {
        Customer customer = restTemplate.getForEntity("/api/customers/1", Customer.class).getBody();
        Assert.assertNotNull(customer);
    }

    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer(1L, "John Doe");
        Customer createdCustomer = restTemplate.postForEntity("/api/customers", customer, Customer.class).getBody();
        Assert.assertEquals(createdCustomer.getId(), 1L);
    }

    @Test
    public void testUpdateCustomer() {
        Customer customer = new Customer(1L, "Jane Doe");
        Customer updatedCustomer = restTemplate.putForEntity("/api/customers/1", customer, Customer.class).getBody();
        Assert.assertEquals(updatedCustomer.getName(), "Jane Doe");
    }

    @Test
    public void testDeleteCustomer() {
        restTemplate.delete("/api/customers/1");
        // No response expected
    }
}

