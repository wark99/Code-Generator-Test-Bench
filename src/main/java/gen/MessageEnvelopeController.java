package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/messageEnvelope")
public class MessageEnvelopeController {

    @PostMapping
    public ResponseEntity<MessageEnvelope> createStandardMessageEnvelope(@RequestBody MessageEnvelope messageEnvelope) {
        // Your logic to handle the creation of MessageEnvelope
        return new ResponseEntity<>(messageEnvelope, HttpStatus.CREATED);
    }
}

