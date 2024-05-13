

# Channel


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelId** | **Integer** | Unique identifier of the &#x60;channel&#x60; that is related to the resource &#x60;Channel&#x60; |  |
|**name** | **String** | Name of the resource &#x60;Channel&#x60; |  |
|**createdAt** | **Integer** | Timestamp &#x60;Channel&#x60; has been created |  |
|**updatedAt** | **Integer** | Timestamp &#x60;Channel&#x60; has been updated |  |
|**deletedAt** | **Integer** | Timestamp &#x60;Channel&#x60; has been deleted |  |
|**deleted** | **Boolean** | Boolean &#x60;Channel&#x60; has been deleted |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**rememberToConfig** | **Boolean** |  |  |
|**free** | **Boolean** |  |  |
|**blocked** | **Boolean** |  |  |
|**maintained** | **Boolean** |  |  |
|**blockedAt** | **Integer** |  |  |
|**maintainedAt** | **Integer** |  |  |
|**tags** | **String** |  |  [optional] |
|**rights** | **String** |  |  [optional] |
|**live** | [**Liveressource**](Liveressource.md) |  |  [optional] |
|**realType** | **String** |  |  |
|**status** | **List&lt;String&gt;** | Status of the resource &#x60;Channel&#x60; |  [optional] |
|**consumption** | [**Consumptionressource**](Consumptionressource.md) |  |  [optional] |
|**recordingStatus** | **String** |  |  [optional] |
|**options** | **List&lt;String&gt;** |  |  [optional] |
|**defaultOptions** | **List&lt;String&gt;** |  |  [optional] |
|**streams** | [**List&lt;Stream&gt;**](Stream.md) |  |  [optional] |
|**restriction** | [**ViewersRestrictions**](ViewersRestrictions.md) |  |  [optional] |
|**machines** | [**List&lt;Machine&gt;**](Machine.md) |  |  [optional] |
|**players** | [**List&lt;Player&gt;**](Player.md) |  |  [optional] |
|**order** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ABR | &quot;abr&quot; |
| MONO | &quot;mono&quot; |



## Enum: SourceTypeEnum

| Name | Value |
|---- | -----|
| CAMIP | &quot;camip&quot; |
| ENCODER | &quot;encoder&quot; |
| MANIAK | &quot;maniak&quot; |
| MOBILE | &quot;mobile&quot; |
| WEBCAM | &quot;webcam&quot; |



