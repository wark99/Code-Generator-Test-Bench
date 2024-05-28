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