

# RegistrationCreateAccountPost201Response


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**mobile** | **String** | Only UK phone numbers are valid |  [optional] |
|**email** | **String** |  |  [optional] |
|**mfaOn** | [**MfaOnEnum**](#MfaOnEnum) |  |  [optional] |
|**defaultMfa** | [**DefaultMfaEnum**](#DefaultMfaEnum) | This is the default medium we use to send user mfa code |  [optional] |
|**mobileVerified** | [**MobileVerifiedEnum**](#MobileVerifiedEnum) |  |  [optional] |
|**created** | **String** |  |  [optional] |
|**enabled** | **Boolean** |  |  [optional] |
|**username** | **String** |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PARENT | &quot;parent&quot; |
| PROVIDER | &quot;provider&quot; |



## Enum: MfaOnEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



## Enum: DefaultMfaEnum

| Name | Value |
|---- | -----|
| SMS | &quot;sms&quot; |
| EMAIL | &quot;email&quot; |
| AUTHENTICATOR | &quot;authenticator&quot; |



## Enum: MobileVerifiedEnum

| Name | Value |
|---- | -----|
| TRUE | &quot;true&quot; |
| FALSE | &quot;false&quot; |



