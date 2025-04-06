import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

@SpringBootTest
@AutoConfigureMockMvc
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private TestUserEntityRepository userRepository;

    // Utility methods to test the controller.

    private String createUser() {
        return "{\"name\":\"John Doe\",\"email\":\"johndoe@example.com\"}";
    }

    @Test
    public void testGetAllUsers() throws Exception {
        mockMvc.perform(get("/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.size()).value(0));
    }

    @Test
    public void testGetUserById() throws Exception {
        // Create a user.
        User user = new User(1L, "John Doe", "johndoe@example.com");
        userRepository.save(user);

        mockMvc.perform(get("/users/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").value(1L));
    }

    @Test
    public void testCreateUser() throws Exception {
        // Create a user.
        User user = new User();
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        mockMvc.perform(post("/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content(createUser()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").value(1L));
    }

    @Test
    public void testUpdateUser() throws Exception {
        // Create a user.
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        mockMvc.perform(put("/users/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content(createUser()))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").value(1L));
    }

    @Test
    public void testDeleteUser() throws Exception {
        // Create a user.
        User user = new User();
        user.setId(1L);
        user.setName("John Doe");
        user.setEmail("johndoe@example.com");

        mockMvc.perform(delete("/users/1"))
                .andExpect(status().isOk());
    }
}

