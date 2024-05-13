

# ContentParticipations

Examples include new grade, new excused status, or new score.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a content participation record. |  |
|**userId** | **Object** | The unique ID of a user. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current state of the record. |  |
|**contentId** | **Object** | The unique identifier of a content record. |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | The type of the object represented by &#x60;content_id&#x60;. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| READ | &quot;read&quot; |
| UNREAD | &quot;unread&quot; |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| SUBMISSION | &quot;Submission&quot; |



