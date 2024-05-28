package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/c")
public class CameraInfoController {

    @PutMapping("/info")
    public ResponseEntity<?> updateCameraAttributes(@RequestBody CameraRequest cameraRequest) {
        // Implementation here
    }
}