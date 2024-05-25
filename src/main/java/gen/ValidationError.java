package gen;

import com.fasterxml.jackson.annotation.JsonProperty;

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
}

