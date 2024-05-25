package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

public class AdsResponse {
    @JsonProperty("product")
    private Product product;

    @JsonProperty("message")
    private String message;

    @JsonProperty("error")
    private String error;

    // Getters and setters
}
