

# CameraConfig

Configuration of the camera

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**cameraId** | **String** |  |  [optional] |
|**path** | **String** | Path to the driver |  [optional] |
|**name** | **String** | Name defined by user |  |
|**driver** | **String** |  |  [optional] |
|**triggerScheme** | [**TriggerSchemeEnum**](#TriggerSchemeEnum) | Type of snapshot trigger scheme. Manual, layer, gcode only for LINK cameras |  [optional] |
|**resolution** | [**CameraResolution**](CameraResolution.md) |  |  [optional] |
|**networkInfo** | [**NetworkInfo**](NetworkInfo.md) |  |  [optional] |



## Enum: TriggerSchemeEnum

| Name | Value |
|---- | -----|
| MANUAL | &quot;MANUAL&quot; |
| EACH_LAYER | &quot;EACH_LAYER&quot; |
| FIFTH_LAYER | &quot;FIFTH_LAYER&quot; |
| GCODE | &quot;GCODE&quot; |
| TEN_SEC | &quot;TEN_SEC&quot; |
| THIRTY_SEC | &quot;THIRTY_SEC&quot; |
| SIXTY_SEC | &quot;SIXTY_SEC&quot; |
| TEN_MIN | &quot;TEN_MIN&quot; |



