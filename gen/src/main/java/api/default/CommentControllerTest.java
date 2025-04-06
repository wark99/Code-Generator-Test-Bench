import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.representative.RepresentationMethodHandling;

@SpringBootTest
@AutoConfigureMockMvc
public class CommentControllerTest {
    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testCreateComment() throws Exception {
        // Create a new comment
        Long postId = 1L;
        Comment comment = new Comment(2L, "Hello World");
        String json = jsonMapper.writeValueAsString(comment);
        mockMvc.perform(post("/api/comments/{postId}")
                .contentType(MediaType.APPLICATION_JSON)
                .content(json)
                .value("postId", postId))
                .andExpect(status().isCreated());
    }

    @Test
    public void testGetAllCommentsForPost() throws Exception {
        // Get all comments for a post
        Long postId = 1L;
        mockMvc.perform(get("/api/comments/{postId}")
                .value("postId", postId))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON));
    }
}

