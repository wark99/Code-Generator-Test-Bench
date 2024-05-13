

# Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdDelete400ResponseAllOfError

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
| SIGNATURE_DOES_NOT_EXIST | &quot;signature_does_not_exist&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| SIGNATURE_DOES_NOT_EXIST | &quot;Signature does not exist&quot; |



