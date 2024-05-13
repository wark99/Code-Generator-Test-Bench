

# PatchApiClientsRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | If specified, must also include &#x60;lastName&#x60;. |  [optional] |
|**lastName** | **String** | If specified, must also include &#x60;firstName&#x60;. |  [optional] |
|**status** | **String** |  |  [optional] |
|**dateOfBirth** | **LocalDate** |  |  [optional] |
|**ssn** | **String** |  |  [optional] |
|**residentialAddress** | [**PatchApiClientsRequestResidentialAddress**](PatchApiClientsRequestResidentialAddress.md) |  |  [optional] |
|**personalEmail** | **String** |  |  [optional] |
|**homePhone** | **String** |  |  [optional] |
|**mobilePhone** | **String** |  |  [optional] |
|**medicaidNumber** | **String** |  |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**goesBy** | **String** |  |  [optional] |
|**gender** | **String** | M or F |  [optional] |
|**assessmentDate** | **String** | Date in ISO8601 format |  [optional] |
|**conversionDate** | **String** | Date in ISO8601 format |  [optional] |
|**startDate** | **String** | Date in ISO8601 format |  [optional] |
|**classes** | [**List&lt;PostApiClientsRequestClassesInner&gt;**](PostApiClientsRequestClassesInner.md) | Use code or label, both are optional but should provide one of them |  [optional] |
|**region** | **String** | Region name |  [optional] |
|**referredBy** | [**PostApiClientsRequestReferredBy**](PostApiClientsRequestReferredBy.md) |  |  [optional] |
|**preferredCaregiver** | **String** | Caregiver ID or Name in &#x60;FirstName LastName&#x60; format |  [optional] |
|**billingAddress** | [**PostApiClientsRequestBillingAddress**](PostApiClientsRequestBillingAddress.md) |  |  [optional] |
|**billingEmail** | **String** |  |  [optional] |
|**otherPhone** | **String** |  |  [optional] |
|**telephonyPhone** | **String** |  |  [optional] |
|**priorityNote** | **String** |  |  [optional] |



