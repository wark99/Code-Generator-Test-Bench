

# GroupCategories


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a group category record. |  |
|**name** | **Object** | The display name of the group category. |  [optional] |
|**deletedAt** | **Object** | Timestamp when this record was deleted. If the record has not been deleted the value will be NULL. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a &#x60;group_categories&#x60; record was created. |  [optional] |
|**updatedAt** | **Object** | Timestamp of when a &#x60;group_categories&#x60; record was updated. |  [optional] |
|**sisBatchId** | **Object** | The unique identifier for the SIS import. This field is only included if the user has permission to manage SIS information. |  [optional] |
|**contextId** | **Object** | The unique identifier for the context of &#x60;group_categories&#x60; (account, course, user). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |
|**sisSourceId** | [**GroupCategoriesSisSourceId**](GroupCategoriesSisSourceId.md) |  |  [optional] |
|**role** | [**RoleEnum**](#RoleEnum) | Certain types of group categories have special role designations. Currently, these include: &#x60;communities&#x60;, &#x60;student_organized&#x60;, and &#x60;imported&#x60;. Regular course/account group categories have a role of NULL. |  [optional] |
|**selfSignup** | **Object** | If the group category allows users to join a group themselves, thought they may only be a member of one group per group category at a time. Values include &#x60;restricted&#x60;, &#x60;enabled&#x60;, and NULL. &#x60;enabled&#x60; allows students to assign themselves to a group, &#x60;restricted&#x60; restricts them to only joining a group in their section, NULL disallows students from joining groups. |  [optional] |
|**groupLimit** | **Object** | If self-signup is enabled, this field can be set to cap the number of users in each group. If NULL, there is no limit. |  [optional] |
|**autoLeader** | **Object** | Gives instructors the ability to automatically have group leaders assigned. Values include &#x60;random&#x60;, &#x60;first&#x60;, and NULL; &#x60;random&#x60; picks a student from the group at random as the leader, &#x60;first&#x60; sets the first student to be assigned to the group as the leader. |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COMMUNITIES | &quot;communities&quot; |
| STUDENT_ORGANIZED | &quot;student_organized&quot; |
| IMPORTED | &quot;imported&quot; |



