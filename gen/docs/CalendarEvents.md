

# CalendarEvents

These can be manually created, or automatically generated from other items like Assignments with a date attached.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a calendar event record. |  |
|**deletedAt** | **Object** | Timestamp when this record was deleted. If the record has not been deleted the value will be NULL. |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a &#x60;calendar_events&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;calendar_events&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current state of the event. |  |
|**contextId** | **Object** | The unique identifier for the context of this calendar event (account, course, user). |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |
|**locationAddress** | [**CalendarEventsLocationAddress**](CalendarEventsLocationAddress.md) |  |  [optional] |
|**startAt** | **Object** | The start date for the calendar event, if applicable. |  [optional] |
|**endAt** | **Object** | The end date for the calendar event, if applicable. |  [optional] |
|**contextCode** | **Object** | The context code of the calendar this event belongs to (course, user or group). |  [optional] |
|**timeZoneEdited** | **Object** | Time zone of the user editing the event. |  [optional] |
|**parentCalendarEventId** | **Object** | Normally NULL. If this is a reservation (see the Appointment Groups API), the ID will indicate the time slot it is for. If this is a section-level event, this will be the course-level parent event. |  [optional] |
|**effectiveContextCode** | **Object** | If specified, it indicates which calendar this event should be displayed on. For example, a section-level event would have the course&#39;s context code here, while the section&#39;s context code would be returned above. |  [optional] |
|**participantsPerAppointment** | **Object** | If the event is a time slot, this is the participant limit. |  [optional] |
|**comments** | [**CalendarEventsComments**](CalendarEventsComments.md) |  |  [optional] |
|**webConferenceId** | **Object** | The ID of a web conference associated with the calendar event. |  [optional] |
|**allDay** | **Object** | Indicates whether this is an all-day event (midnight to midnight). |  [optional] |
|**allDayDate** | **Object** | The date of this event. |  [optional] |
|**migrationId** | **Object** | The unique identifier of the migration that imported this calendar event. |  [optional] |
|**importantDates** | **Object** | Indicates if the calendar event has important dates. |  |
|**locationName** | [**CalendarEventsLocationName**](CalendarEventsLocationName.md) |  |  [optional] |
|**description** | [**CalendarEventsDescription**](CalendarEventsDescription.md) |  |  [optional] |
|**title** | **Object** | The title of the calendar event. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| LOCKED | &quot;locked&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| APPOINTMENTGROUP | &quot;AppointmentGroup&quot; |
| COURSE | &quot;Course&quot; |
| COURSESECTION | &quot;CourseSection&quot; |
| GROUP | &quot;Group&quot; |
| USER | &quot;User&quot; |
| ACCOUNT | &quot;Account&quot; |



