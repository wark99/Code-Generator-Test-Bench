# ItemApi

All URIs are relative to *http://localhost:8000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**itemsGet**](ItemApi.md#itemsGet) | **GET** /items | Retrieve all items |
| [**itemsIdDelete**](ItemApi.md#itemsIdDelete) | **DELETE** /items/{id} | Delete an item by ID |
| [**itemsIdGet**](ItemApi.md#itemsIdGet) | **GET** /items/{id} | Retrieve a specific item by ID |
| [**itemsIdPatch**](ItemApi.md#itemsIdPatch) | **PATCH** /items/{id} | Partially update an item by ID |
| [**itemsIdPut**](ItemApi.md#itemsIdPut) | **PUT** /items/{id} | Update an item by ID |
| [**itemsPost**](ItemApi.md#itemsPost) | **POST** /items | Create an item |



## itemsGet

> itemsGet()

Retrieve all items

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
        defaultClient.setBasePath("http://localhost:8000");

        ItemApi apiInstance = new ItemApi(defaultClient);
        try {
            apiInstance.itemsGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemsGet");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | The request parameters are invalid. |  -  |
| **403** | The user is not authorized to perform the operation. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## itemsIdDelete

> itemsIdDelete(id)

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
        defaultClient.setBasePath("http://localhost:8000");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer id = 2; // Integer | ID of the item to delete
        try {
            apiInstance.itemsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemsIdDelete");
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
| **id** | **Integer**| ID of the item to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **403** | The user is not authorized. |  -  |
| **404** | The requested item could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## itemsIdGet

> itemsIdGet(id)

Retrieve a specific item by ID

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
        defaultClient.setBasePath("http://localhost:8000");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer id = 2; // Integer | ID of the item to retrieve
        try {
            apiInstance.itemsIdGet(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemsIdGet");
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
| **id** | **Integer**| ID of the item to retrieve | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **404** | The requested item could not be found. |  -  |


## itemsIdPatch

> itemsIdPatch(id, itemsIdPatchRequest)

Partially update an item by ID

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
        defaultClient.setBasePath("http://localhost:8000");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer id = 2; // Integer | ID of the item to update
        ItemsIdPatchRequest itemsIdPatchRequest = new ItemsIdPatchRequest(); // ItemsIdPatchRequest | 
        try {
            apiInstance.itemsIdPatch(id, itemsIdPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemsIdPatch");
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
| **id** | **Integer**| ID of the item to update | |
| **itemsIdPatchRequest** | [**ItemsIdPatchRequest**](ItemsIdPatchRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |
| **403** | The user is not authorized. |  -  |
| **404** | The requested item could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## itemsIdPut

> itemsIdPut(id, itemsPostRequest)

Update an item by ID

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
        defaultClient.setBasePath("http://localhost:8000");

        ItemApi apiInstance = new ItemApi(defaultClient);
        Integer id = 2; // Integer | ID of the item to update
        ItemsPostRequest itemsPostRequest = new ItemsPostRequest(); // ItemsPostRequest | 
        try {
            apiInstance.itemsIdPut(id, itemsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemsIdPut");
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
| **id** | **Integer**| ID of the item to update | |
| **itemsPostRequest** | [**ItemsPostRequest**](ItemsPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |
| **403** | The user is not authorized. |  -  |
| **404** | The requested item could not be found. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |


## itemsPost

> itemsPost(itemsPostRequest)

Create an item

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
        defaultClient.setBasePath("http://localhost:8000");

        ItemApi apiInstance = new ItemApi(defaultClient);
        ItemsPostRequest itemsPostRequest = new ItemsPostRequest(); // ItemsPostRequest | 
        try {
            apiInstance.itemsPost(itemsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ItemApi#itemsPost");
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
| **itemsPostRequest** | [**ItemsPostRequest**](ItemsPostRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The item was successfully created. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |
| **403** | The user is not authorized to perform the operation. |  -  |
| **500** | An unexpected error occurred on the server. |  -  |

