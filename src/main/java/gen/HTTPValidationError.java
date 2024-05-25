package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;

public class HTTPValidationError {
    @JsonProperty("detail")
    private List<ValidationError> detail;

    public List<ValidationError> getDetail() {
        return detail;
    }

    public void setDetail(List<ValidationError> detail) {
        this.detail = detail;
    }
}

