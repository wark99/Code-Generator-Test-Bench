package gen;

import lombok.Data;

@Data
public class ApiResponse {
    private Integer code;
    private String error;
    private String message;
}
