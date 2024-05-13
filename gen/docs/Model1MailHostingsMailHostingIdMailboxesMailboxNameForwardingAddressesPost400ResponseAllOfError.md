

# Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesPost400ResponseAllOfError

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
| INCORRECT_REDIRECT_ADDRESS | &quot;incorrect_redirect_address&quot; |
| MAX_MAILBOX_REDIRECTION | &quot;max_mailbox_redirection&quot; |
| REDIRECT_ADDRESS_ALREADY_EXISTS | &quot;redirect_address_already_exists&quot; |
| TOO_MUCH_REDIRECTIONS | &quot;too_much_redirections&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| INCORRECT_REDIRECT_ADDRESS | &quot;Incorrect redirect address&quot; |
| MAX_MAILBOX_REDIRECTION | &quot;Max mailbox redirection&quot; |
| REDIRECT_ADDRESS_ALREADY_EXISTS | &quot;Redirect address already exists&quot; |
| TOO_MUCH_REDIRECTIONS | &quot;Too much redirections&quot; |



