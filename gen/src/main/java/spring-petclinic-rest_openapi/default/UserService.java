public class UserService {
    @Transactional
    public static User createUser(String username, String email, String password);

    // Other user operations...
}

