

# ApiLogo

Logo

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**uuid** | **String** |  |  [optional] |
|**channelId** | **BigDecimal** |  |  [optional] |
|**mode** | [**ModeEnum**](#ModeEnum) |  |  [optional] |
|**position** | [**PositionEnum**](#PositionEnum) |  |  [optional] |
|**margin** | **BigDecimal** |  |  [optional] |
|**size** | **BigDecimal** | Integer value 1-100 |  [optional] |
|**data** | **String** |  |  [optional] |
|**width** | **BigDecimal** |  |  [optional] |
|**height** | **BigDecimal** |  |  [optional] |
|**mimetype** | **String** |  |  [optional] |
|**createdAt** | **Datetime** |  |  [optional] |
|**updatedAt** | **Datetime** |  |  [optional] |
|**deletedAt** | **Datetime** |  |  [optional] |
|**channel** | [**List&lt;ApiChannel&gt;**](ApiChannel.md) |  |  [optional] |
|**medias** | [**List&lt;ApiMedia&gt;**](ApiMedia.md) |  |  [optional] |
|**overlayLogos** | [**List&lt;ApiOverlayLogo&gt;**](ApiOverlayLogo.md) |  |  [optional] |
|**uuidSequence** | **ApiUuidSequence** |  |  [optional] |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| OVERLAY | &quot;OVERLAY&quot; |
| EMBED | &quot;EMBED&quot; |



## Enum: PositionEnum

| Name | Value |
|---- | -----|
| TOP_LEFT | &quot;TOP_LEFT&quot; |
| TOP_MIDDLE | &quot;TOP_MIDDLE&quot; |
| TOP_RIGHT | &quot;TOP_RIGHT&quot; |
| CENTER_LEFT | &quot;CENTER_LEFT&quot; |
| CENTER_MIDDLE | &quot;CENTER_MIDDLE&quot; |
| CENTER_RIGHT | &quot;CENTER_RIGHT&quot; |
| BOTTOM_LEFT | &quot;BOTTOM_LEFT&quot; |
| BOTTOM_MIDDLE | &quot;BOTTOM_MIDDLE&quot; |
| BOTTOM_RIGHT | &quot;BOTTOM_RIGHT&quot; |



