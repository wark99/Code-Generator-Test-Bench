# CuisineApi

All URIs are relative to *https://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cuisinesCuisineIdGet**](CuisineApi.md#cuisinesCuisineIdGet) | **GET** /cuisines/{cuisineId} | Get cuisine details |



## cuisinesCuisineIdGet

> CuisinesCuisineIdGet200Response cuisinesCuisineIdGet(cuisineId)

Get cuisine details

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CuisineApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://localhost:3000");

        CuisineApi apiInstance = new CuisineApi(defaultClient);
        Integer cuisineId = 56; // Integer | 
        try {
            CuisinesCuisineIdGet200Response result = apiInstance.cuisinesCuisineIdGet(cuisineId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CuisineApi#cuisinesCuisineIdGet");
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
| **cuisineId** | **Integer**|  | |

### Return type

[**CuisinesCuisineIdGet200Response**](CuisinesCuisineIdGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |

