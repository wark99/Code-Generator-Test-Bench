package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProfileController {

    @GetMapping("/v1/profile/{user}")
    public ResponseEntity<String> getProfile(
        @PathVariable("user") String user,
        @RequestParam(value = "get", required = false) String get,
        @RequestParam(value = "image", required = false) String image
    ) {
        // Here you can implement your logic to handle the profile request
        return new ResponseEntity<>("Successful Response", HttpStatus.OK);
    }
}

