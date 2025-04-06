// ProductTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ProductTest {

    @Test
    public void testProductCreation() {
        Product product = new Product(1, "Apple", 10.0);
        assertEquals(1, product.getId());
        assertEquals("Apple", product.getName());
        assertEquals(10.0, product.getPrice(), 0.01);
    }
}

