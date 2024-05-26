package gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api")
public class CountryController {

    @GetMapping("/country")
    public ResponseEntity<CountriesGetExampleResponse> getCountry(@RequestParam String code) {
        // Your implementation here
        return null;
    }

    @GetMapping("/country/all")
    public ResponseEntity<CountriesGetAllExampleResponse> getAllCountries() {
        // Your implementation here
        return null;
    }
}

@RestController
@RequestMapping("/api")
public class ServiceController {

    @GetMapping("/service")
    public ResponseEntity<ServicesGetExampleResponse> getService(@RequestParam String country_code) {
        // Your implementation here
        return null;
    }

    @GetMapping("/service/all")
    public ResponseEntity<ServicesGetAllExampleResponse> getAllServices() {
        // Your implementation here
        return null;
    }
}

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

class CountriesGetAllExampleResponse {
    private String status;
    private List<Country> result;

    // Getters and setters
}

class CountriesGetExampleResponse {
    private String status;
    private Country result;

    // Getters and setters
}

class HTTPValidationError {
    private String status;
    private String error_message;
    private Object error_type;

    // Getters and setters
}

class SendGetResultExampleResponse {
    private String status;
    private SendResult result;

    // Getters and setters
}

class SendParams {
    private String url;
    private String to;
    private String country_code;
    private String service_code;
    private String product;
    private boolean is_delay;
    private int notify_id;
    private String url_img;

    // Getters and setters
}

class SendResultExampleResponse {
    private String status;
    private Object result;

    // Getters and setters
}

class ServicesGetAllExampleResponse {
    private String status;
    private List<Service> result;

    // Getters and setters
}

class ServicesGetExampleResponse {
    private String status;
    private Service result;

    // Getters and setters
}

class ValidationError {
    private List<Object> loc;
    private String msg;
    private String type;

    // Getters and setters
}

class Country {
    private String code;
    private String full_code;
    private String name;

    // Getters and setters
}

class Service {
    private String code;
    private String country_code;
    private String name;

    // Getters and setters
}
