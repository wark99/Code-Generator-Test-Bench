

# CreateUserScheme


## Properties

| Name | Type | Description | Notes |
|------------ | ------------- | ------------- | -------------|
|**companyId** | [**CompanyId**](CompanyId.md) |  |  [optional] |
|**name** | **String** | user name |  |
|**email** | **String** | user email |  |
|**phone** | **String** | user phone |  |
|**password** | **String** | user password |  |
|**role** | **UserRole** | user role   * 0 - Superadmin     * 1 - Administrator     * 2 - Operator     * 3 - User     * 4 - Partner    |  |
|**locale** | **String** | user language in the system |  [optional] |
|**tz** | **String** | time zone of the user in the system |  [optional] |
|**status** | **StatusUser** | user status (1 - Inactive, 2 - New, 3 - Active) |  |



