# ProductsApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productsGet**](ProductsApi.md#productsGet) | **GET** /products | get all service packages available |



## productsGet

> List&lt;ProductsGet200ResponseInner&gt; productsGet()

get all service packages available

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        ProductsApi apiInstance = new ProductsApi(defaultClient);
        try {
            List<ProductsGet200ResponseInner> result = apiInstance.productsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductsApi#productsGet");
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

[**List&lt;ProductsGet200ResponseInner&gt;**](ProductsGet200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All service packages retrieved |  -  |
| **400** | Unable to retrieve service package |  -  |
| **403** | Forbidden |  -  |
| **0** | Unexpected Error |  -  |

