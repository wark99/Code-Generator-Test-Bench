

# Distribution


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  |
|**asset** | [**Asset**](Asset.md) |  |  |
|**scheduleId** | **Long** |  |  |
|**channel** | [**Channel**](Channel.md) |  |  |
|**account** | [**Account**](Account.md) |  |  |
|**priority** | **BigDecimal** |  |  [optional] |
|**created** | **OffsetDateTime** |  |  |
|**updated** | **String** |  |  [optional] |
|**requiredBy** | **OffsetDateTime** |  |  [optional] |
|**slaDate** | **OffsetDateTime** |  |  [optional] |
|**state** | [**StateEnum**](#StateEnum) | Distribution Status |  |
|**fileTransfers** | [**List&lt;Transfer&gt;**](Transfer.md) |  |  [optional] |
|**message** | **String** |  |  [optional] |
|**retries** | **Integer** |  |  [optional] |



## Enum: StateEnum

| Name | Value |
|---- | -----|
| UNKNOWN | &quot;UNKNOWN&quot; |
| INITIATING | &quot;INITIATING&quot; |
| WAITING_FOR_FILE_TRANSFER | &quot;WAITING_FOR_FILE_TRANSFER&quot; |
| CONTENT_ERROR | &quot;CONTENT_ERROR&quot; |
| TRANSFER_ERROR | &quot;TRANSFER_ERROR&quot; |
| SCHEDULED_FOR_TRANSFER | &quot;SCHEDULED_FOR_TRANSFER&quot; |
| TRANSFERRING | &quot;TRANSFERRING&quot; |
| TRANSFERRED | &quot;TRANSFERRED&quot; |
| EXPORT_ERROR | &quot;EXPORT_ERROR&quot; |
| SCHEDULED_FOR_EXPORT | &quot;SCHEDULED_FOR_EXPORT&quot; |
| EXPORTING | &quot;EXPORTING&quot; |
| EXPORTED | &quot;EXPORTED&quot; |
| SCHEDULED_FOR_DELETE | &quot;SCHEDULED_FOR_DELETE&quot; |
| DELETING | &quot;DELETING&quot; |
| DELETED | &quot;DELETED&quot; |
| DELETE_ERROR | &quot;DELETE_ERROR&quot; |
| API_ERROR | &quot;API_ERROR&quot; |
| MDU_HOLD | &quot;MDU_HOLD&quot; |
| MDU_HOLD_REJECT | &quot;MDU_HOLD_REJECT&quot; |
| MDU_HOLD_APPROVED | &quot;MDU_HOLD_APPROVED&quot; |



