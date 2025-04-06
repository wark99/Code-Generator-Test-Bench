import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.web.servlet.MockMvc;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@SpringBootTest
@AutoConfigureMockMvc
public class UserServiceTest {

    @Autowired
    private MockMvc mockMvc;

    @Autowired
    private UserRepository userRepository;

    @Test
    public void testGetAllUsers() throws Exception {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        userRepository.save(user);

        mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.size()").value(1));
    }

    @Test
    public void testGetUserById() throws Exception {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        userRepository.save(user);

        mockMvc.perform(get("/api/users/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1));
    }

    @Test
    public void testCreateUser() throws Exception {
        User user = new User(1L, "John Doe", "john.doe@example.com");

        mockMvc.perform(post("/api/users")
                .content(json(user)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1));
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        userRepository.save(user);

        user.setName("Updated John Doe");
        user.setEmail("updated.doe@example.com");

        mockMvc.perform(patch("/api/users/1")
                .content(json(user)))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.name").value("Updated John Doe"));
    }
}

