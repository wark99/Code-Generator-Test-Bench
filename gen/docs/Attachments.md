

# Attachments


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier of an attachment record. |  |
|**deletedAt** | **Object** | Timestamp showing when this record was deleted. If the record has not been deleted the value will be NULL. |  [optional] |
|**userId** | **Object** | The unique ID of a user. |  [optional] |
|**createdAt** | **Object** | Timestamp showing when an attachments record was created. |  [optional] |
|**updatedAt** | **Object** | Timestamp showing when an attachments record was updated. |  [optional] |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Current workflow state of the attachment. |  [optional] |
|**unlockAt** | **Object** | The date-time to unlock the file at. |  [optional] |
|**lockAt** | **Object** | The date-time to lock the file at. |  [optional] |
|**contextId** | **Object** | The unique identifier of the attachments&#39;s context. |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by context_id. |  [optional] |
|**folderId** | **Object** | The unique identifier of a folder record. |  [optional] |
|**filename** | [**AttachmentsFilename**](AttachmentsFilename.md) |  |  [optional] |
|**locked** | **Object** | Flag if file is locked or available. |  |
|**fileState** | [**FileStateEnum**](#FileStateEnum) | Similar to &#x60;workflow_state&#x60; but for the file itself. |  |
|**mediaEntryId** | **Object** | The ID of a Kaltura/Notorious media entry associated with the file. |  [optional] |
|**md5** | **Object** | A hash of the file. Historically this was MD5 in Canvas Data 1 and API but newer records store a SHA512 in this column. |  [optional] |
|**replacementAttachmentId** | **Object** | The unique identifier of the attachment that this record replaced. |  [optional] |
|**usageRightsId** | **Object** | The unique identifier for the &#x60;usage_rights&#x60; record. |  [optional] |
|**modifiedAt** | **Object** | Timestamp showing when an attachment record was updated. |  [optional] |
|**viewedAt** | **Object** | Timestamp showing when an attachment record was last viewed. |  [optional] |
|**couldBeLocked** | **Object** | True if the file is in a lockable module item. |  [optional] |
|**migrationId** | **Object** | Only applicable for files which have been imported via a content migration, an opaque identifier for the file in its source. This field is used by Canvas to identify when a file is being re-imported, and can also be used to identify multiple files that have been copied from the same source. |  [optional] |
|**namespace** | **Object** | The asset string of the root account associated with the file&#39;s storage. |  [optional] |
|**size** | **Object** | The size of the file in bytes. |  [optional] |
|**displayName** | [**AttachmentsDisplayName**](AttachmentsDisplayName.md) |  |  [optional] |
|**contentType** | **Object** | MIME type of the associated file. |  [optional] |
|**uuid** | **Object** | The UUID of the attachment. |  [optional] |
|**rootAttachmentId** | **Object** | Identifier of the source file from which this file was copied and created. Defaults to &#x60;NULL&#x60; when this is the only copy. |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| DELETED | &quot;deleted&quot; |
| ERRORED | &quot;errored&quot; |
| PENDING_UPLOAD | &quot;pending_upload&quot; |
| PROCESSED | &quot;processed&quot; |
| PROCESSING | &quot;processing&quot; |
| TO_BE_ZIPPED | &quot;to_be_zipped&quot; |
| UNATTACHED | &quot;unattached&quot; |
| UNATTACHED_TEMPORARY | &quot;unattached_temporary&quot; |
| ZIPPED | &quot;zipped&quot; |
| ZIPPING | &quot;zipping&quot; |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNT | &quot;Account&quot; |
| ASSESSMENTQUESTION | &quot;AssessmentQuestion&quot; |
| ASSIGNMENT | &quot;Assignment&quot; |
| ATTACHMENT | &quot;Attachment&quot; |
| CONTENTEXPORT | &quot;ContentExport&quot; |
| CONTENTMIGRATION | &quot;ContentMigration&quot; |
| COURSE | &quot;Course&quot; |
| EPORTFOLIO | &quot;Eportfolio&quot; |
| EPUBEXPORT | &quot;EpubExport&quot; |
| FOLDER | &quot;Folder&quot; |
| GRADEBOOKUPLOAD | &quot;GradebookUpload&quot; |
| GROUP | &quot;Group&quot; |
| GROUPANDMEMBERSHIPIMPORTER | &quot;GroupAndMembershipImporter&quot; |
| OUTCOMEIMPORT | &quot;OutcomeImport&quot; |
| PURGATORY | &quot;Purgatory&quot; |
| QUIZZES_QUIZ | &quot;Quizzes::Quiz&quot; |
| QUIZZES_QUIZSTATISTICS | &quot;Quizzes::QuizStatistics&quot; |
| QUIZZES_QUIZSUBMISSION | &quot;Quizzes::QuizSubmission&quot; |
| SISBATCH | &quot;SisBatch&quot; |
| SUBMISSION | &quot;Submission&quot; |
| USER | &quot;User&quot; |



## Enum: FileStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| UNPUBLISHED | &quot;unpublished&quot; |
| PUBLISHED | &quot;published&quot; |
| DELETED | &quot;deleted&quot; |
| AVAILABLE | &quot;available&quot; |
| HIDDEN | &quot;hidden&quot; |
| ERRORED | &quot;errored&quot; |
| BROKEN | &quot;broken&quot; |



