

# Scores


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the score. |  |
|**createdAt** | **Object** | Time when the score was created. |  [optional] |
|**updatedAt** | **Object** | Time when the score was updated. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the score. |  |
|**assignmentGroupId** | **Object** | The ID of the assignment group this score refers to, or NULL if it does not refer to a particular assignment group. |  [optional] |
|**enrollmentId** | **Object** | The ID of the enrollment object this score refers to. |  |
|**gradingPeriodId** | **Object** | The ID of the grading period covered by this score, or NULL if it does not apply to a specific grading period. If this is NULL, this is the overall score for the course. |  [optional] |
|**currentScore** | **Object** | The current score for the assignments represented by this Score object. |  [optional] |
|**finalScore** | **Object** | The final score for the assignments represented by this Score object, calculated by treating ungraded assignments as though they received zero points. |  [optional] |
|**courseScore** | **Object** | True if this score does not refer to a particular grading period or assignment group (in other words, if it represents the overall score for the course referred to in the enrollment). |  |
|**unpostedCurrentScore** | **Object** | The current score, with muted/unposted assignments included. |  [optional] |
|**unpostedFinalScore** | **Object** | The final score, with muted/unposted assignments included. |  [optional] |
|**currentPoints** | **Object** | The number of points earned over all assignments covered by this score, with dropped assignments excluded. |  [optional] |
|**unpostedCurrentPoints** | **Object** | The total number of points earned over all assignments covered by this score, including muted/unposted assignments. |  [optional] |
|**finalPoints** | **Object** | The number of points earned over all assignments covered by this score, with dropped assignments excluded and unposted submissions treated as 0. |  [optional] |
|**unpostedFinalPoints** | **Object** | The number of points earned over all assignments covered by this score, with dropped assignments excluded and unposted submissions treated as 0, including muted/unposted assignments. |  [optional] |
|**overrideScore** | **Object** | The override score, if one has been set. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



