

# Courses


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for the course. |  |
|**storageQuota** | **Object** | The total amount of storage space (in bytes) allowed to be used by files in the course. |  [optional] |
|**integrationId** | **Object** | the integration identifier for the course, if defined. |  [optional] |
|**ltiContextId** | **Object** | UUID of the Canvas context in LTI standard. secondary ID for this context, could be used in API to identify resource as well. |  [optional] |
|**sisBatchId** | **Object** | The unique identifier for the SIS import. |  [optional] |
|**createdAt** | **Object** | The date the course was created. |  |
|**updatedAt** | **Object** | The time the course was last updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for the course. |  |
|**accountId** | **Object** | Points to the account associated with the course. |  |
|**gradingStandardId** | **Object** | The grading standard associated with the course. |  [optional] |
|**startAt** | **Object** | The start date for the course, if applicable. If NULL, then use &#x60;start_at&#x60; value from &#x60;enrollment_terms&#x60; table. Enrollment term dates, course dates, and course section dates flow together in all aspects of Canvas. Various dates allow different users to participate in the course. The hierarchy of dates are: course section dates override course dates, course dates override term dates. |  [optional] |
|**sisSourceId** | **Object** | The SIS identifier for the course, if defined. |  [optional] |
|**groupWeightingScheme** | **Object** | Whether final grades will be weighted based on the &#x60;group_weight&#x60; value of assignment groups &#x60;percent&#x60; if weighted &#x60;equal&#x60; or NULL otherwise. |  [optional] |
|**concludeAt** | **Object** | The end date for the course, if applicable. If NULL, then use &#x60;start_at&#x60; value from &#x60;enrollment_terms&#x60; table. |  [optional] |
|**isPublic** | **Object** | True if the course is publicly visible. |  [optional] |
|**allowStudentWikiEdits** | **Object** | Whether Pages in the course can be created and are editable by students. |  [optional] |
|**syllabusBody** | [**CoursesSyllabusBody**](CoursesSyllabusBody.md) |  |  [optional] |
|**defaultWikiEditingRoles** | **Object** | Comma-separated list used as the default &#x60;editing_roles&#x60; value for new &#x60;wiki_pages&#x60; in the course. |  [optional] |
|**wikiId** | **Object** | Foreign key to the &#x60;wikis&#x60; dataset. |  [optional] |
|**allowStudentOrganizedGroups** | **Object** | Whether students are able to organize their own groups. |  |
|**courseCode** | **Object** | The course code. |  [optional] |
|**defaultView** | **Object** | the type of page that users will see when they first visit the course - &#x60;feed&#x60;: Recent Activity Dashboard - &#x60;wiki&#x60;: Wiki Front Page - &#x60;modules&#x60;: Course Modules/Sections Page - &#x60;assignments&#x60;: Course Assignments List - &#x60;syllabus&#x60;: Course Syllabus Page other types may be added in the future. |  [optional] |
|**abstractCourseId** | **Object** | Foreign key to the &#x60;abstract_courses&#x60; table. |  [optional] |
|**enrollmentTermId** | **Object** | The enrollment term associated with the course. |  |
|**openEnrollment** | **Object** | Whether the course has enabled open enrollment. |  [optional] |
|**tabConfiguration** | **Object** | A YAML serialized list detailing the order and visibility status of tabs in the left-hand navigation for the course. |  [optional] |
|**turnitinComments** | [**CoursesTurnitinComments**](CoursesTurnitinComments.md) |  |  [optional] |
|**selfEnrollment** | **Object** | Whether the course has enabled self enrollment. |  [optional] |
|**license** | **Object** | The default license for content in the course; &#x60;private&#x60;: Private (Copyrighted), &#x60;public_domain&#x60;: Public Domain, &#x60;cc_by&#x60;: CC Attribution, &#x60;cc_by_sa&#x60;: CC Attribution Share Alike, &#x60;cc_by_nc&#x60;: CC Attribution Noncommercial, &#x60;cc_by_nc_sa&#x60;: CC Attribution Noncommercial Share Alike, &#x60;cc_by_nd&#x60;: CC Attribution No Derivatives, &#x60;cc_by_nc_nd&#x60;: CC Attribution Noncommercial No Derivatives. |  [optional] |
|**indexed** | **Object** | Whether the course is included in the public course index. |  [optional] |
|**restrictEnrollmentsToCourseDates** | **Object** | Whether the course&#39;s start and end dates will override dates from the term when determining user access. |  [optional] |
|**templateCourseId** | **Object** | If set, this course was originally created via SIS when a section was marked to be cross listed to a non-existent course, using attributes from the original section&#39;s course and setting that course ID here. |  [optional] |
|**replacementCourseId** | **Object** | The ID of the course created to replace this one when it had its content reset. |  [optional] |
|**publicDescription** | [**CoursesPublicDescription**](CoursesPublicDescription.md) |  |  [optional] |
|**selfEnrollmentCode** | **Object** | The alpha-numeric code students can use to enroll in the course through self enrollment. |  [optional] |
|**selfEnrollmentLimit** | **Object** | The number of students that can enroll in the course through self enrollment. |  [optional] |
|**turnitinId** | **Object** | A unique identifier for use with Turnitin. |  [optional] |
|**showAnnouncementsOnHomePage** | **Object** | Whether announcements will be shown on the course home page. |  [optional] |
|**homePageAnnouncementLimit** | **Object** | The maximum number of announcements to show on the course home page. |  [optional] |
|**latestOutcomeImportId** | **Object** | The ID of the most recent Outcome Import for the course. |  [optional] |
|**gradePassbackSetting** | **Object** | The grade_passback_setting set on the course. |  [optional] |
|**template** | **Object** | Course is marked as a template for accounts to use. |  |
|**homeroomCourse** | **Object** | Course is marked as a homeroom course. |  |
|**syncEnrollmentsFromHomeroom** | **Object** | Enrollments for this course will be synced from the associated homeroom. |  |
|**homeroomCourseId** | **Object** | Points to the homeroom course from which this course receives its enrollments. |  [optional] |
|**locale** | **Object** | The course-set locale, if applicable. |  [optional] |
|**name** | **Object** | The full name of the course. |  [optional] |
|**timeZone** | **Object** | The course&#39;s IANA time zone name. |  [optional] |
|**uuid** | **Object** | The UUID of the course. |  [optional] |
|**settings** | [**TypeExtractedFromColumnCoursesSettings**](TypeExtractedFromColumnCoursesSettings.md) |  |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| CREATED | &quot;created&quot; |
| CLAIMED | &quot;claimed&quot; |
| AVAILABLE | &quot;available&quot; |
| COMPLETED | &quot;completed&quot; |
| DELETED | &quot;deleted&quot; |



