import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

@SpringBootTest
@AutoConfigureMockMvc
public class BlogControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private BlogService blogService;

    @Test
    public void testGetAllBlogs() throws Exception {
        mockMvc.perform(get("/api/blogs"))
                .andExpect(status().isOk());
    }

    @Test
    public void testGetBlogById() throws Exception {
        Blog blog = new Blog("test title", "test content");
        blogService.createBlog(blog);
        mockMvc.perform(get("/api/blogs/1"))
                .andExpect(status().isOk())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void testCreateBlog() throws Exception {
        Blog blog = new Blog("test title", "test content");
        mockMvc.perform(post("/api/blogs")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(blog)))
                .andExpect(status().isCreated())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void testUpdateBlog() throws Exception {
        Blog blog = new Blog("test title", "test content");
        blogService.createBlog(blog);
        mockMvc.perform(put("/api/blogs/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(asJsonString(new Blog("updated title", "updated content"))))
                .andExpect(status().isOk())
                .andExpect(status().is2xxSuccessful());
    }

    @Test
    public void testDeleteBlog() throws Exception {
        Blog blog = new Blog("test title", "test content");
        blogService.createBlog(blog);
        mockMvc.perform(delete("/api/blogs/1"))
                .andExpect(status().isOk())
                .andExpect(status().is2xxSuccessful());
    }

    private String asJsonString(Object obj) {
        try {
            return new ObjectMapper().writeValueAsString(obj);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}

