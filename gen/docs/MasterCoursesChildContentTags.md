

# MasterCoursesChildContentTags


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of a master courses child content tag record. |  |
|**childSubscriptionId** | **Object** | The ID of a subscription belonging to the associated course. |  |
|**contentId** | **Object** | The ID of an associated content object. |  |
|**migrationId** | [**MasterCoursesChildContentTagsMigrationId**](MasterCoursesChildContentTagsMigrationId.md) |  |  [optional] |
|**downstreamChanges** | **Object** | The columns changed on the associated content. |  [optional] |
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
| LEARNINGOUTCOMEGROUP | &quot;LearningOutcomeGroup&quot; |
| RUBRIC | &quot;Rubric&quot; |
| WIKI | &quot;Wiki&quot; |
| WIKIPAGE | &quot;WikiPage&quot; |
| QUIZZES_QUIZ | &quot;Quizzes::Quiz&quot; |



