package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

class Position {
    @JsonProperty("latitude")
    private Double latitude;

    @JsonProperty("longitude")
    private Double longitude;

    @JsonProperty("updatedAt")
    private String updatedAt;

    // getters and setters, equals, hashCode, toString
}
