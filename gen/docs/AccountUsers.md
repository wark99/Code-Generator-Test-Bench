

# AccountUsers

Contains users' roles within an account (this table includes the account admins).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for the users account association record. |  |
|**userId** | **Object** | The unique ID of a user. |  |
|**createdAt** | **Object** | Timestamp of when an &#x60;account_users&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when an &#x60;account_users&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The current state of the account user record. |  |
|**accountId** | **Object** | The unique ID of an account. |  |
|**roleId** | **Object** | The unique ID of a role. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



