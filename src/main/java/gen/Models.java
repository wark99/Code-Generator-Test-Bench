package gen;

// HTTPValidationError.java
public class HTTPValidationError {
    private List<ValidationError> detail;

    public List<ValidationError> getDetail() {
        return detail;
    }

    public void setDetail(List<ValidationError> detail) {
        this.detail = detail;
    }
}

// ValidationError.java
public class ValidationError {
    private List<Object> loc;
    private String msg;
    private String type;

    public List<Object> getLoc() {
        return loc;
    }

    public void setLoc(List<Object> loc) {
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

// Data.java (used in request bodies)
public class Data {
    // Add properties as needed
    private String property1;
    private String property2;

    public String getProperty1() {
        return property1;
    }

    public void setProperty1(String property1) {
        this.property1 = property1;
    }

    public String getProperty2() {
        return property2;
    }

    public void setProperty2(String property2) {
        this.property2 = property2;
    }
}

