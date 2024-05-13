

# PropertySalesIdMarketingGet200ResponseValuePriceInformation


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**councilTaxBand** | **String** |  |  [optional] |
|**pricePerUnitArea** | **Integer** |  |  [optional] |
|**domesticRates** | **Double** | Domestic rate for property. |  [optional] |
|**salePrice** | **Double** |  |  [optional] |
|**priceQualifier** | [**PriceQualifierEnum**](#PriceQualifierEnum) | 1 &#x3D; POA, 2 &#x3D; Guide price, 3 &#x3D; Fixed price, 4 &#x3D; Offers in excess of, 5 &#x3D; OIRO, 6 &#x3D; Sale by tender, 7 &#x3D; From, 9 &#x3D; Shared ownership, 10 &#x3D; Offers over, 11 &#x3D; Part buy part rent, 12 &#x3D; Shared equity, 0 &#x3D; Default |  [optional] |
|**tenureType** | [**TenureTypeEnum**](#TenureTypeEnum) | Freehold, Leasehold, Feudal, Commonhold, Share of Freehold |  [optional] |
|**tenureExpirationDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**serviceCharge** | **Double** |  |  [optional] |
|**serviceChargeReviewPeriod** | **Integer** |  |  [optional] |
|**groundRent** | **Double** |  |  [optional] |
|**groundRentReviewPeriod** | **Integer** |  |  [optional] |



## Enum: PriceQualifierEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_0 | 0 |



## Enum: TenureTypeEnum

| Name | Value |
|---- | -----|
| FREEHOLD | &quot;Freehold&quot; |
| LEASEHOLD | &quot;Leasehold&quot; |
| FEUDAL | &quot;feudal&quot; |
| COMMON_HOLD | &quot;common_hold&quot; |
| SHARE_OF_FREEHOLD | &quot;share_of_freehold&quot; |



