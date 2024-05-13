# BackgroundImagesManagementApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**newManagementBackgroundIdDelete**](BackgroundImagesManagementApi.md#newManagementBackgroundIdDelete) | **DELETE** /new/management/background/{id} | delete-background |
| [**newManagementBackgroundListTenantIdGet**](BackgroundImagesManagementApi.md#newManagementBackgroundListTenantIdGet) | **GET** /new/management/background/list/{tenantId} | get list backgrounds |
| [**newManagementBackgroundNewBackgroundPost**](BackgroundImagesManagementApi.md#newManagementBackgroundNewBackgroundPost) | **POST** /new/management/background/new-background | add-new-background-image |



## newManagementBackgroundIdDelete

> NewManagementBackgroundIdDelete200Response newManagementBackgroundIdDelete(id)

delete-background



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundImagesManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        BackgroundImagesManagementApi apiInstance = new BackgroundImagesManagementApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            NewManagementBackgroundIdDelete200Response result = apiInstance.newManagementBackgroundIdDelete(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundImagesManagementApi#newManagementBackgroundIdDelete");
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
| **id** | **Integer**|  | |

### Return type

[**NewManagementBackgroundIdDelete200Response**](NewManagementBackgroundIdDelete200Response.md)

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


## newManagementBackgroundListTenantIdGet

> NewManagementBackgroundListTenantIdGet200Response newManagementBackgroundListTenantIdGet(tenantId)

get list backgrounds



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundImagesManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        BackgroundImagesManagementApi apiInstance = new BackgroundImagesManagementApi(defaultClient);
        Integer tenantId = 56; // Integer | 
        try {
            NewManagementBackgroundListTenantIdGet200Response result = apiInstance.newManagementBackgroundListTenantIdGet(tenantId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundImagesManagementApi#newManagementBackgroundListTenantIdGet");
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
| **tenantId** | **Integer**|  | |

### Return type

[**NewManagementBackgroundListTenantIdGet200Response**](NewManagementBackgroundListTenantIdGet200Response.md)

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


## newManagementBackgroundNewBackgroundPost

> NewManagementBackgroundNewBackgroundPost200Response newManagementBackgroundNewBackgroundPost(userId, tenantId, backgroundName, adjustImageSetting, brandIds, dealerIds, customImageSetting, backgroundImage)

add-new-background-image



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BackgroundImagesManagementApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        BackgroundImagesManagementApi apiInstance = new BackgroundImagesManagementApi(defaultClient);
        Integer userId = 56; // Integer | 
        Integer tenantId = 56; // Integer | 
        String backgroundName = "backgroundName_example"; // String | 
        String adjustImageSetting = "FIRST"; // String | 
        List<String> brandIds = Arrays.asList(); // List<String> | 
        List<String> dealerIds = Arrays.asList(); // List<String> | 
        String customImageSetting = "customImageSetting_example"; // String | 
        File backgroundImage = new File("/path/to/file"); // File | 
        try {
            NewManagementBackgroundNewBackgroundPost200Response result = apiInstance.newManagementBackgroundNewBackgroundPost(userId, tenantId, backgroundName, adjustImageSetting, brandIds, dealerIds, customImageSetting, backgroundImage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BackgroundImagesManagementApi#newManagementBackgroundNewBackgroundPost");
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
| **userId** | **Integer**|  | |
| **tenantId** | **Integer**|  | |
| **backgroundName** | **String**|  | |
| **adjustImageSetting** | **String**|  | [enum: FIRST, LAST, ALL, SPECIFIC] |
| **brandIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **dealerIds** | [**List&lt;String&gt;**](String.md)|  | [optional] |
| **customImageSetting** | **String**|  | [optional] |
| **backgroundImage** | **File**|  | [optional] |

### Return type

[**NewManagementBackgroundNewBackgroundPost200Response**](NewManagementBackgroundNewBackgroundPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

