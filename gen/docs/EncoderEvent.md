

# EncoderEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**mountpoint** | **String** | The mountpoint has the event |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of event |  |
|**date** | **String** | The date of the encoder event |  |
|**streamId** | **Integer** | The stream id has the event |  |
|**isTranscoding** | **Boolean** | Is a transcoded stream ? |  |
|**isSource** | **Boolean** | Is a source stream? |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BAD_PASSWORD | &quot;bad_password&quot; |
| START | &quot;start&quot; |
| STOP | &quot;stop&quot; |



