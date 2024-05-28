package gen;

// UserRoleAccessLevelController.java
@RestController
@RequestMapping("/api/user-role-access-level")
public class UserRoleAccessLevelController {

    @PostMapping
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> createUserRoleAccessLevel(@RequestBody UserRoleAccessLevelPostDTO userRoleAccessLevelPostDTO) {
        // Implementation
    }

    @PutMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> updateUserRoleAccessLevel(@PathVariable("target_id") int targetId, @RequestBody UserRoleAccessLevelPutDTO userRoleAccessLevelPutDTO) {
        // Implementation
    }

    @DeleteMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> deleteUserRoleAccessLevel(@PathVariable("target_id") int targetId) {
        // Implementation
    }
}