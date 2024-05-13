

# AttachmentAssociations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of an attachment associations record. |  |
|**attachmentId** | **Object** | The unique identifier of an attachment record. |  [optional] |
|**contextId** | **Object** | The unique identifier of the context of this attachment association. |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;. |  |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| CONVERSATIONMESSAGE | &quot;ConversationMessage&quot; |
| SUBMISSION | &quot;Submission&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |



