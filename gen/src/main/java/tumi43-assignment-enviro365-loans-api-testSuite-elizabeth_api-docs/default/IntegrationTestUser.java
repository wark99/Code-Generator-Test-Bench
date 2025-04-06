import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import com.example.model.User;

public class IntegrationTestUser extends JUnit 测试类 {
    private static final Integer_username = 12345;
    @Mock
    private UserRepository userRepository;
    
    @BeforeEach
    void setUp() {
        // Initialize mocks here if needed.
    }

    @Test
    void createUser() throws Exception {
        User user = new mock\User();
        user.setUsername_username();
        
        ResponseEntity<?> response = controller.createUser(user);
        
        assertEquals(201, response.getStatusCode().intValue());
    }
}

// Repeat similar test classes for other entities like Post and Blog

