package gen;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

@JsonInclude(JsonInclude.Include.NON_NULL)
class DeviceEventDevice {
    @JsonProperty("id")
    @NotNull
    private String id;

    @JsonProperty("type")
    @NotNull
    private String type;

    @JsonProperty("serialNumber")
    private String serialNumber;

    @JsonProperty("imei")
    private String imei;

    @JsonProperty("phoneNumber")
    @NotNull
    private String phoneNumber;

    @JsonProperty("batteryPercentage")
    private Integer batteryPercentage;

    // Getters and setters
}
