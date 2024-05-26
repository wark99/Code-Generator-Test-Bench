package uni.testbench.gen;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;
import java.util.List;

@RestController
@RequestMapping("/api/pub/vX")
public class BrandController {

    @GetMapping("/brands")
    public ResponseEntity<List<Brand>> getBrands(@RequestParam(required = false, defaultValue = "prod") String env) {
        // Logic to fetch brands based on environment
        return ResponseEntity.ok(Arrays.asList(
            new Brand("onecom", new WsbApiUri("websitebuilder.one.com", "https://websitebuilder.one.com/api/pub/v1")),
            new Brand("hostnet", new WsbApiUri("websitebuilder.hostnet.nl", "https://websitebuilder.hostnet.nl/api/pub/v1")),
            new Brand("checkdomain", new WsbApiUri("websitebuilder.checkdomain.de", "https://websitebuilder.checkdomain.de/api/pub/v1"))
        ));
    }

    @GetMapping("/brands/{codeName}")
    public ResponseEntity<Brand> getBrand(@PathVariable String codeName) {
        // Logic to fetch brand information by codeName
        // Assuming codeName is unique
        switch (codeName) {
            case "onecom":
                return ResponseEntity.ok(new Brand("onecom", new WsbApiUri("websitebuilder.one.com", "https://websitebuilder.one.com/api/pub/v1")));
            case "hostnet":
                return ResponseEntity.ok(new Brand("hostnet", new WsbApiUri("websitebuilder.hostnet.nl", "https://websitebuilder.hostnet.nl/api/pub/v1")));
            case "checkdomain":
                return ResponseEntity.ok(new Brand("checkdomain", new WsbApiUri("websitebuilder.checkdomain.de", "https://websitebuilder.checkdomain.de/api/pub/v1")));
            default:
                return ResponseEntity.notFound().build();
        }
    }

    @PostMapping("/sso/{domainName}")
    public ResponseEntity<SSOResponse> generateSSO(@PathVariable String domainName) {
        // Logic to generate SSO for the provided domainName
        String ssoUrl = "https://websitebuilder.hostnet.nl/sso?tkn=;lksaj;dlkfajs";
        long expirationTime = 1618388591058L; // Example expiration time

        SSOResponse response = new SSOResponse(ssoUrl, expirationTime);
        return ResponseEntity.ok(response);
    }
}
