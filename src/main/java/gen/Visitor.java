package gen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Visitor {
    private String firstname;
    private String lastname;
    private String jobTitle;
    private String phone;
    private String email;
}
