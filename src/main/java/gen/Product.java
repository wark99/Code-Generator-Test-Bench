package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Product {
    @JsonProperty("name")
    private String name;

    @JsonProperty("description")
    private String description;

    @JsonProperty("url")
    private String url;

    // Getters and setters
}