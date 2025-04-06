import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AuthorControllerTest {

    @Mock
    private AuthorRepository authorRepository;

    @Before
    public void setUp() {
        authorRepository = createMockAuthorRepository();
    }

    @Test
    void testCreateAuthor_Success() throws Exception {
        // Test creating an author with name and email
        String authorName = "John Doe";
        String authorEmail = "john@example.com";

        Author result = null;

        try {
            result = AuthorController.createAuthor(authorName, authorEmail);
        } catch (Exception e) {
            failWithMessage("Unexpected exception: " + e.getMessage());
        }

        assertNotNull(result);
        assertEquals(authorName, result.getName());
        assertEquals(authorEmail, result.getEmail());

        // Cleanup mock
    }
}

