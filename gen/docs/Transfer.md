

# Transfer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** | File Transfer Id |  |
|**uri** | **String** | Uri Resolving to the content in s3 (s3 uri) |  |
|**state** | [**StateEnum**](#StateEnum) | File Transfer State |  |
|**message** | **String** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| WAITING_FOR_CONTENT_COMPLETION | &quot;WAITING_FOR_CONTENT_COMPLETION&quot; |
| SEND_ERROR | &quot;SEND_ERROR&quot; |
| SCHEDULED_FOR_SEND | &quot;SCHEDULED_FOR_SEND&quot; |
| SENDING | &quot;SENDING&quot; |
| SENT | &quot;SENT&quot; |
| ABORTED | &quot;ABORTED&quot; |
| EXPORT_ERROR | &quot;EXPORT_ERROR&quot; |
| SCHEDULED_FOR_EXPORT | &quot;SCHEDULED_FOR_EXPORT&quot; |
| EXPORTING | &quot;EXPORTING&quot; |
| EXPORTED | &quot;EXPORTED&quot; |



