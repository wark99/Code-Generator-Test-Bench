

# ServiceMailResponder


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Service Mail Responder&#x60; |  |
|**name** | **String** | Name of the pack mail responder |  |
|**isModel** | **Boolean** |  |  |
|**sourceModelId** | **Integer** |  |  |
|**message** | **String** | Message send by the responder |  |
|**isRecurrent** | **String** | Days when the responder is activated |  |
|**recurrentDays** | **String** | Days when the responder is activated |  |
|**startedAt** | **Integer** | Timestamp of the start of the responder |  |
|**endedAt** | **Integer** | Timestamp of the end of the responder |  |
|**isActive** | **Boolean** | is the responder actived |  |
|**isVisible** | **Boolean** |  |  |
|**dontReplyTo** | **List&lt;String&gt;** | emails where autoreply will not be sent |  [optional] |
|**replyFromId** | **Integer** | Id of the Email that send the auto reply |  [optional] |
|**replyFrom** | **String** | Email that send the auto reply |  [optional] |
|**validEmails** | [**List&lt;ValidEmail&gt;**](ValidEmail.md) |  |  [optional] |



