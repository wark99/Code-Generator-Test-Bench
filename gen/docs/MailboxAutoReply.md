

# MailboxAutoReply


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**isEnabled** | **Boolean** | Enabled (scheduled)   |  [optional] |
|**isActive** | **Boolean** | Active (currently activated)   |  [optional] |
|**replyMessage** | **String** | Reply message   |  [optional] |
|**replyFrom** | **String** | Reply from   |  [optional] |
|**replyFromId** | **Integer** | Id of verified email configured as reply from   |  [optional] |
|**isRecurrent** | **Boolean** | Is recurrent   |  [optional] |
|**recurrentDays** | [**RecurrentDays**](RecurrentDays.md) |  |  [optional] |
|**startedAt** | **LocalDate** | Start   |  [optional] |
|**endedAt** | **LocalDate** | End   |  [optional] |
|**dontReplyTo** | **List&lt;String&gt;** |  |  [optional] |
|**hasSendOriginalMessage** | **Boolean** | Send original message   |  [optional] |
|**validEmails** | [**List&lt;VerifiedEmail&gt;**](VerifiedEmail.md) |  |  [optional] |



