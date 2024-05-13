

# PostMetadataEmbedsInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | The type of content that is embedded in this point. |  [optional] |
|**url** | **String** | The URL of the embedded content, if one exists. |  [optional] |
|**data** | **Object** | Any additional information about the embedded content. Only used at this time to store OpenGraph metadata. This field will be null for non-OpenGraph embeds.  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| IMAGE | &quot;image&quot; |
| MESSAGE_ATTACHMENT | &quot;message_attachment&quot; |
| OPENGRAPH | &quot;opengraph&quot; |
| LINK | &quot;link&quot; |



