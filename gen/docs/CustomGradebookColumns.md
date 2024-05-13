

# CustomGradebookColumns


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a custom Gradebook column data definition. |  |
|**createdAt** | **Object** | Timestamp of when a custom_gradebook_columns record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a custom_gradebook_columns record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the custom gradebook column. |  |
|**courseId** | **Object** | The ID of the course that defines this column. |  |
|**teacherNotes** | **Object** | True if this column represents the predefined *Notes* column in Gradebook. |  |
|**position** | **Object** | The ordering of this column among the columns defined for this course. |  |
|**readOnly** | **Object** | If true, the contents of this column cannot be edited from Gradebook. |  |
|**title** | **Object** | The title of the column, as displayed in Gradebook. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| HIDDEN | &quot;hidden&quot; |
| DELETED | &quot;deleted&quot; |



