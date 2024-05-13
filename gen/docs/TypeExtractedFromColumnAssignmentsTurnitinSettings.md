

# TypeExtractedFromColumnAssignmentsTurnitinSettings


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**originalityReportVisibility** | [**OriginalityReportVisibilityEnum**](#OriginalityReportVisibilityEnum) | Allows to set the timeframe when the report will become visible. |  [optional] |
|**excludeSmallMatchesType** | [**ExcludeSmallMatchesTypeEnum**](#ExcludeSmallMatchesTypeEnum) | Exclude small sources from the Similarity Report by a set number of words or percentage. |  [optional] |
|**excludeSmallMatchesValue** | **Object** | If exclude_small_matches_type is set to percent or number then the value will be will be a number (of words or a percent). |  [optional] |
|**sPaperCheck** | **Object** | If set to TRUE, will allow to compare submission against other students&#39; papers. |  [optional] |
|**sViewReport** | **Object** | If set to TRUE students will be able to access their originality report. |  [optional] |
|**internetCheck** | **Object** | Select the content you&#39;d like to compare papers against: current and archived website content. |  [optional] |
|**journalCheck** | **Object** | Select the content you&#39;d like to compare papers against: periodicals, journals and publications. |  [optional] |
|**excludeBiblio** | **Object** | Selecting this option will exclude text appearing in the bibliography, works cited, or references sections of student papers from being checked for matches when generating Similarity Reports. |  [optional] |
|**excludeQuoted** | **Object** | Selecting this option will exclude text appearing in the bibliography, works cited, or references sections of student papers from being checked for matches when generating Similarity Reports. |  [optional] |
|**submitPapersTo** | **Object** | If set to FALSE, a similarity report will still be generated for paper submissions but students&#39; papers will not be stored in the Turnitin standard paper repository or the institution&#39;s paper repository for future comparison. |  [optional] |



## Enum: OriginalityReportVisibilityEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| IMMEDIATE | &quot;immediate&quot; |
| AFTER_GRADING | &quot;after_grading&quot; |
| AFTER_DUE_DATE | &quot;after_due_date&quot; |
| NEVER | &quot;never&quot; |



## Enum: ExcludeSmallMatchesTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| OFF | &quot;off&quot; |
| WORDS | &quot;words&quot; |
| PERCENT | &quot;percent&quot; |



