# OrderingApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**imageOrderPost**](OrderingApi.md#imageOrderPost) | **POST** /image/order | /image/order |
| [**imageOrderPost_0**](OrderingApi.md#imageOrderPost_0) | **POST** /image/order | /image/order |



## imageOrderPost

> Object imageOrderPost(imageOrderPostRequest)

/image/order



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        OrderingApi apiInstance = new OrderingApi(defaultClient);
        ImageOrderPostRequest imageOrderPostRequest = new ImageOrderPostRequest(); // ImageOrderPostRequest | 
        try {
            Object result = apiInstance.imageOrderPost(imageOrderPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderingApi#imageOrderPost");
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
| **imageOrderPostRequest** | [**ImageOrderPostRequest**](ImageOrderPostRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## imageOrderPost_0

> Object imageOrderPost_0(imageOrderPostRequest)

/image/order



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        OrderingApi apiInstance = new OrderingApi(defaultClient);
        ImageOrderPostRequest imageOrderPostRequest = new ImageOrderPostRequest(); // ImageOrderPostRequest | 
        try {
            Object result = apiInstance.imageOrderPost_0(imageOrderPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderingApi#imageOrderPost_0");
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
| **imageOrderPostRequest** | [**ImageOrderPostRequest**](ImageOrderPostRequest.md)|  | [optional] |

### Return type

**Object**

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

