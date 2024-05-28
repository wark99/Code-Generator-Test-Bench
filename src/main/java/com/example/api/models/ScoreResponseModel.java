package com.example.api.models;

import lombok.Data;

@Data
public class ScoreResponseModel {
    private Integer code;
    private ScoreSubResponseModel response;
}
