

# LearningOutcomeQuestionResults


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a learning outcome question result record. |  |
|**createdAt** | **Object** | Timestamp of when a learning_outcome_question_results record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a learning_outcome_question_results record was updated. |  |
|**learningOutcomeId** | **Object** | Foreign key to the learning outcome this record is associated with. |  [optional] |
|**associatedAssetId** | **Object** | Polymorphic foreign key to the associated asset (currently always Assessment Question) used to generate this result. |  [optional] |
|**associatedAssetType** | [**AssociatedAssetTypeEnum**](#AssociatedAssetTypeEnum) | Type of the associated asset (currently always Assessment Question). |  |
|**learningOutcomeResultId** | **Object** | Identifies the learning outcome result. |  [optional] |
|**score** | **Object** | The student&#39;s score. |  [optional] |
|**possible** | **Object** | Total number of points possible. |  [optional] |
|**mastery** | **Object** | Boolean indicating whether user achieved mastery. |  [optional] |
|**attempt** | **Object** | The total number of attempts, or submissions. |  [optional] |
|**originalScore** | **Object** | Score on the first attempt. |  [optional] |
|**originalPossible** | **Object** | Possible points on the first attempt. |  [optional] |
|**originalMastery** | **Object** | Boolean indicating whether user achieved mastery. |  [optional] |
|**assessedAt** | **Object** | Time when answer was assessed. |  [optional] |
|**submittedAt** | **Object** | Time when answer was submitted. |  [optional] |
|**percent** | **Object** | Score&#39;s percent of maximum points possible for outcome, scaled to reflect any custom mastery levels that differ from the learning outcome. |  [optional] |
|**title** | [**LearningOutcomeQuestionResultsTitle**](LearningOutcomeQuestionResultsTitle.md) |  |  [optional] |



## Enum: AssociatedAssetTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ASSESSMENTQUESTION | &quot;AssessmentQuestion&quot; |



