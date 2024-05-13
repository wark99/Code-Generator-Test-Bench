

# PropertyResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**managementType** | [**ManagementTypeEnum**](#ManagementTypeEnum) | 1 &#x3D; Managed let, 2 &#x3D; Let only, 3 &#x3D; Estate agency, 4 &#x3D; Short term let, 5 &#x3D; STL advertising, 6 &#x3D; Booking only, 7 &#x3D; STL Key holding, 9 &#x3D; Rental potential purchase, 10 &#x3D; Advertising only, 11 &#x3D; Lease only, 12 &#x3D; Rent collection, 13 &#x3D; Key holding, 15 &#x3D; Inspection only, 20 &#x3D; Block management, 30 &#x3D; Guaranteed rent |  [optional] |
|**primaryStatus** | [**PrimaryStatusEnum**](#PrimaryStatusEnum) | If management_type is not 3:  1 &#x3D; Void: general, 2 &#x3D; Unoccupied on market, 3 &#x3D; Occupied on market, 4 &#x3D; Tenant check period, 5 &#x3D; Await tenant move in, 6 &#x3D; Occupied, 7 &#x3D; Past property, 8 &#x3D; Notice given: not on market, 10 &#x3D; Eviction, 11 &#x3D; Pending: new property, 20 &#x3D; Occupied: pre let, 21 &#x3D; Occupied: on hold, 22 &#x3D; Occupied: pending withdrawal, 30 &#x3D; Unoccupied: pre let, 31 &#x3D; Unoccupied: on hold, 32 &#x3D; Unoccupied: pending withdrawal, 40 &#x3D; Void: in development, 41 &#x3D; Void: in refurbishment, 42 &#x3D; Void: in maintenance, 43 &#x3D; Awaiting tenant checks, 44 &#x3D; Awaiting lease.\\If management_type is 3:  0 &#x3D; Occupied on market, 1 &#x3D; Sold STC, 2 &#x3D; Sold STCM, 3 &#x3D; Under offer, 4 &#x3D; Reserved, 7 &#x3D; Past property, 8 &#x3D; Pending, 12 &#x3D; Viewings on hold, 20 &#x3D; Enquiry, 21 &#x3D; Exchanged, 22 &#x3D; Unoccupied on market, 23 &#x3D; Unoccupied off-market sale, 24 &#x3D; Occupied off-market sale. |  [optional] |
|**secondaryStatus** | **Integer** |  |  [optional] |
|**address** | [**PropertyAddressResponse**](PropertyAddressResponse.md) |  |  [optional] |
|**inspectionRoute** | **Integer** |  |  [optional] |
|**accommodationType** | [**AccommodationTypeEnum**](#AccommodationTypeEnum) | F &#x3D; Flat/Apartment, S &#x3D; Studio, H &#x3D; Detached House, SH &#x3D; Semi Detached House, TH &#x3D; Terraced House, T &#x3D; Town House, M &#x3D; Mews, B &#x3D; Bungalow, P &#x3D; Penthouse, SA &#x3D; Serviced Apartment, D &#x3D; Double Upper, I &#x3D; Single Room, J &#x3D; Double Room, V &#x3D; Villa, C &#x3D; Cottage, G &#x3D; Garage, Q &#x3D; Parking Space, CA1 &#x3D; Commercial 1, CA2 &#x3D; Commercial 2, CA3 &#x3D; Commercial 3, CA4 &#x3D; Commercial 4, CA5 &#x3D; Commercial 5, CA6 &#x3D; Commercial 6, CA7 &#x3D; Commercial 7, CA8 &#x3D; Commercial 8, CA9 &#x3D; Commercial 9, CA10 &#x3D; Commercial 10, CA11 &#x3D; Commercial 11, COT &#x3D; Commercial other, Land &#x3D; Land, N &#x3D; Unknown, ETH &#x3D; End of Terrace, GM &#x3D; Grand Maisonette, MA &#x3D; Maisonette, TB &#x3D; Terraced Bungalow, MH &#x3D; Mobile Home, BC &#x3D; Barn Conversion, SHH &#x3D; Sheltered Housing, RP &#x3D; Retirement Property, FH &#x3D; Farm House, BN &#x3D; Barn, HB &#x3D; House Boat, BF &#x3D; Block of flats |  [optional] |
|**situate** | [**SituateEnum**](#SituateEnum) | lower basement &#x3D; Lower basement, basement &#x3D; Basement, ground floor &#x3D; Ground floor, main door &#x3D; Main door, 1st-floor &#x3D; 1st-floor, 2nd-floor &#x3D; 2nd-floor, 3rd-floor &#x3D; 3rd-floor, 4th-floor &#x3D; 4th-floor, 5th-floor &#x3D; 5th-floor, 6th-floor &#x3D; 6th-floor, 7th-floor &#x3D; 7th-floor, 8th-floor &#x3D; 8th-floor, 9th-floor &#x3D; 9th-floor, 10th-floor &#x3D; 10th-floor, 11th-floor &#x3D; 11th-floor, 12th-floor &#x3D; 12th-floor, 13th-floor &#x3D; 13th-floor, 14th-floor &#x3D; 14th-floor, 15th-floor &#x3D; 15th-floor, 16th-floor &#x3D; 16th-floor, 17th-floor &#x3D; 17th-floor, 18th-floor &#x3D; 18th-floor, 19th-floor &#x3D; 19th-floor, 20th-floor &#x3D; 20th-floor, 21st-floor &#x3D; 21st-floor, 22nd-floor &#x3D; 22st-floor, 23rd-floor &#x3D; 23rd-floor, 24th-floor &#x3D; 24th-floor, 25th-floor &#x3D; 25th-floor, 26th-floor &#x3D; 26th-floor, 27th-floor &#x3D; 27th-floor, 28th-floor &#x3D; 28th-floor, 29th-floor &#x3D; 29th-floor, 30th-floor &#x3D; 30th-floor, Top-floor &#x3D; Top-floor, N/A &#x3D; N/A |  [optional] |
|**typeOfLet** | [**TypeOfLetEnum**](#TypeOfLetEnum) | L &#x3D; Long term, S &#x3D; Short term &lt; 6 months, B &#x3D; Long or short term, F &#x3D; Edinburgh festival |  [optional] |
|**availabilityDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**keyFobReference** | **String** |  |  [optional] |
|**keyHookNumber** | **Integer** |  |  [optional] |
|**bedrooms** | **Integer** |  |  [optional] |
|**bathrooms** | **Integer** |  |  [optional] |
|**tenants** | [**List&lt;LinkedTenantResponse&gt;**](LinkedTenantResponse.md) |  |  [optional] |
|**owners** | [**List&lt;LinkedOwnerResponse&gt;**](LinkedOwnerResponse.md) |  |  [optional] |
|**created** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**updated** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**instructedDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**advertisedRent** | **Double** |  |  [optional] |
|**leadTenant** | **String** |  |  [optional] |
|**salePrice** | **Double** |  |  [optional] |
|**internalReference** | **String** |  |  [optional] |
|**branch** | [**InspectionAppointmentResponseType**](InspectionAppointmentResponseType.md) |  |  [optional] |
|**authorisationLimit** | **Double** |  |  [optional] |
|**actualExchangeDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**actualCompletionDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |



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



## Enum: AccommodationTypeEnum

| Name | Value |
|---- | -----|
| F | &quot;F&quot; |
| S | &quot;S&quot; |
| H | &quot;H&quot; |
| SH | &quot;SH&quot; |
| TH | &quot;TH&quot; |
| T | &quot;T&quot; |
| M | &quot;M&quot; |
| B | &quot;B&quot; |
| P | &quot;P&quot; |
| SA | &quot;SA&quot; |
| D | &quot;D&quot; |
| I | &quot;I&quot; |
| J | &quot;J&quot; |
| V | &quot;V&quot; |
| C | &quot;C&quot; |
| G | &quot;G&quot; |
| Q | &quot;Q&quot; |
| CA1 | &quot;CA1&quot; |
| CA2 | &quot;CA2&quot; |
| CA3 | &quot;CA3&quot; |
| CA4 | &quot;CA4&quot; |
| CA5 | &quot;CA5&quot; |
| CA6 | &quot;CA6&quot; |
| CA7 | &quot;CA7&quot; |
| CA8 | &quot;CA8&quot; |
| CA9 | &quot;CA9&quot; |
| CA10 | &quot;CA10&quot; |
| CA11 | &quot;CA11&quot; |
| COT | &quot;COT&quot; |
| LAND | &quot;Land&quot; |
| N | &quot;N&quot; |
| ETH | &quot;ETH&quot; |
| GM | &quot;GM&quot; |
| MA | &quot;MA&quot; |
| TB | &quot;TB&quot; |
| MH | &quot;MH&quot; |
| BC | &quot;BC&quot; |
| SHH | &quot;SHH&quot; |
| RP | &quot;RP&quot; |
| FH | &quot;FH&quot; |
| BN | &quot;BN&quot; |
| HB | &quot;HB&quot; |
| BF | &quot;BF&quot; |



## Enum: SituateEnum

| Name | Value |
|---- | -----|
| LOWER_BASEMENT | &quot;lower basement&quot; |
| BASEMENT | &quot;basement&quot; |
| GROUND_FLOOR | &quot;ground floor&quot; |
| MAIN_DOOR | &quot;main door&quot; |
| _1ST_FLOOR | &quot;1st-floor&quot; |
| _2ND_FLOOR | &quot;2nd-floor&quot; |
| _3RD_FLOOR | &quot;3rd-floor&quot; |
| _4TH_FLOOR | &quot;4th-floor&quot; |
| _5TH_FLOOR | &quot;5th-floor&quot; |
| _6TH_FLOOR | &quot;6th-floor&quot; |
| _7TH_FLOOR | &quot;7th-floor&quot; |
| _8TH_FLOOR | &quot;8th-floor&quot; |
| _9TH_FLOOR | &quot;9th-floor&quot; |
| _10TH_FLOOR | &quot;10th-floor&quot; |
| _11TH_FLOOR | &quot;11th-floor&quot; |
| _12TH_FLOOR | &quot;12th-floor&quot; |
| _13TH_FLOOR | &quot;13th-floor&quot; |
| _14TH_FLOOR | &quot;14th-floor&quot; |
| _15TH_FLOOR | &quot;15th-floor&quot; |
| _16TH_FLOOR | &quot;16th-floor&quot; |
| _17TH_FLOOR | &quot;17th-floor&quot; |
| _18TH_FLOOR | &quot;18th-floor&quot; |
| _19TH_FLOOR | &quot;19th-floor&quot; |
| _20TH_FLOOR | &quot;20th-floor&quot; |
| _21ST_FLOOR | &quot;21st-floor&quot; |
| _22ND_FLOOR | &quot;22nd-floor&quot; |
| _23RD_FLOOR | &quot;23rd-floor&quot; |
| _24TH_FLOOR | &quot;24th-floor&quot; |
| _25TH_FLOOR | &quot;25th-floor&quot; |
| _26TH_FLOOR | &quot;26th-floor&quot; |
| _27TH_FLOOR | &quot;27th-floor&quot; |
| _28TH_FLOOR | &quot;28th-floor&quot; |
| _29TH_FLOOR | &quot;29th-floor&quot; |
| _30TH_FLOOR | &quot;30th-floor&quot; |
| TOP_FLOOR | &quot;Top-floor&quot; |
| N_A | &quot;N/A&quot; |



## Enum: TypeOfLetEnum

| Name | Value |
|---- | -----|
| L | &quot;L&quot; |
| S | &quot;S&quot; |
| B | &quot;B&quot; |
| F | &quot;F&quot; |



