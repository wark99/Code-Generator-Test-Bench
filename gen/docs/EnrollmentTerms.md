

# EnrollmentTerms

Use the dates in this table as a proxy for the course start/end dates if the `start_at` and `end_at` fields in the courses table are NULL.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for the enrollment term. |  |
|**name** | **Object** | The name of the term. |  [optional] |
|**integrationId** | **Object** | The ID of the enrollment term in the external tools or SIS, this ID usually gets populated via API or SIS import. |  [optional] |
|**createdAt** | **Object** | Timestamp of when the enrollment term was created. |  |
|**updatedAt** | **Object** | Timestamp of when the enrollment term was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the term. |  |
|**sisBatchId** | **Object** | The unique identifier for the SIS import. This field is only included if the user has permission to manage SIS information. |  [optional] |
|**startAt** | **Object** | The datetime of the start of the term. Set up by the administrator. Enrollment term dates, course dates, and course section dates flow together in all aspects of Canvas; various dates allow different users to participate in the course. The hierarchy of dates are: course section dates override course dates, course dates override term dates. |  [optional] |
|**endAt** | **Object** | The datetime of the end of the term. Set up by the administrator. |  [optional] |
|**sisSourceId** | **Object** | The SIS ID of the term. Only included if the user has permission to view SIS information. |  [optional] |
|**termCode** | **Object** | Enrollment term code as viewed in the UI. |  [optional] |
|**gradingPeriodGroupId** | **Object** | Identifies the grading period group. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



