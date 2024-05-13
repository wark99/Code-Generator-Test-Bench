

# UserNotes


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a user journal record. |  |
|**deletedAt** | **Object** | Timestamp when this record was deleted. If the record has not been deleted the value will be NULL. |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a &#x60;user_notes&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;user_notes&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | the state of the entry record. |  |
|**note** | [**UserNotesNote**](UserNotesNote.md) |  |  [optional] |
|**createdById** | **Object** | user ID the entry was created by. |  [optional] |
|**title** | **Object** | Faculty Journal entry title. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



