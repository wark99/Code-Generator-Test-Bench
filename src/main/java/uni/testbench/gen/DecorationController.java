package uni.testbench.gen;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/api")
public class DecorationController {

    @GetMapping("/ping")
    public ResponseEntity<Ping> ping() {
        Ping response = new Ping("pong!");
        return ResponseEntity.ok().body(response);
    }

    @PostMapping("/auto_decoration")
    public ResponseEntity<Decoration> autoDecoration(@RequestParam("room_type") String roomType,
                                                     @RequestParam("style") String style,
                                                     @RequestParam("init_image") MultipartFile initImage) {
        // Implement autoDecoration logic here
    }

    @PostMapping("/retry_decoration")
    public ResponseEntity<RetryDecoration> retryDecoration(@RequestParam("img_id") String imgId) {
        // Implement retryDecoration logic here
    }

    @GetMapping("/get_decoration")
    public ResponseEntity<?> getDecoration(@RequestParam("img_id") String imgId,
                                           @RequestParam(value = "retry_id", required = false) Integer retryId) {
        // Implement getDecoration logic here
    }
}