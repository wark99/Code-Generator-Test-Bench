package com.example.api.models;

import lombok.Data;

import java.util.List;

@Data
public class AllAreas {
    private Integer id;
    private String name;
}

@Data
public class AllAreasModel {
    private List<AllAreas> areas;
}

@Data
public class AllFacts {
    private Integer id;
    private String name;
}

@Data
public class AllFactsModel {
    private List<AllFacts> facts;
}

@Data
public class AllFrameworks {
    private Integer id;
    private String name;
}

@Data
public class AllFrameworkModel {
    private List<AllFrameworks> frameworks;
}

@Data
public class AllSubAreas {
    private Integer id;
    private String name;
}

@Data
public class AllSubAreasModel {
    private List<AllSubAreas> subareas;
}

@Data
public class AreaResponseModel {
    private Integer id;
    private Integer frameworkId;
    private String name;
    private String description;
    private String code;
    private String language;
    private Double lsAreaWeights;
    private Double maximumAreaScore;
}

@Data
public class FrameworkResponseModel {
    private Integer id;
    private String name;
    private String description;
    private Double flESGScoreMax;
    private Boolean transformLikertKPI;
    private String language;
}

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

@Data
public class AtecoToNaceResponse {
    private String naceCode;
}

@Data
public class ScoreBodyModel {
    private String userId;
    private String reportId;
    private String naceCode;
    private List<ScoreDataModel> data;
}

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

@Data
public class ScoreResponseModel {
    private Integer code;
    private ScoreSubResponseModel response;
}

@Data
public class ScoreSubResponseModel {
    private List<SubAreaScore> subareas;
    private List<AreaScore> areas;
    private List<IndicatoriScore> indicators;
    private GlobalScore globalScore;
}

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

@Data
public class GlobalScore {
    private Double globalEsg;
}

@Data
public class KpiAnswerModel {
    private String text;
    private Double value;
}

@Data
public class KpiDependOnModel {
    private Integer kpiId;
    private String kpiCode;
}

@Data
public class KpiFileModel {
    private Boolean haveFile;
    private String fileDescription;
}

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

@Data
public class Language {
    private String value;
}

@Data
public class KpiTypes {
    private String value;
}

