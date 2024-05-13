

# ContentParticipationCounts


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a content participation count record. |  |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when a content_participation_counts record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a content_participation_counts record was updated. |  |
|**contextId** | **Object** | The unique identifier of a content_participation_counts&#39;s context (course). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |
|**unreadCount** | **Object** | The number of unread actions for this user on this course. |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | The type of content. |  |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| SUBMISSION | &quot;Submission&quot; |



