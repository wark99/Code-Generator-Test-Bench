# DecorationApi

All URIs are relative to *https://api.stageinhome.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**autoDecoration**](DecorationApi.md#autoDecoration) | **POST** /auto_decoration | Obtain a new automatic &#39;decoration&#39; image from your input image. |
| [**getDecoration**](DecorationApi.md#getDecoration) | **GET** /get_decoration | Get a full resolution decoration from img_id. |
| [**retryDecoration**](DecorationApi.md#retryDecoration) | **POST** /retry_decoration | Retry a &#39;decoration&#39; image using same img_id. |



## autoDecoration

> Decoration autoDecoration(roomType, style, initImage)

Obtain a new automatic &#39;decoration&#39; image from your input image.

Generates an automatic decoration for a input image of an indoor space in less than 20 seconds.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecorationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stageinhome.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DecorationApi apiInstance = new DecorationApi(defaultClient);
        String roomType = "bedroom"; // String | TODO
        String style = "modern"; // String | TODO
        File initImage = new File("/path/to/file"); // File | 
        try {
            Decoration result = apiInstance.autoDecoration(roomType, style, initImage);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecorationApi#autoDecoration");
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
| **roomType** | **String**| TODO | [default to bedroom] [enum: bedroom, living_room, dining_room, bathroom, kitchen, office, study_room] |
| **style** | **String**| TODO | [default to modern] [enum: modern, minimalist, classic, rustic, industrial, coastal, scandinavian, mediterranean] |
| **initImage** | **File**|  | [optional] |

### Return type

[**Decoration**](Decoration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: multipart/form-data
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Image for decoration uploaded successfully |  -  |
| **400** | Bad Request |  -  |


## getDecoration

> DecResult getDecoration(imgId, retryId)

Get a full resolution decoration from img_id.

Get the full resolution decoration computed automatically using the img_id provided in auto_decoration endpoint.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecorationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stageinhome.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DecorationApi apiInstance = new DecorationApi(defaultClient);
        String imgId = "imgId_example"; // String | UUID from the decoration provided for auto_decoration endpoint.
        Integer retryId = 56; // Integer | Retry id provided for retry_decoration endpoint.
        try {
            DecResult result = apiInstance.getDecoration(imgId, retryId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecorationApi#getDecoration");
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
| **imgId** | **String**| UUID from the decoration provided for auto_decoration endpoint. | |
| **retryId** | **Integer**| Retry id provided for retry_decoration endpoint. | [optional] |

### Return type

[**DecResult**](DecResult.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation (Decoration DONE) |  -  |
| **201** | successful operation (Decoration INPROGRESS) |  -  |
| **400** | Invalid status value |  -  |


## retryDecoration

> RetryDecoration retryDecoration(imgId)

Retry a &#39;decoration&#39; image using same img_id.

Generates a new decoration for an specific image identified previously decorated. The room_type and style can&#39;t be modified and it will use the same as the ones provided in the auto_decoration call.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DecorationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.stageinhome.com");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        DecorationApi apiInstance = new DecorationApi(defaultClient);
        String imgId = "xyz1230x-xyz1-123x-567a-abc123xyz123"; // String | UIID provided in auto_decoration endpoint
        try {
            RetryDecoration result = apiInstance.retryDecoration(imgId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DecorationApi#retryDecoration");
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
| **imgId** | **String**| UIID provided in auto_decoration endpoint | [default to xyz1230x-xyz1-123x-567a-abc123xyz123] |

### Return type

[**RetryDecoration**](RetryDecoration.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Processing a new decoration for specific img_id |  -  |
| **400** | Bad Request |  -  |

