

# StatListenerByStation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**streamId** | **Integer** | The stream id related to this stat |  |
|**listeners** | **Integer** | The number of listeners |  |
|**listeners30s** | **Integer** | The number of listeners will stay 30 seconds |  |
|**maxListeners** | **Integer** | The max listeners on the date range |  |
|**minListeners** | **Integer** | The min listeners on the date range |  |
|**uniques** | **Integer** | The number of unique listeners |  |
|**averageListeners** | **BigDecimal** | The average listeners on the date range |  |
|**listeningTime** | **Integer** | The number of seconds listened |  |
|**maxListeningTime** | **Integer** | The max of seconds listened |  |
|**minListeningTime** | **Integer** | The min of seconds listened |  |
|**averageListeningTime** | **BigDecimal** | The average of seconds listened on the date range |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of stream |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| HLS | &quot;hls&quot; |
| STREAM | &quot;stream&quot; |


