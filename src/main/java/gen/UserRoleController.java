package gen;

// UserRoleController.java
@RestController
@RequestMapping("/api/user-role")
public class UserRoleController {

    @PostMapping
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> createUserRole(@RequestBody UserRolePostDTO userRolePostDTO) {
        // Implementation
    }

    @PutMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> updateUserRole(@PathVariable("target_id") int targetId, @RequestBody UserRolePutDTO userRolePutDTO) {
        // Implementation
    }

    @DeleteMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> deleteUserRole(@PathVariable("target_id") int targetId) {
        // Implementation
    }
}
