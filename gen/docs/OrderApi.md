# OrderApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**orderGet**](OrderApi.md#orderGet) | **GET** /api/order/{uuid} | Получить заказ |
| [**orderMake**](OrderApi.md#orderMake) | **POST** /api/order | Создать заказ |
| [**ordersGet**](OrderApi.md#ordersGet) | **GET** /api/order | Получить заказы пользователя |



## orderGet

> Order orderGet(uuid)

Получить заказ

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        OrderApi apiInstance = new OrderApi(defaultClient);
        String uuid = "uuid_example"; // String | UUID заказа
        try {
            Order result = apiInstance.orderGet(uuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#orderGet");
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
| **uuid** | **String**| UUID заказа | |

### Return type

[**Order**](Order.md)

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


## orderMake

> CartEdit200Response orderMake(orderMakeRequest)

Создать заказ

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        OrderMakeRequest orderMakeRequest = new OrderMakeRequest(); // OrderMakeRequest | 
        try {
            CartEdit200Response result = apiInstance.orderMake(orderMakeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#orderMake");
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
| **orderMakeRequest** | [**OrderMakeRequest**](OrderMakeRequest.md)|  | |

### Return type

[**CartEdit200Response**](CartEdit200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** |  |  -  |


## ordersGet

> List&lt;Order&gt; ordersGet()

Получить заказы пользователя

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OrderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OrderApi apiInstance = new OrderApi(defaultClient);
        try {
            List<Order> result = apiInstance.ordersGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#ordersGet");
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

[**List&lt;Order&gt;**](Order.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** |  |  -  |

