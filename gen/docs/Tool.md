

# Tool


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Id of tool |  [optional] |
|**name** | **String** | Name of tool |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | Yype of tool |  [optional] |
|**totalCycles** | **Integer** | Total cycles count of tool |  [optional] |
|**usedCavities** | **Integer** | Tool used cavities |  [optional] |
|**availableCavities** | **Integer** | Tool available cavities |  [optional] |
|**producedParts** | [**List&lt;ToolProducedPartsInner&gt;**](ToolProducedPartsInner.md) | Array of produced parts |  [optional] |
|**ownerCompany** | **Company** |  |  [optional] |
|**operatingPlant** | **Plant** |  |  [optional] |
|**inHouse** | **Boolean** |  |  [optional] |
|**cretaedAt** | **OffsetDateTime** | Tool creation date |  [optional] |
|**commissioningDate** | **OffsetDateTime** | Tool commissioning date |  [optional] |
|**targetCycleTime** | **Double** |  |  [optional] |
|**matixData** | [**ToolMatixData**](ToolMatixData.md) |  |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| PLASTIC_INJECTION | &quot;plastic_injection&quot; |
| METAL_STAMPING | &quot;metal_stamping&quot; |
| DIE_CASTING | &quot;die_casting&quot; |
| THERMOFORMING | &quot;thermoforming&quot; |



