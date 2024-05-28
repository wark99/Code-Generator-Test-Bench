package com.example.api.models;

import lombok.Data;

import java.util.List;

@Data
public class ScoreSubResponseModel {
    private List<SubAreaScore> subareas;
    private List<AreaScore> areas;
    private List<IndicatoriScore> indicators;
    private GlobalScore globalScore;
}
