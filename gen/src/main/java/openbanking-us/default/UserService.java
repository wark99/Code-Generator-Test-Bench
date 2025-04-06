import org.springframework.stereotype.Service;

import java.util.List;
import java.util.ArrayList;

@Service
public class UserService {

    private List<User> users = new ArrayList<>();

    public UserService() {
        // Initialize with some dummy data
        users.add(new User(1L, "John Doe", "john.doe@example.com"));
        users.add(new User(2L, "Jane Doe", "jane.doe@example.com"));
    }

    public List<User> getAllUsers() {
        return users;
    }

    public User getUserById(Long id) {
        for (User user : users) {
            if (user.getId().equals(id)) {
                return user;
            }
        }
        return null;
    }

    public User createUser(User user) {
        // Validate the input
        if (!isValidName(user.getName()) && !isValidEmail(user.getEmail())) {
            throw new ValidationException("Invalid name or email");
        }
        users.add(user);
        return user;
    }

    public User updateUser(Long id, User user) {
        User existingUser = getUserById(id);
        if (existingUser == null) {
            return null;
        }
        // Update the user
        existingUser.setName(user.getName());
        existingUser.setEmail(user.getEmail());
        return existingUser;
    }

    public void deleteUser(Long id) {
        users.removeIf(user -> user.getId().equals(id));
    }

    private boolean isValidName(String name) {
        // Some basic validation for names
        return !name.isEmpty();
    }

    private boolean isValidEmail(String email) {
        // Some basic validation for emails
        return email.contains("@");
    }
}

