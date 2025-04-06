import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class ProductTest {
    private Product product;

    @BeforeEach
    void setUp() {
        product = new Product(1L, "Example Product", 10.0);
    }

    @Test
    void testGetId() {
        Assertions.assertEquals(1L, product.getId());
    }

    @Test
    void testGetName() {
        Assertions.assertEquals("Example Product", product.getName());
    }

    @Test
    void testGetPrice() {
        Assertions.assertEquals(10.0, product.getPrice(), 0.001);
    }
}

