package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class SalonController {

    @PostMapping("/listSalonsByYear")
    public ResponseEntity<List<Salon>> listSalonsByYear(@RequestParam String year) {
        // Your implementation here
        return ResponseEntity.ok().build();
    }

    @PostMapping("/listContactsBySalonId")
    public ResponseEntity<Contact> listContactsBySalonId(@RequestParam String salonId) {
        // Your implementation here
        return ResponseEntity.ok().build();
    }
}

