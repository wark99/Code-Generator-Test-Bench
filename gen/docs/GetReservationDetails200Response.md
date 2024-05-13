

# GetReservationDetails200Response


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
|**roomTypes** | [**List&lt;RoomType&gt;**](RoomType.md) | Rooms booked on the reservation |  [optional] |
|**guests** | [**List&lt;GuestSummary&gt;**](GuestSummary.md) | Collection of guests on the reservation |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONFIRMED | &quot;CONFIRMED&quot; |
| CHECKED_IN | &quot;CHECKED_IN&quot; |
| EMPTY | &quot;&quot; |



