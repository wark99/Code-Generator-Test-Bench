package com.example.api.models;

import lombok.Data;

@Data
public class AreaResponseModel {
    private Integer id;
    private Integer frameworkId;
    private String name;
    private String description;
    private String code;
    private String language;
    private Double lsAreaWeights;
    private Double maximumAreaScore;
}
