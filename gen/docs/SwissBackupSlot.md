

# SwissBackupSlot


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;Swiss Backup Slot&#x60; |  |
|**customerName** | **String** | Customer name of the resource &#x60;Swiss Backup Slot&#x60; |  |
|**type** | **String** | Type of the resource &#x60;Swiss Backup Slot&#x60; |  |
|**subtype** | **String** | Slot subtype (Arconis or Openstack Swift) |  |
|**connectionType** | **String** | Slot connection type (Swift, S3, FTP) |  |
|**size** | **Integer** | Total storage size of the Swiss Backup product (Bytes) |  |
|**storageUsed** | **Integer** | Used storage size by free storage slots or Acronis backups (Bytes) |  |
|**usageLastCheck** | **Integer** | Date of the last data update |  |
|**createdAt** | **Integer** | Timestamp &#x60;Swiss Backup Slot&#x60; has been created |  |
|**lockedAt** | **Integer** | Slot lock date |  |
|**locked** | **Boolean** | True if the slot is locked |  |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  |
|**lang** | **Integer** | Language identifier (1 &#x3D; fr / 2 &#x3D; en / 3 &#x3D; de / 4 &#x3D; it / 5 &#x3D; es) |  |
|**activateNotifications** | **Boolean** | True if the user wants to receive Acronis notifications |  |
|**unitAdmin** | **Boolean** |  |  |
|**username** | **String** | Acronis administrator username |  |
|**endpoint** | **String** | Endpoint for the slot connection |  |
|**ipSKey** | **String** | IPS identifier |  [optional] |
|**email** | **String** | Email |  [optional] |
|**slotName** | **String** | Slot name |  [optional] |
|**tenantName** | **String** | Swift connection tenant name |  [optional] |
|**domainName** | **String** | Swift connection domain name |  [optional] |
|**containerName** | **String** | Slot container name (optional) |  [optional] |
|**directory** | **String** | Slot default directory (optional) |  [optional] |
|**config** | **String** |  |  [optional] |
|**parent** | **Object** |  |  [optional] |



