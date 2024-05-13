

# DriveUser


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Drive User&#x60; |  |
|**displayName** | **String** | Display name |  |
|**firstName** | **String** | First name |  |
|**lastName** | **String** | Last name |  |
|**email** | **String** | Email |  |
|**avatar** | **String** | Avatar |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the access; this field is no longer used and has been replaced by an additional role property &#x60;external&#x60;.&lt;note&gt;&lt;strong&gt;main&lt;/strong&gt;: User has access to the drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;shared&lt;/strong&gt;: User has access to a shared file / directory only.&lt;/note&gt; |  |
|**deletedAt** | **Integer** | Timestamp &#x60;Drive User&#x60; was deleted at |  |
|**teams** | **List&lt;Integer&gt;** | List of Team identifiers |  [optional] |
|**security** | [**Security2**](Security2.md) |  |  [optional] |
|**driveId** | **Integer** | Drive identifier |  |
|**drive** | [**Drive**](Drive.md) |  |  [optional] |
|**driveName** | **String** |  |  |
|**accountId** | **Integer** | Account identifier of resource &#x60;Drive User&#x60; |  |
|**createdAt** | **Integer** | Timestamp &#x60;Drive User&#x60; was created at |  |
|**updatedAt** | **Integer** | Timestamp &#x60;Drive User&#x60; was updated at |  |
|**lastConnectionAt** | **Integer** | Timestamp &#x60;User&#x60; was last connected at |  |
|**productId** | **Integer** | Unique identifier of the &#x60;product&#x60; that is related to the resource &#x60;Drive User&#x60; |  |
|**status** | [**StatusEnum**](#StatusEnum) | Current access status of the user in the drive.&lt;note&gt;&lt;strong&gt;active&lt;/strong&gt;: User has access to the Drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;deleted_kept&lt;/strong&gt;: User has been removed but his data remain in the drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;deleted_removed&lt;/strong&gt;: User has been removed.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;deleted_transferred&lt;/strong&gt;: User has been removed and his data has been transferred to another user.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;deleted_transferring&lt;/strong&gt;: User has been removed and is being transferred to another user.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;locked&lt;/strong&gt;: User has been locked, user can no longer access to the drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;pending&lt;/strong&gt;: User has not accepted the invitation request.&lt;/note&gt; |  |
|**role** | [**RoleEnum**](#RoleEnum) | Administration level of the user.&lt;note&gt;&lt;strong&gt;admin&lt;/strong&gt;: Administrator of the drive, can manage the drive (settings, invitations and users) and the files.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;external&lt;/strong&gt;: External user can only access the files given by the others roles.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;user&lt;/strong&gt;: Internal user can invite user and manage the files of his private directory and other directories with manage file access.&lt;/note&gt; |  |
|**preference** | [**Preference**](Preference.md) |  |  |
|**categoriesPermissions** | **String** | Get user permissions on categories |  [optional] |
|**capabilities** | [**Capabilities5**](Capabilities5.md) |  |  [optional] |
|**privateStorage** | **Integer** | Storage size of private files (bytes) |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| MAIN | &quot;main&quot; |
| SHARED | &quot;shared&quot; |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ACTIVE | &quot;active&quot; |
| DELETED_KEPT | &quot;deleted_kept&quot; |
| DELETED_REMOVED | &quot;deleted_removed&quot; |
| DELETED_TRANSFERRED | &quot;deleted_transferred&quot; |
| DELETED_TRANSFERRING | &quot;deleted_transferring&quot; |
| LOCKED | &quot;locked&quot; |
| PENDING | &quot;pending&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| EXTERNAL | &quot;external&quot; |
| USER | &quot;user&quot; |



