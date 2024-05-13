

# CommunicationChannels

Examples include an email address, a phone number, a mobile device token for push notifications, etc.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a user communication channel record. |  |
|**path** | **Object** | The address of the communication channel e.g. an email address or a phone number. |  |
|**pathType** | **Object** | The type of communication channel being described. This field determines the type of value seen in &#x60;address&#x60;. |  |
|**pseudonymId** | **Object** | The unique ID of a user&#39;s pseudonym record. |  [optional] |
|**bounceCount** | **Object** | The number of times a communication channel has bounced when trying to deliver messages. |  |
|**confirmationCodeExpiresAt** | **Object** | The date-time when the issued confirmation code will expire. |  [optional] |
|**confirmationSentCount** | **Object** | The number of confirmations sent for the channel. |  |
|**userId** | **Object** | The unique ID of a user. |  |
|**createdAt** | **Object** | Timestamp of when a &#x60;communication_channels&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;communication_channels&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current state of the communication channel. |  |
|**position** | **Object** | The position of this communication channel relative to the user&#39;s other channels when they are ordered. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| UNCONFIRMED | &quot;unconfirmed&quot; |
| ACTIVE | &quot;active&quot; |
| RETIRED | &quot;retired&quot; |



