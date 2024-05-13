

# DiscussionTopicParticipants

If a user has posted to a discussion topic, there will be a row in this table.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a discussion topic participants record. |  |
|**userId** | **Object** | The unique ID of a user. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current state of the record. |  |
|**subscribed** | **Object** | Flag indicating that user is subscribed to discussion and will receive notifications for new comments. |  [optional] |
|**unreadEntryCount** | **Object** | The count of discussion entries that this user has not yet read. |  |
|**discussionTopicId** | **Object** | The unique identifier of a discussion topic record. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| READ | &quot;read&quot; |
| UNREAD | &quot;unread&quot; |



