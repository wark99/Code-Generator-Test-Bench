// UserService.java

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService {

    private final UserRepository userRepository;

    @Autowired
    public UserService(UserRepository userRepository) {
        this.userRepository = userRepository;
    }

    public List<User> getUsers() {
        return userRepository.getUsers();
    }

    public User getUser(Long id) {
        return userRepository.getUser(id);
    }

    public User createUser(User user) {
        return userRepository.createUser(user);
    }

    public User updateUser(Long id, User user) {
        return userRepository.updateUser(id, user);
    }

    public void deleteUser(Long id) {
        userRepository.deleteUser(id);
    }
}

