

# LogicalServer

This model represents a logical server, could be a main server or a VM.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**serverId** | **Integer** |  |  |
|**name** | **String** | Name of the resource &#x60;LogicalServer&#x60; |  |
|**description** | **String** | Description of the resource &#x60;LogicalServer&#x60; |  |
|**type** | [**TypeEnum**](#TypeEnum) |  |  |
|**cpu** | **Integer** | count of allowed CPU |  |
|**ram** | **Integer** | quantity of allowed RAM |  |
|**ipv4** | **String** |  |  |
|**ipv6** | **String** |  |  |
|**parentId** | **Integer** |  |  |
|**parentEquipment** | [**EquipmentServer**](EquipmentServer.md) |  |  [optional] |
|**createdAt** | **Integer** | Timestamp &#x60;LogicalServer&#x60; has been created |  |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| DMU | &quot;DMU&quot; |
| IMU | &quot;IMU&quot; |
| NAS | &quot;NAS&quot; |
| NMU | &quot;NMU&quot; |
| NTU | &quot;NTU&quot; |
| OS | &quot;OS&quot; |
| VMU | &quot;VMU&quot; |
| VNU | &quot;VNU&quot; |
| XEN | &quot;XEN&quot; |
| XENMU | &quot;XENMU&quot; |



