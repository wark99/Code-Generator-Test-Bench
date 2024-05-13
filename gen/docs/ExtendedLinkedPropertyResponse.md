

# ExtendedLinkedPropertyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**managementType** | [**ManagementTypeEnum**](#ManagementTypeEnum) | 1 &#x3D; Managed let, 2 &#x3D; Let only, 3 &#x3D; Estate agency, 4 &#x3D; Short term let, 5 &#x3D; STL advertising, 6 &#x3D; Booking only, 7 &#x3D; STL Key holding, 9 &#x3D; Rental potential purchase, 10 &#x3D; Advertising only, 11 &#x3D; Lease only, 12 &#x3D; Rent collection, 13 &#x3D; Key holding, 15 &#x3D; Inspection only, 20 &#x3D; Block management, 30 &#x3D; Guaranteed rent |  [optional] |
|**primaryStatus** | [**PrimaryStatusEnum**](#PrimaryStatusEnum) | If management_type is not 3:  1 &#x3D; Void: general, 2 &#x3D; Unoccupied on market, 3 &#x3D; Occupied on market, 4 &#x3D; Tenant check period, 5 &#x3D; Await tenant move in, 6 &#x3D; Occupied, 7 &#x3D; Past property, 8 &#x3D; Notice given: not on market, 10 &#x3D; Eviction, 11 &#x3D; Pending: new property, 20 &#x3D; Occupied: pre let, 21 &#x3D; Occupied: on hold, 22 &#x3D; Occupied: pending withdrawal, 30 &#x3D; Unoccupied: pre let, 31 &#x3D; Unoccupied: on hold, 32 &#x3D; Unoccupied: pending withdrawal, 40 &#x3D; Void: in development, 41 &#x3D; Void: in refurbishment, 42 &#x3D; Void: in maintenance, 43 &#x3D; Awaiting tenant checks, 44 &#x3D; Awaiting lease.\\If management_type is 3:  0 &#x3D; Occupied on market, 1 &#x3D; Sold STC, 2 &#x3D; Sold STCM, 3 &#x3D; Under offer, 4 &#x3D; Reserved, 7 &#x3D; Past property, 8 &#x3D; Pending, 12 &#x3D; Viewings on hold, 20 &#x3D; Enquiry, 21 &#x3D; Exchanged, 22 &#x3D; Unoccupied on market, 23 &#x3D; Unoccupied off-market sale, 24 &#x3D; Occupied off-market sale. |  [optional] |
|**secondaryStatus** | **Integer** |  |  [optional] |
|**address** | [**PropertyAddressResponse**](PropertyAddressResponse.md) |  |  [optional] |
|**internalReference** | **String** |  |  [optional] |



## Enum: ManagementTypeEnum

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
| NUMBER_13 | 13 |
| NUMBER_15 | 15 |
| NUMBER_20 | 20 |
| NUMBER_30 | 30 |



## Enum: PrimaryStatusEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_20 | 20 |
| NUMBER_21 | 21 |
| NUMBER_22 | 22 |
| NUMBER_23 | 23 |
| NUMBER_24 | 24 |
| NUMBER_30 | 30 |
| NUMBER_31 | 31 |
| NUMBER_32 | 32 |
| NUMBER_40 | 40 |
| NUMBER_41 | 41 |
| NUMBER_42 | 42 |
| NUMBER_43 | 43 |
| NUMBER_44 | 44 |



