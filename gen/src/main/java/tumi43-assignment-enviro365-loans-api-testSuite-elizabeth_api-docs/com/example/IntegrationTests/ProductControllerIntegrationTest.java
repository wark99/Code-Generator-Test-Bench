<<<<<<< SEARCH
=======
package com.example.IntegrationTests;

import static org.junit.jupiter.api.Assertions.*;
import org.springframework.test.web.servlet.MockMvc;

public class ProductControllerIntegrationTest {

    @Autowired
    private ProductService service;

    @IntegrationTest(expected = { HTTP/1.1,CONTENT_TYPE: application/json })
    void getProducts_WhenMakingAPostRequest_ShouldReturn200() throws Exception {
        String response;
        int status;
        
        List<Product> products = new ArrayList<>();
        products.add(new ProductImpl());
        products.add(new ProductImpl());

        service.createProduct("test", "default");
        status = doGet.Products).getStatusCode();
        assertTrue(status == 200);
        
        // TODO: Implement logic to compare response with expected data
    }
}
>>>>>>> REPLACE

