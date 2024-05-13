

# DiscussionEntryParticipants


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The Id of the discussion entry participant. |  |
|**userId** | **Object** | The ID of the user who participated in this discussion entry. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the entry record, could be \&quot;read\&quot; if a participant read a discussion. |  |
|**forcedReadState** | **Object** | Allows for users to force a discussion entry to be unread. |  [optional] |
|**discussionEntryId** | **Object** | The ID of the discussion entry that this participant participated in. |  |
|**rating** | **Object** | It is a number of 0 or 1 that indicates the rating providing to the linked entry. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| READ | &quot;read&quot; |
| UNREAD | &quot;unread&quot; |



