package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/course")
public class CourseController {

    @PostMapping("/update/{memberId}")
    public ResponseEntity<MemberCourseUpdateResponse> memberCourseUpdate(
        @RequestHeader("x-api-key") String apiKey,
        @RequestHeader("x-client-id") String clientId,
        @PathVariable String memberId,
        @RequestBody MemberCourseUpdateRequest request) {
        // Your implementation here
        return ResponseEntity.ok(new MemberCourseUpdateResponse("200", "Course updated successfully"));
    }
}
