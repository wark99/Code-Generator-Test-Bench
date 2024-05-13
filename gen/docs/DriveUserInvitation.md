

# DriveUserInvitation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Drive User Invitation&#x60; |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of &#x60;Invitation&#x60; |  |
|**isPrivate** | **Boolean** |  |  |
|**userExist** | **Boolean** |  |  [optional] |
|**key** | **String** | Random key used to uniquely identify the &#x60;Invitation&#x60; |  |
|**fileId** | **Integer** |  |  |
|**lang** | **String** | Language to invite the &#x60;User&#x60; in |  |
|**userId** | **Integer** | User identifier |  |
|**user** | [**User**](User.md) |  |  [optional] |
|**invitedBy** | **Integer** | Identifier of &#x60;User&#x60; that sent the invitation |  |
|**invited** | [**User**](User.md) |  |  [optional] |
|**url** | **String** | &#x60;Invitation&#x60; url |  |
|**isValid** | **Boolean** | Whether the &#x60;Invitation&#x60; is still valid or not |  |
|**status** | [**StatusEnum**](#StatusEnum) | Status of the &#x60;Invitation&#x60; |  |
|**email** | **String** | Email |  |
|**message** | **String** | &#x60;Invitation&#x60; message |  |
|**expiredAt** | **Integer** | When the invitation expire |  |
|**createdAt** | **Integer** | When the invitation was created |  |
|**accessName** | **String** | &#x60;Drive&#x60; name displayed for user |  |
|**role** | **String** | Role that will be assigned to invited &#x60;User&#x60; |  |
|**drive** | [**Drive**](Drive.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| FILE | &quot;file&quot; |
| USER | &quot;user&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACCEPTED | &quot;accepted&quot; |
| CANCELLED | &quot;cancelled&quot; |
| PENDING | &quot;pending&quot; |
| REJECTED | &quot;rejected&quot; |



