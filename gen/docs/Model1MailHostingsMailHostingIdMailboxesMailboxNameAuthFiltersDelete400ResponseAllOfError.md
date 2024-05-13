

# Model1MailHostingsMailHostingIdMailboxesMailboxNameAuthFiltersDelete400ResponseAllOfError

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
| INVALID_MAILBOX_PASSWORD | &quot;invalid_mailbox_password&quot; |
| MAILBOX_NOT_LINKED_TO_CURRENT_USER | &quot;mailbox_not_linked_to_current_user&quot; |
| SIEVE_LOAD_ERROR | &quot;sieve_load_error&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| INVALID_MAILBOX_PASSWORD | &quot;Invalid mailbox password&quot; |
| MAILBOX_NOT_LINKED_TO_CURRENT_USER | &quot;Mailbox not linked to current user&quot; |
| SIEVE_LOAD_ERROR | &quot;Sieve load error&quot; |


