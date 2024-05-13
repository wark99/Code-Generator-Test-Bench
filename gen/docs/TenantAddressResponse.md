

# TenantAddressResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | 1 &#x3D; Pre tenancy, 2 &#x3D; Work, 3 &#x3D; Other, 4 &#x3D; Forwarding, 5 &#x3D; Correspondence, 6 &#x3D; Post tenancy address |  [optional] |
|**postcode** | **String** |  |  [optional] |
|**addressLineOne** | **String** |  |  [optional] |
|**addressLineTwo** | **String** |  |  [optional] |
|**addressLineThree** | **String** |  |  [optional] |
|**addressLineFour** | **String** |  |  [optional] |
|**town** | **String** |  |  [optional] |
|**county** | **String** |  |  [optional] |
|**country** | **String** |  |  [optional] |
|**currentAddress** | **Boolean** |  |  [optional] |
|**yearsAtAddress** | **String** |  |  [optional] |
|**monthsAtAddress** | **String** |  |  [optional] |
|**approximateMoveInDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**approximateMoveOutDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |



