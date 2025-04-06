// UserControllerTest.java

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockMvc;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.http.MediaType;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.assertj.core.api.Assertions.assertThat;
import static org.mockito.ArgumentMatchers.any;
import static org.mockito.Mockito.when;

@SpringBootTest
@AutoConfigureMockMvc
class UserControllerTest {

    @Autowired
    private MockMvc mockMvc;

    @InjectMocks
    private UserController userController;

    @Test
    public void testGetAllUsers() throws Exception {
        // Arrange
        when(userService.getAllUsers()).thenReturn(List.of(new User(1L, "John Doe", "john.doe@example.com")));

        // Act and Assert
        mockMvc.perform(get("/api/users"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$").size(1));
    }

    @Test
    public void testGetUserById() throws Exception {
        // Arrange
        when(userService.getUserById(1L)).thenReturn(new User(1L, "John Doe", "john.doe@example.com"));

        // Act and Assert
        mockMvc.perform(get("/api/users/1"))
                .andExpect(status().isOk())
                .andExpect(content().contentType(MediaType.APPLICATION_JSON))
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("John Doe"));
    }

    @Test
    public void testCreateUser() throws Exception {
        // Arrange
        User user = new User(1L, "Jane Doe", "jane.doe@example.com");

        when(userService.createUser(user)).thenReturn(new User(2L, "Jane Doe", "jane.doe@example.com"));

        // Act and Assert
        mockMvc.perform(post("/api/users")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Jane Doe\",\"email\":\"jane.doe@example.com\"}"))
                .andExpect(status().isCreated())
                .andExpect(jsonPath("$.id").value(2))
                .andExpect(jsonPath("$.name").value("Jane Doe"));
    }

    @Test
    public void testUpdateUser() throws Exception {
        // Arrange
        when(userService.getUserById(1L)).thenReturn(new User(1L, "John Doe", "john.doe@example.com"));

        User updatedUser = new User(1L, "Jane Doe", "jane.doe@example.com");

        when(userService.updateUser(1L, updatedUser)).thenReturn(new User(1L, "Jane Doe", "jane.doe@example.com"));

        // Act and Assert
        mockMvc.perform(put("/api/users/1")
                .contentType(MediaType.APPLICATION_JSON)
                .content("{\"name\":\"Jane Doe\",\"email\":\"jane.doe@example.com\"}"))
                .andExpect(status().isOk())
                .andExpect(jsonPath("$.id").value(1))
                .andExpect(jsonPath("$.name").value("Jane Doe"));
    }

    @Test
    public void testDeleteUser() throws Exception {
        // Arrange

        // Act and Assert
        mockMvc.perform(delete("/api/users/1"))
                .andExpect(status().isNoContent());
    }
}

