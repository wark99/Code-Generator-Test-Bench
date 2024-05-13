

# MasterCoursesMasterContentTags


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a master courses master content tag record. |  |
|**contentId** | **Object** | The ID of an associated content object. |  |
|**migrationId** | [**MasterCoursesMasterContentTagsMigrationId**](MasterCoursesMasterContentTagsMigrationId.md) |  |  [optional] |
|**restrictions** | **Object** | The locked status of the associated content object. |  [optional] |
|**useDefaultRestrictions** | **Object** | Whether the content is using defaults set by the course or has been individually configured. |  |
|**masterTemplateId** | **Object** | The ID of a template belonging to the blueprint course. |  |
|**contentType** | [**ContentTypeEnum**](#ContentTypeEnum) | The class of the associated content object. |  |



## Enum: ContentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ASSESSMENTQUESTIONBANK | &quot;AssessmentQuestionBank&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| ASSIGNMENTGROUP | &quot;AssignmentGroup&quot; |
| ATTACHMENT | &quot;Attachment&quot; |
| CALENDAREVENT | &quot;CalendarEvent&quot; |
| CONTEXTEXTERNALTOOL | &quot;ContextExternalTool&quot; |
| CONTEXTMODULE | &quot;ContextModule&quot; |
| CONTENTTAG | &quot;ContentTag&quot; |
| COURSEPACE | &quot;CoursePace&quot; |
| DISCUSSIONTOPIC | &quot;DiscussionTopic&quot; |
| LEARNINGOUTCOME | &quot;LearningOutcome&quot; |
| RUBRIC | &quot;Rubric&quot; |
| WIKI | &quot;Wiki&quot; |
| WIKIPAGE | &quot;WikiPage&quot; |
| QUIZZES_QUIZ | &quot;Quizzes::Quiz&quot; |



