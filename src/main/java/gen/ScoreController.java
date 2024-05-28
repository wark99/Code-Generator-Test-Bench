package gen;

import org.springframework.web.bind.annotation.*;
import org.springframework.http.ResponseEntity;

@RestController
@RequestMapping("/")
public class ScoreController {

    @PostMapping("/score")
    public ResponseEntity<ScoreResponse> getScore(@RequestParam(required = false) String consumer_id,
                                                  @RequestParam(required = false) String request_date,
                                                  @RequestParam(required = false) String upload_id,
                                                  @RequestBody ConsumerFile consumerFile) {
        // Implementation here
    }

    @PostMapping("/sandbox")
    public ResponseEntity<ScoreResponse> getSandboxScore(@RequestParam(required = false) String consumer_id,
                                                         @RequestParam(required = false) String request_date,
                                                         @RequestParam(required = false) String upload_id,
                                                         @RequestBody ConsumerFile consumerFile) {
        // Implementation here
    }

    @PostMapping("/attributes")
    public ResponseEntity<AttributesResponse> getAttributes(@RequestParam(required = false) String consumer_id,
                                                            @RequestParam(required = false) String request_date,
                                                            @RequestParam(required = false) String upload_id,
                                                            @RequestBody ConsumerFile consumerFile) {
        // Implementation here
    }
}