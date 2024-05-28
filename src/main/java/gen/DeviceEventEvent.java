package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

import java.util.Date;

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
