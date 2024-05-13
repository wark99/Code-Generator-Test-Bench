

# ReservationSummary


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **String** | System generated unique ID for a reservation |  [optional] |
|**externalIds** | [**List&lt;ExternalReservationID&gt;**](ExternalReservationID.md) | One or more reference IDs for a reservation. Uniqueness is not guarenteed. |  [optional] |
|**checkinDate** | **OffsetDateTime** | Start of stay reservation |  [optional] |
|**checkoutDate** | **OffsetDateTime** | End of stay reservation |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Status of reservation |  [optional] |
|**numAdults** | **Integer** | Total number of adults on the reservation |  [optional] |
|**numChildren** | **Integer** | Total number of children on the reservation |  [optional] |
|**payments** | [**List&lt;ReservationSummaryPaymentsInner&gt;**](ReservationSummaryPaymentsInner.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| CONFIRMED | &quot;CONFIRMED&quot; |
| CHECKED_IN | &quot;CHECKED_IN&quot; |
| EMPTY | &quot;&quot; |



