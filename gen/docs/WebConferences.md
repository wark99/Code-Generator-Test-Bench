

# WebConferences

Integrates with external conferencing solutions like BigBlueButton.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the conference. |  |
|**userId** | **Object** | The ID of the user that created the conference. |  |
|**createdAt** | **Object** | Timestamp when record was created. |  |
|**updatedAt** | **Object** | Timestamp when record was updated. |  |
|**contextId** | **Object** | The ID of this conference&#39;s context. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of this conference&#39;s context. |  |
|**startAt** | **Object** | The date the conference started at, NULL if it hasn&#39;t started. |  [optional] |
|**endAt** | **Object** | The date that the conference ended at, NULL if it hasn&#39;t ended. |  [optional] |
|**contextCode** | **Object** | A string identifying the context. |  [optional] |
|**startedAt** | **Object** | The time at which this conference actually started at, NULL if it hasn&#39;t started. |  [optional] |
|**userIds** | **Object** | Array of user ids that are participants in the conference. |  [optional] |
|**endedAt** | **Object** | The time at which this conference actually ended, NULL if it hasn&#39;t ended. |  [optional] |
|**recordingReady** | **Object** | Whether the conference&#39;s recording has been processed. |  [optional] |
|**conferenceType** | [**ConferenceTypeEnum**](#ConferenceTypeEnum) | The type of conference. |  |
|**conferenceKey** | **Object** | The 3rd party&#39;s ID for the conference. |  [optional] |
|**description** | [**WebConferencesDescription**](WebConferencesDescription.md) |  |  [optional] |
|**duration** | **Object** | The expected duration the conference is supposed to last. |  [optional] |
|**settings** | **Object** | Settings for the given conference. |  [optional] |
|**title** | **Object** | The title of the conference. |  |
|**uuid** | **Object** | A unique ID used for integrations. |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |
| GROUP | &quot;Group&quot; |



## Enum: ConferenceTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ADOBECONNECT | &quot;AdobeConnect&quot; |
| BIGBLUEBUTTON | &quot;BigBlueButton&quot; |
| CISCOWEBEX | &quot;CiscoWebex&quot; |
| DIMDIM | &quot;DimDim&quot; |
| WIMBA | &quot;Wimba&quot; |
| WIZIQ | &quot;Wiziq&quot; |
| DIMDIM2 | &quot;dimdim&quot; |



