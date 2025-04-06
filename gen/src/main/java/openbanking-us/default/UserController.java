import org.springframework.http.Request;
import org.springframework.stereotype.Service;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.ArgumentMatchers.*;
import static org.mockito.Mockito.*;

import java.util.List;

@Service
public class UserController {
    @GetMapping("/users")
    public List<User> getAllUsers() {
        // Implement user fetching logic here
        return null;
    }
}

