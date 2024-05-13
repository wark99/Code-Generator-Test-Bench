# UsersApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autocompleteUsers**](UsersApi.md#autocompleteUsers) | **GET** /users/autocomplete | Autocomplete users |
| [**getChannelMembersWithTeamDataForUser**](UsersApi.md#getChannelMembersWithTeamDataForUser) | **GET** /users/{user_id}/channel_members | Get all channel members for a user |
| [**getDefaultProfileImage**](UsersApi.md#getDefaultProfileImage) | **GET** /users/{user_id}/image/default | Return user&#39;s default (generated) profile image |
| [**getProfileImage**](UsersApi.md#getProfileImage) | **GET** /users/{user_id}/image | Get user&#39;s profile image |
| [**getUser**](UsersApi.md#getUser) | **GET** /users/{user_id} | Get a user |
| [**getUserByEmail**](UsersApi.md#getUserByEmail) | **GET** /users/email/{email} | Get a user by email |
| [**getUserByUsername**](UsersApi.md#getUserByUsername) | **GET** /users/username/{username} | Get a user by username |
| [**getUsers**](UsersApi.md#getUsers) | **GET** /users | Get users |
| [**getUsersByGroupChannelIds**](UsersApi.md#getUsersByGroupChannelIds) | **POST** /users/group_channels | Get users by group channels ids |
| [**getUsersByIds**](UsersApi.md#getUsersByIds) | **POST** /users/ids | Get users by ids |
| [**getUsersByUsernames**](UsersApi.md#getUsersByUsernames) | **POST** /users/usernames | Get users by usernames |
| [**patchUser**](UsersApi.md#patchUser) | **PUT** /users/{user_id}/patch | Patch a user |
| [**searchUsers**](UsersApi.md#searchUsers) | **POST** /users/search | Search users |
| [**updateUserRoles**](UsersApi.md#updateUserRoles) | **PUT** /users/{user_id}/roles | Update a user&#39;s roles |



## autocompleteUsers

> UserAutocomplete autocompleteUsers(name, teamId, channelId, limit)

Autocomplete users

Get a list of users for the purpose of autocompleting based on the provided search term. Specify a combination of &#x60;team_id&#x60; and &#x60;channel_id&#x60; to filter results further. ##### Permissions Requires an active session and &#x60;view_team&#x60; and &#x60;read_channel&#x60; on any teams or channels used to filter the results further. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String name = "name_example"; // String | Username, nickname first name or last name
        String teamId = "teamId_example"; // String | Team ID
        String channelId = "channelId_example"; // String | Channel ID
        Integer limit = 100; // Integer | The maximum number of users to return in each subresult  __Defaults to `100` if not provided.__ 
        try {
            UserAutocomplete result = apiInstance.autocompleteUsers(name, teamId, channelId, limit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#autocompleteUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **name** | **String**| Username, nickname first name or last name | |
| **teamId** | **String**| Team ID | [optional] |
| **channelId** | **String**| Channel ID | [optional] |
| **limit** | **Integer**| The maximum number of users to return in each subresult  __Defaults to &#x60;100&#x60; if not provided.__  | [optional] [default to 100] |

### Return type

[**UserAutocomplete**](UserAutocomplete.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User autocomplete successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getChannelMembersWithTeamDataForUser

> List&lt;ChannelMemberWithTeamData&gt; getChannelMembersWithTeamDataForUser(userId, page, pageSize)

Get all channel members for a user

Get all channel members for a user.  ##### Permissions Logged in as the user, or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        Integer page = 56; // Integer | Page specifies which part of the results to return, by PageSize.
        Integer pageSize = 56; // Integer | PageSize specifies the size of the returned chunk of results.
        try {
            List<ChannelMemberWithTeamData> result = apiInstance.getChannelMembersWithTeamDataForUser(userId, page, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getChannelMembersWithTeamDataForUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| The ID of the user. This can also be \&quot;me\&quot; which will point to the current user. | |
| **page** | **Integer**| Page specifies which part of the results to return, by PageSize. | [optional] |
| **pageSize** | **Integer**| PageSize specifies the size of the returned chunk of results. | [optional] |

### Return type

[**List&lt;ChannelMemberWithTeamData&gt;**](ChannelMemberWithTeamData.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s uploads retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## getDefaultProfileImage

> File getDefaultProfileImage(userId)

Return user&#39;s default (generated) profile image

Returns the default (generated) user profile image based on user_id string parameter. ##### Permissions Must be logged in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        try {
            File result = apiInstance.getDefaultProfileImage(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getDefaultProfileImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| User GUID | |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/png, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Default profile image |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **501** |  |  -  |


## getProfileImage

> File getProfileImage(userId, u)

Get user&#39;s profile image

Get a user&#39;s profile image based on user_id string parameter. ##### Permissions Must be logged in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        BigDecimal u = new BigDecimal(78); // BigDecimal | Not used by the server. Clients can pass in the last picture update time of the user to potentially take advantage of caching
        try {
            File result = apiInstance.getProfileImage(userId, u);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getProfileImage");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| User GUID | |
| **u** | **BigDecimal**| Not used by the server. Clients can pass in the last picture update time of the user to potentially take advantage of caching | [optional] |

### Return type

[**File**](File.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: image/png, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s profile image |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |
| **501** |  |  -  |


## getUser

> User getUser(userId)

Get a user

Get a user a object. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | User GUID. This can also be \"me\" which will point to the current user.
        try {
            User result = apiInstance.getUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| User GUID. This can also be \&quot;me\&quot; which will point to the current user. | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## getUserByEmail

> User getUserByEmail(email)

Get a user by email

Get a user object by providing a user email. Sensitive information will be sanitized out. ##### Permissions Requires an active session and for the current session to be able to view another user&#39;s email based on the server&#39;s privacy settings. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String email = "email_example"; // String | User Email
        try {
            User result = apiInstance.getUserByEmail(email);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUserByEmail");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **email** | **String**| User Email | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getUserByUsername

> User getUserByUsername(username)

Get a user by username

Get a user object by providing a username. Sensitive information will be sanitized out. ##### Permissions Requires an active session but no other permissions. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String username = "username_example"; // String | Username
        try {
            User result = apiInstance.getUserByUsername(username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUserByUsername");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **username** | **String**| Username | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## getUsers

> List&lt;User&gt; getUsers(page, perPage, inTeam, notInTeam, inChannel, notInChannel, inGroup, groupConstrained, withoutTeam, active, inactive, role, sort, roles, channelRoles, teamRoles)

Get users

Get a page of a list of users. Based on query string parameters, select users from a team, channel, or select users not in a specific channel.  Some basic sorting is available using the &#x60;sort&#x60; query parameter. Sorting is currently only supported when selecting users on a team. ##### Permissions Requires an active session and (if specified) membership to the channel or team being selected from. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of users per page. There is a maximum limit of 200 users per page.
        String inTeam = "inTeam_example"; // String | The ID of the team to get users for.
        String notInTeam = "notInTeam_example"; // String | The ID of the team to exclude users for. Must not be used with \"in_team\" query parameter.
        String inChannel = "inChannel_example"; // String | The ID of the channel to get users for.
        String notInChannel = "notInChannel_example"; // String | The ID of the channel to exclude users for. Must be used with \"in_channel\" query parameter.
        String inGroup = "inGroup_example"; // String | The ID of the group to get users for. Must have `manage_system` permission.
        Boolean groupConstrained = true; // Boolean | When used with `not_in_channel` or `not_in_team`, returns only the users that are allowed to join the channel or team based on its group constrains.
        Boolean withoutTeam = true; // Boolean | Whether or not to list users that are not on any team. This option takes precendence over `in_team`, `in_channel`, and `not_in_channel`.
        Boolean active = true; // Boolean | Whether or not to list only users that are active. This option cannot be used along with the `inactive` option.
        Boolean inactive = true; // Boolean | Whether or not to list only users that are deactivated. This option cannot be used along with the `active` option.
        String role = "role_example"; // String | Returns users that have this role.
        String sort = "sort_example"; // String | Sort is only available in conjunction with certain options below. The paging parameter is also always available.  ##### `in_team` Can be \"\", \"last_activity_at\" or \"create_at\". When left blank, sorting is done by username. ##### `in_channel` Can be \"\", \"status\". When left blank, sorting is done by username. `status` will sort by User's current status (Online, Away, DND, Offline), then by Username. 
        String roles = "roles_example"; // String | Comma separated string used to filter users based on any of the specified system roles  Example: `?roles=system_admin,system_user` will return users that are either system admins or system users  
        String channelRoles = "channelRoles_example"; // String | Comma separated string used to filter users based on any of the specified channel roles, can only be used in conjunction with `in_channel`  Example: `?in_channel=4eb6axxw7fg3je5iyasnfudc5y&channel_roles=channel_user` will return users that are only channel users and not admins or guests  
        String teamRoles = "teamRoles_example"; // String | Comma separated string used to filter users based on any of the specified team roles, can only be used in conjunction with `in_team`  Example: `?in_team=4eb6axxw7fg3je5iyasnfudc5y&team_roles=team_user` will return users that are only team users and not admins or guests  
        try {
            List<User> result = apiInstance.getUsers(page, perPage, inTeam, notInTeam, inChannel, notInChannel, inGroup, groupConstrained, withoutTeam, active, inactive, role, sort, roles, channelRoles, teamRoles);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of users per page. There is a maximum limit of 200 users per page. | [optional] [default to 60] |
| **inTeam** | **String**| The ID of the team to get users for. | [optional] |
| **notInTeam** | **String**| The ID of the team to exclude users for. Must not be used with \&quot;in_team\&quot; query parameter. | [optional] |
| **inChannel** | **String**| The ID of the channel to get users for. | [optional] |
| **notInChannel** | **String**| The ID of the channel to exclude users for. Must be used with \&quot;in_channel\&quot; query parameter. | [optional] |
| **inGroup** | **String**| The ID of the group to get users for. Must have &#x60;manage_system&#x60; permission. | [optional] |
| **groupConstrained** | **Boolean**| When used with &#x60;not_in_channel&#x60; or &#x60;not_in_team&#x60;, returns only the users that are allowed to join the channel or team based on its group constrains. | [optional] |
| **withoutTeam** | **Boolean**| Whether or not to list users that are not on any team. This option takes precendence over &#x60;in_team&#x60;, &#x60;in_channel&#x60;, and &#x60;not_in_channel&#x60;. | [optional] |
| **active** | **Boolean**| Whether or not to list only users that are active. This option cannot be used along with the &#x60;inactive&#x60; option. | [optional] |
| **inactive** | **Boolean**| Whether or not to list only users that are deactivated. This option cannot be used along with the &#x60;active&#x60; option. | [optional] |
| **role** | **String**| Returns users that have this role. | [optional] |
| **sort** | **String**| Sort is only available in conjunction with certain options below. The paging parameter is also always available.  ##### &#x60;in_team&#x60; Can be \&quot;\&quot;, \&quot;last_activity_at\&quot; or \&quot;create_at\&quot;. When left blank, sorting is done by username. ##### &#x60;in_channel&#x60; Can be \&quot;\&quot;, \&quot;status\&quot;. When left blank, sorting is done by username. &#x60;status&#x60; will sort by User&#39;s current status (Online, Away, DND, Offline), then by Username.  | [optional] |
| **roles** | **String**| Comma separated string used to filter users based on any of the specified system roles  Example: &#x60;?roles&#x3D;system_admin,system_user&#x60; will return users that are either system admins or system users   | [optional] |
| **channelRoles** | **String**| Comma separated string used to filter users based on any of the specified channel roles, can only be used in conjunction with &#x60;in_channel&#x60;  Example: &#x60;?in_channel&#x3D;4eb6axxw7fg3je5iyasnfudc5y&amp;channel_roles&#x3D;channel_user&#x60; will return users that are only channel users and not admins or guests   | [optional] |
| **teamRoles** | **String**| Comma separated string used to filter users based on any of the specified team roles, can only be used in conjunction with &#x60;in_team&#x60;  Example: &#x60;?in_team&#x3D;4eb6axxw7fg3je5iyasnfudc5y&amp;team_roles&#x3D;team_user&#x60; will return users that are only team users and not admins or guests   | [optional] |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User page retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getUsersByGroupChannelIds

> GetUsersByGroupChannelIds200Response getUsersByGroupChannelIds(requestBody)

Get users by group channels ids

Get an object containing a key per group channel id in the query and its value as a list of users members of that group channel.  The user must be a member of the group ids in the query, or they will be omitted from the response. ##### Permissions Requires an active session but no other permissions.  

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | List of group channel ids
        try {
            GetUsersByGroupChannelIds200Response result = apiInstance.getUsersByGroupChannelIds(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsersByGroupChannelIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of group channel ids | |

### Return type

[**GetUsersByGroupChannelIds200Response**](GetUsersByGroupChannelIds200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## getUsersByIds

> List&lt;User&gt; getUsersByIds(requestBody, since)

Get users by ids

Get a list of users based on a provided list of user ids. ##### Permissions Requires an active session but no other permissions. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | List of user ids
        Integer since = 56; // Integer | Only return users that have been modified since the given Unix timestamp (in milliseconds).  
        try {
            List<User> result = apiInstance.getUsersByIds(requestBody, since);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsersByIds");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of user ids | |
| **since** | **Integer**| Only return users that have been modified since the given Unix timestamp (in milliseconds).   | [optional] |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## getUsersByUsernames

> List&lt;User&gt; getUsersByUsernames(requestBody)

Get users by usernames

Get a list of users based on a provided list of usernames. ##### Permissions Requires an active session but no other permissions. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | List of usernames
        try {
            List<User> result = apiInstance.getUsersByUsernames(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#getUsersByUsernames");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of usernames | |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## patchUser

> User patchUser(userId, patchUserRequest)

Patch a user

Partially update a user by providing only the fields you want to update. Omitted fields will not be updated. The fields that can be updated are defined in the request body, all other provided fields will be ignored. ##### Permissions Must be logged in as the user being updated or have the &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        PatchUserRequest patchUserRequest = new PatchUserRequest(); // PatchUserRequest | User object that is to be updated
        try {
            User result = apiInstance.patchUser(userId, patchUserRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#patchUser");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| User GUID | |
| **patchUserRequest** | [**PatchUserRequest**](PatchUserRequest.md)| User object that is to be updated | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User patch successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## searchUsers

> List&lt;User&gt; searchUsers(searchUsersRequest)

Search users

Get a list of users based on search criteria provided in the request body. Searches are typically done against username, full name, nickname and email unless otherwise configured by the server. ##### Permissions Requires an active session and &#x60;read_channel&#x60; and/or &#x60;view_team&#x60; permissions for any channels or teams specified in the request body. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        SearchUsersRequest searchUsersRequest = new SearchUsersRequest(); // SearchUsersRequest | Search criteria
        try {
            List<User> result = apiInstance.searchUsers(searchUsersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#searchUsers");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **searchUsersRequest** | [**SearchUsersRequest**](SearchUsersRequest.md)| Search criteria | |

### Return type

[**List&lt;User&gt;**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## updateUserRoles

> StatusOK updateUserRoles(userId, updateUserRolesRequest)

Update a user&#39;s roles

Update a user&#39;s system-level roles. Valid user roles are \&quot;system_user\&quot;, \&quot;system_admin\&quot; or both of them. Overwrites any previously assigned system-level roles. ##### Permissions Must have the &#x60;manage_roles&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        UpdateUserRolesRequest updateUserRolesRequest = new UpdateUserRolesRequest(); // UpdateUserRolesRequest | Space-delimited system roles to assign to the user
        try {
            StatusOK result = apiInstance.updateUserRoles(userId, updateUserRolesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#updateUserRoles");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters


| Name | Type | Description  | Notes |
|------------- | ------------- | ------------- | -------------|
| **userId** | **String**| User GUID | |
| **updateUserRolesRequest** | [**UpdateUserRolesRequest**](UpdateUserRolesRequest.md)| Space-delimited system roles to assign to the user | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User roles update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |

