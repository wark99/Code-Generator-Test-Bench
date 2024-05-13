

# Stat


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**userId** | **Integer** |  |  |
|**type** | [**TypeEnum**](#TypeEnum) | A descriptor for what this recorded stat is. |  |
|**timestamp** | **Integer** | Time at which the stat was recorded. |  |
|**unit** | [**UnitEnum**](#UnitEnum) | The unit for this stat\&quot;s value. |  |
|**value** | **BigDecimal** | The value recorded in this stat. |  |
|**exerciseId** | **Integer** | If this stat is associated with an exercise, this is the id of said exercise. Otherwise, null. |  [optional] |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| ONE_RM | &quot;ONE_RM&quot; |



## Enum: UnitEnum

| Name | Value |
|---- | -----|
| LBS | &quot;LBS&quot; |
| KG | &quot;KG&quot; |



