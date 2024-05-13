

# Groups

Groups contain two or more students enrolled in a particular course working on an assignment or project together.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the group. |  |
|**name** | **Object** | The display name of the group. |  [optional] |
|**deletedAt** | **Object** | Timestamp when the group was deleted. |  [optional] |
|**storageQuota** | **Object** | The storage quota for the group. |  [optional] |
|**ltiContextId** | **Object** | UUID of the Canvas context in LTI standard. secondary ID for this context, could be used in API to identify resource as well. |  [optional] |
|**createdAt** | **Object** | Timestamp when the group was first saved in the system. |  |
|**updatedAt** | **Object** | Timestamp when the group was last updated in the system. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the group. |  |
|**accountId** | **Object** | Identifies the associated account, groups could be owned by sub-accounts. |  |
|**sisBatchId** | **Object** | The ID of the SIS import if created through SIS. |  [optional] |
|**contextId** | **Object** | The ID of the context (account or course) this group belongs too. See also: context_type. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The course or account that the group belongs to. The pattern here is that whatever the &#x60;context_type&#x60; is, there will be an &#x60;_id&#x60; field named after that type. So if instead &#x60;context_type&#x60; was &#x60;account&#x60;, the &#x60;course_id&#x60; field would be replaced by an &#x60;account_id&#x60; field. |  |
|**migrationId** | **Object** | The unique identifier of the migration that imported this group. |  [optional] |
|**groupCategoryId** | **Object** | The ID of the group&#39;s category. |  [optional] |
|**sisSourceId** | **Object** | The SIS ID of the group. |  [optional] |
|**isPublic** | **Object** | Whether or not the group is public. Currently only community groups can be made public. Also, once a group has been set to public, it cannot be changed back to private. |  [optional] |
|**wikiId** | **Object** | The ID of an associated wiki page. |  [optional] |
|**maxMembership** | **Object** | The maximum number of participating users in the group. |  [optional] |
|**joinLevel** | **Object** | How people are allowed to join the group. For all groups except for community groups, the user must share the group&#39;s parent course or account. For student organized or community groups, where a user can be a member of as many or few as they want, the applicable levels are &#x60;parent_context_auto_join&#x60;, &#x60;parent_context_request&#x60;, and &#x60;invitation_only&#x60;. For class groups, where students are divided up and should only be part of one group of the category, this value will always be &#x60;invitation_only&#x60;, and is not relevant. If &#x60;parent_context_auto_join&#x60;, anyone can join and will be automatically accepted. If &#x60;parent_context_request&#x60;, anyone can request to join, which must be approved by a group moderator. If &#x60;invitation_only&#x60;, only those how have received an invitation my join the group, by accepting that invitation. |  [optional] |
|**avatarAttachmentId** | **Object** | Foreign key to the &#x60;attachments&#x60; table for the avatar of this group. |  [optional] |
|**leaderId** | **Object** | Foreign key to the &#x60;users&#x60; table for the leader of this group. |  [optional] |
|**description** | [**GroupsDescription**](GroupsDescription.md) |  |  [optional] |
|**uuid** | **Object** | The UUID of the group. |  |
|**defaultView** | [**DefaultViewEnum**](#DefaultViewEnum) | Default view for groups is the feed. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| AVAILABLE | &quot;available&quot; |
| DELETED | &quot;deleted&quot; |
| ACTIVE | &quot;active&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |



## Enum: DefaultViewEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| FEED | &quot;feed&quot; |



