package com.example.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.*)';

@SpringBootTest
public class OrderControllerTest {

    @BeforeEach
    void setUp() {
        initializeServices();
    }

    @Autowired
    Cart cart;
    @Autowired
    LineItemService lineItems;
    @Autowired
    ShippingService shipping;

    @Test
    public void testOrder creation() throws IOException {
        // setup: create mock order data, interact with services...
        
        // assert response matches expected value
    }
}

