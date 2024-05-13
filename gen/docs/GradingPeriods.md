

# GradingPeriods

A Grading period is like a \"term\", essentially used for splitting up the grade book into \"periods\".

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for the grading period. |  |
|**createdAt** | **Object** | Timestamp when record was created. |  |
|**updatedAt** | **Object** | Timestamp when record was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the grading periods. |  |
|**gradingPeriodGroupId** | **Object** | Surrogate ID to the grading period group dataset. |  |
|**startDate** | **Object** | The start date of the grading period. |  |
|**endDate** | **Object** | The end date of the grading period. |  |
|**closeDate** | **Object** | Grades can only be changed before this close date of the grading period. |  [optional] |
|**title** | **Object** | The title for the grading period. |  [optional] |
|**weight** | **Object** | A weight value that contributes to the overall weight of a grading period set, used to calculate how much assignments in this period contribute to the total grade. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



