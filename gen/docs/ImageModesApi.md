# ImageModesApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**modeCarStockIdTenantIdGet**](ImageModesApi.md#modeCarStockIdTenantIdGet) | **GET** /mode/{carStockId}/{tenantId} | get-current-image-modus |
| [**modePost**](ImageModesApi.md#modePost) | **POST** /mode | save-new-image-mode |



## modeCarStockIdTenantIdGet

> ModeCarStockIdTenantIdGet200Response modeCarStockIdTenantIdGet(carStockId, tenantId)

get-current-image-modus



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageModesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageModesApi apiInstance = new ImageModesApi(defaultClient);
        String carStockId = "carStockId_example"; // String | 
        String tenantId = "tenantId_example"; // String | 
        try {
            ModeCarStockIdTenantIdGet200Response result = apiInstance.modeCarStockIdTenantIdGet(carStockId, tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageModesApi#modeCarStockIdTenantIdGet");
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
| **carStockId** | **String**|  | |
| **tenantId** | **String**|  | |

### Return type

[**ModeCarStockIdTenantIdGet200Response**](ModeCarStockIdTenantIdGet200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## modePost

> ModePost200Response modePost(modePostRequest)

save-new-image-mode



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageModesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageModesApi apiInstance = new ImageModesApi(defaultClient);
        ModePostRequest modePostRequest = new ModePostRequest(); // ModePostRequest | 
        try {
            ModePost200Response result = apiInstance.modePost(modePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageModesApi#modePost");
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
| **modePostRequest** | [**ModePostRequest**](ModePostRequest.md)|  | [optional] |

### Return type

[**ModePost200Response**](ModePost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

