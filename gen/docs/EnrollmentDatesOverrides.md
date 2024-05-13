

# EnrollmentDatesOverrides


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for an enrollment date override record. |  |
|**createdAt** | **Object** | Timestamp of when a enrollment_dates_overrides record was created. |  |
|**updatedAt** | **Object** | Timestamp of when an enrollment_dates_overrides record was updated. |  |
|**contextId** | **Object** | The unique ID of main Canvas account, always a root account ID in this table. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  |
|**startAt** | **Object** | The start time of the enrollment. |  [optional] |
|**endAt** | **Object** | The end datetime for the enrollment date override, if applicable. |  [optional] |
|**enrollmentTermId** | **Object** | The unique identifier for the enrollment term. |  [optional] |
|**enrollmentType** | [**EnrollmentTypeEnum**](#EnrollmentTypeEnum) | The enrollment type. One of StudentEnrollment, TeacherEnrollment, TaEnrollment, DesignerEnrollment, ObserverEnrollment. |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |



## Enum: EnrollmentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| DESIGNERENROLLMENT | &quot;DesignerEnrollment&quot; |
| STUDENTENROLLMENT | &quot;StudentEnrollment&quot; |
| TAENROLLMENT | &quot;TaEnrollment&quot; |
| TEACHERENROLLMENT | &quot;TeacherEnrollment&quot; |



