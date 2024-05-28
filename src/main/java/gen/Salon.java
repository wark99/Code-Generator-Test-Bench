package gen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Salon {
    private String id;
    private String city;
    private String year;
    private String semester;
}