package gen;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/user")
public class UserController {

    @GetMapping
    public List<UserInput> getAllUsers() {
        // Logic to fetch all users
    }

    @PostMapping("/register")
    public UserInput registerUser(@RequestBody UserInput userInput) {
        // Logic to register a new user
    }

    @PutMapping("/{customerId}")
    public void updateUser(@PathVariable int customerId, @RequestBody UserInput userInput) {
        // Logic to update an existing user
    }

    @PatchMapping("/{customerId}")
    public void updateUserPatch(@PathVariable int customerId, @RequestBody UserInput userInput) {
        // Logic to update an existing user partially
    }

    @DeleteMapping
    public void deleteUser(@RequestParam int customerId) {
        // Logic to delete a user
    }

    @GetMapping("/{customerId}")
    public UserInput getUserById(@PathVariable int customerId) {
        // Logic to get a user by ID
    }
}

