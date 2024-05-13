# BackgroundImagesApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**newBackgroundGetActiveBackgroundCarStockIdGet**](BackgroundImagesApi.md#newBackgroundGetActiveBackgroundCarStockIdGet) | **GET** /new/background/getActiveBackground/{carStockId} | get-active-background-for-carstock |
| [**newBackgroundListPost**](BackgroundImagesApi.md#newBackgroundListPost) | **POST** /new/background/list | carstock-specific-background-list |
| [**newBackgroundRestorePost**](BackgroundImagesApi.md#newBackgroundRestorePost) | **POST** /new/background/restore | restore-background-to-automatic |
| [**newBackgroundSavePost**](BackgroundImagesApi.md#newBackgroundSavePost) | **POST** /new/background/save | carstock-specific-background-save |



## newBackgroundGetActiveBackgroundCarStockIdGet

> NewBackgroundGetActiveBackgroundCarStockIdGet200Response newBackgroundGetActiveBackgroundCarStockIdGet(carStockId)

get-active-background-for-carstock



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        BackgroundImagesApi apiInstance = new BackgroundImagesApi(defaultClient);
        Integer carStockId = 56; // Integer | 
        try {
            NewBackgroundGetActiveBackgroundCarStockIdGet200Response result = apiInstance.newBackgroundGetActiveBackgroundCarStockIdGet(carStockId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundImagesApi#newBackgroundGetActiveBackgroundCarStockIdGet");
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
| **carStockId** | **Integer**|  | |

### Return type

[**NewBackgroundGetActiveBackgroundCarStockIdGet200Response**](NewBackgroundGetActiveBackgroundCarStockIdGet200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## newBackgroundListPost

> NewBackgroundListPost200Response newBackgroundListPost(newBackgroundListPostRequest)

carstock-specific-background-list



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        BackgroundImagesApi apiInstance = new BackgroundImagesApi(defaultClient);
        NewBackgroundListPostRequest newBackgroundListPostRequest = new NewBackgroundListPostRequest(); // NewBackgroundListPostRequest | 
        try {
            NewBackgroundListPost200Response result = apiInstance.newBackgroundListPost(newBackgroundListPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundImagesApi#newBackgroundListPost");
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
| **newBackgroundListPostRequest** | [**NewBackgroundListPostRequest**](NewBackgroundListPostRequest.md)|  | [optional] |

### Return type

[**NewBackgroundListPost200Response**](NewBackgroundListPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## newBackgroundRestorePost

> NewManagementBackgroundNewBackgroundPost200Response newBackgroundRestorePost(newBackgroundListPostRequest)

restore-background-to-automatic



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        BackgroundImagesApi apiInstance = new BackgroundImagesApi(defaultClient);
        NewBackgroundListPostRequest newBackgroundListPostRequest = new NewBackgroundListPostRequest(); // NewBackgroundListPostRequest | 
        try {
            NewManagementBackgroundNewBackgroundPost200Response result = apiInstance.newBackgroundRestorePost(newBackgroundListPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundImagesApi#newBackgroundRestorePost");
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
| **newBackgroundListPostRequest** | [**NewBackgroundListPostRequest**](NewBackgroundListPostRequest.md)|  | [optional] |

### Return type

[**NewManagementBackgroundNewBackgroundPost200Response**](NewManagementBackgroundNewBackgroundPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **400** | Bad Request |  -  |


## newBackgroundSavePost

> NewManagementBackgroundNewBackgroundPost200Response newBackgroundSavePost(newBackgroundSavePostRequest)

carstock-specific-background-save



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        BackgroundImagesApi apiInstance = new BackgroundImagesApi(defaultClient);
        NewBackgroundSavePostRequest newBackgroundSavePostRequest = new NewBackgroundSavePostRequest(); // NewBackgroundSavePostRequest | 
        try {
            NewManagementBackgroundNewBackgroundPost200Response result = apiInstance.newBackgroundSavePost(newBackgroundSavePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundImagesApi#newBackgroundSavePost");
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
| **newBackgroundSavePostRequest** | [**NewBackgroundSavePostRequest**](NewBackgroundSavePostRequest.md)|  | [optional] |

### Return type

[**NewManagementBackgroundNewBackgroundPost200Response**](NewManagementBackgroundNewBackgroundPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

