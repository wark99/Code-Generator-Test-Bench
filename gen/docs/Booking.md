

# Booking


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**ref** | **String** |  |  [optional] |
|**studentId** | **Integer** |  |  [optional] |
|**studentName** | **String** |  |  [optional] |
|**organiserId** | **Integer** |  |  [optional] |
|**organiserName** | **String** |  |  [optional] |
|**classId** | **Integer** |  |  [optional] |
|**className** | **String** |  |  [optional] |
|**zoomId** | **String** |  |  [optional] |
|**zoomPassword** | **String** |  |  [optional] |
|**teacherName** | **String** |  |  [optional] |
|**venueName** | **String** |  |  [optional] |
|**net** | **Integer** |  |  [optional] |
|**gross** | **Integer** |  |  [optional] |
|**balance** | **Integer** |  |  [optional] |
|**credit** | **Integer** |  |  [optional] |
|**paymentMethod** | [**PaymentMethodEnum**](#PaymentMethodEnum) |  |  [optional] |
|**paymentMethodLabel** | **String** |  |  [optional] |
|**priceType** | **String** |  |  [optional] |
|**nextSession** | **OffsetDateTime** |  |  [optional] |
|**nextSessionEndsAt** | **OffsetDateTime** |  |  [optional] |
|**lastSession** | **OffsetDateTime** |  |  [optional] |
|**processingPaymentsCount** | **Integer** |  |  [optional] |
|**successfulPaymentsCount** | **Integer** |  |  [optional] |
|**sessions** | [**List&lt;BookingSession&gt;**](BookingSession.md) |  |  [optional] |
|**propertyClass** | [**ModelClass**](ModelClass.md) |  |  [optional] |



## Enum: PaymentMethodEnum

| Name | Value |
|---- | -----|
| CARD | &quot;card&quot; |
| SUBSCRIPTION | &quot;subscription&quot; |



