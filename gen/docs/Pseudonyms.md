

# Pseudonyms

Pseudonyms are login profiles associated with users. Contains user / account relationship (may contain multiple records per `user_id` if that `user_id` is associated with multiple accounts); note: not all users can be found in the pseudonyms table.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | Primary key for this pseudonym in the the Canvas database. |  |
|**deletedAt** | **Object** | Timestamp when the pseudonym was deleted (NULL if the pseudonym is still active). |  [optional] |
|**integrationId** | **Object** | The &#x60;integration_id&#x60; associated with the user. |  [optional] |
|**userId** | **Object** | Id for the user associated with this pseudonym. |  |
|**createdAt** | **Object** | Timestamp when this pseudonym was created in Canvas. |  |
|**updatedAt** | **Object** | Timestamp when this pseudonym was last updated in Canvas. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the pseudonym. |  |
|**accountId** | **Object** | Identifies the account associated with this pseudonym. Typically root account ID unless account user belongs to trust/consortium based Canvas accounts. |  |
|**sisBatchId** | **Object** | The ID of the SIS import. |  [optional] |
|**uniqueId** | **Object** | The unique login ID for the user. This is what the user uses to log in to Canvas. |  |
|**loginCount** | **Object** | The count of all user logins. |  |
|**failedLoginCount** | **Object** | Only applies to accounts that use Canvas authentication settings. |  |
|**lastRequestAt** | **Object** | Timestamp of when the user last logged in with this pseudonym. |  [optional] |
|**lastLoginAt** | **Object** | Timestamp of last time a user logged in with this pseudonym. |  [optional] |
|**currentLoginAt** | **Object** | Timestamp of when the user logged in. |  [optional] |
|**lastLoginIp** | **Object** | IP address recorded the last time a user logged in with this pseudonym. |  [optional] |
|**currentLoginIp** | **Object** | IP address of user&#39;s previous login id, this value could be the same as last_login_ip. |  [optional] |
|**sisUserId** | **Object** | The SIS ID associated with the user. |  [optional] |
|**authenticationProviderId** | **Object** | The authentication provider this login is associated with. This can be the integer ID of the provider, or the type of the provider (in which case, it will find the first matching provider). |  [optional] |
|**position** | **Object** | Position of user&#39;s login credentials. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| SUSPENDED | &quot;suspended&quot; |



