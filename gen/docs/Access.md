

# Access

The invitation send, null if access was not found

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | User file access Identifier, can be team identifier, user identifier, invitation identifier |  |
|**access** | [**AccessEnum**](#AccessEnum) | Access type |  |
|**name** | **Object** | User file access name |  |
|**right** | **Object** | Access right |  |
|**color** | **Object** | Access color |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of access |  |
|**email** | **Object** | Email if available |  |
|**user** | [**User**](User.md) |  |  [optional] |
|**invitationDriveId** | **Object** | Access was given with the access to the drive id |  |



## Enum: AccessEnum

| Name | Value |
|---- | -----|
| INVITATION | &quot;invitation&quot; |
| TEAM | &quot;team&quot; |
| USER | &quot;user&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| CANCELLED | &quot;cancelled&quot; |
| EXPIRED | &quot;expired&quot; |
| PENDING | &quot;pending&quot; |
| REJECTED | &quot;rejected&quot; |



