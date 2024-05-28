package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

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
