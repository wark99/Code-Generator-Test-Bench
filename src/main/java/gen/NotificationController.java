package gen;


import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api")
@ApiIgnore
public class NotificationController {

    @PostMapping("/notifications/slack")
    public ResponseEntity<?> sendSlackNotification(@RequestBody SlackNotificationRequest request) {
        // Implementation
        return ResponseEntity.ok().build();
    }
}
