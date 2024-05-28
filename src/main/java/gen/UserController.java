package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import springfox.documentation.annotations.ApiIgnore;

@RestController
@RequestMapping("/api")
public class UserController {

    @PostMapping("/users")
    public ResponseEntity<?> registerUser(@RequestBody UserRequest request) {
        // Implementation
        return ResponseEntity.ok().build();
    }

    @PostMapping("/auth/login")
    public ResponseEntity<?> loginUser(@RequestBody LoginRequest request) {
        // Implementation
        return ResponseEntity.ok().build();
    }

    @PostMapping("/auth/logout")
    public ResponseEntity<?> logoutUser(@RequestBody LogoutRequest request) {
        // Implementation
        return ResponseEntity.ok().build();
    }
}