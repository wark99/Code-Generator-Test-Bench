# InventoryAndCollectiblesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publicApiV1InventoryAssetsUseridAssettypeidGet**](InventoryAndCollectiblesApi.md#publicApiV1InventoryAssetsUseridAssettypeidGet) | **GET** /public-api/v1/inventory/assets/{userid}/{assettypeid} | Get User&#39;s Assets by Type |
| [**publicApiV1InventoryCollectiblesUseridGet**](InventoryAndCollectiblesApi.md#publicApiV1InventoryCollectiblesUseridGet) | **GET** /public-api/v1/inventory/collectibles/{userid} | Get User&#39;s Collectibles |



## publicApiV1InventoryAssetsUseridAssettypeidGet

> PublicApiV1InventoryAssetsUseridAssettypeidGet200Response publicApiV1InventoryAssetsUseridAssettypeidGet(userid, assettypeid, page)

Get User&#39;s Assets by Type

Retrieve a user&#39;s assets of a specific type.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InventoryAndCollectiblesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        InventoryAndCollectiblesApi apiInstance = new InventoryAndCollectiblesApi(defaultClient);
        Integer userid = 56; // Integer | The ID of the user.
        Integer assettypeid = 56; // Integer | The ID of the asset type. Refer to the [Roblox Documentation](https://create.roblox.com/docs/reference/engine/enums/AssetType) for valid values.
        Integer page = 56; // Integer | The page number (optional).
        try {
            PublicApiV1InventoryAssetsUseridAssettypeidGet200Response result = apiInstance.publicApiV1InventoryAssetsUseridAssettypeidGet(userid, assettypeid, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryAndCollectiblesApi#publicApiV1InventoryAssetsUseridAssettypeidGet");
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
| **userid** | **Integer**| The ID of the user. | |
| **assettypeid** | **Integer**| The ID of the asset type. Refer to the [Roblox Documentation](https://create.roblox.com/docs/reference/engine/enums/AssetType) for valid values. | |
| **page** | **Integer**| The page number (optional). | [optional] |

### Return type

[**PublicApiV1InventoryAssetsUseridAssettypeidGet200Response**](PublicApiV1InventoryAssetsUseridAssettypeidGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | User Not Found |  -  |


## publicApiV1InventoryCollectiblesUseridGet

> PublicApiV1InventoryCollectiblesUseridGet200Response publicApiV1InventoryCollectiblesUseridGet(userid, page)

Get User&#39;s Collectibles

Retrieve a user&#39;s collectibles.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.InventoryAndCollectiblesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        InventoryAndCollectiblesApi apiInstance = new InventoryAndCollectiblesApi(defaultClient);
        Integer userid = 56; // Integer | The ID of the user.
        Integer page = 56; // Integer | The page number (optional).
        try {
            PublicApiV1InventoryCollectiblesUseridGet200Response result = apiInstance.publicApiV1InventoryCollectiblesUseridGet(userid, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling InventoryAndCollectiblesApi#publicApiV1InventoryCollectiblesUseridGet");
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
| **userid** | **Integer**| The ID of the user. | |
| **page** | **Integer**| The page number (optional). | [optional] |

### Return type

[**PublicApiV1InventoryCollectiblesUseridGet200Response**](PublicApiV1InventoryCollectiblesUseridGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | User Not Found |  -  |

