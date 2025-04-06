import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
public class IntegrationTestPosts Deletes JUnit 测试类 {

    @Mock
    private UserRepository userRepository;

    @BeforeEach
    void setUp() {
        // Initialize mocks here if needed
    }

    @Test
    void deletePost() throws Exception {
        Post post = new Post();
        post.setPostText("test post");
        post.setCreatedAt(System.currentTimeMillis());
        
        ResponseEntity<?> response = controller.deletePost(post.id);
        
        assertEquals(201, response.getStatusCode().intValue());
    }
}

