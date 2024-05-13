

# Rewind


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Rewind identifier |  |
|**status** | [**StatusEnum**](#StatusEnum) | Rewind status.&lt;note&gt;&lt;strong&gt;canceled&lt;/strong&gt;: Rewind was canceled by the user and deleted.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;done&lt;/strong&gt;: Rewind completed successfully.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;drive_not_ready&lt;/strong&gt;: Rewind cannot start because the drive was not ready (uploads or actions in progress).&lt;/note&gt;&lt;note&gt;&lt;strong&gt;expired&lt;/strong&gt;: Rewind has expired and deleted.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;failed&lt;/strong&gt;: Rewind completed with errors.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;in_progress&lt;/strong&gt;: Rewind is currently in progress.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;new&lt;/strong&gt;: Rewind did not start.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;sanitizing&lt;/strong&gt;: Rewind find the activity to sanitize.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;waiting_approval&lt;/strong&gt;: Rewind waiting user approval to continue.&lt;/note&gt; |  |
|**mode** | [**ModeEnum**](#ModeEnum) | Rewind type.&lt;note&gt;&lt;strong&gt;directory&lt;/strong&gt;: Rewind only a directory.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;drive&lt;/strong&gt;: Rewind all the drive.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;user&lt;/strong&gt;: Rewind a user&#39;s private folder.&lt;/note&gt; |  |
|**archiving** | [**ArchivingEnum**](#ArchivingEnum) | Rewind archive mode, all created files between now and the rewind date will be set to trash or to an archive depending on the mode selected.&lt;note&gt;&lt;strong&gt;all&lt;/strong&gt;: Keep in an archive folder the current or trashed files.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;current&lt;/strong&gt;: Keep in an archive folder the current files.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;none&lt;/strong&gt;: Don&#39;t build an archive, trash all created files.&lt;/note&gt; |  |
|**directoryId** | **Integer** | The targeted directory of the rewind &lt;note&gt;Filled only in directory and user mode&lt;/note&gt; |  |
|**directory** | [**Directory**](Directory.md) |  |  [optional] |
|**directoryName** | **String** | The name of the directory selected when the directory mode is selected |  [optional] |
|**userId** | **Integer** | The targeted user of the rewind &lt;note&gt;Filled only in user mode&lt;/note&gt; |  |
|**rewindAt** | **Integer** | Rewind at |  |
|**createdAt** | **Integer** | created at |  |
|**finishedAt** | **Integer** | when the rewind is executed the finished process time is save here |  [optional] |
|**expiresAt** | **Integer** | Date of the rewind approval |  |
|**createdBy** | **Integer** | created by the user |  |
|**isApproved** | **Boolean** | Rewind approved by the user |  |
|**approvalAt** | **Integer** | Date of the rewind approval |  |
|**rewindName** | **String** | The name of the directory choose during approval step |  [optional] |
|**sanitizer** | [**Sanitizer**](Sanitizer.md) |  |  [optional] |
|**summary** | [**Summary**](Summary.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CANCELED | &quot;canceled&quot; |
| DONE | &quot;done&quot; |
| DRIVE_NOT_READY | &quot;drive_not_ready&quot; |
| EXPIRED | &quot;expired&quot; |
| FAILED | &quot;failed&quot; |
| IN_PROGRESS | &quot;in_progress&quot; |
| NEW | &quot;new&quot; |
| SANITIZING | &quot;sanitizing&quot; |
| WAITING_APPROVAL | &quot;waiting_approval&quot; |



## Enum: ModeEnum

| Name | Value |
|---- | -----|
| DIRECTORY | &quot;directory&quot; |
| DRIVE | &quot;drive&quot; |
| USER | &quot;user&quot; |



## Enum: ArchivingEnum

| Name | Value |
|---- | -----|
| ALL | &quot;all&quot; |
| CURRENT | &quot;current&quot; |
| NONE | &quot;none&quot; |



