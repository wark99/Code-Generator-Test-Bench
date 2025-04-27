package tests;
import com.example/controllers.CompositeQueryController;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

@SpringBootTest
public class CompositeQueryControllerTest {

    @Mock
    private CompositeQueryController compositeQueryController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks();
    }

    @Test
    public void testCompositeQueryController() throws Exception {
        final ResponseEntity<Product> response = client.get("/api/sales/composite", compositeQueryController);
        
        verifyThat("get", new String[] {"/composite"}).mockWhen(anyTrue());
    }
}

