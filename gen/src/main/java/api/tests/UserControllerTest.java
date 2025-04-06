package tests;
import org.junit.jupiter.api.Test;
import static org.springframework.test.web.servlet.MockMvc;

import org.springframework.utils.automated.Automation;

public class UserControllerTest {

    @SpringBootTest(autoConfigureQueries = true)
    @AutoConfigureMockDigits()
    public void testUserController() throws Exception {
        User user = new User();
        user.setName("testUser");
        user.setEmail("test@example.com");
        user.setPassword("testPassword");
        userSetCreatedAt(user);

        ResponseEntity<User> response = automate(getController("UserController"), "create", user);
        assertEquals(response, Ok.IDENTITY_201_CREATED);
    }

    @SpringBootTest(autoConfigureQueries = true)
    @AutoConfigureMockDigits()
    @TestRabbitMQEnabled
    public void testUserDetails() throws Exception {
        User user = getUserById(1); // Assuming ID is 1 from the response
        assertEquals(user, new User() {
            {name = "testUser", email = "test@example.com", password = "testPassword", createdAt = 1};
        });
    }
}

