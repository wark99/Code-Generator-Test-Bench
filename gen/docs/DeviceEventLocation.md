

# DeviceEventLocation

Information about the location where the device was located at the time of this event/alarm. Thie property may not be present for all events.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **OffsetDateTime** | The time when the event occurred. |  |
|**fixType** | **GpsFixType** |  |  |
|**latitude** | **Double** |  |  |
|**longitude** | **Double** |  |  |
|**speed** | **Double** |  |  [optional] |
|**heading** | **Double** |  |  [optional] |
|**gpsText** | **String** | The raw location data reported by the device. For GPS fix types this will be in NMEA message structure. |  [optional] |



