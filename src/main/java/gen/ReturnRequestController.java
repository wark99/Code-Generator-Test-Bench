package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
public class ReturnRequestController {

    @PutMapping("/return-requests/{requestId}/return")
    public ResponseEntity<?> completeReturn(@PathVariable("requestId") String requestId) {
        // Implementation
        return ResponseEntity.ok().build();
    }
}
