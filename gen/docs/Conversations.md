

# Conversations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a conversations record. Links to &#x60;conversation_messages.conversation_id&#x60;. |  |
|**updatedAt** | **Object** | Timestamp of when a conversations record was updated. |  [optional] |
|**contextId** | **Object** | The unique identifier for the conversations&#39;s context (account, course, user). ID associated with the &#x60;context_type&#x60;. |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  [optional] |
|**hasAttachments** | **Object** | If the conversation has attachments. |  |
|**hasMediaObjects** | **Object** | If the conversation has media objects associated. |  |
|**subject** | **Object** | The subject line of the conversation. |  [optional] |
|**tags** | [**ConversationsTags**](ConversationsTags.md) |  |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |
| ACCOUNT | &quot;Account&quot; |



