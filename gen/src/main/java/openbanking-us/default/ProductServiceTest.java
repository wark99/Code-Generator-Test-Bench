// ProductServiceTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductServiceTest {

    @Autowired
    private ProductService productService;

    @Test
    public void testAddProduct() {
        Product product = new Product(1, "Apple", 10.0);
        productService.addProduct(product);
        assertTrue(productService.getAllProducts().contains(product));
    }
}

