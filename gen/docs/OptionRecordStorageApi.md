# OptionRecordStorageApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelOptionsRecordingStorageGet**](OptionRecordStorageApi.md#call1videosChannelOptionsRecordingStorageGet) | **GET** /1/videos/{channel}/options/recording/storage | Lists all storage machine |
| [**call1videosChannelOptionsRecordingStoragePost**](OptionRecordStorageApi.md#call1videosChannelOptionsRecordingStoragePost) | **POST** /1/videos/{channel}/options/recording/storage | Return a storage machine |
| [**call1videosChannelOptionsRecordingStorageTestPost**](OptionRecordStorageApi.md#call1videosChannelOptionsRecordingStorageTestPost) | **POST** /1/videos/{channel}/options/recording/storage/test | Update a storage machine |
| [**call1videosChannelOptionsRecordingStorageVideoStorageMachineDelete**](OptionRecordStorageApi.md#call1videosChannelOptionsRecordingStorageVideoStorageMachineDelete) | **DELETE** /1/videos/{channel}/options/recording/storage/{video_storage_machine} | Update a storage machine |
| [**call1videosChannelOptionsRecordingStorageVideoStorageMachineGet**](OptionRecordStorageApi.md#call1videosChannelOptionsRecordingStorageVideoStorageMachineGet) | **GET** /1/videos/{channel}/options/recording/storage/{video_storage_machine} | Create a storage machine |
| [**call1videosChannelOptionsRecordingStorageVideoStorageMachinePut**](OptionRecordStorageApi.md#call1videosChannelOptionsRecordingStorageVideoStorageMachinePut) | **PUT** /1/videos/{channel}/options/recording/storage/{video_storage_machine} | Update a storage machine |



## call1videosChannelOptionsRecordingStorageGet

> Model1VideosChannelOptionsRecordingStorageGet200Response call1videosChannelOptionsRecordingStorageGet(channel, with)

Lists all storage machine

This endpoint allows you to retrieve all storage machine.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordStorageApi apiInstance = new OptionRecordStorageApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsRecordingStorageGet200Response result = apiInstance.call1videosChannelOptionsRecordingStorageGet(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordStorageApi#call1videosChannelOptionsRecordingStorageGet");
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

[**Model1VideosChannelOptionsRecordingStorageGet200Response**](Model1VideosChannelOptionsRecordingStorageGet200Response.md)

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


## call1videosChannelOptionsRecordingStoragePost

> Model1VideosChannelOptionsRecordingStoragePost201Response call1videosChannelOptionsRecordingStoragePost(channel, with)

Return a storage machine

This endpoint allows you to create a new storage machine.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordStorageApi apiInstance = new OptionRecordStorageApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsRecordingStoragePost201Response result = apiInstance.call1videosChannelOptionsRecordingStoragePost(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordStorageApi#call1videosChannelOptionsRecordingStoragePost");
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

[**Model1VideosChannelOptionsRecordingStoragePost201Response**](Model1VideosChannelOptionsRecordingStoragePost201Response.md)

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


## call1videosChannelOptionsRecordingStorageTestPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsRecordingStorageTestPost(channel, with)

Update a storage machine

This endpoint allows you to test a storage machine.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordStorageApi apiInstance = new OptionRecordStorageApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1videosChannelOptionsRecordingStorageTestPost(channel, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordStorageApi#call1videosChannelOptionsRecordingStorageTestPost");
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


## call1videosChannelOptionsRecordingStorageVideoStorageMachineDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1videosChannelOptionsRecordingStorageVideoStorageMachineDelete(channel, videoStorageMachine, with)

Update a storage machine

This endpoint allows you to delete a storage machine.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordStorageApi apiInstance = new OptionRecordStorageApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String videoStorageMachine = "videoStorageMachine_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1videosChannelOptionsRecordingStorageVideoStorageMachineDelete(channel, videoStorageMachine, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordStorageApi#call1videosChannelOptionsRecordingStorageVideoStorageMachineDelete");
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
| **videoStorageMachine** | **String**|  | [optional] |
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


## call1videosChannelOptionsRecordingStorageVideoStorageMachineGet

> Model1VideosChannelOptionsRecordingStoragePost201Response call1videosChannelOptionsRecordingStorageVideoStorageMachineGet(channel, videoStorageMachine, with)

Create a storage machine

This endpoint allows you to retrieve a storage machine.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordStorageApi apiInstance = new OptionRecordStorageApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String videoStorageMachine = "videoStorageMachine_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsRecordingStoragePost201Response result = apiInstance.call1videosChannelOptionsRecordingStorageVideoStorageMachineGet(channel, videoStorageMachine, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordStorageApi#call1videosChannelOptionsRecordingStorageVideoStorageMachineGet");
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
| **videoStorageMachine** | **String**|  | [optional] |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelOptionsRecordingStoragePost201Response**](Model1VideosChannelOptionsRecordingStoragePost201Response.md)

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


## call1videosChannelOptionsRecordingStorageVideoStorageMachinePut

> Model1VideosChannelOptionsRecordingStoragePost201Response call1videosChannelOptionsRecordingStorageVideoStorageMachinePut(channel, videoStorageMachine, with)

Update a storage machine

This endpoint allows you to update a storage machine.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OptionRecordStorageApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        OptionRecordStorageApi apiInstance = new OptionRecordStorageApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the channel to request.
        String videoStorageMachine = "videoStorageMachine_example"; // String | 
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelOptionsRecordingStoragePost201Response result = apiInstance.call1videosChannelOptionsRecordingStorageVideoStorageMachinePut(channel, videoStorageMachine, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OptionRecordStorageApi#call1videosChannelOptionsRecordingStorageVideoStorageMachinePut");
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
| **videoStorageMachine** | **String**|  | [optional] |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelOptionsRecordingStoragePost201Response**](Model1VideosChannelOptionsRecordingStoragePost201Response.md)

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

