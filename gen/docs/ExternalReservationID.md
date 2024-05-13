

# ExternalReservationID

Alternate reference IDs for the reservation. Uniqueness of this reference number is not guarenteed

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) |  |  [optional] |
|**source** | **String** | Reference to the source of external ID |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| EXTERNAL_ID | &quot;EXTERNAL_ID&quot; |
| CONFIRMATION_ID | &quot;CONFIRMATION_ID&quot; |
| CRS_ID | &quot;CRS_ID&quot; |
| OTA_ID | &quot;OTA_ID&quot; |



