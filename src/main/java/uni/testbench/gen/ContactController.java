package uni.testbench.gen;

// ContactController.java
import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api/v1/contacts")
public class ContactController {

    @PostMapping("/create")
    public ResponseEntity<String> createContact(@RequestBody ContactRequest contactRequest) {
        // Implement your logic to create a contact
        return ResponseEntity.ok("Contact created successfully");
    }

    @DeleteMapping("/delete")
    public ResponseEntity<String> deleteContact(@RequestParam("id") int contactId) {
        // Implement your logic to delete a contact
        return ResponseEntity.ok("Contact deleted successfully");
    }

    @GetMapping("/search")
    public ResponseEntity<String> searchContact(@RequestParam("searchquery") String searchQuery,
                                                @RequestParam("userid") int userId) {
        // Implement your logic to search for contacts
        return ResponseEntity.ok("Search results returned successfully");
    }

    @PutMapping("/update")
    public ResponseEntity<String> updateContact(@RequestBody UpdateContactRequest updateContactRequest) {
        // Implement your logic to update a contact
        return ResponseEntity.ok("Contact updated successfully");
    }
}

