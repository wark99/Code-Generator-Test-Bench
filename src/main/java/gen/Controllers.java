package gen;

// DepartmentController.java
@RestController
@RequestMapping("/api/department")
public class DepartmentController {

    @PostMapping
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> createDepartment(@RequestBody DepartmentPostDTO departmentPostDTO) {
        // Implementation
    }

    @PutMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> updateDepartment(@PathVariable("target_id") int targetId, @RequestBody DepartmentPutDTO departmentPutDTO) {
        // Implementation
    }

    @DeleteMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> deleteDepartment(@PathVariable("target_id") int targetId) {
        // Implementation
    }
}

// DepartmentAccessLevelController.java
@RestController
@RequestMapping("/api/department-access-level")
public class DepartmentAccessLevelController {

    @PostMapping
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> createDepartmentAccessLevel(@RequestBody DepartmentAccessLevelPostDTO departmentAccessLevelPostDTO) {
        // Implementation
    }

    @PutMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> updateDepartmentAccessLevel(@PathVariable("target_id") int targetId, @RequestBody DepartmentAccessLevelPutDTO departmentAccessLevelPutDTO) {
        // Implementation
    }

    @DeleteMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> deleteDepartmentAccessLevel(@PathVariable("target_id") int targetId) {
        // Implementation
    }
}

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

// DocumentFileRecordController.java
@RestController
@RequestMapping("/api/document-file-record")
public class DocumentFileRecordController {

    @GetMapping
    public ResponseEntity<?> getDocumentFileRecord(@RequestParam("target_id") int targetId) {
        // Implementation
    }

    @PostMapping
    public ResponseEntity<BaseHttpActionPostCorrectResponseModel> createDocumentFileRecord(@RequestBody Body__api_document_file_record_post body) {
        // Implementation
    }

    @PutMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionPutCorrectResponseModel> updateDocumentFileRecord(@PathVariable("target_id") int targetId, @RequestBody Body__api_document_file_record__target_id__put body) {
        // Implementation
    }

    @DeleteMapping("/{target_id}")
    public ResponseEntity<BaseHttpActionDeleteCorrectResponseModel> deleteDocumentFileRecord(@PathVariable("target_id") int targetId) {
        // Implementation
    }
}
