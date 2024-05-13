

# LearningOutcomes

This table contains dimensions for learning outcomes.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a learning outcome record. |  |
|**displayName** | **Object** | Optional friendly name for reporting. |  [optional] |
|**contextCode** | **Object** | Alternate specification of learning outcome context as single string. Combination of &#x60;context_type&#x60; and &#x60;context_id&#x60; (ex: &#x60;course_34416&#x60;). |  [optional] |
|**createdAt** | **Object** | Timestamp of when a &#x60;learning_outcomes&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;learning_outcomes&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Workflow status of the learning outcome. |  |
|**contextId** | **Object** | The unique identifier for the context of &#x60;learning_outcomes&#x60; (account, course, user), may be NULL for global outcomes. |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;. |  [optional] |
|**migrationId** | **Object** | A GUID used to resolve outcomes during import and migration. |  [optional] |
|**vendorGuid** | **Object** | A custom GUID for the learning standard. |  [optional] |
|**outcomeImportId** | **Object** | Foreign key to the outcome import associated with this outcome, if this outcome was imported. |  [optional] |
|**calculationMethod** | [**CalculationMethodEnum**](#CalculationMethodEnum) | The method used to calculate student score. |  [optional] |
|**calculationInt** | **Object** | Defines the variable value used by the calculation_method. included only if &#x60;calculation_method&#x60; uses it. |  [optional] |
|**shortDescription** | **Object** | Title of the outcome. |  |
|**description** | [**LearningOutcomesDescription**](LearningOutcomesDescription.md) |  |  [optional] |
|**data** | **Object** | YAML data specifying the scoring method and rubric criteria for this outcome. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| RETIRED | &quot;retired&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| COURSE | &quot;Course&quot; |



## Enum: CalculationMethodEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| DECAYING_AVERAGE | &quot;decaying_average&quot; |
| AVERAGE | &quot;average&quot; |
| HIGHEST | &quot;highest&quot; |
| LATEST | &quot;latest&quot; |
| N_MASTERY | &quot;n_mastery&quot; |



