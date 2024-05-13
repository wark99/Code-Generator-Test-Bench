# CartApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**cartDelete**](CartApi.md#cartDelete) | **DELETE** /api/cart | Удалить товар из корзины |
| [**cartEdit**](CartApi.md#cartEdit) | **POST** /api/cart | Изменить корзину |
| [**cartGet**](CartApi.md#cartGet) | **GET** /api/cart/{uuid} | Получить корзину |



## cartDelete

> CartEdit200Response cartDelete(cartDeleteRequest)

Удалить товар из корзины

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CartApi apiInstance = new CartApi(defaultClient);
        CartDeleteRequest cartDeleteRequest = new CartDeleteRequest(); // CartDeleteRequest | 
        try {
            CartEdit200Response result = apiInstance.cartDelete(cartDeleteRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CartApi#cartDelete");
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
| **cartDeleteRequest** | [**CartDeleteRequest**](CartDeleteRequest.md)|  | |

### Return type

[**CartEdit200Response**](CartEdit200Response.md)

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


## cartEdit

> CartEdit200Response cartEdit(cartEditRequest)

Изменить корзину

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CartApi apiInstance = new CartApi(defaultClient);
        CartEditRequest cartEditRequest = new CartEditRequest(); // CartEditRequest | 
        try {
            CartEdit200Response result = apiInstance.cartEdit(cartEditRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CartApi#cartEdit");
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
| **cartEditRequest** | [**CartEditRequest**](CartEditRequest.md)|  | |

### Return type

[**CartEdit200Response**](CartEdit200Response.md)

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


## cartGet

> Cart cartGet(uuid)

Получить корзину

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CartApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        CartApi apiInstance = new CartApi(defaultClient);
        String uuid = "uuid_example"; // String | UUID корзины
        try {
            Cart result = apiInstance.cartGet(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CartApi#cartGet");
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
| **uuid** | **String**| UUID корзины | |

### Return type

[**Cart**](Cart.md)

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

