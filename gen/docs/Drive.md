

# Drive


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Integer** | Id of the kDrive |  |
|**name** | **String** | Name of the kDrive |  |
|**size** | **Integer** | Maximum space (in bytes) |  |
|**usedSize** | **Integer** | Used space (in bytes) |  |
|**createdAt** | **Integer** | Creation timestamp |  |
|**updatedAt** | **Integer** | Last update timestamp |  |
|**inMaintenance** | **Boolean** | When maintenance is activated |  |
|**maintenanceReason** | [**MaintenanceReasonEnum**](#MaintenanceReasonEnum) | Reason of Drive maintenance.&lt;note&gt;&lt;strong&gt;demo_end&lt;/strong&gt;: The demonstration period of the Drive has come to an end.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;invoice_overdue&lt;/strong&gt;: An invoice for this Drive is currently unpaid.&lt;/note&gt;&lt;note&gt;&lt;strong&gt;not_renew&lt;/strong&gt;: This Drive has expired and must be renewed.&lt;/note&gt; |  [optional] |
|**maintenanceAt** | **Integer** | When maintenance was activated at |  |
|**maintenanceTypes** | [**List&lt;MaintenanceType&gt;**](MaintenanceType.md) |  |  [optional] |
|**version** | **String** | Backend version |  |
|**usersCount** | **Integer** | Number of user slots used |  |
|**usersQuota** | **Integer** | Maximum number of users for this kdrive |  |
|**productId** | **Integer** | Unique id of the kDrive product |  |
|**accountId** | **Integer** | Id of the account in which the kDrive is |  |
|**account** | **String** | Account the Drive belongs to. |  [optional] |
|**expiredAt** | **Integer** | Product expiration timestamp |  |
|**isLocked** | **Boolean** | If the product is locked |  |
|**description** | **String** | Custom description of this kDrive |  [optional] |
|**billReference** | **String** | Reference used for billing |  [optional] |
|**isDemo** | **Boolean** | If the product is in free trial period |  |
|**role** | [**RoleEnum**](#RoleEnum) | Role of the current user within this kDrive |  |
|**accountAdmin** | **Boolean** | Can be managed as admin |  |
|**isInAppSubscription** | **Boolean** | Whether this drive has been purchased within an app store |  |
|**rewind** | [**Rewind**](Rewind.md) |  |  [optional] |
|**invitationsCount** | **Integer** | Number of pending invitation. |  [optional] |
|**categories** | [**List&lt;Category&gt;**](Category.md) |  |  [optional] |
|**categoriesPermissions** | [**Categorypermission**](Categorypermission.md) |  |  [optional] |
|**users** | [**Users**](Users.md) |  |  [optional] |
|**teams** | [**Teams**](Teams.md) |  |  [optional] |
|**rights** | [**Right**](Right.md) |  |  [optional] |
|**tags** | [**List&lt;Tag&gt;**](Tag.md) |  |  [optional] |
|**kSuite** | [**KSuite**](KSuite.md) |  |  [optional] |
|**capabilities** | [**Capabilities**](Capabilities.md) |  |  [optional] |
|**settings** | [**Settings**](Settings.md) |  |  [optional] |
|**preferences** | [**Preferences1**](Preferences1.md) |  |  [optional] |
|**pack** | [**PricingPlan**](PricingPlan.md) |  |  |



## Enum: MaintenanceReasonEnum

| Name | Value |
|---- | -----|
| DEMO_END | &quot;demo_end&quot; |
| INVOICE_OVERDUE | &quot;invoice_overdue&quot; |
| NOT_RENEW | &quot;not_renew&quot; |
| TECHNICAL | &quot;technical&quot; |



## Enum: RoleEnum

| Name | Value |
|---- | -----|
| ADMIN | &quot;admin&quot; |
| EXTERNAL | &quot;external&quot; |
| NONE | &quot;none&quot; |
| USER | &quot;user&quot; |



