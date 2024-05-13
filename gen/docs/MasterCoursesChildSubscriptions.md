

# MasterCoursesChildSubscriptions


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a master courses child subscription record. |  |
|**createdAt** | **Object** | Timestamp showing when a master_courses_child_subscriptions record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a master_courses_child_subscriptions record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Whether the subscription is active or has been deleted. |  |
|**useSelectiveCopy** | **Object** | Whether the associated course can receive partial exports from the blueprint course for subsequent sync events. |  |
|**masterTemplateId** | **Object** | The ID of a template that belongs to the blueprint course. |  |
|**childCourseId** | **Object** | The ID of an associated course. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



