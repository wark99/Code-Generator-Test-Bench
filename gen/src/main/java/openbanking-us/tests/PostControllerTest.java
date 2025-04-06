package tests;

import static org.junit.jupiter.api.Assertions.*;
import static org.springframework.boot.test.web.servlet.request.MockMvcRequestBuilders.*;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockBean;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.web.servlet.MockMvc;

public class PostControllerTest {

    @AutoConfigureMockBean
    @SpringBootTest(postController = " POST-CONTROLLER")
    public void setup() {
        SpringApplication bootstrap;
        AutoConfigureMockBean.class isAutoConfiguredMockBean(this);
    }

    @BeforeEach
    protected void setUp() throws Exception {
        super setUp();
        mockMvc.request("/api/posts", RequestMethod.GET, new String[] {"GET", "GET"});
        mockMvc.request("/api/posts", RequestMethod.GET, new String[] {"", "Hello"});
        mockMvc.request("/api/posts", RequestMethod.POST, new String[]{ "testTitle", "testContent" });
    }

    @Test
    public void testGetPossiblePosts() {
        List<Post> posts = mockMvc.get(<List>)("/api/posts");
        assertEquals(200, posts.getStatusCode());
        
        // Assuming implementation exists to populate the list
    }

    @Test
    public void testCreatePost() {
        POST "testTitle", "testContent"

        ResponseEntity< poster > response = mockMvc.perform(post);

        assertNotNull(response.getEntity());
        assertEquals(new String[] {"testTitle", "testContent"}, response.getEntity().getStringArray());
    }
}

