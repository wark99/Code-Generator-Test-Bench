

# ChannelWithTeamData


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelId** | **Object** | Unique identifier of the &#x60;channel&#x60; that is related to the resource &#x60;Channel&#x60; |  |
|**name** | **Object** | Name of the resource &#x60;Channel&#x60; |  |
|**createdAt** | **Object** | Timestamp &#x60;Channel&#x60; has been created |  |
|**updatedAt** | **Object** | Timestamp &#x60;Channel&#x60; has been updated |  |
|**deletedAt** | **Object** | Timestamp &#x60;Channel&#x60; has been deleted |  |
|**deleted** | **Object** | Boolean &#x60;Channel&#x60; has been deleted |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**sourceType** | [**SourceTypeEnum**](#SourceTypeEnum) |  |  |
|**rememberToConfig** | **Object** |  |  |
|**free** | **Object** |  |  |
|**blocked** | **Object** |  |  |
|**maintained** | **Object** |  |  |
|**blockedAt** | **Object** |  |  |
|**maintainedAt** | **Object** |  |  |
|**tags** | **Object** |  |  [optional] |
|**rights** | **Object** |  |  [optional] |
|**live** | [**Liveressource**](Liveressource.md) |  |  [optional] |
|**realType** | **Object** |  |  |
|**status** | **Object** | Status of the resource &#x60;Channel&#x60; |  [optional] |
|**consumption** | [**Consumptionressource**](Consumptionressource.md) |  |  [optional] |
|**recordingStatus** | **Object** |  |  [optional] |
|**options** | **Object** |  |  [optional] |
|**defaultOptions** | **Object** |  |  [optional] |
|**streams** | **Object** |  |  [optional] |
|**restriction** | [**ViewersRestrictions**](ViewersRestrictions.md) |  |  [optional] |
|**machines** | **Object** |  |  [optional] |
|**players** | **Object** |  |  [optional] |
|**order** | **Object** |  |  [optional] |
|**teamDisplayName** | **String** | The display name of the team to which this channel belongs. |  [optional] |
|**teamName** | **String** | The name of the team to which this channel belongs. |  [optional] |
|**teamUpdateAt** | **Integer** | The time at which the team to which this channel belongs was last updated. |  [optional] |
|**policyId** | **String** | The data retention policy to which this team has been assigned. If no such policy exists, or the caller does not have the &#x60;sysconsole_read_compliance_data_retention&#x60; permission, this field will be null. |  [optional] |



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



