package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class StorageRequestController {

    @PutMapping("/storage-requests/{requestId}/pickup")
    public ResponseEntity<?> completePickup(@PathVariable("requestId") String requestId) {
        // Implementation
        return ResponseEntity.ok().build();
    }

    @PutMapping("/storage-requests/{requestId}/store")
    public ResponseEntity<?> completeStore(@PathVariable("requestId") String requestId) {
        // Implementation
        return ResponseEntity.ok().build();
    }
}
