

# EquipmentServer


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Unique identifier of the resource &#x60;EquipmentServer&#x60; |  |
|**serialNumber** | **String** |  |  |
|**name** | **String** | Name of equipment |  |
|**type** | **String** | Type of equipment |  |
|**status** | **String** | Status of equipment |  |
|**createdAt** | **Integer** | Date of creation |  |
|**hardwareModel** | [**HardwareModel**](HardwareModel.md) |  |  [optional] |
|**specification** | **List&lt;String&gt;** |  |  [optional] |
|**ancestors** | [**List&lt;EquipmentBase&gt;**](EquipmentBase.md) |  |  [optional] |
|**description** | **String** | Description of the resource &#x60;EquipmentServer&#x60; |  [optional] |
|**serialNumber2** | **String** | Some equipments have 2 SN |  [optional] |
|**order** | **String** | Order details |  [optional] |
|**tags** | [**List&lt;EquipmentTag&gt;**](EquipmentTag.md) |  |  [optional] |
|**rootName** | **String** | Name of datacenter |  |
|**rackName** | **String** | Name of installed rack if is in production |  |
|**rackId** | **Integer** | Id of installed rack if is in production |  |
|**position** | **String** |  |  |
|**size** | **String** | Size of server on rack (1U,2U) |  |
|**components** | **Object** |  |  [optional] |
|**networkInfos** | [**PhysicalServer**](PhysicalServer.md) |  |  [optional] |
|**interfaces** | **String** |  |  [optional] |



