

# ContractorResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**name** | **String** |  |  [optional] |
|**contactName** | **String** |  |  [optional] |
|**callingName** | **String** |  |  [optional] |
|**website** | **String** |  |  [optional] |
|**preferred** | **Boolean** |  |  [optional] |
|**contactDetails** | **String** |  |  [optional] |
|**contact** | [**ContractorContactResponse**](ContractorContactResponse.md) |  |  [optional] |
|**addresses** | [**List&lt;ContractorAddressResponse&gt;**](ContractorAddressResponse.md) |  |  [optional] |
|**gasSafetyRegisterNumber** | **String** |  |  [optional] |
|**vatRegistrationNumber** | **String** |  |  [optional] |
|**companyNumber** | **String** |  |  [optional] |
|**companyType** | [**CompanyTypeEnum**](#CompanyTypeEnum) |  |  [optional] |
|**insurance** | [**List&lt;ContractorInsuranceResponseInner&gt;**](ContractorInsuranceResponseInner.md) |  |  [optional] |
|**created** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**updated** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**services** | [**List&lt;LinkedServiceResponse&gt;**](LinkedServiceResponse.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| APPROVED | &quot;Approved&quot; |
| NOT_APPROVED | &quot;Not approved&quot; |
| LANDLORD_CONTRACTOR | &quot;Landlord contractor&quot; |
| PAST_CONTRACTOR | &quot;Past contractor&quot; |



## Enum: CompanyTypeEnum

| Name | Value |
|---- | -----|
| SOLE_TRADER | &quot;Sole trader&quot; |
| PARTNERSHIP | &quot;Partnership&quot; |
| LIMITED_LIABILITY_PARTNERSHIP | &quot;Limited liability partnership&quot; |
| LIMITED_COMPANY | &quot;Limited company&quot; |
| PUBLIC_LIMITED_COMPANY | &quot;Public limited company&quot; |
| CO_OPERATIVE | &quot;Co-operative&quot; |
| COMMUNITY_INTEREST_COMPANY | &quot;Community interest company&quot; |
| UNINCORPORATED_ASSOCIATION | &quot;Unincorporated association&quot; |
| CHARITY | &quot;Charity&quot; |
| CHARITABLE_INCORPORATED_ORGANISATION | &quot;Charitable incorporated organisation&quot; |



