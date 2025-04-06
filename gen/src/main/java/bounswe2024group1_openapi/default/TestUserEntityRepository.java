import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

@Repository
public class TestUserEntityRepository implements UserEntityRepository {

    @Autowired
    private UserRepository userRepository;

    @Override
    public Iterable<User> findAll() {
        // Simulating a database for testing purposes.
        return new ArrayList<>();
    }

    @Override
    public Optional<User> findById(Long id) {
        return Optional.ofNullable(userData.get(id));
    }

    @Override
    public User save(User user) {
        return userRepository.save(user);
    }

    private Map<Long, User> userData = new HashMap<>();

    public void setUserData(Map<Long, User> userData) {
        this.userData = userData;
    }
}

