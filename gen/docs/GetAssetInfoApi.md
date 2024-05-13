# GetAssetInfoApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publicApiV1AssetAssetidGet**](GetAssetInfoApi.md#publicApiV1AssetAssetidGet) | **GET** /public-api/v1/asset/{assetid} | Get Asset by ID |



## publicApiV1AssetAssetidGet

> PublicApiV1AssetAssetidGet200Response publicApiV1AssetAssetidGet(assetid)

Get Asset by ID

Retrieve asset information by asset ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GetAssetInfoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        GetAssetInfoApi apiInstance = new GetAssetInfoApi(defaultClient);
        Integer assetid = 56; // Integer | The ID of the asset.
        try {
            PublicApiV1AssetAssetidGet200Response result = apiInstance.publicApiV1AssetAssetidGet(assetid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GetAssetInfoApi#publicApiV1AssetAssetidGet");
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
| **assetid** | **Integer**| The ID of the asset. | |

### Return type

[**PublicApiV1AssetAssetidGet200Response**](PublicApiV1AssetAssetidGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Asset Not Found |  -  |

