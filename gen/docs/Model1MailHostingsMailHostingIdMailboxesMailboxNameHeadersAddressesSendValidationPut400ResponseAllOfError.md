

# Model1MailHostingsMailHostingIdMailboxesMailboxNameHeadersAddressesSendValidationPut400ResponseAllOfError

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
| SENDER_REPLY_ADDRESS_ALREADY_VALIDATED | &quot;sender_reply_address_already_validated&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| SENDER_REPLY_ADDRESS_ALREADY_VALIDATED | &quot;Sender reply address already validated&quot; |



