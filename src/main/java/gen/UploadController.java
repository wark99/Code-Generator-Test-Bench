package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
public class UploadController {

    @PostMapping("/upload/session")
    public ResponseEntity<UploadSessionResponse> startUploadSession() {
        // Implementation here
    }

    @PostMapping("/upload/generate-url")
    public ResponseEntity<UploadURLResponse> generateUploadURL(@RequestParam String sessionID) {
        // Implementation here
    }
}
