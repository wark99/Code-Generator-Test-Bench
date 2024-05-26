package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.List;
import java.util.Objects;

public class HTTPValidationError {
    @JsonProperty("detail")
    private List<ValidationError> detail = null;

    public List<ValidationError> getDetail() {
        return detail;
    }

    public void setDetail(List<ValidationError> detail) {
        this.detail = detail;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        HTTPValidationError that = (HTTPValidationError) o;
        return Objects.equals(detail, that.detail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(detail);
    }

    @Override
    public String toString() {
        return "HTTPValidationError{" +
            "detail=" + detail +
            '}';
    }
}
