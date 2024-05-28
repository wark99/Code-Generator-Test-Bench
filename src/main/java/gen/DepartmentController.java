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