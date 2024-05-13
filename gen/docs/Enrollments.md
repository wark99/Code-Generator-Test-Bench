

# Enrollments

An enrollment represents a user's association with a specific course and section. There may be multiple records associated with a `course_id` and `user_id` combination (records are unique on: `course_id`, `user_id`, `course_section_id`, `role_id`, `workflow_state`, `associated_user_id`).

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the enrollment. |  |
|**sisBatchId** | **Object** | The unique identifier for the SIS import. This field is only included if the user has permission to manage SIS information. |  [optional] |
|**userId** | **Object** | The unique ID of the user. |  |
|**createdAt** | **Object** | The created time of the enrollment. |  |
|**updatedAt** | **Object** | The updated time of the enrollment. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the user&#39;s enrollment in the course. |  |
|**roleId** | **Object** | The ID of the enrollment role. |  |
|**startAt** | **Object** | The start time of the enrollment, in ISO8601 format. |  [optional] |
|**endAt** | **Object** | The end time of the enrollment, in ISO8601 format. |  [optional] |
|**courseId** | **Object** | The unique ID of the course. |  |
|**completedAt** | **Object** | Enrollment completed date. |  [optional] |
|**courseSectionId** | **Object** | The Section Integration ID in which the enrollment is associated. This field is only included if the user has permission to view SIS information. |  |
|**gradePublishingStatus** | **Object** | Used internally with grade passback functionality. |  |
|**associatedUserId** | **Object** | The unique ID of the associated user. Will be NULL unless type is ObserverEnrollment. |  [optional] |
|**selfEnrolled** | **Object** | Enrollment was created via self-enrollment. |  [optional] |
|**limitPrivilegesToCourseSection** | **Object** | User can only access his or her own course section. |  |
|**lastActivityAt** | **Object** | The last activity time of the user for the enrollment. This time stamp updates when a user navigates through the course using the Course Navigation menu, replies to a discussion or submits an assignment or quiz, and when they access course files and pages (does not include mobile interactions or group participation). |  [optional] |
|**totalActivityTime** | **Object** | The total activity time of the user for the enrollment, in seconds. If user is viewing a page and is enrolled in that particular course, then the time is incremented. Requires at least 2 minutes, but not more than 10 (for ex: if a student just checks their grade or due date and was on the page for less than 2 min, it doesn&#39;t get counted). May not be incremented for page views through mobile app (will get incremented for page views through mobile browser); does not include group activity or page views for videos that do not include intermediate page requests, such as a half-hour recorded lecture. |  [optional] |
|**sisPseudonymId** | **Object** | If enrolled via SIS import, which pseudonym was referenced to create this enrollment. It&#39;s the user ID that was referenced when an enrollment was created via SIS. it&#39;s used for some LTI calls to try and send consistent IDs. also used for splitting accidentally-merged-users to decide which way the enrollments should go. |  [optional] |
|**lastAttendedAt** | **Object** | The last attended date of the user for the enrollment in a course. The UI facing field that could be set by an end user or API call. |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | The base enrollment type. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| CREATION_PENDING | &quot;creation_pending&quot; |
| INVITED | &quot;invited&quot; |
| REJECTED | &quot;rejected&quot; |
| ACTIVE | &quot;active&quot; |
| INACTIVE | &quot;inactive&quot; |
| COMPLETED | &quot;completed&quot; |
| DELETED | &quot;deleted&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| STUDENTENROLLMENT | &quot;StudentEnrollment&quot; |
| TEACHERENROLLMENT | &quot;TeacherEnrollment&quot; |
| TAENROLLMENT | &quot;TaEnrollment&quot; |
| DESIGNERENROLLMENT | &quot;DesignerEnrollment&quot; |
| OBSERVERENROLLMENT | &quot;ObserverEnrollment&quot; |
| STUDENTVIEWENROLLMENT | &quot;StudentViewEnrollment&quot; |



