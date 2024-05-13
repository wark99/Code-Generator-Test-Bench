# OptionWatermarkingApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelOptionsWatermarkDisablePut**](OptionWatermarkingApi.md#call1videosChannelOptionsWatermarkDisablePut) | **PUT** /1/videos/{channel}/options/watermark/disable | Disable watermark |
| [**call1videosChannelOptionsWatermarkEnablePut**](OptionWatermarkingApi.md#call1videosChannelOptionsWatermarkEnablePut) | **PUT** /1/videos/{channel}/options/watermark/enable | Enabled watermark |
| [**call1videosChannelOptionsWatermarkGet**](OptionWatermarkingApi.md#call1videosChannelOptionsWatermarkGet) | **GET** /1/videos/{channel}/options/watermark | Return watermark |
| [**call1videosChannelOptionsWatermarkPost**](OptionWatermarkingApi.md#call1videosChannelOptionsWatermarkPost) | **POST** /1/videos/{channel}/options/watermark | Create watermark |
| [**call1videosChannelOptionsWatermarkPut**](OptionWatermarkingApi.md#call1videosChannelOptionsWatermarkPut) | **PUT** /1/videos/{channel}/options/watermark | Update watermark |



## call1videosChannelOptionsWatermarkDisablePut

> Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkDisablePut(channel, with)

Disable watermark

This endpoint allows you to retrieve to enable the watermark.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionWatermarkingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionWatermarkingApi apiInstance = new OptionWatermarkingApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsWatermarkGet200Response result = apiInstance.call1videosChannelOptionsWatermarkDisablePut(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionWatermarkingApi#call1videosChannelOptionsWatermarkDisablePut");
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

[**Model1VideosChannelOptionsWatermarkGet200Response**](Model1VideosChannelOptionsWatermarkGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelOptionsWatermarkEnablePut

> Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkEnablePut(channel, with)

Enabled watermark

This endpoint allows you to retrieve to enable the watermark.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionWatermarkingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionWatermarkingApi apiInstance = new OptionWatermarkingApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsWatermarkGet200Response result = apiInstance.call1videosChannelOptionsWatermarkEnablePut(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionWatermarkingApi#call1videosChannelOptionsWatermarkEnablePut");
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

[**Model1VideosChannelOptionsWatermarkGet200Response**](Model1VideosChannelOptionsWatermarkGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelOptionsWatermarkGet

> Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkGet(channel, with)

Return watermark

This endpoint allows you to retrieve to get the watermark.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionWatermarkingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionWatermarkingApi apiInstance = new OptionWatermarkingApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsWatermarkGet200Response result = apiInstance.call1videosChannelOptionsWatermarkGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionWatermarkingApi#call1videosChannelOptionsWatermarkGet");
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

[**Model1VideosChannelOptionsWatermarkGet200Response**](Model1VideosChannelOptionsWatermarkGet200Response.md)

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


## call1videosChannelOptionsWatermarkPost

> Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkPost(channel, with)

Create watermark

This endpoint allows you to retrieve to create the watermark.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionWatermarkingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionWatermarkingApi apiInstance = new OptionWatermarkingApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsWatermarkGet200Response result = apiInstance.call1videosChannelOptionsWatermarkPost(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionWatermarkingApi#call1videosChannelOptionsWatermarkPost");
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

[**Model1VideosChannelOptionsWatermarkGet200Response**](Model1VideosChannelOptionsWatermarkGet200Response.md)

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


## call1videosChannelOptionsWatermarkPut

> Model1VideosChannelOptionsWatermarkGet200Response call1videosChannelOptionsWatermarkPut(channel, with)

Update watermark

This endpoint allows you to retrieve to update the watermark.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionWatermarkingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionWatermarkingApi apiInstance = new OptionWatermarkingApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsWatermarkGet200Response result = apiInstance.call1videosChannelOptionsWatermarkPut(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionWatermarkingApi#call1videosChannelOptionsWatermarkPut");
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

[**Model1VideosChannelOptionsWatermarkGet200Response**](Model1VideosChannelOptionsWatermarkGet200Response.md)

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
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |

