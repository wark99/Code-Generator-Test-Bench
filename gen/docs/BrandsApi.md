# BrandsApi

All URIs are relative to *https://websitebuilder.one.com/api/pub/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**brandsCodeNameGet**](BrandsApi.md#brandsCodeNameGet) | **GET** /brands/{codeName} | Get information for specific brand |
| [**brandsGet**](BrandsApi.md#brandsGet) | **GET** /brands | Get brands list |



## brandsCodeNameGet

> Brand brandsCodeNameGet(codeName)

Get information for specific brand

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://websitebuilder.one.com/api/pub/v1");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String codeName = "onecom"; // String | 
        try {
            Brand result = apiInstance.brandsCodeNameGet(codeName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#brandsCodeNameGet");
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
| **codeName** | **String**|  | [enum: onecom, hostnet, checkdomain] |

### Return type

[**Brand**](Brand.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## brandsGet

> List&lt;Brand&gt; brandsGet(env)

Get brands list

Brands discovery endpoint.   Requires special &#x60;root&#x60; client acccess token 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BrandsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://websitebuilder.one.com/api/pub/v1");

        BrandsApi apiInstance = new BrandsApi(defaultClient);
        String env = "prod"; // String | 
        try {
            List<Brand> result = apiInstance.brandsGet(env);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BrandsApi#brandsGet");
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
| **env** | **String**|  | [optional] [default to prod] [enum: prod, staging, phase, next, test] |

### Return type

[**List&lt;Brand&gt;**](Brand.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |
| **401** | Unauthorized |  -  |
| **403** | Forbidden |  -  |
| **500** | Internal Server Error. Contact devs |  -  |

