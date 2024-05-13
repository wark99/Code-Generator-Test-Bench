# OrderApi

All URIs are relative to *https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createOrder**](OrderApi.md#createOrder) | **POST** /order | Create a new order |
| [**deleteOrder**](OrderApi.md#deleteOrder) | **DELETE** /Order/{order_id} | Delete an order |
| [**getAllOrders**](OrderApi.md#getAllOrders) | **GET** /order | Get all orders |
| [**getOrderById**](OrderApi.md#getOrderById) | **GET** /Order/{order_id} | Get order by ID |
| [**partialUpdateOrder**](OrderApi.md#partialUpdateOrder) | **PATCH** /Order/{order_id} | Update an existing order partially |
| [**updateOrder**](OrderApi.md#updateOrder) | **PUT** /Order/{order_id} | Update an existing order |



## createOrder

> createOrder(order)

Create a new order

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Order order = new Order(); // Order | Order object to be created
        try {
            apiInstance.createOrder(order);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#createOrder");
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
| **order** | [**Order**](Order.md)| Order object to be created | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order created successfully |  -  |


## deleteOrder

> deleteOrder(orderId)

Delete an order

Delete an order by ID

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Integer orderId = 56; // Integer | ID of the order to delete
        try {
            apiInstance.deleteOrder(orderId);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#deleteOrder");
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
| **orderId** | **Integer**| ID of the order to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order deleted successfully |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |


## getAllOrders

> List&lt;Order&gt; getAllOrders()

Get all orders

Returns all registered orders

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        OrderApi apiInstance = new OrderApi(defaultClient);
        try {
            List<Order> result = apiInstance.getAllOrders();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#getAllOrders");
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

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## getOrderById

> Order getOrderById(orderId)

Get order by ID

Returns a single order based on the provided ID

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Integer orderId = 56; // Integer | ID of the order to retrieve
        try {
            Order result = apiInstance.getOrderById(orderId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#getOrderById");
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
| **orderId** | **Integer**| ID of the order to retrieve | |

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
| **200** | Successful operation |  -  |
| **404** | Order not found |  -  |


## partialUpdateOrder

> partialUpdateOrder(orderId, order)

Update an existing order partially

Update an existing order partially by ID

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Integer orderId = 56; // Integer | ID of the order to update
        Order order = new Order(); // Order | Partially updated order information
        try {
            apiInstance.partialUpdateOrder(orderId, order);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#partialUpdateOrder");
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
| **orderId** | **Integer**| ID of the order to update | |
| **order** | [**Order**](Order.md)| Partially updated order information | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order updated successfully |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |
| **409** | conflict |  -  |


## updateOrder

> updateOrder(orderId, order)

Update an existing order

Update an existing order by ID

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
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        OrderApi apiInstance = new OrderApi(defaultClient);
        Integer orderId = 56; // Integer | ID of the order to update
        Order order = new Order(); // Order | Updated order information
        try {
            apiInstance.updateOrder(orderId, order);
        } catch (ApiException e) {
            System.err.println("Exception when calling OrderApi#updateOrder");
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
| **orderId** | **Integer**| ID of the order to update | |
| **order** | [**Order**](Order.md)| Updated order information | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Order updated successfully |  -  |
| **204** | No Content |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Order not found |  -  |

