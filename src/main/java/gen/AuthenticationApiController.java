package gen;

import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/auth")
public class AuthenticationApiController {

    @PostMapping
    public void getJwtToken(@RequestBody List<String> scopes) {
        // Implement your logic here
    }
}

