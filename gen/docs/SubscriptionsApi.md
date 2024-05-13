# SubscriptionsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**subscriptionActiveGet**](SubscriptionsApi.md#subscriptionActiveGet) | **GET** /subscription/active | Retrieves active subscription for current user |
| [**subscriptionAutorenewStatePut**](SubscriptionsApi.md#subscriptionAutorenewStatePut) | **PUT** /subscription/autorenew/{state} | turn auto renew for subscription on or off |
| [**subscriptionCreatePost**](SubscriptionsApi.md#subscriptionCreatePost) | **POST** /subscription/create | initiate payment process for subscription package |



## subscriptionActiveGet

> SubscriptionActiveGet200Response subscriptionActiveGet()

Retrieves active subscription for current user

This endpoint retrieves active user subscription. If user does not have any active subscription, it returns an http 400 status code

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        try {
            SubscriptionActiveGet200Response result = apiInstance.subscriptionActiveGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionActiveGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**SubscriptionActiveGet200Response**](SubscriptionActiveGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Active subscription returned |  -  |


## subscriptionAutorenewStatePut

> subscriptionAutorenewStatePut(state)

turn auto renew for subscription on or off

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String state = "on"; // String | 
        try {
            apiInstance.subscriptionAutorenewStatePut(state);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionAutorenewStatePut");
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
| **state** | **String**|  | [enum: on, off] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Auto renew successfully updated |  -  |
| **400** | Unable to update autorenew |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## subscriptionCreatePost

> SubscriptionCreatePost201Response subscriptionCreatePost(subscriptionCreatePostRequest)

initiate payment process for subscription package

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        SubscriptionCreatePostRequest subscriptionCreatePostRequest = new SubscriptionCreatePostRequest(); // SubscriptionCreatePostRequest | 
        try {
            SubscriptionCreatePost201Response result = apiInstance.subscriptionCreatePost(subscriptionCreatePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#subscriptionCreatePost");
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
| **subscriptionCreatePostRequest** | [**SubscriptionCreatePostRequest**](SubscriptionCreatePostRequest.md)|  | [optional] |

### Return type

[**SubscriptionCreatePost201Response**](SubscriptionCreatePost201Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully initiated payment process |  -  |
| **400** | Unable to update job post |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |

