

# TeamMember


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**teamId** | **String** | The ID of the team this member belongs to. |  [optional] |
|**userId** | **String** | The ID of the user this member relates to. |  [optional] |
|**roles** | **String** | The complete list of roles assigned to this team member, as a space-separated list of role names, including any roles granted implicitly through permissions schemes. |  [optional] |
|**deleteAt** | **Integer** | The time in milliseconds that this team member was deleted. |  [optional] |
|**schemeUser** | **Boolean** | Whether this team member holds the default user role defined by the team&#39;s permissions scheme. |  [optional] |
|**schemeAdmin** | **Boolean** | Whether this team member holds the default admin role defined by the team&#39;s permissions scheme. |  [optional] |
|**explicitRoles** | **String** | The list of roles explicitly assigned to this team member, as a space separated list of role names. This list does *not* include any roles granted implicitly through permissions schemes. |  [optional] |



