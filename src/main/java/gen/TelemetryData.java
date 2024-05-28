package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

class TelemetryData {
    @JsonProperty("value")
    private Double value;

    @JsonProperty("updatedAt")
    private String updatedAt;

    // getters and setters, equals, hashCode, toString
}
