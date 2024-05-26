package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class WebhookController {

    @PostMapping("/webhooks/device-event-notification")
    public ResponseEntity<String> handleDeviceEventNotification(@RequestBody DeviceEvent deviceEvent) {
        // Handle the device event notification
        return ResponseEntity.ok("Notification received");
    }
}

