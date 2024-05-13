

# AccessTokens

This table in Canvas Data 2 will only share developer tool specific token metadata. All users have an option to create an access token based on their role and level of data access.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for an access token record. |  |
|**developerKeyId** | **Object** | The unique identifier of a developer key. |  |
|**userId** | **Object** | The unique ID of the user the token acts as. |  [optional] |
|**realUserId** | **Object** | If the token was created while masquerading, this is the real user doing the masquerading. Used for auditing. |  [optional] |
|**lastUsedAt** | **Object** | Timestamp of last access using this access token. |  [optional] |
|**expiresAt** | **Object** | The expiration date/time for this token. This may be a NULL value. |  [optional] |
|**purpose** | **Object** | For user-generated tokens, purpose can be manually set. For app-generated tokens, this should be generated based on the scope defined in the authentication process. |  [optional] |
|**createdAt** | **Object** | Timestamp of when an &#x60;access_tokens&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when an &#x60;access_tokens&#x60; record was updated. |  |
|**scopes** | **Object** | A list of scopes that can be applied to access tokens. i.e.: courses. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The current state of the access token record. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



