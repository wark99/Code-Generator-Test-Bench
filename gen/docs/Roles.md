

# Roles

Roles have a few implicit permissions and a large set of default permissions, which can be customized with RoleOverrides.

## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**id** | **Object** | The unique identifier for a user role record. |  |
|**name** | **Object** | The name of the role. |  |
|**deletedAt** | **Object** | Timestamp when this record was deleted. If the record has not been deleted the value will be NULL. |  [optional] |
|**createdAt** | **Object** | Timestamp of when a roles record was created. |  |
|**updatedAt** | **Object** | Timestamp of when a roles record was updated. |  |
|**workflowState** | [**WorkflowStateEnum**](#WorkflowStateEnum) | The state of the role. |  |
|**accountId** | **Object** | Points to the account associated with the course. Could be Canvas root account or sub-account ID. |  [optional] |
|**baseRoleType** | [**BaseRoleTypeEnum**](#BaseRoleTypeEnum) | The role type that is being used as a base for this role. For account-level roles, this is &#x60;AccountMembership&#x60;. For course-level roles, it is an enrollment type. |  |



## Enum: WorkflowStateEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACTIVE | &quot;active&quot; |
| BUILT_IN | &quot;built_in&quot; |
| DELETED | &quot;deleted&quot; |
| INACTIVE | &quot;inactive&quot; |



## Enum: BaseRoleTypeEnum

| Name | Value |
|---- | -----|
| __DAP_UNSPECIFIED__ | &quot;__dap_unspecified__&quot; |
| ACCOUNTADMIN | &quot;AccountAdmin&quot; |
| ACCOUNTMEMBERSHIP | &quot;AccountMembership&quot; |
| DESIGNERENROLLMENT | &quot;DesignerEnrollment&quot; |
| NOPERMISSIONS | &quot;NoPermissions&quot; |
| OBSERVERENROLLMENT | &quot;ObserverEnrollment&quot; |
| STUDENTENROLLMENT | &quot;StudentEnrollment&quot; |
| TAENROLLMENT | &quot;TaEnrollment&quot; |
| TEACHERENROLLMENT | &quot;TeacherEnrollment&quot; |



