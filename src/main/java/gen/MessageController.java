package gen;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/api")
public class MessageController {

    @PostMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestBody Message message) {
        // Implementation goes here
        return ResponseEntity.ok("Message sent successfully");
    }

    @GetMapping("/message")
    public ResponseEntity<String> subscribeMessage(@RequestParam String format) {
        // Implementation goes here
        return ResponseEntity.ok("Subscribed to messages in " + format + " format");
    }
}

