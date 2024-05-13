

# SubmissionComments


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of this submission comment. |  |
|**comment** | [**SubmissionCommentsComment**](SubmissionCommentsComment.md) |  |  [optional] |
|**submissionId** | **Object** | The ID of the associated submission. |  [optional] |
|**createdAt** | **Object** | The date this comment was created. |  |
|**updatedAt** | **Object** | The date this comment was updated. |  |
|**contextId** | **Object** | The ID of the course this comment is associated with. |  [optional] |
|**contextType** | [**ContextTypeEnum**](#ContextTypeEnum) | The type of the object represented by &#x60;context_id&#x60;, typically &#x60;Course&#x60;. |  |
|**authorId** | **Object** | The ID of the commenting user. |  [optional] |
|**mediaCommentId** | **Object** | For media comments, the ID of the associated media object. |  [optional] |
|**mediaCommentType** | [**MediaCommentTypeEnum**](#MediaCommentTypeEnum) | For media comments, the type of the associated media object. |  [optional] |
|**attachmentIds** | [**SubmissionCommentsAttachmentIds**](SubmissionCommentsAttachmentIds.md) |  |  [optional] |
|**attempt** | **Object** | The particular attempt (on the associated submission) that this comment pertains to. |  [optional] |
|**hidden** | **Object** | True if this comment is not visible to the owner of the submission. |  |
|**authorName** | **Object** | The name of the commenting user. |  [optional] |
|**groupCommentId** | **Object** | For group assignments, a value that is unique for all copies of this comment on submissions in the same group. |  [optional] |
|**assessmentRequestId** | **Object** | For peer-reviewed assignments, the ID of the Assessment Request this comment is associated with. |  [optional] |
|**anonymous** | **Object** | True if this is a peer-reviewed comment for an assignment with anonymous peer reviews enabled. Does not apply to instructor comments for anonymously-graded assignments. |  [optional] |
|**teacherOnlyComment** | **Object** | Indicates whether the comment was provided by a teacher. |  |
|**provisionalGradeId** | **Object** | For moderated assignments, the provisional grade this comment is tied to. |  [optional] |
|**draft** | **Object** | True if this comment was saved as a draft. |  |
|**editedAt** | **Object** | The date this comment was last edited. |  [optional] |



## Enum: ContextTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| COURSE | &quot;Course&quot; |



## Enum: MediaCommentTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| AUDIO | &quot;audio&quot; |
| VIDEO | &quot;video&quot; |



