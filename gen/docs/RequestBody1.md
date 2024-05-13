

# RequestBody1


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**connectionType** | [**ConnectionTypeEnum**](#ConnectionTypeEnum) | Slot connection type (Swift, S3, FTP) |  [optional] |
|**customerName** | **String** | Customer name of the resource &#x60;{name}&#x60; |  |
|**email** | **String** | Email |  |
|**firstname** | **String** |  |  [optional] |
|**lang** | **Integer** | Language identifier (1 &#x3D; fr / 2 &#x3D; en / 3 &#x3D; de / 4 &#x3D; it / 5 &#x3D; es) |  [optional] |
|**lastname** | **String** |  |  [optional] |
|**size** | **Integer** | Total storage size of the Swiss Backup product (Bytes) |  |
|**type** | [**TypeEnum**](#TypeEnum) | Type of the resource &#x60;{name}&#x60; |  |



## Enum: ConnectionTypeEnum

| Name | Value |
|---- | -----|
| FTP | &quot;ftp&quot; |
| S3 | &quot;s3&quot; |
| SWIFT | &quot;swift&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ACRONIS | &quot;acronis&quot; |
| LINUX | &quot;linux&quot; |
| MOBILE | &quot;mobile&quot; |
| OFFICE | &quot;office&quot; |
| OTHER | &quot;other&quot; |
| QNAP | &quot;qnap&quot; |
| SERVER | &quot;server&quot; |
| SYNOLOGY | &quot;synology&quot; |
| VIRTUAL | &quot;virtual&quot; |
| WORKSTATION | &quot;workstation&quot; |



