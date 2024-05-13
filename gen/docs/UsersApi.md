# UsersApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postActivate**](UsersApi.md#postActivate) | **POST** /activate | Activate a user |
| [**postConnectAccept**](UsersApi.md#postConnectAccept) | **POST** /organisers/{organiserId}/accept | Connect accept |
| [**postConnectReject**](UsersApi.md#postConnectReject) | **POST** /organisers/{organiserId}/reject | Connect reject |



## postActivate

> postActivate(postActivateRequest)

Activate a user

Activate a user account.

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
        defaultClient.setBasePath("http://api.dodays.test/v1");

        UsersApi apiInstance = new UsersApi(defaultClient);
        PostActivateRequest postActivateRequest = new PostActivateRequest(); // PostActivateRequest | Activates the users account.
        try {
            apiInstance.postActivate(postActivateRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#postActivate");
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
| **postActivateRequest** | [**PostActivateRequest**](PostActivateRequest.md)| Activates the users account. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |


## postConnectAccept

> postConnectAccept(organiserId, postConnectAcceptRequest)

Connect accept

Acccept a connect request.

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
        defaultClient.setBasePath("http://api.dodays.test/v1");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String organiserId = "organiserId_example"; // String | 
        PostConnectAcceptRequest postConnectAcceptRequest = new PostConnectAcceptRequest(); // PostConnectAcceptRequest | Accepts the organisers connect request.
        try {
            apiInstance.postConnectAccept(organiserId, postConnectAcceptRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#postConnectAccept");
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
| **organiserId** | **String**|  | |
| **postConnectAcceptRequest** | [**PostConnectAcceptRequest**](PostConnectAcceptRequest.md)| Accepts the organisers connect request. | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |


## postConnectReject

> postConnectReject(organiserId)

Connect reject

Reject a connect request.

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
        defaultClient.setBasePath("http://api.dodays.test/v1");

        UsersApi apiInstance = new UsersApi(defaultClient);
        String organiserId = "organiserId_example"; // String | 
        try {
            apiInstance.postConnectReject(organiserId);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsersApi#postConnectReject");
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
| **organiserId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |

