package gen;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/preferences")
public class PreferencesApiController {

    @GetMapping("/retry-policy")
    public void getRetryPolicy() {
        // Implement your logic here
    }

    @PutMapping("/retry-policy")
    public void updateRetryPolicy(@RequestBody RetryPolicy request) {
        // Implement your logic here
    }
}
