# InsightsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getNewTeamMembers**](InsightsApi.md#getNewTeamMembers) | **GET** /teams/{team_id}/top/team_members | Get a list of new team members. |
| [**getTopChannelsForTeam**](InsightsApi.md#getTopChannelsForTeam) | **GET** /teams/{team_id}/top/channels | Get a list of the top channels for a team. |
| [**getTopChannelsForUser**](InsightsApi.md#getTopChannelsForUser) | **GET** /users/me/top/channels | Get a list of the top channels for a user. |
| [**getTopDMsForUser**](InsightsApi.md#getTopDMsForUser) | **GET** /users/me/top/dms | Get a list of the top dms for a user. |
| [**getTopReactionsForTeam**](InsightsApi.md#getTopReactionsForTeam) | **GET** /teams/{team_id}/top/reactions | Get a list of the top reactions for a team. |
| [**getTopReactionsForUser**](InsightsApi.md#getTopReactionsForUser) | **GET** /users/me/top/reactions | Get a list of the top reactions for a user. |
| [**getTopThreadsForTeam**](InsightsApi.md#getTopThreadsForTeam) | **GET** /teams/{team_id}/top/threads | Get a list of the top threads for a team. |
| [**getTopThreadsForUser**](InsightsApi.md#getTopThreadsForUser) | **GET** /users/me/top/threads | Get a list of the top threads for a user. |



## getNewTeamMembers

> NewTeamMembersList getNewTeamMembers(teamId, timeRange, page, perPage)

Get a list of new team members.

Get a list of all of the new team members that have joined the given team during the given time period. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String timeRange = "timeRange_example"; // String | Time range can be \"today\", \"7_day\", or \"28_day\". - `today`: team members who joined during the current day. - `7_day`: team members who joined in the last 7 days. - `28_day`: team members who joined in the last 28 days. 
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of items per page.
        try {
            NewTeamMembersList result = apiInstance.getNewTeamMembers(teamId, timeRange, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#getNewTeamMembers");
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
| **timeRange** | **String**| Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: team members who joined during the current day. - &#x60;7_day&#x60;: team members who joined in the last 7 days. - &#x60;28_day&#x60;: team members who joined in the last 28 days.  | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of items per page. | [optional] [default to 60] |

### Return type

[**NewTeamMembersList**](NewTeamMembersList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | New team members retrieved successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |


## getTopChannelsForTeam

> TopChannelList getTopChannelsForTeam(teamId, timeRange, page, perPage)

Get a list of the top channels for a team.

Get a list of the top public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String timeRange = "timeRange_example"; // String | Time range can be \"today\", \"7_day\", or \"28_day\". - `today`: channels with posts on the current day. - `7_day`: channels with posts in the last 7 days. - `28_day`: channels with posts in the last 28 days. 
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of items per page, up to a maximum of 200.
        try {
            TopChannelList result = apiInstance.getTopChannelsForTeam(teamId, timeRange, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#getTopChannelsForTeam");
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
| **timeRange** | **String**| Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: channels with posts on the current day. - &#x60;7_day&#x60;: channels with posts in the last 7 days. - &#x60;28_day&#x60;: channels with posts in the last 28 days.  | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of items per page, up to a maximum of 200. | [optional] [default to 60] |

### Return type

[**TopChannelList**](TopChannelList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top channels retrieved successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |


## getTopChannelsForUser

> TopChannelList getTopChannelsForUser(timeRange, page, perPage, teamId)

Get a list of the top channels for a user.

Get a list of the top public and private channels (the user is a member of) for a given user. ##### Permissions Must be logged in as the user. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        String timeRange = "timeRange_example"; // String | Time range can be \"today\", \"7_day\", or \"28_day\". - `today`: channels with posts on the current day. - `7_day`: channels with posts in the last 7 days. - `28_day`: channels with posts in the last 28 days. 
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of items per page, up to a maximum of 200.
        String teamId = "teamId_example"; // String | Team ID will scope the response to a given team. ##### Permissions Must have `view_team` permission for the team. 
        try {
            TopChannelList result = apiInstance.getTopChannelsForUser(timeRange, page, perPage, teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#getTopChannelsForUser");
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
| **timeRange** | **String**| Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: channels with posts on the current day. - &#x60;7_day&#x60;: channels with posts in the last 7 days. - &#x60;28_day&#x60;: channels with posts in the last 28 days.  | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of items per page, up to a maximum of 200. | [optional] [default to 60] |
| **teamId** | **String**| Team ID will scope the response to a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  | [optional] |

### Return type

[**TopChannelList**](TopChannelList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top channels retrieved successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |


## getTopDMsForUser

> TopDMList getTopDMsForUser(timeRange, page, perPage)

Get a list of the top dms for a user.

Get a list of the top dms for a given user. ##### Permissions Must be logged in as the user. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        String timeRange = "timeRange_example"; // String | Time range can be \"today\", \"7_day\", or \"28_day\". - `today`: threads with activity on the current day. - `7_day`: threads with activity in the last 7 days. - `28_day`: threads with activity in the last 28 days. 
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of items per page, up to a maximum of 200.
        try {
            TopDMList result = apiInstance.getTopDMsForUser(timeRange, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#getTopDMsForUser");
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
| **timeRange** | **String**| Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of items per page, up to a maximum of 200. | [optional] [default to 60] |

### Return type

[**TopDMList**](TopDMList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top dms retrieved successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |


## getTopReactionsForTeam

> TopReactionList getTopReactionsForTeam(teamId, timeRange, page, perPage)

Get a list of the top reactions for a team.

Get a list of the top reactions across all public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String timeRange = "timeRange_example"; // String | Time range can be \"today\", \"7_day\", or \"28_day\". - `today`: reactions posted on the current day. - `7_day`: reactions posted in the last 7 days. - `28_day`: reactions posted in the last 28 days. 
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of items per page, up to a maximum of 200.
        try {
            TopReactionList result = apiInstance.getTopReactionsForTeam(teamId, timeRange, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#getTopReactionsForTeam");
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
| **timeRange** | **String**| Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: reactions posted on the current day. - &#x60;7_day&#x60;: reactions posted in the last 7 days. - &#x60;28_day&#x60;: reactions posted in the last 28 days.  | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of items per page, up to a maximum of 200. | [optional] [default to 60] |

### Return type

[**TopReactionList**](TopReactionList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top reactions retrieved successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |


## getTopReactionsForUser

> TopReactionList getTopReactionsForUser(timeRange, page, perPage, teamId)

Get a list of the top reactions for a user.

Get a list of the top reactions across all public and private channels (the user is a member of) for a given user. If no &#x60;team_id&#x60; is provided, this will also include reactions posted by the given user in direct and group messages. ##### Permissions Must be logged in as the user. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        String timeRange = "timeRange_example"; // String | Time range can be \"today\", \"7_day\", or \"28_day\". - `today`: reactions posted on the current day. - `7_day`: reactions posted in the last 7 days. - `28_day`: reactions posted in the last 28 days. 
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of items per page, up to a maximum of 200.
        String teamId = "teamId_example"; // String | Team ID will scope the response to a given team and exclude direct and group messages. ##### Permissions Must have `view_team` permission for the team. 
        try {
            TopReactionList result = apiInstance.getTopReactionsForUser(timeRange, page, perPage, teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#getTopReactionsForUser");
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
| **timeRange** | **String**| Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: reactions posted on the current day. - &#x60;7_day&#x60;: reactions posted in the last 7 days. - &#x60;28_day&#x60;: reactions posted in the last 28 days.  | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of items per page, up to a maximum of 200. | [optional] [default to 60] |
| **teamId** | **String**| Team ID will scope the response to a given team and exclude direct and group messages. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  | [optional] |

### Return type

[**TopReactionList**](TopReactionList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top reactions retrieved successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |


## getTopThreadsForTeam

> TopThreadList getTopThreadsForTeam(teamId, timeRange, page, perPage)

Get a list of the top threads for a team.

Get a list of the top threads from public and private channels (the user is a member of) for a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        String teamId = "teamId_example"; // String | Team GUID
        String timeRange = "timeRange_example"; // String | Time range can be \"today\", \"7_day\", or \"28_day\". - `today`: threads with activity on the current day. - `7_day`: threads with activity in the last 7 days. - `28_day`: threads with activity in the last 28 days. 
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of items per page, up to a maximum of 200.
        try {
            TopThreadList result = apiInstance.getTopThreadsForTeam(teamId, timeRange, page, perPage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#getTopThreadsForTeam");
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
| **timeRange** | **String**| Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of items per page, up to a maximum of 200. | [optional] [default to 60] |

### Return type

[**TopThreadList**](TopThreadList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top threads retrieved successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |


## getTopThreadsForUser

> TopThreadList getTopThreadsForUser(timeRange, page, perPage, teamId)

Get a list of the top threads for a user.

Get a list of the top threads from public and private channels (the user is a member of and participating in the thread) for a given user. ##### Permissions Must be logged in as the user. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InsightsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        InsightsApi apiInstance = new InsightsApi(defaultClient);
        String timeRange = "timeRange_example"; // String | Time range can be \"today\", \"7_day\", or \"28_day\". - `today`: threads with activity on the current day. - `7_day`: threads with activity in the last 7 days. - `28_day`: threads with activity in the last 28 days. 
        Integer page = 0; // Integer | The page to select.
        Integer perPage = 60; // Integer | The number of items per page, up to a maximum of 200.
        String teamId = "teamId_example"; // String | Team ID will scope the response to a given team. ##### Permissions Must have `view_team` permission for the team. 
        try {
            TopThreadList result = apiInstance.getTopThreadsForUser(timeRange, page, perPage, teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InsightsApi#getTopThreadsForUser");
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
| **timeRange** | **String**| Time range can be \&quot;today\&quot;, \&quot;7_day\&quot;, or \&quot;28_day\&quot;. - &#x60;today&#x60;: threads with activity on the current day. - &#x60;7_day&#x60;: threads with activity in the last 7 days. - &#x60;28_day&#x60;: threads with activity in the last 28 days.  | |
| **page** | **Integer**| The page to select. | [optional] [default to 0] |
| **perPage** | **Integer**| The number of items per page, up to a maximum of 200. | [optional] [default to 60] |
| **teamId** | **String**| Team ID will scope the response to a given team. ##### Permissions Must have &#x60;view_team&#x60; permission for the team.  | [optional] |

### Return type

[**TopThreadList**](TopThreadList.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Top threads retrieved successfully. |  -  |
| **400** |  |  -  |
| **403** |  |  -  |

