# ItemsApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getItems**](ItemsApi.md#getItems) | **GET** /items/ | Retrieve a comprehensive list of Star Citizen items, including ship components, weapons, and more. |
| [**getItemsPricesAllByCategory**](ItemsApi.md#getItemsPricesAllByCategory) | **GET** /items_prices_all/id_category/{id_category}/ | Retrieve a list of prices for all items in all terminals, all at once |
| [**getItemsPricesByCategory**](ItemsApi.md#getItemsPricesByCategory) | **GET** /items_prices/id_category/{id_category}/ | Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more. |
| [**getItemsPricesByItem**](ItemsApi.md#getItemsPricesByItem) | **GET** /items_prices/id_item/{id_item}/ | Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more. |
| [**getItemsPricesByTerminal**](ItemsApi.md#getItemsPricesByTerminal) | **GET** /items_prices/id_terminal/{id_terminal}/ | Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more. |



## getItems

> GetItemsOkResponse getItems(idCategory)

Retrieve a comprehensive list of Star Citizen items, including ship components, weapons, and more.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        BigDecimal idCategory = new BigDecimal(78); // BigDecimal | 
        try {
            GetItemsOkResponse result = apiInstance.getItems(idCategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItems");
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
| **idCategory** | **BigDecimal**|  | [optional] |

### Return type

[**GetItemsOkResponse**](GetItemsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getItemsPricesAllByCategory

> GetItemsPricesAllOkResponse getItemsPricesAllByCategory(idCategory)

Retrieve a list of prices for all items in all terminals, all at once

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String idCategory = "idCategory_example"; // String | 
        try {
            GetItemsPricesAllOkResponse result = apiInstance.getItemsPricesAllByCategory(idCategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItemsPricesAllByCategory");
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
| **idCategory** | **String**|  | |

### Return type

[**GetItemsPricesAllOkResponse**](GetItemsPricesAllOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getItemsPricesByCategory

> GetItemsPricesOkResponse getItemsPricesByCategory(idCategory)

Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String idCategory = "idCategory_example"; // String | 
        try {
            GetItemsPricesOkResponse result = apiInstance.getItemsPricesByCategory(idCategory);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItemsPricesByCategory");
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
| **idCategory** | **String**|  | |

### Return type

[**GetItemsPricesOkResponse**](GetItemsPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getItemsPricesByItem

> GetItemsPricesOkResponse getItemsPricesByItem(idItem)

Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String idItem = "idItem_example"; // String | 
        try {
            GetItemsPricesOkResponse result = apiInstance.getItemsPricesByItem(idItem);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItemsPricesByItem");
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
| **idItem** | **String**|  | |

### Return type

[**GetItemsPricesOkResponse**](GetItemsPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getItemsPricesByTerminal

> GetItemsPricesOkResponse getItemsPricesByTerminal(idTerminal)

Retrieve a comprehensive list of prices for all items, including armor, ship components, weapons, and more.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        ItemsApi apiInstance = new ItemsApi(defaultClient);
        String idTerminal = "idTerminal_example"; // String | 
        try {
            GetItemsPricesOkResponse result = apiInstance.getItemsPricesByTerminal(idTerminal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemsApi#getItemsPricesByTerminal");
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
| **idTerminal** | **String**|  | |

### Return type

[**GetItemsPricesOkResponse**](GetItemsPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

