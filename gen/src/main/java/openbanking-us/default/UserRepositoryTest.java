import org.junit.jupiter.api.Test;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.hasSize;
import static org.mockito.Mockito.*;

 @SpringExtension
public class UserRepositoryTest {
    @Autowired
    private UserRepository userRepository;

    @Test
    public void testSave() throws Exception {
        User user = new User("John Doe", "john@example.com");
        Long id = 1L;
        when(userRepository.save(any(User.class))).thenReturn(id);

        Long result = userRepository.save(user);
        assertThat(result, hasValue(1));
    }

    @Test
    public void testFindAll() throws Exception {
        List<User> users = new ArrayList<>();
        for (int i = 0; i < 5; i++) {
            User u = new User("User " + i, "user" + i + "@example.com");
            users.add(u);
        }

        when(userRepository.findAll()).thenReturn(users);

        List<User> result = userRepository.findAll();

        assertThat(result, hasSize(5));
    }
}

