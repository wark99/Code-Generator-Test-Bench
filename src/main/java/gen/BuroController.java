package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.Map;

@RestController
@RequestMapping("/buro")
public class BuroController {

    @PostMapping("/pa")
    public ResponseEntity<Map<String, String>> postReservationToPortaleAlloggiati(@RequestBody PostPaRequest request) {
        // Your implementation here
        return ResponseEntity.ok(Map.of("result", "ok"));
    }

    @PostMapping("/istat")
    public ResponseEntity<Map<String, String>> postReservationToIstat(@RequestBody PostIstatRequest request) {
        // Your implementation here
        return ResponseEntity.ok(Map.of("result", "ok"));
    }

    @DeleteMapping("/istat")
    public ResponseEntity<Map<String, String>> deleteReservationsFromIstat(@RequestBody DeleteIstatRequest request) {
        // Your implementation here
        return ResponseEntity.ok(Map.of("result", "ok"));
    }

    @GetMapping("/istat/regions")
    public ResponseEntity<Map<String, Object>> getIstatRegions() {
        // Your implementation here
        return ResponseEntity.ok(Map.of("result", "ok"));
    }
}

