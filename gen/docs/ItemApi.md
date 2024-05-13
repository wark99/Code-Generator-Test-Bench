# ItemApi

All URIs are relative to *https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addNewItem**](ItemApi.md#addNewItem) | **POST** /item |  |
| [**deleteItem**](ItemApi.md#deleteItem) | **DELETE** /item/{product_id} | Deletes an item |
| [**getAllItems**](ItemApi.md#getAllItems) | **GET** /item |  |
| [**getItemById**](ItemApi.md#getItemById) | **GET** /item/{product_id} | Get item by ID |
| [**updateItem**](ItemApi.md#updateItem) | **PUT** /item/{product_id} |  |
| [**updateItemPatch**](ItemApi.md#updateItemPatch) | **PATCH** /item/{product_id} | Update an existing item |



## addNewItem

> List&lt;AddNewItem200ResponseInner&gt; addNewItem()



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        ItemApi apiInstance = new ItemApi(defaultClient);
        try {
            List<AddNewItem200ResponseInner> result = apiInstance.addNewItem();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#addNewItem");
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

[**List&lt;AddNewItem200ResponseInner&gt;**](AddNewItem200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Response |  -  |
| **201** | Successfully created a new item |  -  |
| **405** | the requested method is not allowed for this resource |  -  |
| **409** | item with the same id already exists |  -  |


## deleteItem

> deleteItem(productId)

Deletes an item

Delete an item by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer productId = 56; // Integer | ID of the item to delete
        try {
            apiInstance.deleteItem(productId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#deleteItem");
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
| **productId** | **Integer**| ID of the item to delete | |

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
| **200** | Item Deleted |  -  |
| **400** | Invalid ID supplied |  -  |
| **403** | the server understood the delete request but refuses to authorize it |  -  |
| **404** | Item not found |  -  |


## getAllItems

> List&lt;Iteminput&gt; getAllItems()



Returns all registered items

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        ItemApi apiInstance = new ItemApi(defaultClient);
        try {
            List<Iteminput> result = apiInstance.getAllItems();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#getAllItems");
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

[**List&lt;Iteminput&gt;**](Iteminput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | invalid request format |  -  |
| **404** | No items found |  -  |


## getItemById

> Iteminput getItemById(productId)

Get item by ID

Returns a single item based on the provided ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer productId = 56; // Integer | ID of the item to retrieve
        try {
            Iteminput result = apiInstance.getItemById(productId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#getItemById");
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
| **productId** | **Integer**| ID of the item to retrieve | |

### Return type

[**Iteminput**](Iteminput.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Item not found |  -  |
| **422** | Validation exception |  -  |


## updateItem

> Object updateItem(productId, name, price, iteminput)



Update an existing item

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer productId = 56; // Integer | ID
        String name = "name_example"; // String | Product name
        Integer price = 56; // Integer | Price of product
        Iteminput iteminput = new Iteminput(); // Iteminput | Update an existent item
        try {
            Object result = apiInstance.updateItem(productId, name, price, iteminput);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#updateItem");
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
| **productId** | **Integer**| ID | [optional] |
| **name** | **String**| Product name | [optional] |
| **price** | **Integer**| Price of product | [optional] |
| **iteminput** | [**Iteminput**](Iteminput.md)| Update an existent item | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid ID |  -  |
| **404** | Item not found |  -  |
| **409** | conflict |  -  |


## updateItemPatch

> updateItemPatch(productId, iteminput)

Update an existing item

Update an existing item by ID using PATCH method

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ItemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://app.swaggerhub.com/apis/YAQEENISSA3_1/Ass/1.0.0-oas3.1");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer productId = 56; // Integer | ID of the item to update
        Iteminput iteminput = new Iteminput(); // Iteminput | Updated item information
        try {
            apiInstance.updateItemPatch(productId, iteminput);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#updateItemPatch");
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
| **productId** | **Integer**| ID of the item to update | |
| **iteminput** | [**Iteminput**](Iteminput.md)| Updated item information | |

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
| **200** | Item updated successfully |  -  |
| **204** | No Content |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Item not found |  -  |

