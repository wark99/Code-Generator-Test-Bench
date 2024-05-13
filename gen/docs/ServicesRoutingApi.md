# ServicesRoutingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllApiServiceAllGet**](ServicesRoutingApi.md#getAllApiServiceAllGet) | **GET** /api/service/all | Get All |
| [**getServiceApiServiceGet**](ServicesRoutingApi.md#getServiceApiServiceGet) | **GET** /api/service | Get Service |



## getAllApiServiceAllGet

> ServicesGetAllExampleResponse getAllApiServiceAllGet()

Get All

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServicesRoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ServicesRoutingApi apiInstance = new ServicesRoutingApi(defaultClient);
        try {
            ServicesGetAllExampleResponse result = apiInstance.getAllApiServiceAllGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServicesRoutingApi#getAllApiServiceAllGet");
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

[**ServicesGetAllExampleResponse**](ServicesGetAllExampleResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешный запрос |  -  |


## getServiceApiServiceGet

> ServicesGetExampleResponse getServiceApiServiceGet(countryCode)

Get Service

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ServicesRoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        ServicesRoutingApi apiInstance = new ServicesRoutingApi(defaultClient);
        String countryCode = "countryCode_example"; // String | 
        try {
            ServicesGetExampleResponse result = apiInstance.getServiceApiServiceGet(countryCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ServicesRoutingApi#getServiceApiServiceGet");
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
| **countryCode** | **String**|  | |

### Return type

[**ServicesGetExampleResponse**](ServicesGetExampleResponse.md)

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

