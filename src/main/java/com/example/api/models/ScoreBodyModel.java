package com.example.api.models;

import lombok.Data;

import java.util.List;

@Data
public class ScoreBodyModel {
    private String userId;
    private String reportId;
    private String naceCode;
    private List<ScoreDataModel> data;
}
