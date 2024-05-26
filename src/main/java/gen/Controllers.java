package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/app/printers/{printerUuid}/camera")
public class CameraController {

    @PostMapping
    public ResponseEntity<?> registerCamera(@PathVariable String printerUuid, @RequestParam(required = false) String origin) {
        // Implementation here
    }
}

@RestController
@RequestMapping("/c")
public class SnapshotController {

    @PutMapping("/snapshot")
    public ResponseEntity<?> uploadSnapshot(@RequestBody byte[] snapshot) {
        // Implementation here
    }
}

@RestController
@RequestMapping("/c")
public class CameraInfoController {

    @PutMapping("/info")
    public ResponseEntity<?> updateCameraAttributes(@RequestBody CameraRequest cameraRequest) {
        // Implementation here
    }
}

