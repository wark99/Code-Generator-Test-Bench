

# RadioProduct


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**product** | **String** |  |  |
|**price** | **BigDecimal** | The &#x60;RadioProduct&#x60; price |  |
|**overquotaAt** | **Integer** |  |  |
|**lockedAt** | **Integer** | Timestamp &#x60;RadioProduct&#x60; has been locked |  |
|**isLocked** | **Boolean** | Is the resource &#x60;RadioProduct&#x60; locked? |  |
|**hasMaintenance** | **Boolean** | Does the resource &#x60;RadioProduct&#x60; have a maintenance mode enabled? |  |
|**maxStation** | **Integer** | The max &#x60;Station&#x60; can be created |  |
|**pack** | [**Pack**](Pack.md) |  |  [optional] |
|**packPrice** | [**PackPrice**](PackPrice.md) |  |  [optional] |
|**options** | **String** |  |  [optional] |
|**stations** | [**List&lt;Station446a80a0&gt;**](Station446a80a0.md) |  |  [optional] |
|**countStations** | **Integer** |  |  [optional] |
|**listeners** | **Integer** | The number of currently listeners listen all &#x60;Stream&#x60; |  |
|**monthlyConsumption** | **Integer** | The current monthly consumption (Byte) |  [optional] |
|**status** | **List&lt;String&gt;** | The status of the &#x60;RadioProduct&#x60; |  |
|**rights** | **List&lt;String&gt;** | The rights of the &#x60;RadioProduct&#x60; |  |
|**packs** | [**List&lt;Pack&gt;**](Pack.md) |  |  [optional] |
|**updatedAt** | **Integer** | Timestamp &#x60;RadioProduct&#x60; has been updated |  |



