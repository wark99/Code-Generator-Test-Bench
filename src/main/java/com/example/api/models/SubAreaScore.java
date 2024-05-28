package com.example.api.models;

import lombok.Data;

@Data
public class SubAreaScore {
    private String subareaCode;
    private Double scoreSubarea;
    private Double scoreSubareaMax;
    private Double scoreSubareaToBe;
    private Double deltaImprovementsSubarea;
    private Double deltaCriticalIssuesSubarea;
    private String improvementsSubarea;
    private String criticalIssuesSubarea;
}
