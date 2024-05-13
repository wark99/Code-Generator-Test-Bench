# ProductApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**productFilter**](ProductApi.md#productFilter) | **POST** /api/product/filter | Отфильтровать товары |
| [**productGet**](ProductApi.md#productGet) | **GET** /api/product/{slug} | Получить товар по ЧПУ |



## productFilter

> List&lt;Product&gt; productFilter(productFilterRequest)

Отфильтровать товары

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ProductApi apiInstance = new ProductApi(defaultClient);
        ProductFilterRequest productFilterRequest = new ProductFilterRequest(); // ProductFilterRequest | 
        try {
            List<Product> result = apiInstance.productFilter(productFilterRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#productFilter");
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
| **productFilterRequest** | [**ProductFilterRequest**](ProductFilterRequest.md)|  | |

### Return type

[**List&lt;Product&gt;**](Product.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** |  |  -  |


## productGet

> Product productGet(slug)

Получить товар по ЧПУ

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ProductApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        ProductApi apiInstance = new ProductApi(defaultClient);
        String slug = "slug_example"; // String | ЧПУ товара
        try {
            Product result = apiInstance.productGet(slug);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ProductApi#productGet");
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
| **slug** | **String**| ЧПУ товара | |

### Return type

[**Product**](Product.md)

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

