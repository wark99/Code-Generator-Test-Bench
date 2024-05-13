

# AssignmentOverrides

There may be many records in this table for each assignment. Use the data in this table to calculate actual due, all day, lock and unlock dates/times.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the &#x60;assignment_override&#x60;. |  |
|**createdAt** | **Object** | Timestamp of when the &#x60;assignment_override&#x60; was created. |  |
|**updatedAt** | **Object** | Timestamp of when the &#x60;assignment_override&#x60; was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Gives the workflow state of this record. |  |
|**dueAt** | **Object** | The new *due at* date-time for this group of users. |  [optional] |
|**unlockAt** | **Object** | The new *unlock at* date-time for this group of users. |  [optional] |
|**lockAt** | **Object** | The new *lock at* date-time for this group of users. |  [optional] |
|**allDay** | **Object** | Indicates if the &#x60;all_day&#x60; field overrides the original &#x60;all_day&#x60; field in the table &#x60;assignment&#x60; for this group of users. |  [optional] |
|**assignmentVersion** | **Object** | The version of the assignment this override is applied to. |  [optional] |
|**setType** | [**SetTypeEnum**](#SetTypeEnum) | Used in conjunction with &#x60;set_id&#x60;, this field tells us what type of foreign relation is used. |  |
|**setId** | **Object** | The primary key for the object type described in &#x60;set_id&#x60;. |  [optional] |
|**dueAtOverridden** | **Object** | Indicates if the &#x60;unlock_at&#x60; field overrides the original. |  |
|**unlockAtOverridden** | **Object** | Indicates if the &#x60;unlock_at&#x60; field overrides the original &#x60;unlock_at&#x60; field in the table &#x60;assignment&#x60; for this group of users. |  |
|**lockAtOverridden** | **Object** | Indicates if the &#x60;lock_at&#x60; field overrides the original &#x60;lock_at&#x60; field in the table &#x60;assignment&#x60; for this group of users. |  |
|**quizId** | **Object** | Identifies the quiz the override is associated with. |  [optional] |
|**quizVersion** | **Object** | The version of the quiz this override is applied to. |  [optional] |
|**assignmentId** | **Object** | Identifies the assignment the override is associated with. |  [optional] |
|**allDayDate** | **Object** | The new date version of the due date if the &#x60;all_day&#x60; flag is true. |  [optional] |
|**title** | **Object** | The title for this &#x60;assignment_override&#x60;. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: SetTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| GROUP | &quot;Group&quot; |
| COURSESECTION | &quot;CourseSection&quot; |
| ADHOC | &quot;ADHOC&quot; |
| NOOP | &quot;Noop&quot; |



