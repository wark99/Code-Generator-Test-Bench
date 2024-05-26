package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;

import javax.validation.constraints.NotNull;
import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class DeviceEvent {
    @JsonProperty("id")
    @NotNull
    private String id;

    @JsonProperty("device")
    @NotNull
    private DeviceEventDevice device;

    @JsonProperty("event")
    private DeviceEventEvent event;

    @JsonProperty("location")
    private DeviceEventLocation location;

    // Getters and setters
}

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

@JsonInclude(JsonInclude.Include.NON_NULL)
class DeviceEventEvent {
    @JsonProperty("timestamp")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ss.SSSXXX")
    @NotNull
    private Date timestamp;

    @JsonProperty("type")
    @NotNull
    private String type;

    @JsonProperty("code")
    @NotNull
    private String code;

    @JsonProperty("zone")
    @NotNull
    private Integer zone;

    // Getters and setters
}

@JsonInclude(JsonInclude.Include.NON_NULL)
class DeviceEventLocation {
    @JsonProperty("timestamp")
    @JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-MM-dd'T'HH:mm:ssXXX")
    private Date timestamp;

    @JsonProperty("fixType")
    @NotNull
    private String fixType;

    @JsonProperty("latitude")
    @NotNull
    private Double latitude;

    @JsonProperty("longitude")
    @NotNull
    private Double longitude;

    @JsonProperty("speed")
    private Double speed;

    @JsonProperty("heading")
    private Double heading;

    @JsonProperty("gpsText")
    private String gpsText;

    // Getters and setters
}

