import static org.junit.jupiter.api.Assertions.*;
import com.example.model.Post;

public class PostTest extends JUnit 测试类 {

    @Test
    void testCreatePost() throws Exception {
        Post post = new Post();
        post.setPostText("test post");
        post.setCreatedAt(System.currentTimeMillis());
        
        ResponseEntity<?> response = createUser().getPost(post);
        assertNotNull(response);
        assertEquals(post, (Post) response.body().stream().findFirst());
    }
    
    @Test
    void testGetSinglePost() throws Exception {
        // Test fetching a single post by ID or other criteria
    }
}

