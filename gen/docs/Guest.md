

# Guest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** |  |  [optional] |
|**title** | **Object** |  |  [optional] |
|**firstName** | **Object** |  |  [optional] |
|**lastName** | **Object** |  |  [optional] |
|**middleName** | **Object** |  |  [optional] |
|**isAdult** | **Object** | Set to true when a guest is considered an adult as per hotel rules |  [optional] |
|**isVerified** | **Object** | Set to true when a guest has been verified against an ID Docuemnt |  [optional] |
|**isPrimary** | **Object** | Set to true if this is a primary guest |  [optional] |
|**gender** | [**GenderEnum**](#GenderEnum) |  |  [optional] |
|**emailAddresses** | [**List&lt;EmailAddress&gt;**](EmailAddress.md) |  |  [optional] |
|**phoneNumbers** | [**List&lt;PhoneNumber&gt;**](PhoneNumber.md) |  |  [optional] |
|**addresses** | [**List&lt;Address&gt;**](Address.md) |  |  [optional] |
|**nationality** | [**Country**](Country.md) |  |  [optional] |
|**identity** | [**GuestAllOfIdentity**](GuestAllOfIdentity.md) |  |  [optional] |
|**verification** | [**GuestAllOfVerification**](GuestAllOfVerification.md) |  |  [optional] |



## Enum: GenderEnum

| Name | Value |
|---- | -----|
| MALE | &quot;MALE&quot; |
| FEMALE | &quot;FEMALE&quot; |
| OTHER | &quot;OTHER&quot; |
| NA | &quot;NA&quot; |



