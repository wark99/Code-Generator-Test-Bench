

# Product


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Product&#x60; |  |
|**accountId** | **Integer** | Unique identifier of the &#x60;account&#x60; that is related to the resource &#x60;Product&#x60; |  |
|**serviceId** | **Integer** | Unique identifier of the &#x60;service&#x60; that is related to the resource &#x60;Product&#x60; |  |
|**serviceName** | **String** | Name of the service |  |
|**customerName** | **String** | Customer name of the resource &#x60;Product&#x60; |  |
|**internalName** | **String** |  |  |
|**createdAt** | **Integer** | Timestamp &#x60;Product&#x60; has been created |  |
|**expiredAt** | **Integer** | Timestamp &#x60;Product&#x60; has expired |  |
|**deletedAt** | **Integer** | Timestamp &#x60;Product&#x60; has been deleted |  [optional] |
|**version** | **Integer** |  |  |
|**hasMaintenance** | **Boolean** | Does the resource &#x60;Product&#x60; have a maintenance mode enabled? |  |
|**isLocked** | **Boolean** | Is the resource &#x60;Product&#x60; locked? |  |
|**hasOperationInProgress** | **Boolean** | Does the resource &#x60;Product&#x60; have an operation in progress ? |  |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  |
|**uniqueId** | **Integer** | Unique identifier of the resource &#x60;Product&#x60; |  |
|**description** | **String** | Description of the resource &#x60;Product&#x60; |  [optional] |
|**billReference** | **String** |  |  [optional] |
|**isFree** | **Boolean** | Does the resource &#x60;Product&#x60; have a free price status? |  |
|**isZeroPrice** | **Boolean** | Does the resource &#x60;Product&#x60; have a zero price status? |  |
|**isTrial** | **Boolean** | Does the resource &#x60;Product&#x60; have a trial status? |  |
|**rights** | [**Right**](Right.md) |  |  |
|**parentId** | **Integer** |  |  [optional] |
|**parentServiceId** | **Integer** |  |  [optional] |
|**parentServiceName** | **String** |  |  [optional] |
|**status** | [**Productstatus**](Productstatus.md) |  |  [optional] |
|**users** | [**List&lt;ProductUser&gt;**](ProductUser.md) |  |  [optional] |
|**admin** | [**ProductAdminUser**](ProductAdminUser.md) |  |  [optional] |
|**isManagedByPartner** | **Boolean** |  |  [optional] |



