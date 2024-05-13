

# AssignmentGroups


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the assignment group. |  |
|**name** | **Object** | The name of the assignment group. |  [optional] |
|**createdAt** | **Object** | The time when the assignment group was created. |  |
|**updatedAt** | **Object** | The time when the assignment group was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the assignment group. |  |
|**contextId** | **Object** | The unique identifier for the assignments group context (course). |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of object represented by &#x60;context_id&#x60;. |  |
|**defaultAssignmentName** | **Object** | The default title for an assignment when it is created in this assignment group. |  [optional] |
|**groupWeight** | **Object** | The weight of the assignment group. |  [optional] |
|**migrationId** | **Object** | The unique identifier of the migration that imported this assignment group. |  [optional] |
|**sisSourceId** | **Object** | The Student Information System source ID of the assignment group. |  [optional] |
|**position** | **Object** | The position of the assignment group. |  [optional] |
|**rules** | [**TypeExtractedFromColumnAssignmentGroupsRules**](TypeExtractedFromColumnAssignmentGroupsRules.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| AVAILABLE | &quot;available&quot; |
| DELETED | &quot;deleted&quot; |
| ACTIVE | &quot;active&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |



