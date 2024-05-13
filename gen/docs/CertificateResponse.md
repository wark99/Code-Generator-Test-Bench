

# CertificateResponse


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** |  |  [optional] |
|**newCertificateInstructed** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**date** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**expiryDate** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**agencyToDo** | [**AgencyToDoEnum**](#AgencyToDoEnum) |  |  [optional] |
|**property** | [**ExtendedLinkedPropertyResponse**](ExtendedLinkedPropertyResponse.md) |  |  [optional] |
|**comments** | **String** |  |  [optional] |
|**contractor** | [**LinkedContractorResponse**](LinkedContractorResponse.md) |  |  [optional] |
|**type** | [**TypeEnum**](#TypeEnum) | 1 &#x3D; Gas safety, 2 &#x3D; EICR, 3 &#x3D; PAT, 4 &#x3D; EPC, 5 &#x3D; Fire fighting, 6 &#x3D; Smoke alarm, 7 &#x3D; Oil safety, 8 &#x3D; HMO, 9 &#x3D; Insurance, 10 &#x3D; Landlord registration, 11 &#x3D; Legionella, 12 &#x3D; Fire risk assessment, 13 &#x3D; Emergency lighting, 14 &#x3D; Carbon monoxide certificate, 15 &#x3D; Sprinkler system, 18 &#x3D; Service agreement, 20 &#x3D; Other, 21 &#x3D; Landlord gas boiler service, 22 &#x3D; Water system review, 23 &#x3D; Chimney sweep, 24 &#x3D; Smoke detector, 25 &#x3D; Heat detector, 26 &#x3D; Carbon monoxide detector, 27 &#x3D; Selective licensing, 28 &#x3D; Additional licensing |  [optional] |
|**landlordAgreedToRenew** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**landlordInformedToRenew** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**invoiceReceived** | [**MaintenancePost200ResponseValueCreatedDate**](MaintenancePost200ResponseValueCreatedDate.md) |  |  [optional] |
|**invoiceReceivedReference** | **String** |  |  [optional] |
|**owners** | [**List&lt;LinkedOwnerResponse&gt;**](LinkedOwnerResponse.md) |  |  [optional] |
|**tenants** | [**List&lt;LinkedTenantResponse&gt;**](LinkedTenantResponse.md) |  |  [optional] |



## Enum: AgencyToDoEnum

| Name | Value |
|---- | -----|
| YES | &quot;Yes&quot; |
| NO | &quot;No&quot; |
| UNKNOWN | &quot;Unknown&quot; |
| NOT_APPLICABLE | &quot;Not applicable&quot; |



## Enum: TypeEnum

| Name | Value |
|---- | -----|
| NUMBER_1 | 1 |
| NUMBER_2 | 2 |
| NUMBER_3 | 3 |
| NUMBER_4 | 4 |
| NUMBER_5 | 5 |
| NUMBER_6 | 6 |
| NUMBER_7 | 7 |
| NUMBER_8 | 8 |
| NUMBER_9 | 9 |
| NUMBER_10 | 10 |
| NUMBER_11 | 11 |
| NUMBER_12 | 12 |
| NUMBER_13 | 13 |
| NUMBER_14 | 14 |
| NUMBER_15 | 15 |
| NUMBER_18 | 18 |
| NUMBER_20 | 20 |
| NUMBER_21 | 21 |
| NUMBER_22 | 22 |
| NUMBER_23 | 23 |
| NUMBER_24 | 24 |
| NUMBER_25 | 25 |
| NUMBER_26 | 26 |
| NUMBER_27 | 27 |
| NUMBER_28 | 28 |



