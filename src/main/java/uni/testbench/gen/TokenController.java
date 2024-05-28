package uni.testbench.gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

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
