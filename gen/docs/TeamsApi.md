# TeamsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllTeams**](TeamsApi.md#getAllTeams) | **GET** /teams | Get teams |
| [**getTeam**](TeamsApi.md#getTeam) | **GET** /teams/{team_id} | Get a team |
| [**getTeamByName**](TeamsApi.md#getTeamByName) | **GET** /teams/name/{name} | Get a team by name |
| [**getTeamMember**](TeamsApi.md#getTeamMember) | **GET** /teams/{team_id}/members/{user_id} | Get a team member |
| [**getTeamMembers**](TeamsApi.md#getTeamMembers) | **GET** /teams/{team_id}/members | Get team members |
| [**getTeamMembersByIds**](TeamsApi.md#getTeamMembersByIds) | **POST** /teams/{team_id}/members/ids | Get team members by ids |
| [**getTeamMembersForUser**](TeamsApi.md#getTeamMembersForUser) | **GET** /users/{user_id}/teams/members | Get team members for a user |
| [**getTeamStats**](TeamsApi.md#getTeamStats) | **GET** /teams/{team_id}/stats | Get a team stats |
| [**getTeamUnread**](TeamsApi.md#getTeamUnread) | **GET** /users/{user_id}/teams/{team_id}/unread | Get unreads for a team |
| [**getTeamsForUser**](TeamsApi.md#getTeamsForUser) | **GET** /users/{user_id}/teams | Get a user&#39;s teams |
| [**getTeamsUnreadForUser**](TeamsApi.md#getTeamsUnreadForUser) | **GET** /users/{user_id}/teams/unread | Get team unreads for a user |
| [**inviteGuestsToTeam**](TeamsApi.md#inviteGuestsToTeam) | **POST** /teams/{team_id}/invite-guests/email | Invite guests to the team by email |
| [**searchFiles**](TeamsApi.md#searchFiles) | **POST** /teams/{team_id}/files/search | Search files in a team |
| [**updateTeamMemberRoles**](TeamsApi.md#updateTeamMemberRoles) | **PUT** /teams/{team_id}/members/{user_id}/roles | Update a team member roles |



## getAllTeams

> List&lt;Team&gt; getAllTeams(page, perPage, includeTotalCount, excludePolicyConstrained)

Get teams

For regular users only returns open teams. Users with the \&quot;manage_system\&quot; permission will return teams regardless of type. The result is based on query string parameters - page and per_page. ##### Permissions Must be authenticated. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of teams per page.
        Boolean includeTotalCount = false; // Boolean | Appends a total count of returned teams inside the response object - ex: `{ \"teams\": [], \"total_count\" : 0 }`.      
        Boolean excludePolicyConstrained = false; // Boolean | If set to true, teams which are part of a data retention policy will be excluded. The `sysconsole_read_compliance` permission is required to use this parameter. 
        try {
            List<Team> result = apiInstance.getAllTeams(page, perPage, includeTotalCount, excludePolicyConstrained);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getAllTeams");
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
| **perPage** | **Integer**| The number of teams per page. | [optional] [default to 60] |
| **includeTotalCount** | **Boolean**| Appends a total count of returned teams inside the response object - ex: &#x60;{ \&quot;teams\&quot;: [], \&quot;total_count\&quot; : 0 }&#x60;.       | [optional] [default to false] |
| **excludePolicyConstrained** | **Boolean**| If set to true, teams which are part of a data retention policy will be excluded. The &#x60;sysconsole_read_compliance&#x60; permission is required to use this parameter.  | [optional] [default to false] |

### Return type

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## getTeam

> Team getTeam(teamId)

Get a team

Get a team on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        try {
            Team result = apiInstance.getTeam(teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeam");
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
| **teamId** | **String**| Team GUID | |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getTeamByName

> Team getTeamByName(name)

Get a team by name

Get a team based on provided name string ##### Permissions Must be authenticated, team type is open and have the &#x60;view_team&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String name = "name_example"; // String | Team Name
        try {
            Team result = apiInstance.getTeamByName(name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamByName");
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
| **name** | **String**| Team Name | |

### Return type

[**Team**](Team.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getTeamMember

> TeamMember getTeamMember(teamId, userId)

Get a team member

Get a team member on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        try {
            TeamMember result = apiInstance.getTeamMember(teamId, userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamMember");
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
| **teamId** | **String**| Team GUID | |
| **userId** | **String**| User GUID | |

### Return type

[**TeamMember**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team member retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getTeamMembers

> List&lt;TeamMember&gt; getTeamMembers(teamId, page, perPage)

Get team members

Get a page team members list based on query string parameters - team id, page and per page. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of users per page.
        try {
            List<TeamMember> result = apiInstance.getTeamMembers(teamId, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamMembers");
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
| **teamId** | **String**| Team GUID | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of users per page. | [optional] [default to 60] |

### Return type

[**List&lt;TeamMember&gt;**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team members retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getTeamMembersByIds

> List&lt;TeamMember&gt; getTeamMembersByIds(teamId, requestBody)

Get team members by ids

Get a list of team members based on a provided array of user ids. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        List<String> requestBody = Arrays.asList(); // List<String> | List of user ids
        try {
            List<TeamMember> result = apiInstance.getTeamMembersByIds(teamId, requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamMembersByIds");
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
| **teamId** | **String**| Team GUID | |
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of user ids | |

### Return type

[**List&lt;TeamMember&gt;**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team members retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getTeamMembersForUser

> List&lt;TeamMember&gt; getTeamMembersForUser(userId)

Get team members for a user

Get a list of team members for a user. Useful for getting the ids of teams the user is on and the roles they have in those teams. ##### Permissions Must be logged in as the user or have the &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        try {
            List<TeamMember> result = apiInstance.getTeamMembersForUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamMembersForUser");
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

[**List&lt;TeamMember&gt;**](TeamMember.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team members retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getTeamStats

> TeamStats getTeamStats(teamId)

Get a team stats

Get a team stats on the system. ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        try {
            TeamStats result = apiInstance.getTeamStats(teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamStats");
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
| **teamId** | **String**| Team GUID | |

### Return type

[**TeamStats**](TeamStats.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team stats retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getTeamUnread

> TeamUnread getTeamUnread(userId, teamId)

Get unreads for a team

Get the unread mention and message counts for a team for the specified user. ##### Permissions Must be the user or have &#x60;edit_other_users&#x60; permission and have &#x60;view_team&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String teamId = "teamId_example"; // String | Team GUID
        try {
            TeamUnread result = apiInstance.getTeamUnread(userId, teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamUnread");
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
| **teamId** | **String**| Team GUID | |

### Return type

[**TeamUnread**](TeamUnread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team unread count retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |


## getTeamsForUser

> List&lt;Team&gt; getTeamsForUser(userId)

Get a user&#39;s teams

Get a list of teams that a user is on. ##### Permissions Must be authenticated as the user or have the &#x60;manage_system&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        try {
            List<Team> result = apiInstance.getTeamsForUser(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamsForUser");
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

[**List&lt;Team&gt;**](Team.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## getTeamsUnreadForUser

> List&lt;TeamUnread&gt; getTeamsUnreadForUser(userId, excludeTeam, includeCollapsedThreads)

Get team unreads for a user

Get the count for unread messages and mentions in the teams the user is a member of. ##### Permissions Must be logged in. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String userId = "userId_example"; // String | User GUID
        String excludeTeam = "excludeTeam_example"; // String | Optional team id to be excluded from the results
        Boolean includeCollapsedThreads = false; // Boolean | Boolean to determine whether the collapsed threads should be included or not
        try {
            List<TeamUnread> result = apiInstance.getTeamsUnreadForUser(userId, excludeTeam, includeCollapsedThreads);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#getTeamsUnreadForUser");
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
| **excludeTeam** | **String**| Optional team id to be excluded from the results | |
| **includeCollapsedThreads** | **Boolean**| Boolean to determine whether the collapsed threads should be included or not | [optional] [default to false] |

### Return type

[**List&lt;TeamUnread&gt;**](TeamUnread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Team unreads retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## inviteGuestsToTeam

> StatusOK inviteGuestsToTeam(teamId, inviteGuestsToTeamRequest)

Invite guests to the team by email

Invite guests to existing team channels usign the user&#39;s email.  The number of emails that can be sent is rate limited to 20 per hour with a burst of 20 emails. If the rate limit exceeds, the error message contains details on when to retry and when the timer will be reset.  ##### Permissions Must have &#x60;invite_guest&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        InviteGuestsToTeamRequest inviteGuestsToTeamRequest = new InviteGuestsToTeamRequest(); // InviteGuestsToTeamRequest | Guests invite information
        try {
            StatusOK result = apiInstance.inviteGuestsToTeam(teamId, inviteGuestsToTeamRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#inviteGuestsToTeam");
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
| **teamId** | **String**| Team GUID | |
| **inviteGuestsToTeamRequest** | [**InviteGuestsToTeamRequest**](InviteGuestsToTeamRequest.md)| Guests invite information | |

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
| **200** | Guests invite successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **413** |  |  -  |


## searchFiles

> FileInfoList searchFiles(teamId, searchFilesRequest)

Search files in a team

Search for files in a team based on file name, extention and file content (if file content extraction is enabled and supported for the files). ##### Permissions Must be authenticated and have the &#x60;view_team&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        SearchFilesRequest searchFilesRequest = new SearchFilesRequest(); // SearchFilesRequest | The search terms and logic to use in the search.
        try {
            FileInfoList result = apiInstance.searchFiles(teamId, searchFilesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#searchFiles");
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
| **teamId** | **String**| Team GUID | |
| **searchFilesRequest** | [**SearchFilesRequest**](SearchFilesRequest.md)| The search terms and logic to use in the search. | |

### Return type

[**FileInfoList**](FileInfoList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Files list retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |


## updateTeamMemberRoles

> StatusOK updateTeamMemberRoles(teamId, userId, updateUserRolesRequest)

Update a team member roles

Update a team member roles. Valid team roles are \&quot;team_user\&quot;, \&quot;team_admin\&quot; or both of them. Overwrites any previously assigned team roles. ##### Permissions Must be authenticated and have the &#x60;manage_team_roles&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TeamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        TeamsApi apiInstance = new TeamsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String userId = "userId_example"; // String | User GUID
        UpdateUserRolesRequest updateUserRolesRequest = new UpdateUserRolesRequest(); // UpdateUserRolesRequest | Space-delimited team roles to assign to the user
        try {
            StatusOK result = apiInstance.updateTeamMemberRoles(teamId, userId, updateUserRolesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TeamsApi#updateTeamMemberRoles");
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
| **teamId** | **String**| Team GUID | |
| **userId** | **String**| User GUID | |
| **updateUserRolesRequest** | [**UpdateUserRolesRequest**](UpdateUserRolesRequest.md)| Space-delimited team roles to assign to the user | |

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
| **200** | Team member roles update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **404** |  |  -  |

