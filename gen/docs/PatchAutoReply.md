

# PatchAutoReply

Auto reply PATCH body parameters

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isEnabled** | **Boolean** | Enable or disable auto reply |  |
|**message** | **String** | Auto reply message |  [optional] |
|**isRecurrent** | **Boolean** | Activate responder for recurrent_days |  [optional] |
|**recurrentDays** | [**PatchAutoReplyRecurrentDays**](PatchAutoReplyRecurrentDays.md) |  |  [optional] |
|**replyFromId** | **Integer** | Validated sender/reply address identifier |  [optional] |
|**dontReplyTo** | **List&lt;String&gt;** | Ignored addresses |  [optional] |
|**startedAt** | **String** | Begin date (Y-m-d H:i)&lt;br/&gt;This field must match the &#x60;Y-m-d&#x60; format. |  [optional] |
|**endedAt** | **String** | End date (Y-m-d H:i)&lt;br/&gt;This field must match the &#x60;Y-m-d&#x60; format. |  [optional] |
|**timeZone** | **String** |  |  [optional] |



