

# PatchApiCaregiversCaregiverIdRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** | If specified, must also include &#x60;lastName&#x60;. |  [optional] |
|**lastName** | **String** | If specified, must also include &#x60;firstName&#x60;. |  [optional] |
|**ssn** | **BigDecimal** |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**terminationDate** | **LocalDate** |  |  [optional] |
|**classes** | [**List&lt;PatchApiCaregiversCaregiverIdRequestClassesInner&gt;**](PatchApiCaregiversCaregiverIdRequestClassesInner.md) | When set on an update, specify the entire set of classes that should be associated with a caregiver.  If a full class object can&#39;t be supplied, either a &#x60;code&#x60; or &#x60;label&#x60; can be supplied and the corresponding class will be associated. |  [optional] |
|**mailingAddress** | [**PatchApiCaregiversCaregiverIdRequestMailingAddress**](PatchApiCaregiversCaregiverIdRequestMailingAddress.md) |  |  [optional] |
|**personalEmail** | **String** |  |  [optional] |
|**mobilePhone** | **String** |  |  [optional] |
|**goesBy** | **String** |  |  [optional] |
|**gender** | **String** | M or F |  [optional] |
|**dateOfBirth** | **String** | Date in &#x60;YYYY-MM-DD&#x60; format |  [optional] |
|**status** | **String** | Status name |  [optional] |
|**hireDate** | **String** | Date in ISO8601 format |  [optional] |
|**region** | **String** | Region name |  [optional] |
|**referredBy** | [**PostApiClientsRequestReferredBy**](PostApiClientsRequestReferredBy.md) |  |  [optional] |
|**payrollId** | **String** |  |  [optional] |
|**homePhone** | **String** |  |  [optional] |
|**applicationDate** | **String** | Date in ISO8601 format |  [optional] |
|**interviewDate** | **String** | Date in ISO8601 format |  [optional] |
|**externalId** | **String** |  |  [optional] |
|**ethnicity** | **String** |  |  [optional] |
|**otherPhone** | **String** |  |  [optional] |
|**driverLicenseNumber** | **String** |  |  [optional] |



