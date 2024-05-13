

# CommentBankItems


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the comment bank item. |  |
|**userId** | **Object** | The ID of the user who created the comment bank item. |  |
|**createdAt** | **Object** | Timestamp of when the comment_bank_item record was created. |  |
|**updatedAt** | **Object** | Timestamp of when the comment_bank_item record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Workflow status of the comment bank item. |  |
|**courseId** | **Object** | Identifies the course. |  |
|**comment** | [**CommentBankItemsComment**](CommentBankItemsComment.md) |  |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



