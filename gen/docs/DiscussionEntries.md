

# DiscussionEntries

Discussion entries are replies in a discussion topic.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for the entry. |  |
|**message** | [**DiscussionEntriesMessage**](DiscussionEntriesMessage.md) |  |  [optional] |
|**attachmentId** | **Object** | Representation of the attachment for the entry, if any. Present only if there is an attachment. |  [optional] |
|**deletedAt** | **Object** | Timestamp when the discussion entry was deleted. |  [optional] |
|**userId** | **Object** | The unique identifier for the author of the entry. |  [optional] |
|**createdAt** | **Object** | The creation time of the entry. |  |
|**updatedAt** | **Object** | The updated time of the entry, in ISO8601 format. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the discussion message. |  |
|**migrationId** | **Object** | The unique identifier of the migration that imported the entry. |  [optional] |
|**discussionTopicId** | **Object** | The ID of the discussion topic that this entry is part of. |  [optional] |
|**parentId** | **Object** | The parent discussion entry ID of this discussion entry. Has a value if the entry is a reply to another entry. |  [optional] |
|**editorId** | **Object** | The unique user ID of the person to last edit the entry, if different than user_id. |  [optional] |
|**rootEntryId** | **Object** | The root discussion entry ID that this entry is a part of. Has a value if the entry is a reply to another entry. |  [optional] |
|**depth** | **Object** | Reply depth for this entry. |  [optional] |
|**ratingCount** | **Object** | Rating count is the amount of people who have submitted a rating on a given discussion with the only rating being \&quot;like\&quot;. |  [optional] |
|**ratingSum** | **Object** | The rating sum is the sum of the ratings which occurred. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



