# LiveApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelLiveStartPut**](LiveApi.md#call1videosChannelLiveStartPut) | **PUT** /1/videos/{channel}/live/start | Resume the live |
| [**call1videosChannelLiveStopPut**](LiveApi.md#call1videosChannelLiveStopPut) | **PUT** /1/videos/{channel}/live/stop | Interrupt the live |



## call1videosChannelLiveStartPut

> Model1VideosPost201Response call1videosChannelLiveStartPut(channel, accountId, with)

Resume the live

Attempt to resume the live if interrupted or does nothing otherwise.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        LiveApi apiInstance = new LiveApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosPost201Response result = apiInstance.call1videosChannelLiveStartPut(channel, accountId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LiveApi#call1videosChannelLiveStartPut");
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
| **channel** | **Integer**| The unique identifier (ID) of the channel to request. | |
| **accountId** | **Integer**| The account identifier | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosPost201Response**](Model1VideosPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |


## call1videosChannelLiveStopPut

> Model1VideosPost201Response call1videosChannelLiveStopPut(channel, accountId, with)

Interrupt the live

Attempt to interrupt the live if not already interrupted or does nothing otherwise.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LiveApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        LiveApi apiInstance = new LiveApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosPost201Response result = apiInstance.call1videosChannelLiveStopPut(channel, accountId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LiveApi#call1videosChannelLiveStopPut");
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
| **channel** | **Integer**| The unique identifier (ID) of the channel to request. | |
| **accountId** | **Integer**| The account identifier | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosPost201Response**](Model1VideosPost201Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

