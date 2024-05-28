package uni.testbench.gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import javax.validation.Valid;

@RestController
@RequestMapping("/attachments")
public class AttachmentController {

    @GetMapping("/{data_attachment_id}")
    public ResponseEntity<GetDataAttachmentResponse> getDataAttachment(@PathVariable("data_attachment_id") String dataAttachmentId,
                                                                       @RequestHeader(value = "Accept") String accept) {
        // Implementation here
        return ResponseEntity.ok().build();
    }
}

