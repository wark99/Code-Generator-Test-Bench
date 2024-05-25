package gen;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AdsController {

    @PostMapping("/sponsors_v2")
    public ResponseEntity<AdsResponse> fetchAds(@RequestBody ConversationHistory conversationHistory) {
        // Implement your logic to fetch contextually relevant ads based on conversation history
        // For demonstration purposes, let's assume we always return flowers as the relevant ad
        Product product = new Product();
        product.setName("Send Flowers!");
        product.setDescription("Send Flowers!");
        product.setUrl("https://ads-is8uies5u-firebender.vercel.app/api/redirect?impressionId=ba603249-4a93-469d-886b-9b6d9ac4dd12");

        AdsResponse response = new AdsResponse();
        response.setProduct(product);
        response.setMessage("Success");

        return ResponseEntity.ok(response);
    }
}
