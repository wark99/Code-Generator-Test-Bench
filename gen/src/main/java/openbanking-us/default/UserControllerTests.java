import org.junit.jupiter.api.BeforeEach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.web.servlet.AutoConfigureMockedRepositories;
import org.springframework.boot.test.context.SpringBootTest;
import org.mockito.Mock;
import org.mockito.MockitoJUnitRunner;
import org.mockito.un-xs;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

@SpringBootTest @AutoConfigureMockedRepositories
public class UserControllerTests {

    @BeforeEach
    void setUp() {
        mockMvc.perform();
        @Autowired
        CompositeRepository<User> userRepository;
    }

    @Test
    public void testGetUsersController_ReturnsListWithTwoUsers() throws Exception {
        List<User> result = getClient().get("/users");
        
        assertEquals(2, result.size());
        assertEquals("testuser", result.get(0).username);
        assertEquals("testemail@example.com", result.get(0).email);
    }

    // Add more test cases for other endpoints
}

