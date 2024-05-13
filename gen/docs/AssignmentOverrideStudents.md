

# AssignmentOverrideStudents


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the Assignment Override Student. |  |
|**userId** | **Object** | Identifies the user. |  |
|**createdAt** | **Object** | Timestamp of when the &#x60;assignment_override_student&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when the &#x60;assignment_override_student&#x60; was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for assignment override students record. |  |
|**assignmentId** | **Object** | Identifies the assignment the override is associated with. |  [optional] |
|**quizId** | **Object** | Identifies the quiz the override is associated with. |  [optional] |
|**assignmentOverrideId** | **Object** | Identifies the assignment override dimension. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



