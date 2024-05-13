

# Model1MailHostingsMailHostingIdMailboxesMailboxNameForwardingAddressesRedirectAddressesDelete400ResponseAllOfError

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
| REDIRECT_ADDRESS_DOES_NOT_EXIST | &quot;redirect_address_does_not_exist&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| REDIRECT_ADDRESS_DOES_NOT_EXIST | &quot;Redirect address does not exist&quot; |



