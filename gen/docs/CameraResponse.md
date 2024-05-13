

# CameraResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  |
|**name** | **String** | Name defined by user |  [optional] |
|**config** | [**CameraConfig**](CameraConfig.md) |  |  [optional] |
|**options** | [**CameraOptions**](CameraOptions.md) |  |  [optional] |
|**capabilities** | [**List&lt;CapabilitiesEnum&gt;**](#List&lt;CapabilitiesEnum&gt;) |  |  [optional] |
|**teamId** | **Integer** | Team id. 0 is reserved for anonymous. |  |
|**printerUuid** | **String** | Printer UUID - can be found in the url in printer detail or in the printer settings tab |  |
|**token** | **String** |  |  [optional] |
|**origin** | **CameraOrigin** |  |  |
|**deleted** | **Integer** | Timestamp of camera deletion. Deleted cameras are listed only in job detail! |  [optional] |
|**registered** | **Boolean** | True if the registration process of camera is finished |  |
|**sortOrder** | **Integer** | Sort order of the cameras per printer! For now it is not possible to change the camera&#39;s sort order |  [optional] |



## Enum: List&lt;CapabilitiesEnum&gt;

| Name | Value |
|---- | -----|
| TRIGGER_SCHEME | &quot;trigger_scheme&quot; |
| IMAGING | &quot;imaging&quot; |
| RESOLUTION | &quot;resolution&quot; |
| FOCUS | &quot;focus&quot; |



