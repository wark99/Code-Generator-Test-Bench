

# ConversationMessageParticipants


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a conversation recipients record. |  |
|**deletedAt** | **Object** | Timestamp when this record was deleted. If the record has not been deleted the value will be NULL. |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The workflow state of the conversation participants. |  [optional] |
|**conversationMessageId** | **Object** | Identifies the messages dataset for the associated message. |  [optional] |
|**conversationParticipantId** | **Object** | Identifies the conversations dataset for the associated conversation. |  [optional] |
|**tags** | [**ConversationMessageParticipantsTags**](ConversationMessageParticipantsTags.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



