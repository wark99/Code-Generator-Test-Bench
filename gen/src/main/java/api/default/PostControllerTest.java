import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.representative.RepresentationMethodHandling;

@SpringBootTest
@AutoConfigureMockMvc
public class PostControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreatePost() throws Exception {
        // Create a new post
        Post post = new Post(1L, "Hello World", "This is a test post");
        String json = jsonMapper.writeValueAsString(post);
        mockMvc.perform(post("/api/posts")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json))
                .andExpect(status().isCreated());
    }

    @Test
    public void testGetAllPosts() throws Exception {
        // Get all posts
        mockMvc.perform(get("/api/posts"))
                .andExpect(status().isOk())
                .andExpect(content().contentTypeMediaType("application/json"));
    }
}

