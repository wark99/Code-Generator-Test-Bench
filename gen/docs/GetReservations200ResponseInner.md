

# GetReservations200ResponseInner


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | System generated unique ID for a reservation |  [optional] |
|**externalIds** | **Object** | One or more reference IDs for a reservation. Uniqueness is not guarenteed. |  [optional] |
|**checkinDate** | **Object** | Start of stay reservation |  [optional] |
|**checkoutDate** | **Object** | End of stay reservation |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of reservation |  [optional] |
|**numAdults** | **Object** | Total number of adults on the reservation |  [optional] |
|**numChildren** | **Object** | Total number of children on the reservation |  [optional] |
|**payments** | **Object** |  |  [optional] |
|**roomTypes** | [**List&lt;RoomTypeSummary&gt;**](RoomTypeSummary.md) | Rooms booked on the reservation |  [optional] |
|**guests** | [**List&lt;GuestSummary&gt;**](GuestSummary.md) | Collection of guests on the reservation |  [optional] |
|**additionalData** | [**List&lt;GetReservations200ResponseInnerAllOfAdditionalDataInner&gt;**](GetReservations200ResponseInnerAllOfAdditionalDataInner.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONFIRMED | &quot;CONFIRMED&quot; |
| CHECKED_IN | &quot;CHECKED_IN&quot; |
| EMPTY | &quot;&quot; |



