package gen;

// UserAccountController.java
@RestController
@RequestMapping("/api/user-account")
public class UserAccountController {

    @PostMapping
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> createUserAccount(@RequestBody UserAccountPostDTO userAccountPostDTO) {
        // Implementation
    }

    @PutMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> updateUserAccount(@PathVariable("target_id") int targetId, @RequestBody UserAccountPutDTO userAccountPutDTO) {
        // Implementation
    }

    @DeleteMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> deleteUserAccount(@PathVariable("target_id") int targetId) {
        // Implementation
    }
}
