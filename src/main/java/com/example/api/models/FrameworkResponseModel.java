package com.example.api.models;

import lombok.Data;

@Data
public class FrameworkResponseModel {
    private Integer id;
    private String name;
    private String description;
    private Double flESGScoreMax;
    private Boolean transformLikertKPI;
    private String language;
}
