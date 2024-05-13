

# Accounts

Accounts are most often used to represent a hierarchy of colleges, schools, departments, campuses.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The ID of the Account object. |  |
|**name** | **Object** | The display name of the account. |  [optional] |
|**deletedAt** | **Object** | Timestamp of when the account was deleted. Will only ever be NULL for end customers. |  [optional] |
|**parentAccountId** | **Object** | The account&#39;s parent ID, or NULL if this is the root account. |  [optional] |
|**currentSisBatchId** | **Object** | The ID of the currently processing SIS (Student Information System) batch (if submitted via UI, not API). |  [optional] |
|**storageQuota** | **Object** | The storage quote for the account, in megabytes. |  [optional] |
|**defaultStorageQuota** | **Object** | The storage quota for children accounts in megabytes, if not otherwise specified. |  [optional] |
|**defaultLocale** | **Object** | Language for the account. |  [optional] |
|**defaultUserStorageQuota** | **Object** | The default storage quota for users in the account in megabytes, if not otherwise specified. |  [optional] |
|**defaultGroupStorageQuota** | **Object** | The storage quota for a group in the account in megabytes, if not otherwise specified. |  [optional] |
|**integrationId** | **Object** | The account&#39;s identifier in the Student Information System. |  [optional] |
|**ltiContextId** | **Object** | UUID of the Canvas context in LTI standard. Secondary ID for this context, could be used in API to identify resource as well. |  [optional] |
|**consortiumParentAccountId** | **Object** | The root account of the consortium account, if this root account is part of a consortium. |  [optional] |
|**courseTemplateId** | **Object** | The course selected as a template for new courses created in this account. 0 if a template should not be used, nor inherited. |  [optional] |
|**createdAt** | **Object** | Timestamp of when the account was created. |  |
|**updatedAt** | **Object** | Timestamp of when the account was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | Life-cycle state for account. |  |
|**defaultTimeZone** | **Object** | The default time zone of the account. Allowed time zones are [IANA time zones](https://www.iana.org/time-zones) or friendlier [Ruby on Rails time zones](https://api.rubyonrails.org/classes/ActiveSupport/TimeZone.html). |  [optional] |
|**uuid** | **Object** | The UUID of the account. |  [optional] |
|**sisSourceId** | **Object** | Correlated id for the record for this course in the SIS system (assuming SIS integration is configured) |  [optional] |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| DELETED | &quot;deleted&quot; |
| SUSPENDED | &quot;suspended&quot; |



