package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

class MatixData {
    @JsonProperty("deviceId")
    private String deviceId;

    @JsonProperty("position")
    private Position position;

    @JsonProperty("stateOfCharge")
    private TelemetryData stateOfCharge;

    @JsonProperty("battery")
    private TelemetryData battery;

    // getters and setters, equals, hashCode, toString
}
