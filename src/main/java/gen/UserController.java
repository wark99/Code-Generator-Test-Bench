package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/user")
public class UserController {

    @PostMapping("/signup")
    public ResponseEntity<?> userSignup(@RequestBody UserSchema userSchema) {
        // Implement your logic here
        return ResponseEntity.status(HttpStatus.CREATED).build();
    }

    @PostMapping("/login")
    public ResponseEntity<?> userLogin(@RequestBody UserLoginSchema userLoginSchema) {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @GetMapping("/")
    public ResponseEntity<?> getAllUser() {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }
}

