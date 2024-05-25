package com.example.jamsapi.models;

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
