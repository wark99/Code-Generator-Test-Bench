# SubscriptionsApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getSubscriptions**](SubscriptionsApi.md#getSubscriptions) | **GET** /subscriptions | List subscriptions |
| [**postActivateSubscription**](SubscriptionsApi.md#postActivateSubscription) | **POST** /subscriptions/{subscriptionId}/activate | Activate subscription |
| [**postPaySubscription**](SubscriptionsApi.md#postPaySubscription) | **POST** /subscriptions/{subscriptionId}/pay | Pay subscription |



## getSubscriptions

> GetSubscriptions200Response getSubscriptions(filterOrganiser, filterStudent)

List subscriptions

Retrieve a list of subscriptions.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        Integer filterOrganiser = 56; // Integer | ID of the organiser
        Integer filterStudent = 56; // Integer | ID of the student
        try {
            GetSubscriptions200Response result = apiInstance.getSubscriptions(filterOrganiser, filterStudent);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#getSubscriptions");
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
| **filterOrganiser** | **Integer**| ID of the organiser | [optional] |
| **filterStudent** | **Integer**| ID of the student | [optional] |

### Return type

[**GetSubscriptions200Response**](GetSubscriptions200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of Subscription objects. |  -  |


## postActivateSubscription

> postActivateSubscription(subscriptionId)

Activate subscription

Activate a subscription.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        try {
            apiInstance.postActivateSubscription(subscriptionId);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#postActivateSubscription");
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
| **subscriptionId** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |


## postPaySubscription

> postPaySubscription(subscriptionId, postPayBookingRequest)

Pay subscription

Pay a subscription.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SubscriptionsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        SubscriptionsApi apiInstance = new SubscriptionsApi(defaultClient);
        String subscriptionId = "subscriptionId_example"; // String | 
        PostPayBookingRequest postPayBookingRequest = new PostPayBookingRequest(); // PostPayBookingRequest | Pays for a subscription.
        try {
            apiInstance.postPaySubscription(subscriptionId, postPayBookingRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling SubscriptionsApi#postPaySubscription");
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
| **subscriptionId** | **String**|  | |
| **postPayBookingRequest** | [**PostPayBookingRequest**](PostPayBookingRequest.md)| Pays for a subscription. | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |

