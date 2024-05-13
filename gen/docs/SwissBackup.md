

# SwissBackup


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Swiss Backup&#x60; |  |
|**accountId** | **Integer** | Unique identifier of the &#x60;account&#x60; that is related to the resource &#x60;Swiss Backup&#x60; |  |
|**serviceId** | **Integer** | Unique identifier of the &#x60;service&#x60; that is related to the resource &#x60;Swiss Backup&#x60; |  |
|**serviceName** | **String** | Name of the service |  |
|**customerName** | **String** | Customer name of the resource &#x60;Swiss Backup&#x60; |  |
|**internalName** | **String** |  |  |
|**createdAt** | **Integer** | Timestamp &#x60;Swiss Backup&#x60; has been created |  |
|**expiredAt** | **Integer** | Timestamp &#x60;Swiss Backup&#x60; has expired |  |
|**deletedAt** | **Integer** | Timestamp &#x60;Swiss Backup&#x60; has been deleted |  [optional] |
|**version** | **Integer** |  |  |
|**hasMaintenance** | **Boolean** | Does the resource &#x60;Swiss Backup&#x60; have a maintenance mode enabled? |  |
|**isLocked** | **Boolean** | Is the resource &#x60;Swiss Backup&#x60; locked? |  |
|**hasOperationInProgress** | **Boolean** | Does the resource &#x60;Swiss Backup&#x60; have an operation in progress ? |  |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  |
|**uniqueId** | **Integer** | Unique identifier of the resource &#x60;Swiss Backup&#x60; |  |
|**description** | **String** | Description of the resource &#x60;Swiss Backup&#x60; |  [optional] |
|**billReference** | **String** |  |  [optional] |
|**isFree** | **Boolean** | Does the resource &#x60;Swiss Backup&#x60; have a free price status? |  |
|**isZeroPrice** | **Boolean** | Does the resource &#x60;Swiss Backup&#x60; have a zero price status? |  |
|**isTrial** | **Boolean** | Does the resource &#x60;Swiss Backup&#x60; have a trial status? |  |
|**rights** | [**Right**](Right.md) |  |  |
|**parentId** | **Integer** |  |  [optional] |
|**parentServiceId** | **Integer** |  |  [optional] |
|**parentServiceName** | **String** |  |  [optional] |
|**status** | [**Productstatus**](Productstatus.md) |  |  [optional] |
|**users** | [**List&lt;ProductUser&gt;**](ProductUser.md) |  |  [optional] |
|**admin** | **String** | Acronis administrator details |  [optional] |
|**fqdn** | **String** |  |  [optional] |
|**nbSlots** | **Integer** | Total number of slots (Acronis &amp; Free storage) |  |
|**maxSlots** | **Integer** | Total number of authorized slots (Acronis &amp; Free storage) |  |
|**nbUnallocatedSlots** | **Integer** |  |  |
|**nbUnallocatedMobileWorkstation** | **Integer** |  |  |
|**size** | **Integer** | Total storage size of the Swiss Backup product (Bytes) |  |
|**sizeFreeStorage** | **Integer** | Allocated storage size for the free storage (Bytes) |  [optional] |
|**isDemo** | **String** | True if the product is a trial |  |
|**isMigrated** | **String** | True if the backup is an old FTP backup |  |
|**newInterface** | **String** | True if the product has the new interface |  |
|**accountName** | **String** | Account name |  |
|**storageReserved** | **Integer** | Allocated storage size (Bytes) |  |
|**storageReservedFreeStorage** | **Integer** | Allocated storage size for free storage slots (Bytes) |  [optional] |
|**storageReservedAcronis** | **Integer** | Allocated storage size for Acronis (Bytes) |  [optional] |
|**periodicity** | **Integer** | Commitment period (in years) |  [optional] |
|**promo** | **Integer** | Promotion percentage |  [optional] |
|**dueAt** | **Integer** | Contract end date |  [optional] |
|**hasBeenDemo** | **String** | True if the product has been a trial |  [optional] |
|**storageUsedFreeStorage** | **Integer** | Used storage size by free storage slots (Bytes) |  [optional] |
|**storageUsed** | **Integer** | Used storage size by free storage slots or Acronis backups (Bytes) |  [optional] |
|**maxSlotsFreeStorage** | **Integer** | Maximum number of free storage slots allowed |  [optional] |
|**maxSlotsServer** | **Integer** | Maximum number of Acronis server licences allowed |  [optional] |
|**maxSlotsVirtual** | **Integer** | Maximum number of Acronis virtual machine licences allowed |  [optional] |
|**maxSlotsWorkstation** | **Integer** | Maximum number of Acronis workstation licences allowed |  [optional] |
|**maxSlotsMobile** | **Integer** | Maximum number of Acronis mobile licences allowed |  [optional] |
|**nbSlotsFreeStorage** | **Integer** | Number of free storage slots |  [optional] |
|**nbSlotsServer** | **Integer** | Number of Acronis server licences |  [optional] |
|**nbSlotsVirtual** | **Integer** | Number of Acronis virtual machine licences |  [optional] |
|**nbSlotsWorkstation** | **Integer** | Number of Acronis workstation licences |  [optional] |
|**nbSlotsMobile** | **Integer** | Number of Acronis mobile licences |  [optional] |
|**ipSKey** | **String** | IPS identifier |  [optional] |



