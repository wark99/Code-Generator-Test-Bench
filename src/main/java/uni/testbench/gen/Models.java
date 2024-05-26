package uni.testbench.gen;

import java.util.List;

public class BodyPredictPredictPost {
    private List<String> file;

    public List<String> getFile() {
        return file;
    }

    public void setFile(List<String> file) {
        this.file = file;
    }
}

import java.util.List;

public class BodyUploadFileClassifyPost {
    private List<String> file;

    public List<String> getFile() {
        return file;
    }

    public void setFile(List<String> file) {
        this.file = file;
    }
}

import java.util.List;

public class HTTPValidationError {
    private List<ValidationError> detail;

    public List<ValidationError> getDetail() {
        return detail;
    }

    public void setDetail(List<ValidationError> detail) {
        this.detail = detail;
    }
}

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

