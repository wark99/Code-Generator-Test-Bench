

# DeviceEventEvent

Information about the event/alarm that was reported by the customer device. This property may be null or not present if this is a location-only message.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**timestamp** | **OffsetDateTime** | The time when the event occurred. |  |
|**type** | **DeviceEventType** |  |  |
|**code** | **String** | The Contact ID event code. |  |
|**zone** | **Integer** | The zone number reporting the event/alarm. |  |



