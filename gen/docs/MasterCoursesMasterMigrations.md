

# MasterCoursesMasterMigrations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a master courses master migrations record. |  |
|**comment** | [**MasterCoursesMasterMigrationsComment**](MasterCoursesMasterMigrationsComment.md) |  |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when a master_courses_master_migrations record was created. |  |
|**updatedAt** | **Object** | Timestamp showing when a master_courses_master_migrations record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current state of the sync event. |  |
|**migrationSettings** | **Object** | Optional settings for the sync event (such as whether to include course settings). |  [optional] |
|**exportResults** | **Object** | Record of which associated courses received full exports and which ones received partial (selective) ones. |  [optional] |
|**exportsStartedAt** | **Object** | Timestamp showing when exports started being generated from the blueprint course. |  [optional] |
|**importsQueuedAt** | **Object** | Timestamp showing when imports started being queued into the associated courses. |  [optional] |
|**importsCompletedAt** | **Object** | Timestamp showing when all imports into associated courses completed. |  [optional] |
|**sendNotification** | **Object** | Whether to generate notifications around the sync event. |  |
|**masterTemplateId** | **Object** | The ID of a template that belongs to the blueprint course. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COMPLETED | &quot;completed&quot; |
| CREATED | &quot;created&quot; |
| EXPORTING | &quot;exporting&quot; |
| EXPORTS_FAILED | &quot;exports_failed&quot; |
| IMPORTS_FAILED | &quot;imports_failed&quot; |
| IMPORTS_QUEUED | &quot;imports_queued&quot; |
| QUEUED | &quot;queued&quot; |



