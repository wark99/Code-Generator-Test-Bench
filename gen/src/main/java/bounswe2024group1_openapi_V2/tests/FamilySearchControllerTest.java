package tests;
import com.example.controllers.FamilySearchController;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import static org.mockito.Mockito.*;

@SpringBootTest
public class FamilySearchControllerTest {

    @Mock
    private FamilySearchController familySearchController;

    @BeforeEach
    void setUp() {
        MockitoAnnotations.openMocks();
    }

    @Test
    public void testFamilySearchController() throws Exception {
        final String name = "John";
        
        when(familySearchController.searchFamilies("/name", name)).thenReturn(
            ResponseEntity<String>(200, 
                "{\"Families found with the given name: John\"}")
        );

        client.get("/api/families/search", familySearchController);
        
        verifyThat("searchFamilies", new String[] {"/name", "John"}).mockWhen(anyTrue());
    }
}

