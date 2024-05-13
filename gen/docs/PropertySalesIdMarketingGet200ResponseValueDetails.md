

# PropertySalesIdMarketingGet200ResponseValueDetails


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**furnishedType** | [**FurnishedTypeEnum**](#FurnishedTypeEnum) | Y &#x3D; Yes, N &#x3D; No, P &#x3D; Part, A &#x3D; Any |  [optional] |
|**summary** | **String** |  |  [optional] |
|**description** | **String** |  |  [optional] |
|**bedrooms** | **Integer** |  |  [optional] |
|**bedroomsSingle** | **Integer** |  |  [optional] |
|**bedroomsDouble** | **Integer** |  |  [optional] |
|**bedroomsTwin** | **Integer** |  |  [optional] |
|**bedroomsBox** | **Integer** |  |  [optional] |
|**bathrooms** | **Integer** |  |  [optional] |
|**receptionRooms** | **Integer** |  |  [optional] |
|**parking** | [**ParkingEnum**](#ParkingEnum) | S &#x3D; Street, z &#x3D; Zone, P &#x3D; Private, D &#x3D; Driveway, G &#x3D; Garage, E &#x3D; None, N/A &#x3D; N/A, X &#x3D; Not specified |  [optional] |
|**outsideSpace** | [**OutsideSpaceEnum**](#OutsideSpaceEnum) | N &#x3D; Not specified, S &#x3D; Shared, P &#x3D; Private, E &#x3D; None |  [optional] |
|**yearBuilt** | **Integer** |  |  [optional] |
|**entranceFloor** | [**EntranceFloorEnum**](#EntranceFloorEnum) | lower basement &#x3D; Lower basement, basement &#x3D; Basement, ground floor &#x3D; Ground floor, main door &#x3D; Main door, 1st-floor &#x3D; 1st-floor, 2nd-floor &#x3D; 2nd-floor, 3rd-floor &#x3D; 3rd-floor, 4th-floor &#x3D; 4th-floor, 5th-floor &#x3D; 5th-floor, 6th-floor &#x3D; 6th-floor, 7th-floor &#x3D; 7th-floor, 8th-floor &#x3D; 8th-floor, 9th-floor &#x3D; 9th-floor, 10th-floor &#x3D; 10th-floor, 11th-floor &#x3D; 11th-floor, 12th-floor &#x3D; 12th-floor, 13th-floor &#x3D; 13th-floor, 14th-floor &#x3D; 14th-floor, 15th-floor &#x3D; 15th-floor, 16th-floor &#x3D; 16th-floor, 17th-floor &#x3D; 17th-floor, 18th-floor &#x3D; 18th-floor, 19th-floor &#x3D; 19th-floor, 20th-floor &#x3D; 20th-floor, 21st-floor &#x3D; 21st-floor, 22nd-floor &#x3D; 22st-floor, 23rd-floor &#x3D; 23rd-floor, 24th-floor &#x3D; 24th-floor, 25th-floor &#x3D; 25th-floor, 26th-floor &#x3D; 26th-floor, 27th-floor &#x3D; 27th-floor, 28th-floor &#x3D; 28th-floor, 29th-floor &#x3D; 29th-floor, 30th-floor &#x3D; 30th-floor, Top-floor &#x3D; Top-floor, N/A &#x3D; N/A |  [optional] |
|**heating** | [**HeatingEnum**](#HeatingEnum) | a &#x3D; Do not know, y &#x3D; Gas Central Heating, w &#x3D; White Meter Heating, e &#x3D; Electric Central Heating, m &#x3D; Warm Air Central Heating, o &#x3D; Oil Fired Heating, g &#x3D; Gas Fired Heating, s &#x3D; Solid Fuel Heating, p &#x3D; Panel Heating, h &#x3D; Electric Heaters, u &#x3D; Underfloor Heating, z &#x3D; Night Storage Heating |  [optional] |
|**rooms** | [**List&lt;PropertyMarketingRoomsResponse&gt;**](PropertyMarketingRoomsResponse.md) |  |  [optional] |
|**featuredRooms** | [**PropertySalesIdMarketingGet200ResponseValueDetailsFeaturedRooms**](PropertySalesIdMarketingGet200ResponseValueDetailsFeaturedRooms.md) |  |  [optional] |
|**buildingStyle** | [**BuildingStyleEnum**](#BuildingStyleEnum) | X &#x3D; Not specified, T &#x3D; Traditional, O &#x3D; Other, M &#x3D; Modern, N &#x3D; Building, V &#x3D; Vintage, H &#x3D; Historical, S &#x3D; Stylish, C &#x3D; Cottage, P &#x3D; Contemporary |  [optional] |
|**epcCurrent** | **String** | EPC rating or U for unknown |  [optional] |
|**parkingSpaces** | **Integer** |  |  [optional] |
|**featured** | **Boolean** |  |  [optional] |
|**featuredOnSlider** | **Boolean** |  |  [optional] |
|**internalArea** | **Double** |  |  [optional] |
|**internalAreaUnit** | [**InternalAreaUnitEnum**](#InternalAreaUnitEnum) | 1 &#x3D; ft², 2 &#x3D; m², 3 &#x3D; acre, 4 &#x3D; hectares |  [optional] |
|**premiumFeatured** | **Boolean** |  |  [optional] |
|**websitePropertyLink** | **String** |  |  [optional] |
|**landArea** | **Integer** |  |  [optional] |
|**features** | **List&lt;String&gt;** |  |  [optional] |



## Enum: FurnishedTypeEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| N | &quot;N&quot; |
| P | &quot;P&quot; |
| A | &quot;A&quot; |



## Enum: ParkingEnum

| Name | Value |
|---- | -----|
| S | &quot;S&quot; |
| Z | &quot;z&quot; |
| P | &quot;P&quot; |
| D | &quot;D&quot; |
| G | &quot;G&quot; |
| E | &quot;E&quot; |
| N_A | &quot;N/A&quot; |
| X | &quot;X&quot; |



## Enum: OutsideSpaceEnum

| Name | Value |
|---- | -----|
| N | &quot;N&quot; |
| S | &quot;S&quot; |
| P | &quot;P&quot; |
| E | &quot;E&quot; |



## Enum: EntranceFloorEnum

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



## Enum: HeatingEnum

| Name | Value |
|---- | -----|
| A | &quot;a&quot; |
| Y | &quot;y&quot; |
| W | &quot;w&quot; |
| E | &quot;e&quot; |
| M | &quot;m&quot; |
| O | &quot;o&quot; |
| G | &quot;g&quot; |
| S | &quot;s&quot; |
| P | &quot;p&quot; |
| H | &quot;h&quot; |
| U | &quot;u&quot; |
| Z | &quot;z&quot; |



## Enum: BuildingStyleEnum

| Name | Value |
|---- | -----|
| X | &quot;X&quot; |
| T | &quot;T&quot; |
| O | &quot;O&quot; |
| M | &quot;M&quot; |
| N | &quot;N&quot; |
| V | &quot;V&quot; |
| H | &quot;H&quot; |
| S | &quot;S&quot; |
| C | &quot;C&quot; |
| P | &quot;P&quot; |



## Enum: InternalAreaUnitEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |



