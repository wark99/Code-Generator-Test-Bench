package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api")
public class SendMailController {

    @PostMapping("/send")
    public ResponseEntity<SendResultExampleResponse> sendMail(@RequestBody List<SendParams> sendParams) {
        // Your implementation here
        return null;
    }

    @GetMapping("/send/status")
    public ResponseEntity<SendGetResultExampleResponse> getSendStatus(@RequestParam String tag) {
        // Your implementation here
        return null;
    }
}
