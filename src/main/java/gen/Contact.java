package gen;

import com.fasterxml.jackson.annotation.JsonInclude;
import lombok.Data;

import java.util.List;

@Data
@JsonInclude(JsonInclude.Include.NON_NULL)
public class Contact {
    private String id;
    private Company company;
    private CE ce;
    private Visitor visitor;
    private String comment;
    private List<String> tags;
    private String from;
    private Long timestamp;
}
