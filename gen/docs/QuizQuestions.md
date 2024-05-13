

# QuizQuestions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the quiz question. |  |
|**createdAt** | **Object** | Time when the quiz question was created. |  [optional] |
|**updatedAt** | **Object** | Time when the quiz question was last updated. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the quiz question. |  [optional] |
|**quizId** | **Object** | The ID of the Quiz the question belongs to. |  [optional] |
|**migrationId** | **Object** | The unique identifier of the migration that imported the quiz question. |  [optional] |
|**quizGroupId** | **Object** | Identifies the quiz group. |  [optional] |
|**assessmentQuestionId** | **Object** | Identifies the assessment question. |  [optional] |
|**assessmentQuestionVersion** | **Object** | Version of the assessment question associated with the quiz question. |  [optional] |
|**position** | **Object** | The order in which the question will be retrieved and displayed. |  [optional] |
|**questionData** | [**TypeExtractedFromColumnQuizQuestionsQuestionData**](TypeExtractedFromColumnQuizQuestionsQuestionData.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| GENERATED | &quot;generated&quot; |



