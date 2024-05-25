package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/Supplier")
public class SupplierController {

    @PostMapping
    public ResponseEntity<Suppliers> createSupplier(@RequestBody Suppliers suppliers) {
        // Implement create logic here
        return ResponseEntity.ok(suppliers);
    }

    @PostMapping("/createWithList")
    public ResponseEntity<Suppliers> createSuppliersWithListInput(@RequestBody List<Suppliers> suppliersList) {
        // Implement create with list logic here
        return ResponseEntity.ok(null);
    }

    @GetMapping("/login")
    public ResponseEntity<String> loginUser(@RequestParam(required = false) String username, @RequestParam(required = false) String password) {
        // Implement login logic here
        return ResponseEntity.ok(null);
    }

    @GetMapping("/logout")
    public ResponseEntity<Void> logoutSupplier() {
        // Implement logout logic here
        return ResponseEntity.ok().build();
    }

    @GetMapping("/{username}")
    public ResponseEntity<Suppliers> getUserByName(@PathVariable String username) {
        // Implement get user by name logic here
        return ResponseEntity.ok(null);
    }

    @PutMapping("/{username}")
    public ResponseEntity<Void> updateUser(@PathVariable String username, @RequestBody Suppliers suppliers) {
        // Implement update user logic here
        return ResponseEntity.ok().build();
    }

    @DeleteMapping("/{username}")
    public ResponseEntity<Void> deleteUser(@PathVariable String username) {
        // Implement delete user logic here
        return ResponseEntity.ok().build();
    }
}

