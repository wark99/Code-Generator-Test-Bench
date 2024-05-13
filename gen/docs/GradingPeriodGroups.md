

# GradingPeriodGroups


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | Primary key for the grading period groups. |  |
|**accountId** | **Object** | Points to the account associated with the group. |  [optional] |
|**createdAt** | **Object** | Timestamp when record was created. |  |
|**updatedAt** | **Object** | Timestamp when record was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the grading period group. |  |
|**courseId** | **Object** | Identifies the course. |  [optional] |
|**weighted** | **Object** | Whether to weight individual grading periods within this grading group. |  [optional] |
|**displayTotalsForAllGradingPeriods** | **Object** | If set, shows the option to display the totals for all grading periods within this group on the student grades page and the gradebook. |  |
|**title** | **Object** | The title for this grading period group. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



