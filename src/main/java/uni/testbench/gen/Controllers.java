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

@RestController
@RequestMapping("/tokens")
public class TokenController {

    @GetMapping("/{token_code}/attachments")
    public ResponseEntity<GetDataAttachmentPaginationSet> getTokenAttachments(@PathVariable("token_code") String tokenCode,
                                                                              @RequestParam(value = "page_size", required = false, defaultValue = "10") int pageSize,
                                                                              @RequestParam(value = "page", required = false, defaultValue = "1") int page,
                                                                              @RequestHeader(value = "Accept") String accept) {
        // Implementation here
        return ResponseEntity.ok().build();
    }
}

