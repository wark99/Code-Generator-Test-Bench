@SpringBootTest
public class CustomerTest {
    
    @Autowired
    private TestCustomerRepository testCustomerRepository;
    
    @Test
    public void testGetAllCustomers() {
        List<Customer> customers = testCustomerRepository.findAll();
        assertEquals(0, customers.size());
    }
    
    @Test
    public void testGetCustomerById() {
        Customer customer = new Customer("John Doe", "john.doe@example.com");
        testCustomerRepository.save(customer);
        Customer foundCustomer = testCustomerRepository.findById(1L).orElseThrow();
        assertEquals(customer.getName(), foundCustomer.getName());
        assertEquals(customer.getEmail(), foundCustomer.getEmail());
    }
    
    @Test
    public void testCreateCustomer() {
        Customer customer = new Customer("John Doe", "john.doe@example.com");
        Customer createdCustomer = testCustomerRepository.save(customer);
        assertEquals(customer.getName(), createdCustomer.getName());
        assertEquals(customer.getEmail(), createdCustomer.getEmail());
    }
}

