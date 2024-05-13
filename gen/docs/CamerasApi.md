# CamerasApi

All URIs are relative to *http://localhost:8000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**appPrintersPrinterUuidCameraPost**](CamerasApi.md#appPrintersPrinterUuidCameraPost) | **POST** /app/printers/{printer_uuid}/camera | Register camera to Connect by user. |



## appPrintersPrinterUuidCameraPost

> appPrintersPrinterUuidCameraPost(printerUuid, origin)

Register camera to Connect by user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CamerasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");
        
        // Configure API key authorization: Cookie
        ApiKeyAuth Cookie = (ApiKeyAuth) defaultClient.getAuthentication("Cookie");
        Cookie.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //Cookie.setApiKeyPrefix("Token");

        CamerasApi apiInstance = new CamerasApi(defaultClient);
        String printerUuid = "printerUuid_example"; // String | 
        String origin = "WEB"; // String | 
        try {
            apiInstance.appPrintersPrinterUuidCameraPost(printerUuid, origin);
        } catch (ApiException e) {
            System.err.println("Exception when calling CamerasApi#appPrintersPrinterUuidCameraPost");
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
| **printerUuid** | **String**|  | |
| **origin** | **String**|  | [optional] [default to WEB] [enum: WEB, OTHER] |

### Return type

null (empty response body)

### Authorization

[Cookie](../README.md#Cookie)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, text/plain


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | **OK** |  * Token -  <br>  |
| **400** |  |  -  |
| **401** |  |  -  |
| **403** |  |  -  |
| **503** |  |  -  |

