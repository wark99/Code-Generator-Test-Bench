

# PostApiCaregiversRequest


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**firstName** | **String** |  |  |
|**lastName** | **String** |  |  |
|**ssn** | **BigDecimal** |  |  [optional] |
|**startDate** | **LocalDate** |  |  [optional] |
|**terminationDate** | **LocalDate** |  |  [optional] |
|**classes** | [**List&lt;PostApiCaregiversRequestClassesInner&gt;**](PostApiCaregiversRequestClassesInner.md) | If not a full class object, either a &#x60;code&#x60; or &#x60;label&#x60; can be supplied and the corresponding class will be associated. |  [optional] |
|**mailingAddress** | [**PostApiCaregiversRequestMailingAddress**](PostApiCaregiversRequestMailingAddress.md) |  |  [optional] |
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



