

# Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPatch400ResponseAllOfError

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
| REDIRECT_ADDRESS_ALIAS_OR_MAILBOXNAME | &quot;redirect_address_alias_or_mailboxname&quot; |
| TOO_MUCH_REDIRECTIONS | &quot;too_much_redirections&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| REDIRECT_ADDRESS_ALIAS_OR_MAILBOXNAME | &quot;Redirect address alias or mailboxname&quot; |
| TOO_MUCH_REDIRECTIONS | &quot;Too much redirections&quot; |



