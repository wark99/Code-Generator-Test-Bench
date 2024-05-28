package com.example.api.models;

import lombok.Data;

@Data
public class IndicatoriScore {
    private String indicatorCode;
    private Double scoreIndicator;
    private Double scoreIndicatorMax;
    private Double scoreIndicatorToBe;
    private Double deltaImprovementsInd;
    private Double deltaCriticalIssuesInd;
    private String improvementsInd;
    private String criticalIssuesInd;
    private Double indicatorWeight;
    private Double indicatorCost;
    private String typeKPIList;
    private String codKPIList;
    private String weightKPIList;
    private String questionnaireValuesList;
    private String questionnaireValuesToBeList;
    private String esgKPIscoreList;
    private String esgKPIscoreToBeList;
}
