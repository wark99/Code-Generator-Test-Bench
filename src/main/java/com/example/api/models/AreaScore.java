package com.example.api.models;

import lombok.Data;

@Data
public class AreaScore {
    private String areaCode;
    private Double scoreArea;
    private Double scoreAreaMax;
    private Double scoreAreaToBe;
    private Double deltaImprovementsArea;
    private Double deltaCriticalIssuesArea;
    private String improvementsArea;
    private String criticalIssuesArea;
}
