

# OfferResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**property** | [**PropertyInvoiceOwnerBalancePostRequestProperty**](PropertyInvoiceOwnerBalancePostRequestProperty.md) |  |  [optional] |
|**price** | **Double** |  |  [optional] |
|**offerDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | 1 &#x3D; Pending, 2 &#x3D; Withdrawn, 3 &#x3D; Rejected, 4 &#x3D; Accepted |  [optional] |
|**id** | **Integer** |  |  [optional] |
|**buyer** | [**LinkedBuyerResponse**](LinkedBuyerResponse.md) |  |  [optional] |
|**acceptedDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**rejectedDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**withdrawnDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**includeRequirements** | **String** |  |  [optional] |
|**excludeRequirements** | **String** |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**proposedExchangedDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**created** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**updated** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**feesExcludingVat** | **Double** |  |  [optional] |
|**renegotiatedFromOffer** | [**RelatedOfferResponse**](RelatedOfferResponse.md) |  |  [optional] |
|**renegotiatedToOffer** | [**RelatedOfferResponse**](RelatedOfferResponse.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



