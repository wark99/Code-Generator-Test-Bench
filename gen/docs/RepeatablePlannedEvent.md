

# RepeatablePlannedEvent


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**plannedEventId** | **Integer** |  |  |
|**streamId** | **String** | Unique identifier of the &#x60;stream&#x60; that is related to the resource &#x60;RepeatablePlannedEvent&#x60; |  |
|**storageMachineId** | **Integer** | Unique identifier of the &#x60;channel&#x60; that is related to the resource &#x60;RepeatablePlannedEvent&#x60; |  |
|**deletedAt** | **Integer** | Timestamp &#x60;RepeatablePlannedEvent&#x60; has been deleted |  |
|**name** | **String** | Name of the resource &#x60;RepeatablePlannedEvent&#x60; |  |
|**startAt** | **Integer** |  |  |
|**stopAt** | **Integer** |  |  |
|**timezone** | **String** |  |  |
|**repeatInterval** | **Integer** |  |  |
|**repeatUntil** | **Integer** |  |  |
|**weekendsOnly** | **Boolean** |  |  |
|**weekdaysOnly** | **Boolean** |  |  |
|**authorizeCountry** | **Boolean** |  |  |
|**stopLive** | **Boolean** |  |  |
|**accessCountry** | **String** |  |  |
|**record** | **Boolean** |  |  |
|**recordName** | **String** |  |  |
|**fragmentDuration** | **Integer** |  |  |
|**dvrWindow** | **Integer** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | only&#x3D;&gt;Change only this event, all&#x3D;&gt;Change all event, from&#x3D;&gt;Change this event and recurrences |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| FROM | &quot;from&quot; |
| ONLY | &quot;only&quot; |



