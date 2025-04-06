@RestController
public class UserControllerController {
    @GetMapping("/users")
    public List<User> getUserList() {
        // Implementation will follow with Spring Data JPA integration
    }
    
    @PostMapping("/users")
    public void createUser(@RequestBody User user) throws uncontrollableException {
        // Implementation coming soon
    }
}

