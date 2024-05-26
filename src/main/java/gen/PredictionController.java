package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PredictionController {

    @PostMapping("/predict")
    public ResponseEntity<Object> predictPrice(@RequestBody RealEstateInput realEstateInput) {
        // Your prediction logic here
        // For simplicity, returning an empty response with status code 200
        return ResponseEntity.ok().build();
    }

