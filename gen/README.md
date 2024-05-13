# openapi-java-client

Data Access Platform Query API

- API version: 0.9.0

- Build date: 2024-05-13T19:17:10.693828204Z[Etc/UTC]

- Generator version: 7.4.0

[Datasets](tables/index.html) | [Entity relationship diagram](erd/index.html) | [PostgreSQL schema](sql/postgresql.sql) | [MySQL schema](sql/mysql.sql) | [JSON schema](schema.json)

# Data representation

Snapshot and incremental queries in Data Access Platform (DAP) write output to AWS S3 buckets, and return pre-signed URLs to files (objects) in S3. Output comprises of records exported from data tables, and optional metadata associated with them.

## Data formats

DAP API supports several output data formats, including text (TSV), CSV and JSON. Data in all formats is transferred with GZIP compression.

### Text (TSV)

Text format is a simple tabular format in which each record (table row) occupies a single line.

* Output always begins with a header row, which lists all metadata and data field names.
* Fields (table columns) are delimited by *tab* characters.
* Non-printable characters and special values are escaped with *backslash* (`\\`), as shown below:

| Escape | Interpretation               |
| ------ | ---------------------------- |
| `\\N`   | NULL value                   |
| `\\b`   | Backspace (ASCII 8)          |
| `\\f`   | Form feed (ASCII 12)         |
| `\\n`   | Newline (ASCII 10)           |
| `\\r`   | Carriage return (ASCII 13)   |
| `\\t`   | Tab (ASCII 9)                |
| `\\v`   | Vertical tab (ASCII 11)      |
| `\\\\`   | Backslash (single character) |

This format allows data to be easily imported into a database engine, e.g. with PostgreSQL [COPY](https://www.postgresql.org/docs/current/sql-copy.html).

Output in this format is transmitted as media type `text/plain` in UTF-8 encoding.

### Comma-separated values (CSV)

Comma-separated values (CSV) output follows [RFC 4180](https://www.ietf.org/rfc/rfc4180.html) with a few extensions:

* Output always begins with a header row, which lists all metadata and data field names.
* Strings are quoted with double quotes (`\"`) if they contain special characters such as the double quote itself, the comma delimiter, a newline, a carriage return, a tab character, etc.
* Empty strings are always represented as `\"\"` to avoid ambiguity with missing values.
* Missing values (a.k.a. `NULL`) are represented with no data (no characters between delimiters).
* Each row has the same number of fields.

These extensions allow differentiating empty strings (`\"\"`) from missing values (a.k.a. `NULL`, represented as no data), for which RFC 4180 defines no rules. If a field is missing, the comma separators are still included, i.e. multiple comma separators may follow one another in a row if there is no data in subsequent fields.

Double quotes act as escape sequences inside a quoted string. If there are two consecutive double quote characters (i.e. `\"\"`), the sequence is interpreted as a single double quote character (`\"`). If a string contains newline or carriage return characters, they are emitted verbatim (in compliance with RFC 4180). As such, a record may be broken into several lines if the data contains newlines. (Some applications might not interpret these flawlessly, double-check your integration when you deal with CSV files.)

The following example demonstrates some of the above:
```csv
meta.action,key.pkey,value.prop1,value.prop2
U,1,a string,42
U,2,\"a string, but in \"\"quotes\"\".\",
D,3,,
U,4,\"a multi-line
string\",
```

Output in this format is transmitted as media type `text/csv` in UTF-8 encoding.

### JSON Lines

When the output data is represented in the [JSON Lines](https://jsonlines.org/) format, each record (table row) occupies a single line. Each line is a JSON object, which can be validated against the JSON schema returned by DAP API.

Output in this format is transmitted as media type `application/jsonlines` in UTF-8 encoding.

## Metadata

Output of DAP API may include record-level metadata in addition to table data.

In tabular formats (such as text and CSV), metadata are included in the output as additional columns. Consider the following example:
```csv
meta.action,key.pkey,value.prop1,value.prop2
U,1,\"value1\",42
U,2,\"value2\",NULL
D,3,,
```

This CSV output has a metadata section (`meta`), a primary key section (`key`) and a record value section (`value`). The metadata section contains a single field called `action`. The key and value sections comprise of several fields: `pkey`, `prop1` and `prop2`.

In the JSON Lines format, metadata, key and value sections are top-level properties `meta`, `key` and `value`, and have properties of their own:
```json
{ \"meta\": { \"action\": \"U\", ... }, \"key\": { \"pkey\": 1 }, \"value\": { \"prop1\": \"value1\", \"prop2\": 42 } }
{ \"meta\": { \"action\": \"U\", ... }, \"key\": { \"pkey\": 2 }, \"value\": { \"prop1\": \"value2\", \"prop2\": null } }
{ \"meta\": { \"action\": \"D\", ... }, \"key\": { \"pkey\": 3 } }
```

The set of metadata fields returned depends on the context. Some contexts may produce fields that other contexts do not. If output would contain no metadata fields, the section is omitted entirely.

### Action

The metadata field `action` identifies whether a record is *upserted* (inserted or updated) or *(hard) deleted* for an incremental query. In the result of a snapshot query, all records are to be understood as upserted.

* Upserted records (denoted by `U`) have all fields present in the data.
* Deleted records (denoted by `D`) only have the primary key field in their data, other field values are missing.

Occasionally, the term *soft delete* is used, which in this context is equivalent to an update, and is denoted with a `U`, and all field values are included in the output.

### Timestamp

The metadata field `ts` indicates when a record was last updated in the underlying transactional data lake table. For an incremental query with `since` and `until` timestamp parameters, `ts` for all returned records is always strictly greater than `since`, and always less than or equal to `until`.

The timestamp may correlate to but does not correspond to the real time when the event took place (e.g. when a student enrolled to a course). If you need to know when the event happened, use the timestamp embedded in the data. Specifically, many tables have timestamp data columns such as `created_at` or `updated_at`, which are controlled by the product or application that generates the event (e.g. Canvas).

Timestamps are stored in fields of JSON type `string`, are formatted as per ISO-8601, and are to be understood as in time zone UTC. This is aligned with how timestamps are represented in the OpenAPI format `date-time` as per [RFC 3339](https://xml2rfc.tools.ietf.org/public/rfc/html/rfc3339.html#anchor14).

## Format transformations

Tabular data formats such as CSV cannot capture the hierarchy that JSON can represent easily. Nested JSON objects are flattened before they are included in the output. For example, consider the JSON data:
```json
{
    \"id\": 1,
    \"question\": {
        \"headline\": \"title\",
        \"text\": \"some text\"
    },
    \"answers\": [
        { \"answer\": \"A\", \"score\": 0 },
        { \"answer\": \"B\", \"score\": 1 },
        { \"answer\": \"C\", \"score\": 0 }
    ]
}
```
Here, the property `question` with two fixed sub-properties can be flattened into CSV columns `question.headline` and `question.text`. However, the property `answers` cannot be flattened because the list has an indeterminate cardinality. Items with indeterminate cardinality are transmitted as a JSON string. (Cardinality check is performed on the data (JSON) schema, not the actual data.)

This is how text output would look like after flattening (tabs are shown as four spaces):
```
data.id    data.question.headline    data.question.text    data.answers
1    title    some text    [{\"answer\":\"A\",\"score\":0},{\"answer\":\"B\",\"score\":1},{\"answer\":\"C\",\"score\":0}]
```

In a similar fashion, this is how CSV output would look after flattening:
```csv
data.id,data.question.headline,data.question.text,data.answers
1,title,some text,\"[{\"\"answer\"\":\"\"A\"\",\"\"score\"\":0},{\"\"answer\"\":\"\"B\"\",\"\"score\"\":1},{\"\"answer\"\":\"\"C\"\",\"\"score\"\":0}]\"
```

If you wish to avoid format transformations entirely, use the JSON Lines data format.



*Automatically generated by the [OpenAPI Generator](https://openapi-generator.tech)*

## Requirements

Building the API client library requires:

1. Java 1.8+
2. Maven/Gradle

## Installation

To install the API client library to your local Maven repository, simply execute:

```shell
mvn clean install
```

To deploy it to a remote Maven repository instead, configure the settings of the repository and execute:

```shell
mvn clean deploy
```

Refer to the [OSSRH Guide](http://central.sonatype.org/pages/ossrh-guide.html) for more information.

### Maven users

Add this dependency to your project's POM:

```xml
<dependency>
  <groupId>org.openapitools</groupId>
  <artifactId>openapi-java-client</artifactId>
  <version>0.9.0</version>
  <scope>compile</scope>
</dependency>
```

### Gradle users

Add this dependency to your project's build file:

```groovy
  repositories {
    mavenCentral()     // Needed if the 'openapi-java-client' jar has been published to maven central.
    mavenLocal()       // Needed if the 'openapi-java-client' jar has been published to the local maven repo.
  }

  dependencies {
     implementation "org.openapitools:openapi-java-client:0.9.0"
  }
```

### Others

At first generate the JAR by executing:

```shell
mvn clean package
```

Then manually install the following JARs:

- `target/openapi-java-client-0.9.0.jar`
- `target/lib/*.jar`

## Getting Started

Please follow the [installation](#installation) instruction and execute the following Java code:

```java

import org.openapitools.client.*;
import org.openapitools.client.auth.*;
import org.openapitools.client.model.*;
import org.openapitools.client.api.ApiApi;

public class ApiApiExample {

    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api-gateway.instructure.com/dap");
        
        // Configure HTTP bearer authorization: Default
        HttpBearerAuth Default = (HttpBearerAuth) defaultClient.getAuthentication("Default");
        Default.setBearerToken("BEARER TOKEN");

        ApiApi apiInstance = new ApiApi(defaultClient);
        String id = "id_example"; // String | Unique identifier returned when the job was started by querying data.
        try {
            JobIdGet200Response result = apiInstance.jobIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ApiApi#jobIdGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}

```

## Documentation for API Endpoints

All URIs are relative to *https://api-gateway.instructure.com/dap*

Class | Method | HTTP request | Description
------------ | ------------- | ------------- | -------------
*ApiApi* | [**jobIdGet**](docs/ApiApi.md#jobIdGet) | **GET** /job/{id} | Returns status information about a job.
*ApiApi* | [**objectUrlPost**](docs/ApiApi.md#objectUrlPost) | **POST** /object/url | Produces a list of pre-signed URLs for a list of objects.
*ApiApi* | [**queryNamespaceTableGet**](docs/ApiApi.md#queryNamespaceTableGet) | **GET** /query/{namespace}/table | Returns a list of table names that exist in the given scope (e.g. organization domain).
*ApiApi* | [**queryNamespaceTableTableDataPost**](docs/ApiApi.md#queryNamespaceTableTableDataPost) | **POST** /query/{namespace}/table/{table}/data | Queries a table for data.
*ApiApi* | [**queryNamespaceTableTableSchemaGet**](docs/ApiApi.md#queryNamespaceTableTableSchemaGet) | **GET** /query/{namespace}/table/{table}/schema | Returns the JSON schema that records in the table conform to.


## Documentation for Models

 - [AbstractCourses](docs/AbstractCourses.md)
 - [AccessTokens](docs/AccessTokens.md)
 - [AccountUsers](docs/AccountUsers.md)
 - [Accounts](docs/Accounts.md)
 - [AppointmentGroups](docs/AppointmentGroups.md)
 - [AssessmentQuestionBanks](docs/AssessmentQuestionBanks.md)
 - [AssessmentQuestionBanksTitle](docs/AssessmentQuestionBanksTitle.md)
 - [AssessmentQuestions](docs/AssessmentQuestions.md)
 - [AssessmentQuestionsName](docs/AssessmentQuestionsName.md)
 - [AssessmentRequests](docs/AssessmentRequests.md)
 - [AssetUserAccesses](docs/AssetUserAccesses.md)
 - [AssetUserAccessesDisplayName](docs/AssetUserAccessesDisplayName.md)
 - [AssignmentGroups](docs/AssignmentGroups.md)
 - [AssignmentGroupsRules](docs/AssignmentGroupsRules.md)
 - [AssignmentOverrideStudents](docs/AssignmentOverrideStudents.md)
 - [AssignmentOverrides](docs/AssignmentOverrides.md)
 - [Assignments](docs/Assignments.md)
 - [AssignmentsDescription](docs/AssignmentsDescription.md)
 - [AssignmentsLtiContextId](docs/AssignmentsLtiContextId.md)
 - [AssignmentsSisSourceId](docs/AssignmentsSisSourceId.md)
 - [AssignmentsTurnitinSettings](docs/AssignmentsTurnitinSettings.md)
 - [AttachmentAssociations](docs/AttachmentAssociations.md)
 - [Attachments](docs/Attachments.md)
 - [AttachmentsDisplayName](docs/AttachmentsDisplayName.md)
 - [AttachmentsFilename](docs/AttachmentsFilename.md)
 - [AuthenticationError](docs/AuthenticationError.md)
 - [AuthenticationProviders](docs/AuthenticationProviders.md)
 - [CalendarEvents](docs/CalendarEvents.md)
 - [CalendarEventsComments](docs/CalendarEventsComments.md)
 - [CalendarEventsDescription](docs/CalendarEventsDescription.md)
 - [CalendarEventsLocationAddress](docs/CalendarEventsLocationAddress.md)
 - [CalendarEventsLocationName](docs/CalendarEventsLocationName.md)
 - [CanvadocsAnnotationContexts](docs/CanvadocsAnnotationContexts.md)
 - [CanvadocsAnnotationContextsLaunchId](docs/CanvadocsAnnotationContextsLaunchId.md)
 - [ClonedItems](docs/ClonedItems.md)
 - [CommentBankItems](docs/CommentBankItems.md)
 - [CommentBankItemsComment](docs/CommentBankItemsComment.md)
 - [CommunicationChannels](docs/CommunicationChannels.md)
 - [CompleteIncrementalJob](docs/CompleteIncrementalJob.md)
 - [CompleteSnapshotJob](docs/CompleteSnapshotJob.md)
 - [ContentExports](docs/ContentExports.md)
 - [ContentMigrations](docs/ContentMigrations.md)
 - [ContentParticipationCounts](docs/ContentParticipationCounts.md)
 - [ContentParticipations](docs/ContentParticipations.md)
 - [ContentShares](docs/ContentShares.md)
 - [ContentTags](docs/ContentTags.md)
 - [ContentTagsComments](docs/ContentTagsComments.md)
 - [ContentTagsLinkSettings](docs/ContentTagsLinkSettings.md)
 - [ContentTagsTitle](docs/ContentTagsTitle.md)
 - [ContentTagsUrl](docs/ContentTagsUrl.md)
 - [ContextExternalTools](docs/ContextExternalTools.md)
 - [ContextExternalToolsConsumerKey](docs/ContextExternalToolsConsumerKey.md)
 - [ContextExternalToolsDescription](docs/ContextExternalToolsDescription.md)
 - [ContextExternalToolsSettings](docs/ContextExternalToolsSettings.md)
 - [ContextModuleProgressions](docs/ContextModuleProgressions.md)
 - [ContextModules](docs/ContextModules.md)
 - [ContextModulesCompletionEvents](docs/ContextModulesCompletionEvents.md)
 - [ContextModulesName](docs/ContextModulesName.md)
 - [ConversationMessageParticipants](docs/ConversationMessageParticipants.md)
 - [ConversationMessageParticipantsTags](docs/ConversationMessageParticipantsTags.md)
 - [ConversationMessages](docs/ConversationMessages.md)
 - [ConversationMessagesAttachmentIds](docs/ConversationMessagesAttachmentIds.md)
 - [ConversationMessagesBody](docs/ConversationMessagesBody.md)
 - [ConversationMessagesForwardedMessageIds](docs/ConversationMessagesForwardedMessageIds.md)
 - [ConversationParticipants](docs/ConversationParticipants.md)
 - [ConversationParticipantsTags](docs/ConversationParticipantsTags.md)
 - [Conversations](docs/Conversations.md)
 - [ConversationsTags](docs/ConversationsTags.md)
 - [CourseAccountAssociations](docs/CourseAccountAssociations.md)
 - [CourseSections](docs/CourseSections.md)
 - [Courses](docs/Courses.md)
 - [CoursesPublicDescription](docs/CoursesPublicDescription.md)
 - [CoursesSettings](docs/CoursesSettings.md)
 - [CoursesSyllabusBody](docs/CoursesSyllabusBody.md)
 - [CoursesTurnitinComments](docs/CoursesTurnitinComments.md)
 - [CustomGradebookColumnData](docs/CustomGradebookColumnData.md)
 - [CustomGradebookColumns](docs/CustomGradebookColumns.md)
 - [DeveloperKeyAccountBindings](docs/DeveloperKeyAccountBindings.md)
 - [DeveloperKeys](docs/DeveloperKeys.md)
 - [DeveloperKeysClientCredentialsAudience](docs/DeveloperKeysClientCredentialsAudience.md)
 - [DeveloperKeysNotes](docs/DeveloperKeysNotes.md)
 - [DeveloperKeysPublicJwk](docs/DeveloperKeysPublicJwk.md)
 - [DiscussionEntries](docs/DiscussionEntries.md)
 - [DiscussionEntriesMessage](docs/DiscussionEntriesMessage.md)
 - [DiscussionEntryParticipants](docs/DiscussionEntryParticipants.md)
 - [DiscussionTopicParticipants](docs/DiscussionTopicParticipants.md)
 - [DiscussionTopics](docs/DiscussionTopics.md)
 - [DiscussionTopicsMessage](docs/DiscussionTopicsMessage.md)
 - [EnrollmentDatesOverrides](docs/EnrollmentDatesOverrides.md)
 - [EnrollmentStates](docs/EnrollmentStates.md)
 - [EnrollmentTerms](docs/EnrollmentTerms.md)
 - [Enrollments](docs/Enrollments.md)
 - [Eportfolios](docs/Eportfolios.md)
 - [EpubExports](docs/EpubExports.md)
 - [ExternalFeeds](docs/ExternalFeeds.md)
 - [FailedJob](docs/FailedJob.md)
 - [Favorites](docs/Favorites.md)
 - [Filter](docs/Filter.md)
 - [Folders](docs/Folders.md)
 - [FoldersFullName](docs/FoldersFullName.md)
 - [Format](docs/Format.md)
 - [GatewayTimeoutError](docs/GatewayTimeoutError.md)
 - [GradebookUploads](docs/GradebookUploads.md)
 - [GradingPeriodGroups](docs/GradingPeriodGroups.md)
 - [GradingPeriods](docs/GradingPeriods.md)
 - [GradingStandards](docs/GradingStandards.md)
 - [GroupAndMembershipImporters](docs/GroupAndMembershipImporters.md)
 - [GroupCategories](docs/GroupCategories.md)
 - [GroupCategoriesSisSourceId](docs/GroupCategoriesSisSourceId.md)
 - [GroupMemberships](docs/GroupMemberships.md)
 - [Groups](docs/Groups.md)
 - [GroupsDescription](docs/GroupsDescription.md)
 - [IncrementalQuery](docs/IncrementalQuery.md)
 - [JobIdGet200Response](docs/JobIdGet200Response.md)
 - [JobIdGet401Response](docs/JobIdGet401Response.md)
 - [JobIdGet404Response](docs/JobIdGet404Response.md)
 - [JobIdGet500Response](docs/JobIdGet500Response.md)
 - [JobIdGet500ResponseError](docs/JobIdGet500ResponseError.md)
 - [JobIdGet504Response](docs/JobIdGet504Response.md)
 - [JsonType](docs/JsonType.md)
 - [LatePolicies](docs/LatePolicies.md)
 - [LearningOutcomeGroups](docs/LearningOutcomeGroups.md)
 - [LearningOutcomeGroupsDescription](docs/LearningOutcomeGroupsDescription.md)
 - [LearningOutcomeQuestionResults](docs/LearningOutcomeQuestionResults.md)
 - [LearningOutcomeQuestionResultsTitle](docs/LearningOutcomeQuestionResultsTitle.md)
 - [LearningOutcomeResults](docs/LearningOutcomeResults.md)
 - [LearningOutcomes](docs/LearningOutcomes.md)
 - [LearningOutcomesDescription](docs/LearningOutcomesDescription.md)
 - [LiveAssessmentsAssessments](docs/LiveAssessmentsAssessments.md)
 - [LiveAssessmentsSubmissions](docs/LiveAssessmentsSubmissions.md)
 - [LtiLineItems](docs/LtiLineItems.md)
 - [LtiLineItemsExtensions](docs/LtiLineItemsExtensions.md)
 - [LtiLineItemsLabel](docs/LtiLineItemsLabel.md)
 - [LtiLineItemsResourceId](docs/LtiLineItemsResourceId.md)
 - [LtiLineItemsTag](docs/LtiLineItemsTag.md)
 - [LtiMessageHandlers](docs/LtiMessageHandlers.md)
 - [LtiResourceLinks](docs/LtiResourceLinks.md)
 - [LtiResourceLinksCustom](docs/LtiResourceLinksCustom.md)
 - [LtiResults](docs/LtiResults.md)
 - [LtiResultsActivityProgress](docs/LtiResultsActivityProgress.md)
 - [LtiResultsComment](docs/LtiResultsComment.md)
 - [LtiResultsExtensions](docs/LtiResultsExtensions.md)
 - [LtiResultsGradingProgress](docs/LtiResultsGradingProgress.md)
 - [MasterCoursesChildContentTags](docs/MasterCoursesChildContentTags.md)
 - [MasterCoursesChildContentTagsMigrationId](docs/MasterCoursesChildContentTagsMigrationId.md)
 - [MasterCoursesChildSubscriptions](docs/MasterCoursesChildSubscriptions.md)
 - [MasterCoursesMasterContentTags](docs/MasterCoursesMasterContentTags.md)
 - [MasterCoursesMasterContentTagsMigrationId](docs/MasterCoursesMasterContentTagsMigrationId.md)
 - [MasterCoursesMasterMigrations](docs/MasterCoursesMasterMigrations.md)
 - [MasterCoursesMasterMigrationsComment](docs/MasterCoursesMasterMigrationsComment.md)
 - [MasterCoursesMasterTemplates](docs/MasterCoursesMasterTemplates.md)
 - [MasterCoursesMigrationResults](docs/MasterCoursesMigrationResults.md)
 - [MediaObjects](docs/MediaObjects.md)
 - [ModelObject](docs/ModelObject.md)
 - [ModeratedGradingProvisionalGrades](docs/ModeratedGradingProvisionalGrades.md)
 - [NotFoundError](docs/NotFoundError.md)
 - [ObjectUrlPost400Response](docs/ObjectUrlPost400Response.md)
 - [OriginalityReports](docs/OriginalityReports.md)
 - [OriginalityReportsErrorMessage](docs/OriginalityReportsErrorMessage.md)
 - [OriginalityReportsLinkId](docs/OriginalityReportsLinkId.md)
 - [OriginalityReportsOriginalityReportLtiUrl](docs/OriginalityReportsOriginalityReportLtiUrl.md)
 - [OriginalityReportsOriginalityReportUrl](docs/OriginalityReportsOriginalityReportUrl.md)
 - [OutOfRangeError](docs/OutOfRangeError.md)
 - [OutcomeImports](docs/OutcomeImports.md)
 - [OutcomeProficiencies](docs/OutcomeProficiencies.md)
 - [OutcomeProficiencyRatings](docs/OutcomeProficiencyRatings.md)
 - [OutcomeProficiencyRatingsColor](docs/OutcomeProficiencyRatingsColor.md)
 - [PostPolicies](docs/PostPolicies.md)
 - [ProcessingError](docs/ProcessingError.md)
 - [Pseudonyms](docs/Pseudonyms.md)
 - [Purgatories](docs/Purgatories.md)
 - [Query](docs/Query.md)
 - [QueryNamespaceTableTableDataPost400Response](docs/QueryNamespaceTableTableDataPost400Response.md)
 - [QueryNamespaceTableTableDataPost400ResponseError](docs/QueryNamespaceTableTableDataPost400ResponseError.md)
 - [QuizGroups](docs/QuizGroups.md)
 - [QuizQuestions](docs/QuizQuestions.md)
 - [QuizQuestionsQuestionData](docs/QuizQuestionsQuestionData.md)
 - [QuizStatistics](docs/QuizStatistics.md)
 - [QuizSubmissions](docs/QuizSubmissions.md)
 - [Quizzes](docs/Quizzes.md)
 - [QuizzesDescription](docs/QuizzesDescription.md)
 - [RaisedWhenTheClientIsNotOnboarded](docs/RaisedWhenTheClientIsNotOnboarded.md)
 - [RaisedWhenTheClientIsOnboardedButAccessIsForbidden](docs/RaisedWhenTheClientIsOnboardedButAccessIsForbidden.md)
 - [Resource](docs/Resource.md)
 - [ResourceResult](docs/ResourceResult.md)
 - [RoleOverrides](docs/RoleOverrides.md)
 - [Roles](docs/Roles.md)
 - [RubricAssessments](docs/RubricAssessments.md)
 - [RubricAssociations](docs/RubricAssociations.md)
 - [Rubrics](docs/Rubrics.md)
 - [ScoreStatistics](docs/ScoreStatistics.md)
 - [Scores](docs/Scores.md)
 - [SisBatches](docs/SisBatches.md)
 - [SnapshotQuery](docs/SnapshotQuery.md)
 - [SnapshotRequiredError](docs/SnapshotRequiredError.md)
 - [SubmissionComments](docs/SubmissionComments.md)
 - [SubmissionCommentsAttachmentIds](docs/SubmissionCommentsAttachmentIds.md)
 - [SubmissionCommentsComment](docs/SubmissionCommentsComment.md)
 - [SubmissionVersions](docs/SubmissionVersions.md)
 - [Submissions](docs/Submissions.md)
 - [SubmissionsAttachmentIds](docs/SubmissionsAttachmentIds.md)
 - [SubmissionsBody](docs/SubmissionsBody.md)
 - [SubmissionsLtiUserId](docs/SubmissionsLtiUserId.md)
 - [TableJob](docs/TableJob.md)
 - [TableList](docs/TableList.md)
 - [TypeExtractedFromColumnAssignmentGroupsRules](docs/TypeExtractedFromColumnAssignmentGroupsRules.md)
 - [TypeExtractedFromColumnAssignmentsTurnitinSettings](docs/TypeExtractedFromColumnAssignmentsTurnitinSettings.md)
 - [TypeExtractedFromColumnContextExternalToolsSettings](docs/TypeExtractedFromColumnContextExternalToolsSettings.md)
 - [TypeExtractedFromColumnCoursesSettings](docs/TypeExtractedFromColumnCoursesSettings.md)
 - [TypeExtractedFromColumnQuizQuestionsQuestionData](docs/TypeExtractedFromColumnQuizQuestionsQuestionData.md)
 - [UsageRights](docs/UsageRights.md)
 - [UserAccountAssociations](docs/UserAccountAssociations.md)
 - [UserAgents](docs/UserAgents.md)
 - [UserNotes](docs/UserNotes.md)
 - [UserNotesNote](docs/UserNotesNote.md)
 - [Users](docs/Users.md)
 - [UsersPronouns](docs/UsersPronouns.md)
 - [ValidationError](docs/ValidationError.md)
 - [ValidationErrorLocation](docs/ValidationErrorLocation.md)
 - [VersionedSchema](docs/VersionedSchema.md)
 - [Versions](docs/Versions.md)
 - [WebConferenceParticipants](docs/WebConferenceParticipants.md)
 - [WebConferences](docs/WebConferences.md)
 - [WebConferencesDescription](docs/WebConferencesDescription.md)
 - [WebLogs](docs/WebLogs.md)
 - [WebLogsRemoteIp](docs/WebLogsRemoteIp.md)
 - [WikiPages](docs/WikiPages.md)
 - [WikiPagesBody](docs/WikiPagesBody.md)
 - [WikiPagesUrl](docs/WikiPagesUrl.md)
 - [Wikis](docs/Wikis.md)
 - [WikisFrontPageUrl](docs/WikisFrontPageUrl.md)


<a id="documentation-for-authorization"></a>
## Documentation for Authorization


Authentication schemes defined for the API:
<a id="Default"></a>
### Default


- **Type**: HTTP Bearer Token authentication (JWT)


## Recommendation

It's recommended to create an instance of `ApiClient` per thread in a multithreaded environment to avoid any potential issues.

## Author



