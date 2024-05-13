

# ConversationMessages


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a conversation message record. |  |
|**createdAt** | **Object** | Timestamp of when a &#x60;conversation_messages&#x60; record was created. |  [optional] |
|**contextId** | **Object** | The unique identifier for the context of &#x60;conversation_messages&#x60; (account, course, user). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60; or &#x60;Account&#x60; or &#x60;User&#x60;. |  [optional] |
|**conversationId** | **Object** | The unique identifier for the conversation. |  [optional] |
|**authorId** | **Object** | User ID of the author of the message. |  [optional] |
|**generated** | **Object** | This attribute is true if the system generated this message (e.g. \&quot;John was added to this conversation\&quot;). |  [optional] |
|**forwardedMessageIds** | [**ConversationMessagesForwardedMessageIds**](ConversationMessagesForwardedMessageIds.md) |  |  [optional] |
|**mediaCommentId** | **Object** | Media comment ID of an audio of video file to be associated with this message. |  [optional] |
|**mediaCommentType** | [**MediaCommentTypeEnum**](#MediaCommentTypeEnum) | Type of the associated media file. |  [optional] |
|**assetId** | **Object** | The ID of an attached asset, such as a submission. |  [optional] |
|**assetType** | [**AssetTypeEnum**](#AssetTypeEnum) | The type of an attached asset. |  [optional] |
|**attachmentIds** | [**ConversationMessagesAttachmentIds**](ConversationMessagesAttachmentIds.md) |  |  [optional] |
|**hasAttachments** | **Object** | True if the message has attachments. |  [optional] |
|**hasMediaObjects** | **Object** | True if the message has media objects. |  [optional] |
|**body** | [**ConversationMessagesBody**](ConversationMessagesBody.md) |  |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |



## Enum: MediaCommentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| AUDIO | &quot;audio&quot; |
| AUDIO_ | &quot;audio/_*&quot; |
| VIDEO | &quot;video&quot; |
| VIDEO_ | &quot;video/_*&quot; |



## Enum: AssetTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| SUBMISSION | &quot;Submission&quot; |



