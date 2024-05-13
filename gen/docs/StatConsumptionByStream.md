

# StatConsumptionByStream


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**streamId** | **Integer** | The stream id related to this stat |  |
|**totalBytes** | **Integer** | The total of bytes consumed on the date range |  |
|**averageBytesByListeners** | **BigDecimal** | The average of bytes consumed by listeners |  |
|**averageBytesByDay** | **BigDecimal** | The average of bytes consumed by day |  |
|**maxBytes** | **Integer** | The max bytes consumed in one day |  |
|**type** | [**TypeEnum**](#TypeEnum) | The type of stream |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| HLS | &quot;hls&quot; |
| STREAM | &quot;stream&quot; |



