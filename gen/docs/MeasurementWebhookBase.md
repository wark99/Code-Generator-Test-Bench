

# MeasurementWebhookBase


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**url** | **URI** | The URL where notifications will be sent. |  |
|**active** | **Boolean** | Indicates whether notifications are enabled for this webhook. |  [optional] |
|**minSecondsPerCall** | **Integer** | The number of seconds to wait between notifications, or zero to trigger a notification on every event. |  [optional] |
|**eventTypes** | **List&lt;MeasurementEventType&gt;** | An optional array of measurement event types to limit which event types will trigger a notification. If no event types are specified then all events will trigger a notification. |  [optional] |



