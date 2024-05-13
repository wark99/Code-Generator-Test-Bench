

# ExternalImportFile


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | External file import identifier |  |
|**name** | **String** | External file name |  |
|**status** | [**StatusEnum**](#StatusEnum) | External file import status.&lt;note&gt;&lt;strong&gt;downloading&lt;/strong&gt;: External file is currently downloading.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;error&lt;/strong&gt;: External file import failed, additional information in the message field.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;finished&lt;/strong&gt;: External file was successfully imported.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;uploading&lt;/strong&gt;: External file is currently uploading.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;waiting&lt;/strong&gt;: External file is not upload, waiting to be imported.&lt;/note&gt; |  |
|**message** | **String** | Message when error occur |  |
|**createdAt** | **Integer** | External file creation date |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| DOWNLOADING | &quot;downloading&quot; |
| ERROR | &quot;error&quot; |
| FINISHED | &quot;finished&quot; |
| UPLOADING | &quot;uploading&quot; |
| WAITING | &quot;waiting&quot; |



