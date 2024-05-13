

# WebConferenceParticipants


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the web conference participant. |  |
|**webConferenceId** | **Object** | Foreign key to the &#x60;web_conferences&#x60; page. |  [optional] |
|**userId** | **Object** | Identifies the user who is the conference participant. |  [optional] |
|**createdAt** | **Object** | Timestamp when record was created. |  |
|**updatedAt** | **Object** | Timestamp when record was updated. |  |
|**participationType** | [**ParticipationTypeEnum**](#ParticipationTypeEnum) | Type of participation e.g.: invitee or attendee. |  [optional] |



## Enum: ParticipationTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ATTENDEE | &quot;attendee&quot; |
| INITIATOR | &quot;initiator&quot; |
| INVITEE | &quot;invitee&quot; |



