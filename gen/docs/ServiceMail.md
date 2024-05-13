

# ServiceMail


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Ressource identifier   |  [optional] |
|**accountId** | **Integer** | Account id   |  [optional] |
|**serviceId** | **Integer** | Service id   |  [optional] |
|**serviceName** | **String** | Service name   |  [optional] |
|**customerName** | **String** | Customer name   |  [optional] |
|**internalName** | **String** | Internal name   |  [optional] |
|**createdAt** | **Integer** | Created at timestamp   |  [optional] |
|**expiredAt** | **Integer** | Expired at timestamp   |  [optional] |
|**hasMaintenance** | **Boolean** | Maintenance   |  [optional] |
|**isLocked** | **Boolean** | Locked   |  [optional] |
|**tags** | **Object** |  |  [optional] |
|**uniqueId** | **Integer** | Unique id   |  [optional] |
|**description** | **String** | Description   |  [optional] |
|**isFree** | **Boolean** | Is free   |  [optional] |
|**isZeroPrice** | **Boolean** | Is zero price   |  [optional] |
|**rights** | [**DomainRights**](DomainRights.md) |  |  [optional] |
|**hasOperationInProgress** | **Boolean** | Operation in progress  **This field is provided only if you have set with&#x3D;operation_in_progress** |  [optional] |
|**mainFqdn** | **String** | Fully qualified domain name   |  [optional] |
|**mainFqdnIdn** | **String** | Fully qualified domain name, internationalized domain name   |  [optional] |
|**billReference** | **String** | Bill reference   |  [optional] |
|**billPeriodicity** | **Integer** | Bill periodicity   |  [optional] |
|**quota** | **Integer** | Quota  **This field is provided only if you have set with&#x3D;quota** |  [optional] |
|**used** | **Integer** | Used  **This field is provided only if you have set with&#x3D;quota** |  [optional] |
|**total** | **Integer** | Total  **This field is provided only if you have set with&#x3D;quota** |  [optional] |
|**diagnosticDns** | [**MailDiagnosticDns**](MailDiagnosticDns.md) |  |  [optional] |
|**pack** | [**MailPack**](MailPack.md) |  |  [optional] |
|**limit** | [**Limit**](Limit.md) |  |  [optional] |



