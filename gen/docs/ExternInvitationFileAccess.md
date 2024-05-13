

# ExternInvitationFileAccess


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Extern Invitation File Access Identifier, can be team identifier, user identifier, invitation identifier |  |
|**access** | **String** | Access type |  |
|**name** | **String** | Extern Invitation File Access name |  |
|**right** | **String** | Access right |  |
|**color** | **Integer** | Access color |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of access |  |
|**email** | **String** | Email if available |  |
|**user** | [**User**](User.md) |  |  [optional] |
|**invitationDriveId** | **Integer** | Access was given with the access to the drive id |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| CANCELLED | &quot;cancelled&quot; |
| EXPIRED | &quot;expired&quot; |
| PENDING | &quot;pending&quot; |
| REJECTED | &quot;rejected&quot; |



