

# CourseSections

Sections are a group of students that have been organized for administrative purposes.  When users are enrolled in a course, they are actually enrolled in one of the sections of that course. It is possible to place more than one section in course, but it is not possible to put sections within sections. All sections of a course share the same content. If a course is taught by one instructor, sections can remain under one course. However, if each section is taught by a different instructor, those sections will need to be housed under separate courses. Each section can have its own varied due dates for assignments, quizzes, and discussions. For example, a course may have sections that meet on different days of the week or in different formats (online vs. face-to-face). Sections are also beneficial when Teacher Assistants are assigned to help manage courses and oversee grading for a portion of a course enrollment. As part of SIS or manual enrollments, you can limit students to only see students in their section. Instructors can also limit students if you allow them to manually enroll users in their own courses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for the section. |  |
|**name** | **Object** | The name of the section. |  |
|**courseId** | **Object** | The unique Canvas identifier for the course in which the section belongs. |  |
|**integrationId** | **Object** | The integration ID of the section. This field is only included if there is an integration set up between Canvas and SIS. |  [optional] |
|**createdAt** | **Object** | Timestamp for when this section was entered into the system. |  |
|**updatedAt** | **Object** | Timestamp for when the last time the section was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the section. |  |
|**sisBatchId** | **Object** | The unique identifier for the SIS import if created through SIS. |  [optional] |
|**startAt** | **Object** | The start date for the section, if applicable. When a user is allowed to participate in a course. enrollment term dates, course dates, and course section dates flow together in all aspects of Canvas. Various dates allow different users to participate in the course. The hierarchy of dates are: course section dates override course dates, course dates override term dates. |  [optional] |
|**endAt** | **Object** | The end date for the section, if applicable. When a user is allowed to participate in a course. |  [optional] |
|**sisSourceId** | **Object** | Id for the correlated record for the section in the SIS (assuming SIS integration has been properly configured). |  [optional] |
|**defaultSection** | **Object** | True if this is the default section. |  [optional] |
|**acceptingEnrollments** | **Object** | True if this section is open for enrollment. |  [optional] |
|**restrictEnrollmentsToSectionDates** | **Object** | Restrict user enrollments to the start and end dates of the section. True when \&quot;Users can only participate in the course between these dates\&quot; is checked. |  [optional] |
|**nonxlistCourseId** | **Object** | The unique identifier of the original course of a cross-listed section. |  [optional] |
|**enrollmentTermId** | **Object** | Identifies the associated enrollment term. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |



