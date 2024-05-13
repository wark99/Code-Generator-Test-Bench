

# LtiResults

See [IMS Global](https://www.imsglobal.org/spec/lti-ags/v2p0#result-service). LTI 1.3 tools that have been authorized by an admin may read records from this table via API.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for an lti result record. |  |
|**extensions** | [**LtiResultsExtensions**](LtiResultsExtensions.md) |  |  |
|**comment** | [**LtiResultsComment**](LtiResultsComment.md) |  |  [optional] |
|**submissionId** | **Object** | the ID of the associated submission. |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  |
|**createdAt** | **Object** | Timestamp of when a &#x60;lti_results&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a &#x60;lti_results&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The workflow state of the result. |  |
|**resultScore** | **Object** | The score given for the the student (LTI AGS). |  [optional] |
|**resultMaximum** | **Object** | The maximum score for the student (LTI AGS). |  [optional] |
|**activityProgress** | [**LtiResultsActivityProgress**](LtiResultsActivityProgress.md) |  |  [optional] |
|**gradingProgress** | [**LtiResultsGradingProgress**](LtiResultsGradingProgress.md) |  |  [optional] |
|**ltiLineItemId** | **Object** | The ID of the associated line item. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



