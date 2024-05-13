

# MeasurementEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** | The unique identifier for the event. |  |
|**timestamp** | **OffsetDateTime** | The time when the event occurred. |  |
|**lastModified** | **OffsetDateTime** | The time when the event was last modified. In some cases an event may be modified to correct invalid information. |  |
|**type** | **MeasurementEventType** |  |  |
|**device** | [**MeasurementEventDevice**](MeasurementEventDevice.md) |  |  |
|**raw** | [**MeasurementEventRaw**](MeasurementEventRaw.md) |  |  |
|**measurements** | [**List&lt;Measurement&gt;**](Measurement.md) |  |  |



