

# MasterCoursesMasterTemplates


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a master courses template record. |  |
|**courseId** | **Object** | The ID of a blueprint course record. |  |
|**createdAt** | **Object** | Timestamp showing when a master_courses_templates record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a master_courses_templates record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Whether the template is active or if it has been deleted (i.e. the course has been unset as a blueprint). |  [optional] |
|**fullCourse** | **Object** | Whether all blueprint content in the course should be synced (always true for the time being). |  |
|**activeMigrationId** | **Object** | The ID of a last migration to be run (used to ensure only one is running at a time). |  [optional] |
|**defaultRestrictions** | **Object** | The default locked status for all blueprint course content (unless using restrictions by type). |  [optional] |
|**useDefaultRestrictionsByType** | **Object** | Whether to use default_restrictions_by_type to determine content locked status. |  |
|**defaultRestrictionsByType** | **Object** | The default locked status for all blueprint course content depending on the type of content (unless not using restrictions by type). |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



