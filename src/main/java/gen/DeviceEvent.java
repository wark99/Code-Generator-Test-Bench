package gen;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import org.jetbrains.annotations.NotNull;

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