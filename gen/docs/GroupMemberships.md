

# GroupMemberships


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a group membership record. |  |
|**userId** | **Object** | The ID of the user object to which the membership belongs. |  |
|**createdAt** | **Object** | Timestamp of when a &#x60;group_memberships&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;group_memberships&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The current state of the membership. |  |
|**sisBatchId** | **Object** | The ID of the SIS import if created through SIS. Only included if the user has permission to manage SIS information. |  [optional] |
|**groupId** | **Object** | The ID of the group object to which the membership belongs. |  |
|**moderator** | **Object** | Whether or not the user is a moderator of the group (the must also be an active member of the group to moderate). |  [optional] |
|**uuid** | **Object** | UUID for a membership record. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCEPTED | &quot;accepted&quot; |
| DELETED | &quot;deleted&quot; |
| INVITED | &quot;invited&quot; |
| REJECTED | &quot;rejected&quot; |
| REQUESTED | &quot;requested&quot; |



