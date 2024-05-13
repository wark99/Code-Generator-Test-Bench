

# Users


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the user. |  |
|**deletedAt** | **Object** | Timestamp that shows when a user was deleted at. |  [optional] |
|**storageQuota** | **Object** | The storage quota for the users. |  [optional] |
|**ltiContextId** | **Object** | UUID of the Canvas context in LTI standard. secondary ID for this context, could be used in API to identify resource as well. |  [optional] |
|**createdAt** | **Object** | Timestamp when the user was created in the Canvas system. |  |
|**updatedAt** | **Object** | Timestamp that shows the last time the record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Workflow status indicating the status of the user. |  |
|**sortableName** | **Object** | The name of the user that is should be used for sorting groups of users, such as in the gradebook. Format: \&quot;lastname, firstname\&quot;. |  [optional] |
|**avatarImageUrl** | **Object** | If avatars are enabled, this field will be included and contain a url to retrieve the user&#39;s avatar. |  [optional] |
|**avatarImageSource** | **Object** | The source of a user avatar image. |  [optional] |
|**avatarImageUpdatedAt** | **Object** | Timestamp that shows the last time the avatar image was updated. |  [optional] |
|**shortName** | **Object** | A short name the user has selected, for use in conversations or other less formal places through the site. |  [optional] |
|**lastLoggedOut** | **Object** | The last time the user explicitly logged out of Canvas. |  [optional] |
|**pronouns** | [**UsersPronouns**](UsersPronouns.md) |  |  [optional] |
|**mergedIntoUserId** | **Object** | If this user was merged into another one, this is the foreign key to that other user. |  [optional] |
|**locale** | **Object** | The user&#39;s locale. This is an optional field and may not be entered by the user. |  [optional] |
|**name** | **Object** | The name of the user (\&quot;firstname lastname\&quot; format). |  [optional] |
|**timeZone** | **Object** | This field is only returned in certain API calls, and will return the IANA time zone name of the user&#39;s preferred timezone. |  [optional] |
|**uuid** | **Object** | UUID of the user. |  [optional] |
|**schoolName** | **Object** | Used in Trial Versions of Canvas, the school the user is associated with. |  [optional] |
|**schoolPosition** | **Object** | Used in Trial Versions of Canvas, the position the user has at the school. E.g. Admin |  [optional] |
|**_public** | **Object** | Used in Trial Versions of Canvas, the type of school the user is associated with. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| CREATION_PENDING | &quot;creation_pending&quot; |
| DELETED | &quot;deleted&quot; |
| PENDING_APPROVAL | &quot;pending_approval&quot; |
| PRE_REGISTERED | &quot;pre_registered&quot; |
| REGISTERED | &quot;registered&quot; |



