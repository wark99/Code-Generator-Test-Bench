package gen;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/")
public class AnalyzerController {

    @GetMapping
    public ResponseEntity<String> index__get() {
        // Implementation here
        return ResponseEntity.ok("Index");
    }

    @GetMapping("/list")
    public ResponseEntity<String> read_root_list__get() {
        // Implementation here
        return ResponseEntity.ok("Read Root");
    }

    @PostMapping("/upload")
    public ResponseEntity<String> upload_file_upload__post(@RequestBody Body_upload_file_upload__post requestBody) {
        // Implementation here
        return ResponseEntity.ok("Upload File");
    }

    @PostMapping("/user")
    public ResponseEntity<String> get_user_data_user__post(@RequestBody Body_get_user_data_user__post requestBody) {
        // Implementation here
        return ResponseEntity.ok("Get User Data");
    }
}

