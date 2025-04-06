// UserControllerTest.java

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.*;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.*;

@RestControllerMockBeanFactory
@TestPropertySource(locations = "classpath:application.properties")
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @Test
    public void testGetUsers() throws Exception {
        when(userRepository.getUsers()).thenReturn(List.of(new User(1L, "John Doe", "john@example.com"), new User(2L, "Jane Doe", "jane@example.com")));
        result = mockMvc.perform(get("/users"));
        assertEquals(200, result.andReturn().getStatus());
    }

    @Test
    public void testGetUser() throws Exception {
        when(userRepository.getUser(1L)).thenReturn(new User(1L, "John Doe", "john@example.com"));
        result = mockMvc.perform(get("/users/1"));
        assertEquals(200, result.andReturn().getStatus());
    }

    @Test
    public void testCreateUser() throws Exception {
        User user = new User(1L, "John Doe", "john@example.com");
        when(userRepository.createUser(user)).thenReturn(new User(1L, "John Doe", "john@example.com"));
        result = mockMvc.perform(post("/users").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(user)));
        assertEquals(200, result.andReturn().getStatus());
    }

    @Test
    public void testUpdateUser() throws Exception {
        User user = new User(1L, "John Doe", "john@example.com");
        when(userRepository.updateUser(1L, user)).thenReturn(new User(1L, "John Doe", "john@example.com"));
        result = mockMvc.perform(patch("/users/1").contentType(MediaType.APPLICATION_JSON).content(objectMapper.writeValueAsString(user)));
        assertEquals(200, result.andReturn().getStatus());
    }

    @Test
    public void testDeleteUser() throws Exception {
        when(userRepository.deleteUser(1L)).thenReturn(null);
        result = mockMvc.perform(delete("/users/1"));
        assertEquals(204, result.andReturn().getStatus());
    }
}

