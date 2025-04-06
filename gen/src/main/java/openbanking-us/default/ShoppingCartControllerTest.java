import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class ShoppingCartControllerTest {

    @Mock
    private ShoppingCartRepository cartRepository;

    @Before
    public void setUp() {
        cartRepository = createMockShoppingCartRepository();
    }

    @Test
    void testAddItem_Success() throws Exception {
        // Test adding an item to the cart
        String productId = "123";
        String itemName = "Test Item";

        try {
            ShoppingCartController addItem(productId, itemName);
            assertNotNull(cartRepository.getItem(productId));
        } catch (Exception e) {
            failWithMessage("Unexpected exception: " + e.getMessage());
        }

        // Cleanup mock
    }
}

