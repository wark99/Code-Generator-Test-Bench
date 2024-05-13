

# OriginalityReports

Rows in this table are managed solely by LTI 2 tool providers that leverage the Canvas plagiarism detection platform.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for an originality report record. |  |
|**errorMessage** | [**OriginalityReportsErrorMessage**](OriginalityReportsErrorMessage.md) |  |  [optional] |
|**attachmentId** | **Object** | The is of the attachment associated with the originality report. |  [optional] |
|**submissionId** | **Object** | ID of the submission associated with the originality report. |  |
|**createdAt** | **Object** | Timestamp of when an &#x60;originality_reports&#x60; record was created. |  |
|**updatedAt** | **Object** | Timestamp of when an &#x60;originality_reports&#x60; record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Workflow state of the originality report. |  |
|**originalityScore** | **Object** | A number ranging from 0-100 indicating the level of potential plagiarism. |  [optional] |
|**originalityReportUrl** | [**OriginalityReportsOriginalityReportUrl**](OriginalityReportsOriginalityReportUrl.md) |  |  [optional] |
|**originalityReportLtiUrl** | [**OriginalityReportsOriginalityReportLtiUrl**](OriginalityReportsOriginalityReportLtiUrl.md) |  |  [optional] |
|**linkId** | [**OriginalityReportsLinkId**](OriginalityReportsLinkId.md) |  |  [optional] |
|**submissionTime** | **Object** | Time the submission was submitted. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ERROR | &quot;error&quot; |
| PENDING | &quot;pending&quot; |
| SCORED | &quot;scored&quot; |



