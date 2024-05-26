package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@RestController
@RequestMapping("/users")
public class UserController {

    private final Map<String, User> users = new HashMap<>();

    @GetMapping("/list")
    public ResponseEntity<List<User>> getAllUsers() {
        return ResponseEntity.ok(new ArrayList<>(users.values()));
    }

    @GetMapping("/list/{codigo}")
    public ResponseEntity<User> getUserByCodigo(@PathVariable String codigo) {
        if (users.containsKey(codigo)) {
            return ResponseEntity.ok(users.get(codigo));
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/post")
    public ResponseEntity<String> createUser(@RequestBody User user) {
        if (user.getName() == null || user.getEmail() == null) {
            return ResponseEntity.badRequest().body("Invalid user data");
        }

        users.put(user.getEmail(), user);
        return ResponseEntity.status(HttpStatus.CREATED).body("User created successfully");
    }

    @PutMapping("/edit/{codigo}/atualizar")
    public ResponseEntity<String> updateUser(@PathVariable String codigo, @RequestBody User user) {
        if (!users.containsKey(codigo)) {
            return ResponseEntity.notFound().build();
        }

        if (user.getName() == null || user.getEmail() == null) {
            return ResponseEntity.badRequest().body("Invalid user data");
        }

        users.put(user.getEmail(), user);
        return ResponseEntity.ok("User updated successfully");
    }

    @DeleteMapping("/delete/{codigo}/excluir")
    public ResponseEntity<String> deleteUser(@PathVariable String codigo) {
        if (!users.containsKey(codigo)) {
            return ResponseEntity.notFound().build();
        }

        users.remove(codigo);
        return ResponseEntity.noContent().build();
    }
}

