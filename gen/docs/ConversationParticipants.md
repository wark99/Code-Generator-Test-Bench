

# ConversationParticipants


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a conversation message participants record. |  |
|**userId** | **Object** | The unique ID of a user. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;conversation_participants&#x60; record was updated. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The workflow state of the message. |  |
|**hasAttachments** | **Object** | If the conversation has attachments. |  |
|**hasMediaObjects** | **Object** | If the conversation has media objects associated. |  |
|**lastMessageAt** | **Object** | The timestamp of the latest message. |  [optional] |
|**subscribed** | **Object** | Indicates whether the current user is subscribed to the conversation. |  |
|**messageCount** | **Object** | The number of messages in the conversation. |  |
|**label** | **Object** | Any label applied to the conversation, such as *starred*. |  [optional] |
|**tags** | [**ConversationParticipantsTags**](ConversationParticipantsTags.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| READ | &quot;read&quot; |
| UNREAD | &quot;unread&quot; |
| ARCHIVED | &quot;archived&quot; |
| DELETED | &quot;deleted&quot; |



