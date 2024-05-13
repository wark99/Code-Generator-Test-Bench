

# Model1MailHostingsMailHostingIdMailboxesMailboxNameAliasesPost400ResponseAllOfError

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
| ALIAS_ALREADY_EXISTS | &quot;alias_already_exists&quot; |
| ALIAS_LIMIT_REACHED | &quot;alias_limit_reached&quot; |
| CANNOT_CREATE_ALIAS_FOR_GENERIC_MAILBOX | &quot;cannot_create_alias_for_generic_mailbox&quot; |
| CANNOT_CREATE_ALIAS_WITH_A_REDIRECTION | &quot;cannot_create_alias_with_a_redirection&quot; |
| ERROR | &quot;error&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| ALIAS_ALREADY_EXISTS | &quot;Alias already exists&quot; |
| ALIAS_LIMIT_REACHED | &quot;Alias limit reached&quot; |
| BAD_REQUEST | &quot;Bad Request&quot; |
| CANNOT_CREATE_ALIAS_FOR_GENERIC_MAILBOX | &quot;Cannot create alias for generic mailbox&quot; |
| CANNOT_CREATE_ALIAS_WITH_A_REDIRECTION | &quot;Cannot create alias with a redirection&quot; |



