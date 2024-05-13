

# CreateIncomingWebhookRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**channelId** | **String** | The ID of a public channel or private group that receives the webhook payloads. |  |
|**userId** | **String** | The ID of the owner of the webhook if different than the requester. Required for [local mode](https://docs.mattermost.com/administration/mmctl-cli-tool.html#local-mode). |  [optional] |
|**displayName** | **String** | The display name for this incoming webhook |  [optional] |
|**description** | **String** | The description for this incoming webhook |  [optional] |
|**username** | **String** | The username this incoming webhook will post as. |  [optional] |
|**iconUrl** | **String** | The profile picture this incoming webhook will use when posting. |  [optional] |



