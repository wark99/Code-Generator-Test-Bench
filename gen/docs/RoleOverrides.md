

# RoleOverrides


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | unique identifier of a role permission. |  |
|**permission** | **Object** | Permission assigned to a role, see the dictionary of permissions keyed by name in Canvas Roles API documentation. |  [optional] |
|**createdAt** | **Object** | Timestamp of when this record was created. |  [optional] |
|**updatedAt** | **Object** | Timestamp of last update to this record. |  [optional] |
|**roleId** | **Object** | Unique ID of a role. |  |
|**contextId** | **Object** | The unique identifier for the folders&#39;s context (account, course, user). |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |
|**locked** | **Object** | Whether the permission is locked by this role. |  |
|**enabled** | **Object** | Whether the role has the permission. |  |
|**appliesToSelf** | **Object** | Whether the permission applies to the account this role is in. Only present if enabled is true. |  |
|**appliesToDescendants** | **Object** | Whether the permission cascades down to sub accounts of the account this role is in. Only present if enabled is true. |  |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |



