

# ContentMigrations


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a content migration record. |  |
|**attachmentId** | **Object** | The unique ID of the package being imported. |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when a &#x60;content_migrations&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;content_migrations&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current state of the content migration. |  |
|**contextId** | **Object** | The unique identifier of a &#x60;content_migrations&#x60; context. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;. |  |
|**overviewAttachmentId** | **Object** | The unique ID of the packages overview.json file. |  [optional] |
|**exportedAttachmentId** | **Object** | The unique ID of the resulting exported package. |  [optional] |
|**sourceCourseId** | **Object** | The course to copy from for a course copy migration (required if doing course copy). |  [optional] |
|**migrationType** | **Object** | The type of the migration. Use the Migrator endpoint to see all available migrators. Examples include: &#x60;academic_benchmark_importer&#x60;, &#x60;angel_exporter&#x60;, &#x60;blackboard_exporter&#x60;, &#x60;canvas_cartridge_importer&#x60;, &#x60;common_cartridge_importer&#x60;, &#x60;course_copy_importer&#x60;, &#x60;d2l_exporter&#x60;, &#x60;master_course_import&#x60;, &#x60;moodle_converter&#x60;, &#x60;qti_converter&#x60;, &#x60;webct_scraper&#x60;, &#x60;zip_file_importer&#x60;, &#x60;context_external_tool_1234&#x60;. |  [optional] |
|**childSubscriptionId** | **Object** | The unique ID of the &#x60;master_courses_child_subscription&#x60; record indicating a blueprint association. |  [optional] |
|**migrationSettings** | **Object** | Ruby hash of settings that determine what data will get imported for this migration. |  [optional] |
|**startedAt** | **Object** | Timestamp showing when a content migration started. |  [optional] |
|**finishedAt** | **Object** | Timestamp showing when a content migration finished. |  [optional] |
|**progress** | **Object** | Current migration progress. 100 indicates done at 100%. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| CREATED | &quot;created&quot; |
| EXPORTED | &quot;exported&quot; |
| EXPORTING | &quot;exporting&quot; |
| FAILED | &quot;failed&quot; |
| IMPORTED | &quot;imported&quot; |
| IMPORTING | &quot;importing&quot; |
| PRE_PROCESS_ERROR | &quot;pre_process_error&quot; |
| PRE_PROCESSED | &quot;pre_processed&quot; |
| PRE_PROCESSING | &quot;pre_processing&quot; |
| QUEUED | &quot;queued&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |
| ACCOUNT | &quot;Account&quot; |
| GROUP | &quot;Group&quot; |
| USER | &quot;User&quot; |



