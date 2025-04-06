import org.junit.jupiter.api.BeforeEach;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.boot.test.autoconfigure.web.servlet.MockMvc;

public class UserControllerTests {
    @Mock InjectMocks
    private UserController userController;

    @SpringBootTest
    @AutoConfigureMocked
    public void setUp() {
        mockMvc
            .in("127.0.0.1", 8080)
            .withMapping("GET", "/users")
            .whenMapping("POST", "/users")
            .thenCall(userController@Cbj);
    }
}

