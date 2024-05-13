

# DeveloperKeys

Contains both normal API keys and the LTI keys used in LTI 1.3 apps.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a developer key record. |  |
|**name** | **Object** | The name of the developer key. |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a &#x60;developer_keys&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;developer_keys&#x60; record was updated. |  |
|**scopes** | **Object** | The list of scopes the developer key&#39;s access tokens may use. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The workflow state of the developer key. |  |
|**accountId** | **Object** | Points to the account associated with the course. Could be Canvas root account or sub-account ID. |  [optional] |
|**redirectUri** | **Object** | (legacy) The valid redirect URI for the developer key. |  [optional] |
|**iconUrl** | **Object** | A URL pointing to the icon of the developer key. |  [optional] |
|**redirectUris** | **Object** | The list of valid redirect URIs for the developer key. |  |
|**notes** | [**DeveloperKeysNotes**](DeveloperKeysNotes.md) |  |  [optional] |
|**accessTokenCount** | **Object** | The number of times the developer key has been used. |  |
|**requireScopes** | **Object** | Whether or not access token for the developer key are required to be scoped. |  |
|**testClusterOnly** | **Object** | If true, the developer key&#39;s access tokens are only valid on Canvas test and beta instances. |  |
|**publicJwk** | [**DeveloperKeysPublicJwk**](DeveloperKeysPublicJwk.md) |  |  [optional] |
|**allowIncludes** | **Object** | If true, requests made with this key&#39;s access token can use \&quot;includes\&quot; parameters to retrieve additional data in each request. |  |
|**isLtiKey** | **Object** | If true, the developer key is intended to be used with LTI 1.3 tools. |  |
|**clientCredentialsAudience** | [**DeveloperKeysClientCredentialsAudience**](DeveloperKeysClientCredentialsAudience.md) |  |  [optional] |
|**email** | **Object** | The email address of the developer key&#39;s owner. |  [optional] |
|**userName** | **Object** | the login ID of the user who originated developer key. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| INACTIVE | &quot;inactive&quot; |



