

# Drivepackprice


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**type** | [**TypeEnum**](#TypeEnum) | Drive pack price type, Base: standard price, User : Additional user price, Storage_giga : Additional storage price |  |
|**unit** | **Integer** | Unity of additional type |  |
|**period** | **Integer** | Price by months |  |
|**currencyId** | **Integer** | Currency identifier |  |
|**amountExclVat** | **BigDecimal** | Price without the tax |  |
|**amountInclVat** | **BigDecimal** | Price with the tax |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| BASE | &quot;base&quot; |
| STORAGE_GIGA | &quot;storage_giga&quot; |
| USER | &quot;user&quot; |



