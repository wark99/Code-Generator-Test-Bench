package gen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Company {
    private String name;
    private Address address;
    private String workforce;
    private String type;
    private String phone;
}
