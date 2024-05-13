

# Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthInvitationsPost400ResponseAllOfError

Error object

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**code** | [**CodeEnum**](#CodeEnum) | Error code |  [optional] |
|**description** | [**DescriptionEnum**](#DescriptionEnum) | Description of the error |  [optional] |
|**errors** | **List&lt;String&gt;** | Error details |  [optional] |



## Enum: CodeEnum

| Name | Value |
|---- | -----|
| ERROR | &quot;error&quot; |
| MAILBOX_IS_BLOCKED | &quot;mailbox_is_blocked&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| MAILBOX_IS_BLOCKED | &quot;Mailbox is blocked&quot; |



