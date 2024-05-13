# ItemApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemAdditemPost**](ItemApi.md#itemAdditemPost) | **POST** /item/additem | Add a new item |
| [**itemDeleteitemItemIDDelete**](ItemApi.md#itemDeleteitemItemIDDelete) | **DELETE** /item/deleteitem/{itemID} | Delete item by ID |
| [**itemGetitemsGet**](ItemApi.md#itemGetitemsGet) | **GET** /item/getitems | Get all items |
| [**itemItemIDGet**](ItemApi.md#itemItemIDGet) | **GET** /item/{itemID} | Get item by ID |
| [**itemUpdateitemItemIDPut**](ItemApi.md#itemUpdateitemItemIDPut) | **PUT** /item/updateitem/{itemID} | Update item by ID |



## itemAdditemPost

> itemAdditemPost(item)

Add a new item

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
        defaultClient.setBasePath("http://localhost");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Item item = new Item(); // Item | 
        try {
            apiInstance.itemAdditemPost(item);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemAdditemPost");
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
| **item** | [**Item**](Item.md)|  | |

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
| **200** | Successful operation |  -  |


## itemDeleteitemItemIDDelete

> itemDeleteitemItemIDDelete(itemID)

Delete item by ID

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
        defaultClient.setBasePath("http://localhost");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer itemID = 56; // Integer | ID of the item to delete
        try {
            apiInstance.itemDeleteitemItemIDDelete(itemID);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemDeleteitemItemIDDelete");
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
| **itemID** | **Integer**| ID of the item to delete | |

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
| **200** | Successful operation |  -  |


## itemGetitemsGet

> List&lt;Item&gt; itemGetitemsGet()

Get all items

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
        defaultClient.setBasePath("http://localhost");

        ItemApi apiInstance = new ItemApi(defaultClient);
        try {
            List<Item> result = apiInstance.itemGetitemsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemGetitemsGet");
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

[**List&lt;Item&gt;**](Item.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## itemItemIDGet

> Item itemItemIDGet(itemID)

Get item by ID

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
        defaultClient.setBasePath("http://localhost");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer itemID = 56; // Integer | ID of the item to get
        try {
            Item result = apiInstance.itemItemIDGet(itemID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemItemIDGet");
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
| **itemID** | **Integer**| ID of the item to get | |

### Return type

[**Item**](Item.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## itemUpdateitemItemIDPut

> itemUpdateitemItemIDPut(itemID, item)

Update item by ID

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
        defaultClient.setBasePath("http://localhost");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer itemID = 56; // Integer | ID of the item to update
        Item item = new Item(); // Item | 
        try {
            apiInstance.itemUpdateitemItemIDPut(itemID, item);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemUpdateitemItemIDPut");
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
| **itemID** | **Integer**| ID of the item to update | |
| **item** | [**Item**](Item.md)|  | |

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
| **200** | Successful operation |  -  |

