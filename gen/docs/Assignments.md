

# Assignments

There is one record in this table for each assignment.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | Primary key for this record in the Canvas assignments table. |  |
|**integrationId** | **Object** | Third Party unique identifier for Assignments. |  [optional] |
|**ltiContextId** | [**AssignmentsLtiContextId**](AssignmentsLtiContextId.md) |  |  [optional] |
|**createdAt** | **Object** | The time at which this assignment was originally created. |  [optional] |
|**updatedAt** | **Object** | The time at which this assignment was last modified. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current workflow state of the assignment. |  |
|**dueAt** | **Object** | The due date for the assignment. Returns NULL if not present. |  [optional] |
|**unlockAt** | **Object** | The unlock date, meaning that the assignment is unlocked after this date. Returns NULL if not present. |  [optional] |
|**lockAt** | **Object** | The lock date, meaning that the assignment is locked after this date. Returns NULL if not present. |  [optional] |
|**pointsPossible** | **Object** | The maximum points possible for the assignment. |  [optional] |
|**gradingType** | [**GradingTypeEnum**](#GradingTypeEnum) | The type of grading the assignment receives. |  [optional] |
|**submissionTypes** | **Object** | The types of submissions allowed for this assignment. |  |
|**assignmentGroupId** | **Object** | Identifies which assignment grouping the particular assignment is part of (assignment groups may have a scoring weight to determine how much of the assignment group contributes to the total grade). |  [optional] |
|**gradingStandardId** | **Object** | The ID of the grading standard being applied to this assignment. Valid if &#x60;grading_type&#x60; is &#x60;letter_grade&#x60; or &#x60;gpa_scale&#x60;. |  [optional] |
|**submissionsDownloads** | **Object** | Number of times submissions have been downloaded in a zip bundle. |  |
|**peerReviewCount** | **Object** | Represents the amount of reviews each user is assigned. NOTE: This key is NOT present unless you have automatic_peer_reviews set to true. |  |
|**peerReviewsDueAt** | **Object** | Timestamp for when peer reviews should be completed. |  [optional] |
|**peerReviewsAssigned** | **Object** | True if all peer reviews have been assigned. |  |
|**peerReviews** | **Object** | Indicates if peer reviews are required for this assignment. |  |
|**contextId** | **Object** | The ID of the object this assignment belongs to. Typically course. |  |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of object this assignment belongs to. |  |
|**automaticPeerReviews** | **Object** | Indicates if peer reviews are assigned automatically. If false, the teacher is expected to manually assign peer reviews. |  |
|**allDay** | **Object** | True if a specific time for when the assignment is due was not given. The effective due time will be 11:59pm. |  |
|**allDayDate** | **Object** | The date version of the due date if the &#x60;all_day&#x60; flag is true. |  [optional] |
|**couldBeLocked** | **Object** | True if the assignment is under a module that can be locked. |  |
|**migrationId** | **Object** | The unique identifier of the migration that imported this assignment. For assignments which have been imported via a content migration, an opaque identifier for the assignment in its source. This field is used by Canvas to identify when an assignment is being re-imported, and can also be used to identify multiple assignments that have been copied from the same source. |  [optional] |
|**gradeGroupStudentsIndividually** | **Object** | If this is a group assignment, boolean flag indicating whether or not students will be graded individually. |  |
|**anonymousPeerReviews** | **Object** | If true, hide the identities of peer-reviewing and peer-reviewed students. Only relevant if &#x60;peer_reviews&#x60; is true. |  |
|**turnitinEnabled** | **Object** | Flag indicating whether or not Turnitin has been enabled for the assignment. NOTE: This flag will not appear unless your account has the Turnitin plugin available. |  |
|**allowedExtensions** | **Object** | Allowed file extensions, which take effect if &#x60;submission_types&#x60; includes &#x60;online_upload&#x60;. |  [optional] |
|**groupCategoryId** | **Object** | The ID of the assignment’s group set, if this is a group assignment. For group discussions, set &#x60;group_category_id&#x60; on the discussion topic, not the linked assignment. |  [optional] |
|**freezeOnCopy** | **Object** | Indicates if assignment will be frozen when it is copied. NOTE: This field will only be present if the AssignmentFreezer plugin is available for your account. |  |
|**onlyVisibleToOverrides** | **Object** | Indicates whether the assignment is only visible to overrides. |  |
|**postToSis** | **Object** | Present if Sync Grades to Student Information System feature is enabled. |  |
|**moderatedGrading** | **Object** | Indicates if the assignment is moderated. |  |
|**gradesPublishedAt** | **Object** | For assignments with moderated grading, a timestamp identifying when provisional grades were published. |  [optional] |
|**omitFromFinalGrade** | **Object** | If true, the assignment will be omitted from the student&#39;s final grade. |  |
|**intraGroupPeerReviews** | **Object** | Indicates whether or not members from within the same group on a group assignment can be assigned to peer review their own group&#39;s work. |  |
|**vericiteEnabled** | **Object** | Flag indicating whether or not VeriCite has been enabled for the assignment. NOTE: This flag will not appear unless your account has the VeriCite plugin available. |  |
|**anonymousInstructorAnnotations** | **Object** | Flag indicating whether instructor annotations in document submissions for this assignment should be anonymous. |  |
|**duplicateOfId** | **Object** | If the assignment is a duplicate, the ID of the original assignment. |  [optional] |
|**anonymousGrading** | **Object** | Indicates if the assignment is graded anonymously. If true, graders cannot see student identities. |  |
|**gradersAnonymousToGraders** | **Object** | Indicates if provisional graders&#39; identities are hidden from other provisional graders. Only relevant for moderated assignments with grader_comments_visible_to_graders set to true. |  |
|**graderCount** | **Object** | The maximum number of provisional graders who may issue grades for this assignment. Only relevant for moderated assignments. Must be a positive value, and must be set to 1 if the course has fewer than two active instructors. Otherwise, the maximum value is the number of active instructors in the course minus one, or 10 if the course has more than 11 active instructors. |  |
|**graderCommentsVisibleToGraders** | **Object** | Indicates if provisional graders&#39; comments are visible to other provisional graders. Only relevant for moderated assignments. |  |
|**graderSectionId** | **Object** | Graders for an assignment with anonymous moderated marking are assigned from this section if provided, or all sections otherwise. |  [optional] |
|**finalGraderId** | **Object** | User ID of the final grader. |  [optional] |
|**graderNamesVisibleToFinalGrader** | **Object** | Indicates if provisional grader identities are visible to the final grader. Only relevant for moderated assignments. |  |
|**allowedAttempts** | **Object** | The number of submission attempts a student can make for this assignment. -1 is considered unlimited. |  [optional] |
|**sisSourceId** | [**AssignmentsSisSourceId**](AssignmentsSisSourceId.md) |  |  [optional] |
|**annotatableAttachmentId** | **Object** | For an &#x60;Annotated Document&#x60; type assignment, the ID of the annotatable attachment. |  [optional] |
|**importantDates** | **Object** | Indicates if the assignment has important dates. |  |
|**description** | [**AssignmentsDescription**](AssignmentsDescription.md) |  |  [optional] |
|**position** | **Object** | The sorting order of the assignment in the group. |  [optional] |
|**title** | **Object** | Title of the assignment. |  [optional] |
|**turnitinSettings** | [**TypeExtractedFromColumnAssignmentsTurnitinSettings**](TypeExtractedFromColumnAssignmentsTurnitinSettings.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |
| PUBLISHED | &quot;published&quot; |
| DELETED | &quot;deleted&quot; |
| DUPLICATING | &quot;duplicating&quot; |
| FAIL_TO_IMPORT | &quot;fail_to_import&quot; |
| FAILED_TO_DUPLICATE | &quot;failed_to_duplicate&quot; |
| FAILED_TO_IMPORT | &quot;failed_to_import&quot; |
| FAILED_TO_MIGRATE | &quot;failed_to_migrate&quot; |
| IMPORTING | &quot;importing&quot; |
| MIGRATING | &quot;migrating&quot; |



## Enum: GradingTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| GPA_SCALE | &quot;gpa_scale&quot; |
| LETTER_GRADE | &quot;letter_grade&quot; |
| NOT_GRADED | &quot;not_graded&quot; |
| PASS_FAIL | &quot;pass_fail&quot; |
| PERCENT | &quot;percent&quot; |
| POINTS | &quot;points&quot; |
| DEFAULT | &quot;default&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |



