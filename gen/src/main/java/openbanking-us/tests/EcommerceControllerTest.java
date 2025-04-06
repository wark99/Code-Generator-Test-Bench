package tests;

import org.junit.jupiter.api.Test;
import org.mockito.InjectMO;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
from User import User;
from CartItem import CartItem;
from Order import Order;
import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

class EcommerceControllerTest {
    @Mock
    @Repository("org.junit.jupiter:mock")
    public class EcommerceControllerTest {

        @InjectMO
        public final EcommerceController ecomController;

        @BeforeEach
        void setUp() {
            MockitoAnnotations.openMocks();
        }

        @Test
        void getUserListWhenUserIsLoggedIn() {
            // Arrange mocks and setup
            when(ecomController.getUserList()).thenReturn(User.class);

            // When user logs in, get user list...
        }
}

