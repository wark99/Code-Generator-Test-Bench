# ThreadsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserThread**](ThreadsApi.md#getUserThread) | **GET** /users/{user_id}/teams/{team_id}/threads/{thread_id} | Get a thread followed by the user |
| [**getUserThreads**](ThreadsApi.md#getUserThreads) | **GET** /users/{user_id}/teams/{team_id}/threads | Get all threads that user is following |
| [**setThreadUnreadByPostId**](ThreadsApi.md#setThreadUnreadByPostId) | **PUT** /users/{user_id}/teams/{team_id}/threads/{thread_id}/set_unread/{post_id} | Mark a thread that user is following as unread based on a post id |
| [**startFollowingThread**](ThreadsApi.md#startFollowingThread) | **PUT** /users/{user_id}/teams/{team_id}/threads/{thread_id}/following | Start following a thread |
| [**stopFollowingThread**](ThreadsApi.md#stopFollowingThread) | **DELETE** /users/{user_id}/teams/{team_id}/threads/{thread_id}/following | Stop following a thread |
| [**updateThreadReadForUser**](ThreadsApi.md#updateThreadReadForUser) | **PUT** /users/{user_id}/teams/{team_id}/threads/{thread_id}/read/{timestamp} | Mark a thread that user is following read state to the timestamp |
| [**updateThreadsReadForUser**](ThreadsApi.md#updateThreadsReadForUser) | **PUT** /users/{user_id}/teams/{team_id}/threads/read | Mark all threads that user is following as read |



## getUserThread

> UserThread getUserThread(userId, teamId, threadId)

Get a thread followed by the user

Get a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        String teamId = "teamId_example"; // String | The ID of the team in which the thread is.
        String threadId = "threadId_example"; // String | The ID of the thread to follow
        try {
            UserThread result = apiInstance.getUserThread(userId, teamId, threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#getUserThread");
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
| **teamId** | **String**| The ID of the team in which the thread is. | |
| **threadId** | **String**| The ID of the thread to follow | |

### Return type

[**UserThread**](UserThread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Get was successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## getUserThreads

> UserThreads getUserThreads(userId, teamId, since, deleted, extended, page, pageSize, totalsOnly, threadsOnly)

Get all threads that user is following

Get all threads that user is following   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        String teamId = "teamId_example"; // String | The ID of the team in which the thread is.
        Integer since = 56; // Integer | Since filters the threads based on their LastUpdateAt timestamp.
        Boolean deleted = false; // Boolean | Deleted will specify that even deleted threads should be returned (For mobile sync).
        Boolean extended = false; // Boolean | Extended will enrich the response with participant details.
        Integer page = 0; // Integer | Page specifies which part of the results to return, by PageSize.
        Integer pageSize = 30; // Integer | PageSize specifies the size of the returned chunk of results.
        Boolean totalsOnly = false; // Boolean | Setting this to true will only return the total counts.
        Boolean threadsOnly = false; // Boolean | Setting this to true will only return threads.
        try {
            UserThreads result = apiInstance.getUserThreads(userId, teamId, since, deleted, extended, page, pageSize, totalsOnly, threadsOnly);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#getUserThreads");
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
| **teamId** | **String**| The ID of the team in which the thread is. | |
| **since** | **Integer**| Since filters the threads based on their LastUpdateAt timestamp. | [optional] |
| **deleted** | **Boolean**| Deleted will specify that even deleted threads should be returned (For mobile sync). | [optional] [default to false] |
| **extended** | **Boolean**| Extended will enrich the response with participant details. | [optional] [default to false] |
| **page** | **Integer**| Page specifies which part of the results to return, by PageSize. | [optional] [default to 0] |
| **pageSize** | **Integer**| PageSize specifies the size of the returned chunk of results. | [optional] [default to 30] |
| **totalsOnly** | **Boolean**| Setting this to true will only return the total counts. | [optional] [default to false] |
| **threadsOnly** | **Boolean**| Setting this to true will only return threads. | [optional] [default to false] |

### Return type

[**UserThreads**](UserThreads.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s thread retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## setThreadUnreadByPostId

> UserThread setThreadUnreadByPostId(userId, teamId, threadId, postId)

Mark a thread that user is following as unread based on a post id

Mark a thread that user is following as unread  ##### Permissions Must have &#x60;read_channel&#x60; permission for the channel the thread is in or if the channel is public, have the &#x60;read_public_channels&#x60; permission for the team.  Must have &#x60;edit_other_users&#x60; permission if the user is not the one marking the thread for himself. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        String teamId = "teamId_example"; // String | The ID of the team in which the thread is.
        String threadId = "threadId_example"; // String | The ID of the thread to update
        String postId = "postId_example"; // String | The ID of a post belonging to the thread to mark as unread.
        try {
            UserThread result = apiInstance.setThreadUnreadByPostId(userId, teamId, threadId, postId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#setThreadUnreadByPostId");
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
| **teamId** | **String**| The ID of the team in which the thread is. | |
| **threadId** | **String**| The ID of the thread to update | |
| **postId** | **String**| The ID of a post belonging to the thread to mark as unread. | |

### Return type

[**UserThread**](UserThread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s thread update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## startFollowingThread

> StatusOK startFollowingThread(userId, teamId, threadId)

Start following a thread

Start following a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        String teamId = "teamId_example"; // String | The ID of the team in which the thread is.
        String threadId = "threadId_example"; // String | The ID of the thread to follow
        try {
            StatusOK result = apiInstance.startFollowingThread(userId, teamId, threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#startFollowingThread");
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
| **teamId** | **String**| The ID of the team in which the thread is. | |
| **threadId** | **String**| The ID of the thread to follow | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s thread update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## stopFollowingThread

> StatusOK stopFollowingThread(userId, teamId, threadId)

Stop following a thread

Stop following a thread   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        String teamId = "teamId_example"; // String | The ID of the team in which the thread is.
        String threadId = "threadId_example"; // String | The ID of the thread to update
        try {
            StatusOK result = apiInstance.stopFollowingThread(userId, teamId, threadId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#stopFollowingThread");
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
| **teamId** | **String**| The ID of the team in which the thread is. | |
| **threadId** | **String**| The ID of the thread to update | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s thread update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## updateThreadReadForUser

> UserThread updateThreadReadForUser(userId, teamId, threadId, timestamp)

Mark a thread that user is following read state to the timestamp

Mark a thread that user is following as read   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        String teamId = "teamId_example"; // String | The ID of the team in which the thread is.
        String threadId = "threadId_example"; // String | The ID of the thread to update
        String timestamp = "timestamp_example"; // String | The timestamp to which the thread's \"last read\" state will be reset.
        try {
            UserThread result = apiInstance.updateThreadReadForUser(userId, teamId, threadId, timestamp);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#updateThreadReadForUser");
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
| **teamId** | **String**| The ID of the team in which the thread is. | |
| **threadId** | **String**| The ID of the thread to update | |
| **timestamp** | **String**| The timestamp to which the thread&#39;s \&quot;last read\&quot; state will be reset. | |

### Return type

[**UserThread**](UserThread.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s thread update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |


## updateThreadsReadForUser

> StatusOK updateThreadsReadForUser(userId, teamId)

Mark all threads that user is following as read

Mark all threads that user is following as read   ##### Permissions Must be logged in as the user or have &#x60;edit_other_users&#x60; permission. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ThreadsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        ThreadsApi apiInstance = new ThreadsApi(defaultClient);
        String userId = "userId_example"; // String | The ID of the user. This can also be \"me\" which will point to the current user.
        String teamId = "teamId_example"; // String | The ID of the team in which the thread is.
        try {
            StatusOK result = apiInstance.updateThreadsReadForUser(userId, teamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ThreadsApi#updateThreadsReadForUser");
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
| **teamId** | **String**| The ID of the team in which the thread is. | |

### Return type

[**StatusOK**](StatusOK.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User&#39;s thread update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |
| **404** |  |  -  |

