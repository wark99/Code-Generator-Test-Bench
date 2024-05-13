# SendMailRoutingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendGetStatusApiSendStatusGet**](SendMailRoutingApi.md#sendGetStatusApiSendStatusGet) | **GET** /api/send/status | Send Get Status |
| [**sendMailApiSendPost**](SendMailRoutingApi.md#sendMailApiSendPost) | **POST** /api/send | Send Mail |



## sendGetStatusApiSendStatusGet

> SendGetResultExampleResponse sendGetStatusApiSendStatusGet(tag)

Send Get Status

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SendMailRoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SendMailRoutingApi apiInstance = new SendMailRoutingApi(defaultClient);
        String tag = "tag_example"; // String | 
        try {
            SendGetResultExampleResponse result = apiInstance.sendGetStatusApiSendStatusGet(tag);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendMailRoutingApi#sendGetStatusApiSendStatusGet");
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
| **tag** | **String**|  | |

### Return type

[**SendGetResultExampleResponse**](SendGetResultExampleResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешный запрос |  -  |
| **422** | Validation Error |  -  |


## sendMailApiSendPost

> SendResultExampleResponse sendMailApiSendPost(items)

Send Mail

описание

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SendMailRoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        SendMailRoutingApi apiInstance = new SendMailRoutingApi(defaultClient);
        Items items = new Items(); // Items | 
        try {
            SendResultExampleResponse result = apiInstance.sendMailApiSendPost(items);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SendMailRoutingApi#sendMailApiSendPost");
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
| **items** | [**Items**](Items.md)|  | |

### Return type

[**SendResultExampleResponse**](SendResultExampleResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешный запрос |  -  |
| **422** | Validation Error |  -  |

