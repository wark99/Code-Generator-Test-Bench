

# Model1MailHostingsMailHostingIdMailboxesMailboxNameAliasesAliasDelete400ResponseAllOfError

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
| ALIAS_DOES_NOT_EXIST | &quot;alias_does_not_exist&quot; |
| ERROR | &quot;error&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| ALIAS_DOES_NOT_EXIST | &quot;Alias does not exist&quot; |
| BAD_REQUEST | &quot;Bad Request&quot; |



