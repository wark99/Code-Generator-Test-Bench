

# Model1MailHostingsMailHostingIdMailboxesMailboxNameSignaturesSignatureIdPatch400ResponseAllOfError

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
| INVALID_REPLY_TO_CODE | &quot;invalid_reply_to_code&quot; |
| INVALID_SENDER_CODE | &quot;invalid_sender_code&quot; |
| SIGNATURE_DOES_NOT_EXIST | &quot;signature_does_not_exist&quot; |
| SIGNATURE_NAME_ALREADY_EXISTS | &quot;signature_name_already_exists&quot; |



## Enum: DescriptionEnum

| Name | Value |
|---- | -----|
| BAD_REQUEST | &quot;Bad Request&quot; |
| INVALID_REPLY_TO_CODE | &quot;Invalid reply to code&quot; |
| INVALID_SENDER_CODE | &quot;Invalid sender code&quot; |
| SIGNATURE_DOES_NOT_EXIST | &quot;Signature does not exist&quot; |
| SIGNATURE_NAME_ALREADY_EXISTS | &quot;Signature name already exists&quot; |



