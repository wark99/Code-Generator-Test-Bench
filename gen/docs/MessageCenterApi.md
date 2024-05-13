# MessageCenterApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**messagingSendPost**](MessageCenterApi.md#messagingSendPost) | **POST** /messaging/send | send a message |
| [**messagingThreadIdGet**](MessageCenterApi.md#messagingThreadIdGet) | **GET** /messaging/thread/{id} | get messages for particular thread |
| [**messagingThreadsGet**](MessageCenterApi.md#messagingThreadsGet) | **GET** /messaging/threads | Get user active message threads |



## messagingSendPost

> messagingSendPost(messagingSendPostRequest)

send a message

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessageCenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MessageCenterApi apiInstance = new MessageCenterApi(defaultClient);
        MessagingSendPostRequest messagingSendPostRequest = new MessagingSendPostRequest(); // MessagingSendPostRequest | 
        try {
            apiInstance.messagingSendPost(messagingSendPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageCenterApi#messagingSendPost");
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
| **messagingSendPostRequest** | [**MessagingSendPostRequest**](MessagingSendPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successfully sent a message |  -  |
| **400** | There was problem sending a message |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## messagingThreadIdGet

> List&lt;MessagingThreadIdGet200ResponseInner&gt; messagingThreadIdGet(id)

get messages for particular thread

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessageCenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MessageCenterApi apiInstance = new MessageCenterApi(defaultClient);
        String id = "b23ce319-5d79-4164-9fdc-df44bddeb7c1"; // String | 
        try {
            List<MessagingThreadIdGet200ResponseInner> result = apiInstance.messagingThreadIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageCenterApi#messagingThreadIdGet");
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
| **id** | **String**|  | |

### Return type

[**List&lt;MessagingThreadIdGet200ResponseInner&gt;**](MessagingThreadIdGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Messages successfully retrieved |  -  |
| **400** | There was problem retrieving thread&#39;s messages |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |


## messagingThreadsGet

> List&lt;MessagingThreadsGet200ResponseInner&gt; messagingThreadsGet()

Get user active message threads

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessageCenterApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        MessageCenterApi apiInstance = new MessageCenterApi(defaultClient);
        try {
            List<MessagingThreadsGet200ResponseInner> result = apiInstance.messagingThreadsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageCenterApi#messagingThreadsGet");
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

[**List&lt;MessagingThreadsGet200ResponseInner&gt;**](MessagingThreadsGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User message threads retrieved |  -  |
| **400** | There was problem retrieving user message threads |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |

