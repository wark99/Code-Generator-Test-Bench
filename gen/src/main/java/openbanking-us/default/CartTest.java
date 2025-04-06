import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class CartTest {

    @Test
    void testAddProductToCart() {
        CartController cart = new CartController();
        Product product1 = new Product(1, "Product 1", 10.99);
        Product product2 = new Product(2, "Product 2", 5.99);

        cart.addProduct(product1);
        cart.addProduct(product2);

        assertEquals(2, cart.getCart().size());
    }

    @Test
    void testGetProducts() {
        ProductController products = new ProductController();
        Product product1 = new Product(1, "Product 1", 10.99);
        Product product2 = new Product(2, "Product 2", 5.99);

        products.addProduct(product1);
        products.addProduct(product2);

        assertEquals(2, products.getProducts().size());
    }
}

