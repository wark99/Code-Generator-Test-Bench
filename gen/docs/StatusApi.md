# StatusApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getUserStatus**](StatusApi.md#getUserStatus) | **GET** /users/{user_id}/status | Get user status |
| [**getUsersStatusesByIds**](StatusApi.md#getUsersStatusesByIds) | **POST** /users/status/ids | Get user statuses by id |
| [**postUserRecentCustomStatusDelete**](StatusApi.md#postUserRecentCustomStatusDelete) | **POST** /users/{user_id}/status/custom/recent/delete | Delete user&#39;s recent custom status |
| [**unsetUserCustomStatus**](StatusApi.md#unsetUserCustomStatus) | **DELETE** /users/{user_id}/status/custom | Unsets user custom status |
| [**updateUserCustomStatus**](StatusApi.md#updateUserCustomStatus) | **PUT** /users/{user_id}/status/custom | Update user custom status |
| [**updateUserStatus**](StatusApi.md#updateUserStatus) | **PUT** /users/{user_id}/status | Update user status |



## getUserStatus

> Status getUserStatus(userId)

Get user status

Get user status by id from the server. ##### Permissions Must be authenticated. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String userId = "userId_example"; // String | User ID
        try {
            Status result = apiInstance.getUserStatus(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#getUserStatus");
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
| **userId** | **String**| User ID | |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User status retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## getUsersStatusesByIds

> List&lt;Status&gt; getUsersStatusesByIds(requestBody)

Get user statuses by id

Get a list of user statuses by id from the server. ##### Permissions Must be authenticated. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StatusApi apiInstance = new StatusApi(defaultClient);
        List<String> requestBody = Arrays.asList(); // List<String> | List of user ids to fetch
        try {
            List<Status> result = apiInstance.getUsersStatusesByIds(requestBody);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#getUsersStatusesByIds");
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
| **requestBody** | [**List&lt;String&gt;**](String.md)| List of user ids to fetch | |

### Return type

[**List&lt;Status&gt;**](Status.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User statuses retrieval successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## postUserRecentCustomStatusDelete

> StatusOK postUserRecentCustomStatusDelete(userId, postUserRecentCustomStatusDeleteRequest)

Delete user&#39;s recent custom status

Deletes a user&#39;s recent custom status by removing the specific status from the recentCustomStatuses in the user&#39;s props and updates the user. ##### Permissions Must be logged in as the user whose recent custom status is being deleted. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String userId = "userId_example"; // String | User ID
        PostUserRecentCustomStatusDeleteRequest postUserRecentCustomStatusDeleteRequest = new PostUserRecentCustomStatusDeleteRequest(); // PostUserRecentCustomStatusDeleteRequest | Custom Status object that is to be removed from the recent custom statuses.
        try {
            StatusOK result = apiInstance.postUserRecentCustomStatusDelete(userId, postUserRecentCustomStatusDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#postUserRecentCustomStatusDelete");
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
| **userId** | **String**| User ID | |
| **postUserRecentCustomStatusDeleteRequest** | [**PostUserRecentCustomStatusDeleteRequest**](PostUserRecentCustomStatusDeleteRequest.md)| Custom Status object that is to be removed from the recent custom statuses. | |

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
| **200** | User recent custom status delete successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## unsetUserCustomStatus

> StatusOK unsetUserCustomStatus(userId)

Unsets user custom status

Unsets a user&#39;s custom status by updating the user&#39;s props and updates the user ##### Permissions Must be logged in as the user whose custom status is being removed. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String userId = "userId_example"; // String | User ID
        try {
            StatusOK result = apiInstance.unsetUserCustomStatus(userId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#unsetUserCustomStatus");
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
| **userId** | **String**| User ID | |

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
| **200** | User custom status delete successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## updateUserCustomStatus

> StatusOK updateUserCustomStatus(userId, updateUserCustomStatusRequest)

Update user custom status

Updates a user&#39;s custom status by setting the value in the user&#39;s props and updates the user. Also save the given custom status to the recent custom statuses in the user&#39;s props ##### Permissions Must be logged in as the user whose custom status is being updated. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String userId = "userId_example"; // String | User ID
        UpdateUserCustomStatusRequest updateUserCustomStatusRequest = new UpdateUserCustomStatusRequest(); // UpdateUserCustomStatusRequest | Custom status object that is to be updated
        try {
            StatusOK result = apiInstance.updateUserCustomStatus(userId, updateUserCustomStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#updateUserCustomStatus");
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
| **userId** | **String**| User ID | |
| **updateUserCustomStatusRequest** | [**UpdateUserCustomStatusRequest**](UpdateUserCustomStatusRequest.md)| Custom status object that is to be updated | |

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
| **200** | User custom status update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |


## updateUserStatus

> Status updateUserStatus(userId, updateUserStatusRequest)

Update user status

Manually set a user&#39;s status. When setting a user&#39;s status, the status will remain that value until set \&quot;online\&quot; again, which will return the status to being automatically updated based on user activity. ##### Permissions Must have &#x60;edit_other_users&#x60; permission for the team. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatusApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StatusApi apiInstance = new StatusApi(defaultClient);
        String userId = "userId_example"; // String | User ID
        UpdateUserStatusRequest updateUserStatusRequest = new UpdateUserStatusRequest(); // UpdateUserStatusRequest | Status object that is to be updated
        try {
            Status result = apiInstance.updateUserStatus(userId, updateUserStatusRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatusApi#updateUserStatus");
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
| **userId** | **String**| User ID | |
| **updateUserStatusRequest** | [**UpdateUserStatusRequest**](UpdateUserStatusRequest.md)| Status object that is to be updated | |

### Return type

[**Status**](Status.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User status update successful |  -  |
| **400** |  |  -  |
| **401** |  |  -  |

