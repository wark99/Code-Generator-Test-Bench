package com.example.api.models;

import lombok.Data;

import java.util.List;

@Data
public class FactResponseModel {
    private Integer id;
    private Integer frameworkId;
    private Integer areaId;
    private Integer subareaId;
    private Integer indicatorId;
    private String name;
    private String description;
    private String code;
    private String language;
    private Double maximumFactScore;
    private Double factWeight;
    private Double factCost;
    private List<KpiResponseModel> kpis;
}
