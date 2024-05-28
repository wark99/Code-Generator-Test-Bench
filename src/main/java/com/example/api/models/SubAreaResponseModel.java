package com.example.api.models;

import lombok.Data;

@Data
public class SubAreaResponseModel {
    private Integer id;
    private Integer frameworkId;
    private Integer areaId;
    private String name;
    private String description;
    private String code;
    private String language;
    private Double maximumSubareaScore;
}
