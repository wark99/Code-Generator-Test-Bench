

# UtilitiesExtendedLinkedPropertyResponseMeters


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**gasSupplier** | **String** |  |  [optional] |
|**gasSerialNumber** | **String** |  |  [optional] |
|**gasMprn** | **String** |  |  [optional] |
|**gasPrepaymentMeter** | **Boolean** |  |  [optional] |
|**electricitySupplier** | **String** |  |  [optional] |
|**electricityMeterSerialNumber** | **String** |  |  [optional] |
|**electricityMpan** | **String** |  |  [optional] |
|**electricityPrepaymentMeter** | **Boolean** |  |  [optional] |
|**waterSupplier** | **String** |  |  [optional] |
|**waterSerialNumber** | **String** |  |  [optional] |
|**sewerageSupplier** | **String** |  |  [optional] |
|**smartMeterGas** | **Boolean** |  |  [optional] |
|**smartMeterElectricity** | **Boolean** |  |  [optional] |
|**billsIncluded** | [**BillsIncludedEnum**](#BillsIncludedEnum) | Y &#x3D; Yes, Yg &#x3D; Yes (Gas only), Ye &#x3D; Yes (electricity only), N &#x3D; No |  [optional] |
|**offPeak** | [**OffPeakEnum**](#OffPeakEnum) | 0 &#x3D; N/A, 7 &#x3D; Economy 7, 10 &#x3D; Economy 10 |  [optional] |



## Enum: BillsIncludedEnum

| Name | Value |
|---- | -----|
| Y | &quot;Y&quot; |
| YE | &quot;Ye&quot; |
| YG | &quot;Yg&quot; |
| N | &quot;N&quot; |



## Enum: OffPeakEnum

| Name | Value |
|---- | -----|
| NUMBER_0 | 0 |
| NUMBER_7 | 7 |
| NUMBER_10 | 10 |



