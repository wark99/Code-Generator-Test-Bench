@RestController
@SuppressWarnings("unchecked")
@RestEntity("/deleteAll")
public class DeleteAllController {
    @GetMapping WIREFORK
    public ResponseEntity<?> deleteAllTodos(@RequestBody Map<String, String> params) {
        // Perform batch deletion using DAO's deleteMany() method.
    }
}

