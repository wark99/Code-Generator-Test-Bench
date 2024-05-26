package uni.testbench.gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.multipart.MultipartFile;

@RestController
@RequestMapping("/")
public class ApiController {

    @GetMapping
    public ResponseEntity<Object> readRoot() {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @PostMapping("/classify")
    public ResponseEntity<Object> uploadFileClassify(@RequestParam("file") MultipartFile file) {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @PostMapping("/predict")
    public ResponseEntity<Object> predict(@RequestParam("file") MultipartFile file) {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }

    @GetMapping("/model_name")
    public ResponseEntity<Object> getModelName() {
        // Implement your logic here
        return ResponseEntity.ok().build();
    }
}

