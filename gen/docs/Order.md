

# Order


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Long** |  |  [optional] |
|**productId** | **Long** |  |  [optional] |
|**totalAmount** | **Integer** |  |  [optional] |
|**date** | **OffsetDateTime** |  |  [optional] |
|**status** | [**StatusEnum**](#StatusEnum) | Order Status |  [optional] |
|**complete** | **Boolean** |  |  [optional] |



## Enum: StatusEnum

| Name | Value |
|---- | -----|
| PLACED | &quot;placed&quot; |
| APPROVED | &quot;approved&quot; |
| DELIVERED | &quot;delivered&quot; |



