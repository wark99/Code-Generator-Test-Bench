package gen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Address {
    private String street;
    private String extra;
    private String zipcode;
    private String city;
}
