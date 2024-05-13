

# PlannedConference


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**calendarId** | **Integer** | The unique identifier (ID) of the Infomaniak Calendar where you want to plan the meeting. Make a GET request on https://calendar.infomaniak.com/api/pim/calendar |  |
|**startingAt** | **String** |  |  |
|**endingAt** | **String** | Room settings can be deleted if this date expires. This field will be updated if event dates change in Infomaniak Calendar. |  |
|**timezone** | **String** |  |  |
|**hostname** | **String** | Needed for rebuilding room url |  |
|**title** | **String** |  |  |
|**description** | **String** |  |  [optional] |
|**attendees** | [**List&lt;CalendarEventAttendees&gt;**](CalendarEventAttendees.md) |  |  [optional] |
|**options** | [**List&lt;ConferenceOptions&gt;**](ConferenceOptions.md) |  |  |



