@RestController 
public class OrderController {

    @Autowired
    private OrderOrderMapper orderMapper;

    @GetMapping("/orders")
    public List<Order> getAllOrders() {
        // Implementation to fetch all orders from the database
        return new ArrayList<>();
    }

    @PostMapping
    public void createOrder(@RequestBody Order order) {
        // Implementation to save the order in the database
    }
}

