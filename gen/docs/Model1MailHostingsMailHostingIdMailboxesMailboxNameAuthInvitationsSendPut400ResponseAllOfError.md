

# Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthInvitationsSendPut400ResponseAllOfError

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
| CANNOT_SEND_INVITATION_EMAIL | &quot;cannot_send_invitation_email&quot; |
| ERROR | &quot;error&quot; |
| INVALID_PASSWORD | &quot;invalid_password&quot; |
| TOO_MANY_ATTEMPTS_TRY_AGAIN_IN_1_MINUTE | &quot;too_many_attempts_try_again_in_1_minute&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| CANNOT_SEND_INVITATION_EMAIL | &quot;Cannot send invitation email&quot; |
| INVALID_PASSWORD | &quot;Invalid password&quot; |
| TOO_MANY_ATTEMPTS_TRY_AGAIN_IN_1_MINUTE | &quot;Too many attempts try again in 1 minute&quot; |



