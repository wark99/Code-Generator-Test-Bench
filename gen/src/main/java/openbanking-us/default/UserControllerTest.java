import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.WebMvcTest;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.hamcrest.Matchers.hasSize;
import static org.hamcrest.Matchers.is;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@WebMvcTest(UserController.class)
@ExtendWith(SpringExtension.class)
public class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @MockBean
    private UserService userService;

    @Test
    public void testGetAllUsers() throws Exception {
        when(userService.getAllUsers()).thenReturn(new ArrayList<>());
        mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.size()", is(0)));
    }

    @Test
    public void testGetUserById() throws Exception {
        when(userService.getUserById(1L)).thenReturn(new User(1L, "John Doe", "john.doe@example.com"));
        mockMvc.perform(get("/api/users/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").is(1L))
                .andExpect(jsonPath("$.name").is("John Doe"))
                .andExpect(jsonPath("$.email").is("john.doe@example.com"));
    }

    @Test
    public void testCreateUser() throws Exception {
        User user = new User(1L, "John Doe", "john.doe@example.com");
        when(userService.createUser(user)).thenReturn(user);
        mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content("{\"id\": 1, \"name\": \"John Doe\", \"email\": \"john.doe@example.com\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").is(1L))
                .andExpect(jsonPath("$.name").is("John Doe"))
                .andExpect(jsonPath("$.email").is("john.doe@example.com"));
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = new User(1L, "Jane Doe", "jane.doe@example.com");
        when(userService.getUserById(1L)).thenReturn(new User(1L, "John Doe", "john.doe@example.com"));
        mockMvc.perform(patch("/api/users/1")
                .contentType(MediaType.APPLICATION_JSON_VALUE)
                .content("{\"id\": 1, \"name\": \"Jane Doe\", \"email\": \"jane.doe@example.com\"}"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON_VALUE))
                .andExpect(jsonPath("$.id").is(1L))
                .andExpect(jsonPath("$.name").is("Jane Doe"))
                .andExpect(jsonPath("$.email").is("jane.doe@example.com"));
    }

    @Test
    public void testDeleteUser() throws Exception {
        when(userService.getUserById(1L)).thenReturn(new User(1L, "John Doe", "john.doe@example.com"));
        mockMvc.perform(delete("/api/users/1"))
                .andExpect(status().isOk());
    }
}

