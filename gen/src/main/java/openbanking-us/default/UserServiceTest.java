import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.*;

 @SpringExtension
public class UserServiceTest {
    @Autowired
    private UserService userService;

    @Test
    public void testCreateUser() throws Exception {
        User user = new User("John Doe", "john@example.com");
        when(userService.createUser(user)).thenReturn(true);
        boolean result = userService.createUser(user);

        assertThat(result, true);
        verify(userRepository).save(user);
    }

    @Test
    public void testGetAllUsers() throws Exception {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User u = new User("User " + i, "user" + i + "@example.com");
            users.add(u);
        }

        when(userService.getAllUsers()).thenReturn(users);
        List<User> result = userService.getAllUsers();

        assertThat(result, hasSize(5));
    }
}

