

# MeasurementWebhook


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **Object** | The URL where notifications will be sent. |  |
|**active** | **Object** | Indicates whether notifications are enabled for this webhook. |  [optional] |
|**minSecondsPerCall** | **Object** | The number of seconds to wait between notifications, or zero to trigger a notification on every event. |  [optional] |
|**eventTypes** | **Object** | An optional array of measurement event types to limit which event types will trigger a notification. If no event types are specified then all events will trigger a notification. |  [optional] |
|**id** | **UUID** | The unique identifier for the webhook. |  |



