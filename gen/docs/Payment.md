

# Payment


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**paymentDate** | **OffsetDateTime** |  |  [optional] |
|**amount** | **Integer** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) |  |  [optional] |
|**organiserName** | **String** |  |  [optional] |
|**booking** | [**Booking**](Booking.md) |  |  [optional] |
|**order** | [**Order**](Order.md) |  |  [optional] |
|**student** | [**Student**](Student.md) |  |  [optional] |
|**subscription** | [**Subscription**](Subscription.md) |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| SUCCESSFUL | &quot;Successful&quot; |
| FAILED | &quot;Failed&quot; |
| REFUNDED | &quot;Refunded&quot; |



