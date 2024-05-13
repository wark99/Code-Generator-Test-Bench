

# PropertyPropertyIdMeterReadingPostRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**date** | [**DateRequest**](DateRequest.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | 1 &#x3D; Gas (MOVE OUT), 2 &#x3D; Gas (MOVE IN), 3 &#x3D; Electricity TOTAL RATE (MOVE OUT), 4 &#x3D; Electricity TOTAL RATE (MOVE IN), 5 &#x3D; Electricity R2 LOW RATE (MOVE OUT), 6 &#x3D; Electricity R2 LOW RATE (MOVE IN), 7 &#x3D; Electricity R1 NORMAL RATE (MOVE OUT), 8 &#x3D; Electricity R1 NORMAL RATE (MOVE IN), 9 &#x3D; Electricity R1 NORMAL RATE (OTHER READING), 10 &#x3D; Electricity  R2 LOW RATE (OTHER READING), 11 &#x3D; Electricity TOTAL RATE (OTHER READINGS), 12 &#x3D; Gas (OTHER READING), 13 &#x3D; Water (MOVE IN), 14 &#x3D; Water (MOVE OUT), 15 &#x3D; Water (OTHER READING) |  [optional] |
|**meterReading** | **Integer** | The value of the meter. |  [optional] |
|**description** | **String** | Any extra information pertaining to the reading. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |



