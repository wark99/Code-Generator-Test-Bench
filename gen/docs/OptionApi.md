# OptionApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelOptionsGet**](OptionApi.md#call1videosChannelOptionsGet) | **GET** /1/videos/{channel}/options | List option |
| [**call1videosChannelOptionsVideoOptionGet**](OptionApi.md#call1videosChannelOptionsVideoOptionGet) | **GET** /1/videos/{channel}/options/{video_option} | Return option |
| [**call1videosChannelOptionsVideoOptionRecommitPut**](OptionApi.md#call1videosChannelOptionsVideoOptionRecommitPut) | **PUT** /1/videos/{channel}/options/{video_option}/recommit | Undertake option |
| [**call1videosChannelOptionsVideoOptionTerminateDelete**](OptionApi.md#call1videosChannelOptionsVideoOptionTerminateDelete) | **DELETE** /1/videos/{channel}/options/{video_option}/terminate | Terminate option |



## call1videosChannelOptionsGet

> Model1VideosChannelOptionsGet200Response call1videosChannelOptionsGet(channel, with)

List option

This endpoint allows you to retrieve to see all option of the  channel.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionApi apiInstance = new OptionApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsGet200Response result = apiInstance.call1videosChannelOptionsGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#call1videosChannelOptionsGet");
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

[**Model1VideosChannelOptionsGet200Response**](Model1VideosChannelOptionsGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelOptionsVideoOptionGet

> Model1VideosChannelOptionsVideoOptionGet200Response call1videosChannelOptionsVideoOptionGet(channel, videoOption, with)

Return option

This endpoint allows you to retrieve option.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionApi apiInstance = new OptionApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String videoOption = "videoOption_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsVideoOptionGet200Response result = apiInstance.call1videosChannelOptionsVideoOptionGet(channel, videoOption, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#call1videosChannelOptionsVideoOptionGet");
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
| **videoOption** | **String**|  | [optional] |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelOptionsVideoOptionGet200Response**](Model1VideosChannelOptionsVideoOptionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosChannelOptionsVideoOptionRecommitPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsVideoOptionRecommitPut(channel, videoOption, with)

Undertake option

This WILL NOT restore an option effectively terminated, regardless of whether the option has been instantly terminated or its termination date has been reached.  If the given option has already been marked for termination for the given channel then this won&#39;t do anything.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionApi apiInstance = new OptionApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String videoOption = "videoOption_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1videosChannelOptionsVideoOptionRecommitPut(channel, videoOption, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#call1videosChannelOptionsVideoOptionRecommitPut");
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
| **videoOption** | **String**|  | [optional] |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

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


## call1videosChannelOptionsVideoOptionTerminateDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsVideoOptionTerminateDelete(channel, videoOption, with)

Terminate option

This endpoint allows you to retrieve to terminate the option.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionApi apiInstance = new OptionApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String videoOption = "videoOption_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1videosChannelOptionsVideoOptionTerminateDelete(channel, videoOption, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionApi#call1videosChannelOptionsVideoOptionTerminateDelete");
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
| **videoOption** | **String**|  | [optional] |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

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

