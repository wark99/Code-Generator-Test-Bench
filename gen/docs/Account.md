

# Account


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Account&#x60; |  |
|**name** | **String** | Name of the resource &#x60;Account&#x60; |  |
|**legalEntityType** | [**LegalEntityTypeEnum**](#LegalEntityTypeEnum) |  |  |
|**createdAt** | **Integer** | Timestamp &#x60;Account&#x60; has been created |  |
|**addresses** | [**List&lt;Accountaddress&gt;**](Accountaddress.md) |  |  [optional] |
|**timezone** | **String** |  |  [optional] |
|**website** | **String** |  |  [optional] |
|**phone** | **String** |  |  [optional] |
|**fax** | **String** |  |  [optional] |
|**language** | **String** |  |  [optional] |
|**locale** | **String** | Represents a language identifier and a region identifier |  |
|**languageId** | **Integer** | Unique identifier of the &#x60;language&#x60; that is related to the resource &#x60;Account&#x60; |  |
|**logo** | **String** |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**beta** | **Boolean** |  |  |
|**type** | **String** |  |  [optional] |
|**billing** | **Boolean** |  |  [optional] |
|**mailing** | **Boolean** |  |  [optional] |
|**billingMailing** | **Boolean** |  |  [optional] |
|**workspaceOnly** | **Boolean** |  |  [optional] |
|**noAccess** | **Boolean** |  |  [optional] |
|**isBlocked** | **Boolean** |  |  [optional] |
|**blockedAt** | **Integer** |  |  [optional] |
|**vatNumber** | **String** |  |  [optional] |
|**field1** | **String** |  |  [optional] |
|**field2** | **String** |  |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |
|**servicesAlreadyDemo** | **List&lt;String&gt;** |  |  [optional] |
|**customizationUrl** | **Object** |  |  [optional] |
|**nbInvitations** | **Integer** |  |  [optional] |
|**nbUsers** | **Integer** |  |  [optional] |



## Enum: LegalEntityTypeEnum

| Name | Value |
|---- | -----|
| COMPANY | &quot;company&quot; |
| INDIVIDUAL | &quot;individual&quot; |
| PUBLIC_BODY | &quot;public_body&quot; |
| RESTRICT | &quot;restrict&quot; |



