# InventoryApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**inventoryAddnewinventoryPost**](InventoryApi.md#inventoryAddnewinventoryPost) | **POST** /inventory/addnewinventory | Add a new inventory |
| [**inventoryDeleteInventoryInventoryIDDelete**](InventoryApi.md#inventoryDeleteInventoryInventoryIDDelete) | **DELETE** /inventory/deleteInventory/{inventoryID} | Delete inventory by ID |
| [**inventoryGetinventoriesGet**](InventoryApi.md#inventoryGetinventoriesGet) | **GET** /inventory/getinventories | Get all inventories |
| [**inventoryInventoryIDGet**](InventoryApi.md#inventoryInventoryIDGet) | **GET** /inventory/{inventoryID} | Get inventory by ID |
| [**inventoryUpdateInventoryInventoryIDPut**](InventoryApi.md#inventoryUpdateInventoryInventoryIDPut) | **PUT** /inventory/updateInventory/{inventoryID} | Update inventory by ID |



## inventoryAddnewinventoryPost

> inventoryAddnewinventoryPost(inventory)

Add a new inventory

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InventoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        InventoryApi apiInstance = new InventoryApi(defaultClient);
        Inventory inventory = new Inventory(); // Inventory | 
        try {
            apiInstance.inventoryAddnewinventoryPost(inventory);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryApi#inventoryAddnewinventoryPost");
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
| **inventory** | [**Inventory**](Inventory.md)|  | |

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


## inventoryDeleteInventoryInventoryIDDelete

> inventoryDeleteInventoryInventoryIDDelete(inventoryID)

Delete inventory by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InventoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        InventoryApi apiInstance = new InventoryApi(defaultClient);
        Integer inventoryID = 56; // Integer | ID of the inventory to delete
        try {
            apiInstance.inventoryDeleteInventoryInventoryIDDelete(inventoryID);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryApi#inventoryDeleteInventoryInventoryIDDelete");
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
| **inventoryID** | **Integer**| ID of the inventory to delete | |

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


## inventoryGetinventoriesGet

> List&lt;Inventory&gt; inventoryGetinventoriesGet()

Get all inventories

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InventoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        InventoryApi apiInstance = new InventoryApi(defaultClient);
        try {
            List<Inventory> result = apiInstance.inventoryGetinventoriesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryApi#inventoryGetinventoriesGet");
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

[**List&lt;Inventory&gt;**](Inventory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## inventoryInventoryIDGet

> Inventory inventoryInventoryIDGet(inventoryID)

Get inventory by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InventoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        InventoryApi apiInstance = new InventoryApi(defaultClient);
        Integer inventoryID = 56; // Integer | ID of the inventory to get
        try {
            Inventory result = apiInstance.inventoryInventoryIDGet(inventoryID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryApi#inventoryInventoryIDGet");
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
| **inventoryID** | **Integer**| ID of the inventory to get | |

### Return type

[**Inventory**](Inventory.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |


## inventoryUpdateInventoryInventoryIDPut

> inventoryUpdateInventoryInventoryIDPut(inventoryID, inventory)

Update inventory by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InventoryApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        InventoryApi apiInstance = new InventoryApi(defaultClient);
        Integer inventoryID = 56; // Integer | ID of the inventory to update
        Inventory inventory = new Inventory(); // Inventory | 
        try {
            apiInstance.inventoryUpdateInventoryInventoryIDPut(inventoryID, inventory);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryApi#inventoryUpdateInventoryInventoryIDPut");
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
| **inventoryID** | **Integer**| ID of the inventory to update | |
| **inventory** | [**Inventory**](Inventory.md)|  | |

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

