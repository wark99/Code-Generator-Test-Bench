

# Uploadsegment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**number** | **Integer** | Index of the chunk to compute the final object correctly |  |
|**status** | [**StatusEnum**](#StatusEnum) | The chunk status during the upload.&lt;note&gt;&lt;strong&gt;error&lt;/strong&gt;: Something was wrong chunk was not correctly received, retried to send the same chunk.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;ok&lt;/strong&gt;: Chunk has been received.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;uploading&lt;/strong&gt;: Chunks still uploading.&lt;/note&gt; |  |
|**createdAt** | **Integer** | Timestamp &#x60;Upload segment&#x60; was created at |  |
|**size** | **Integer** | Chunk uploaded size, computed |  |
|**hash** | **String** | Chunk uploaded hash, computed |  |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;error&quot; |
| OK | &quot;ok&quot; |
| UPLOADING | &quot;uploading&quot; |



