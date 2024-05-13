# FutureApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**listDistributions**](FutureApi.md#listDistributions) | **GET** /distributions/ | List Distributions |



## listDistributions

> List&lt;Distribution&gt; listDistributions(index, max)

List Distributions



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FutureApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        FutureApi apiInstance = new FutureApi(defaultClient);
        Integer index = 56; // Integer | Start at offset (paging)
        Integer max = 56; // Integer | Max returned (paging)
        try {
            List<Distribution> result = apiInstance.listDistributions(index, max);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FutureApi#listDistributions");
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
| **index** | **Integer**| Start at offset (paging) | |
| **max** | **Integer**| Max returned (paging) | |

### Return type

[**List&lt;Distribution&gt;**](Distribution.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid Request |  -  |
| **404** | Distribution not found |  -  |

