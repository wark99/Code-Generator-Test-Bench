

# ApiFolder

Folder

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **UUID** |  |  [optional] |
|**name** | **Object** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**autoValidate** | [**AutoValidateEnum**](#AutoValidateEnum) |  |  [optional] |
|**autoPublish** | [**AutoPublishEnum**](#AutoPublishEnum) |  |  [optional] |
|**key** | **String** |  |  [optional] |
|**allowedIp** | **List&lt;String&gt;** |  |  [optional] |
|**disallowedIp** | **Object** |  |  [optional] |
|**allowedCountry** | [**List&lt;ApiCountry&gt;**](ApiCountry.md) |  |  [optional] |
|**disallowedCountry** | **Object** |  |  [optional] |
|**image** | **String** |  |  [optional] |
|**createdAt** | **Datetime** |  |  [optional] |
|**updatedAt** | **Datetime** |  |  [optional] |
|**discardedAt** | **Datetime** |  |  [optional] |
|**deletedAt** | **Datetime** |  |  [optional] |
|**mediaCount** | **BigDecimal** |  |  [optional] |
|**mediaDuration** | **String** |  |  [optional] |
|**encodings** | [**List&lt;ApiEncoding&gt;**](ApiEncoding.md) |  |  [optional] |
|**discarded** | **Object** |  |  [optional] |
|**effectiveEncodings** | **Object** |  |  [optional] |
|**path** | **Object** |  |  [optional] |
|**published** | **Object** |  |  [optional] |
|**restricted** | **Object** |  |  [optional] |
|**validated** | **Object** |  |  [optional] |
|**player** | [**List&lt;ApiPlayer&gt;**](ApiPlayer.md) |  |  [optional] |



## Enum: AutoValidateEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: AutoPublishEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



