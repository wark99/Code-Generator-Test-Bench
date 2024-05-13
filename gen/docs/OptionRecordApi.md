# OptionRecordApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelOptionsRecordingGet**](OptionRecordApi.md#call1videosChannelOptionsRecordingGet) | **GET** /1/videos/{channel}/options/recording | Return Recording config |
| [**call1videosChannelOptionsRecordingPost**](OptionRecordApi.md#call1videosChannelOptionsRecordingPost) | **POST** /1/videos/{channel}/options/recording | Create recording config |
| [**call1videosChannelOptionsRecordingPut**](OptionRecordApi.md#call1videosChannelOptionsRecordingPut) | **PUT** /1/videos/{channel}/options/recording | Update recording config |



## call1videosChannelOptionsRecordingGet

> Model1VideosChannelOptionsRecordingGet200Response call1videosChannelOptionsRecordingGet(channel, with)

Return Recording config

This endpoint allows you to retrieve to get the recording config.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordApi apiInstance = new OptionRecordApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsRecordingGet200Response result = apiInstance.call1videosChannelOptionsRecordingGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordApi#call1videosChannelOptionsRecordingGet");
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
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelOptionsRecordingGet200Response**](Model1VideosChannelOptionsRecordingGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelOptionsRecordingPost

> Model1VideosChannelOptionsRecordingGet200Response call1videosChannelOptionsRecordingPost(channel, with)

Create recording config

This endpoint allows you to retrieve to update a Recording config.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordApi apiInstance = new OptionRecordApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsRecordingGet200Response result = apiInstance.call1videosChannelOptionsRecordingPost(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordApi#call1videosChannelOptionsRecordingPost");
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
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelOptionsRecordingGet200Response**](Model1VideosChannelOptionsRecordingGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1videosChannelOptionsRecordingPut

> Model1VideosChannelOptionsRecordingGet200Response call1videosChannelOptionsRecordingPut(channel, accountId, with, requestBody67)

Update recording config

This endpoint allows you to retrieve to update a Recording config.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordApi apiInstance = new OptionRecordApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody67 requestBody67 = new RequestBody67(); // RequestBody67 | 
        try {
            Model1VideosChannelOptionsRecordingGet200Response result = apiInstance.call1videosChannelOptionsRecordingPut(channel, accountId, with, requestBody67);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordApi#call1videosChannelOptionsRecordingPut");
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
| **requestBody67** | [**RequestBody67**](RequestBody67.md)|  | [optional] |

### Return type

[**Model1VideosChannelOptionsRecordingGet200Response**](Model1VideosChannelOptionsRecordingGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

