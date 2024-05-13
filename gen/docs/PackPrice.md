

# PackPrice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;PackPrice&#x60; |  |
|**priceExcludingVat** | **BigDecimal** | The &#x60;PackPrice&#x60; without vat |  |
|**currency** | [**CurrencyEnum**](#CurrencyEnum) | The &#x60;PackPrice&#x60; currency |  |
|**periodicity** | [**PeriodicityEnum**](#PeriodicityEnum) | The &#x60;PackPrice&#x60; time range |  |
|**periodicityId** | [**PeriodicityIdEnum**](#PeriodicityIdEnum) | Unique identifier of the resource &#x60;Periodicity&#x60; |  |



## Enum: CurrencyEnum

| Name | Value |
|---- | -----|
| CHF | &quot;CHF&quot; |
| EUR | &quot;EUR&quot; |



## Enum: PeriodicityEnum

| Name | Value |
|---- | -----|
| MONTH | &quot;MONTH&quot; |
| YEAR | &quot;YEAR&quot; |



## Enum: PeriodicityIdEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |



