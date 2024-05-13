

# DeveloperKeyAccountBindings

Describes if the associated developer key is \"on\" or \"off\" for the associated account.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a developer key and account association record. |  |
|**accountId** | **Object** | Points to the account associated with the course. Could be Canvas root account or sub-account ID. |  |
|**createdAt** | **Object** | Timestamp of when a developer_key_account_bindings record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a developer_key_account_bindings record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The workflow state of the binding. |  |
|**developerKeyId** | **Object** | The ID of the associated developer key. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ON | &quot;on&quot; |
| ALLOW | &quot;allow&quot; |
| OFF | &quot;off&quot; |



