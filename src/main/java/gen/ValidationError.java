package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

import java.util.Objects;

public class ValidationError {
    @JsonProperty("loc")
    private Object loc;
    @JsonProperty("msg")
    private String msg;
    @JsonProperty("type")
    private String type;

    public Object getLoc() {
        return loc;
    }

    public void setLoc(Object loc) {
        this.loc = loc;
    }

    public String getMsg() {
        return msg;
    }

    public void setMsg(String msg) {
        this.msg = msg;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ValidationError that = (ValidationError) o;
        return Objects.equals(loc, that.loc) && Objects.equals(msg, that.msg) && Objects.equals(type, that.type);
    }

    @Override
    public int hashCode() {
        return Objects.hash(loc, msg, type);
    }

    @Override
    public String toString() {
        return "ValidationError{" +
            "loc=" + loc +
            ", msg='" + msg + '\'' +
            ", type='" + type + '\'' +
            '}';
    }
}

