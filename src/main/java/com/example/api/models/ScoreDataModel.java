package com.example.api.models;

import lombok.Data;

@Data
public class ScoreDataModel {
    private String subareaCode;
    private String areaCode;
    private String indicatorNumber;
    private String indicator;
    private Integer numKPI;
    private String typeKPI;
    private String codeKPI;
    private String descKPI;
    private Integer confirmedResponse;
    private Integer questionnaireValues;
    private String companyCategoryCode;
    private Integer weightIndicatorBinarySum;
}
