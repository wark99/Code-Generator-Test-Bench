package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

class ProducedPart {
    @JsonProperty("key")
    private String key;

    @JsonProperty("value")
    private String value;

    // getters and setters, equals, hashCode, toString
}
