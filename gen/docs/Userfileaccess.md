

# Userfileaccess


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | User file access Identifier, can be team identifier, user identifier, invitation identifier |  |
|**access** | [**AccessEnum**](#AccessEnum) | Access type |  |
|**name** | **String** | User file access name |  |
|**right** | **String** | Access right |  |
|**color** | **Integer** | Access color |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of access |  |



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



