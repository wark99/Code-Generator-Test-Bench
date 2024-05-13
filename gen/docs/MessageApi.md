# MessageApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**messageGet**](MessageApi.md#messageGet) | **GET** /message | Subscribe to an SSE stream of messages coming from the Flux network |
| [**messagePost**](MessageApi.md#messagePost) | **POST** /message | Send a message over the Flux network |



## messageGet

> messageGet(format)

Subscribe to an SSE stream of messages coming from the Flux network

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        MessageApi apiInstance = new MessageApi(defaultClient);
        String format = "udl"; // String | Whether to receive messages in an 'IWSD' or 'UDL' format.
        try {
            apiInstance.messageGet(format);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#messageGet");
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
| **format** | **String**| Whether to receive messages in an &#39;IWSD&#39; or &#39;UDL&#39; format. | [optional] [enum: udl, iwsd] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined



## messagePost

> messagePost(message)

Send a message over the Flux network

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MessageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        MessageApi apiInstance = new MessageApi(defaultClient);
        Message message = new Message(); // Message | The message content to send
        try {
            apiInstance.messagePost(message);
        } catch (ApiException e) {
            System.err.println("Exception when calling MessageApi#messagePost");
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
| **message** | [**Message**](Message.md)| The message content to send | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


