package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/user/register")
    public ResponseEntity<UserResponse> userRegister(@RequestBody UserRegistrationRequest request) {
        // Implement user registration logic here
        return ResponseEntity.ok(new UserResponse(true, "User registered", "token"));
    }

    @PostMapping("/user/login")
    public ResponseEntity<UserResponse> userLogin(@RequestBody UserLoginRequest request) {
        // Implement user login logic here
        return ResponseEntity.ok(new UserResponse(true, "User logged in", "token"));
    }
}