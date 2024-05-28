package com.example.api.models;

import lombok.Data;

@Data
public class KpiResponseModel {
    private Integer id;
    private Integer frameworkId;
    private Integer areaId;
    private Integer subareaId;
    private Integer indicatorId;
    private Integer factId;
    private String name;
    private String description;
    private String code;
    private String language;
    private String type;
    private String tooltip;
    private KpiAnswerModel answers;
    private Integer sequence;
    private Integer relevance;
    private String unitMeasure;
    private KpiFileModel file;
    private KpiDependOnModel dependsOn;
    private Object consistencyCheck;
}
