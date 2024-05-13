

# LearningOutcomeGroups

This table contains dimensions for learning outcome groups.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a learning outcome group record. |  |
|**createdAt** | **Object** | Timestamp of when a learning_outcome_groups record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a learning_outcome_groups record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Workflow status of the learning outcome. |  |
|**contextId** | **Object** | The unique identifier for the learning_outcome_groups&#39;s context (account, course). |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  [optional] |
|**migrationId** | **Object** | A GUID used to resolve outcomes during import and migration. |  [optional] |
|**learningOutcomeGroupId** | **Object** | ID associated with the parent of this group (NULL if it does not have parent). Refers to a learning_outcome_group record. |  [optional] |
|**rootLearningOutcomeGroupId** | **Object** | ID associated with the root group in the group hierarchy (NULL if it is the root). Refers to a learning_outcome_group record. |  [optional] |
|**vendorGuid** | **Object** | A custom GUID for the learning standard. |  [optional] |
|**outcomeImportId** | **Object** | Foreign key to the outcome import associated with this outcome group, if this group was imported. |  [optional] |
|**sourceOutcomeGroupId** | **Object** | Foreign key to the learning outcome group that the group was copied from. |  [optional] |
|**description** | [**LearningOutcomeGroupsDescription**](LearningOutcomeGroupsDescription.md) |  |  [optional] |
|**title** | **Object** | Title of the learning outcome group. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |
| COLLEGE | &quot;College&quot; |
| DEPARTMENT | &quot;Department&quot; |



