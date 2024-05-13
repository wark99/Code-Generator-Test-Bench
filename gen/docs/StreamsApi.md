# StreamsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosPlaylistAnyGet**](StreamsApi.md#call1radiosPlaylistAnyGet) | **GET** /1/radios/playlist/{any} | Get playlist with legacy parameters |
| [**call1radiosRadioProductIdStationsStationIdStreamsGet**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams | List streams |
| [**call1radiosRadioProductIdStationsStationIdStreamsPost**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsPost) | **POST** /1/radios/{radio_product_id}/stations/{station_id}/streams | Store stream |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdActualBitrateGet**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdActualBitrateGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/actual-bitrate | Get actual bitrate |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdAddFallbackPost**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdAddFallbackPost) | **POST** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/add-fallback | Add fallback stream |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdDelete**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdDelete) | **DELETE** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id} | Delete stream |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdGet**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id} | Get stream |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileDelete**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileDelete) | **DELETE** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/introduction-file | Delete introduction file |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/introduction-file | Get introduction file |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFilePost**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFilePost) | **POST** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/introduction-file | Update introduction file |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdPut**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdPut) | **PUT** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id} | Update stream |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdRemoveFallbackPost**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdRemoveFallbackPost) | **POST** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/remove-fallback | Remove fallback stream |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdUnbindDelete**](StreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdUnbindDelete) | **DELETE** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/unbind | Delete stream and unbind |
| [**call1radiosStreamsAvailableMountpointPost**](StreamsApi.md#call1radiosStreamsAvailableMountpointPost) | **POST** /1/radios/streams/available-mountpoint | Mountpoint is available |
| [**call1radiosStreamsStreamUuidIntroductionFileGet**](StreamsApi.md#call1radiosStreamsStreamUuidIntroductionFileGet) | **GET** /1/radios/streams/{stream_uuid}/introduction-file | Get introduction file |
| [**call1radiosStreamsStreamUuidPlaylistGet**](StreamsApi.md#call1radiosStreamsStreamUuidPlaylistGet) | **GET** /1/radios/streams/{stream_uuid}/playlist | get playlist with stream url |



## call1radiosPlaylistAnyGet

> Object call1radiosPlaylistAnyGet(any)

Get playlist with legacy parameters

This endpoint allows you to get playlist file with legacy parameters.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        String any = "any_example"; // String | 
        try {
            Object result = apiInstance.call1radiosPlaylistAnyGet(any);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosPlaylistAnyGet");
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
| **any** | **String**|  | [optional] |

### Return type

**Object**

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsGet

> Model1RadiosRadioProductIdStationsStationIdStreamsGet200Response call1radiosRadioProductIdStationsStationIdStreamsGet(radioProductId, stationId, with, _return, limit, skip, page, perPage, orderBy, order, orderFor)

List streams

This endpoint allows you to retrieve all the streams.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        String _return = "total"; // String | *Optional* :  If you pass this parameter with the value `total`, then the response will be the number of items in the collection, instead of the items themselves.<br /> Part of the `total` capacity 
        Integer limit = 10; // Integer | *Optional parameter* that define the number of items to return<br /> Part of the `offset` capacity 
        Integer skip = 2; // Integer | *Optional parameter* that define the index of the first item to return (0 = first item)<br /> Part of the `offset` capacity 
        Integer page = 5; // Integer | *Optional parameter* that define the page number<br /> Part of the `pagination` capacity 
        Integer perPage = 10; // Integer | *Optional parameter* that define the number of items per page<br /> Part of the `pagination` capacity 
        OneOfstringAnyType orderBy = new OneOfstringAnyType(); // OneOfstringAnyType | *Optional parameter* that define the field used for sorting<br /> Part of the `sort` capacity 
        String order = "asc"; // String | *Optional parameter* that define the default sort order<br /> Part of the `sort` capacity 
        Object orderFor = null; // Object | *Optional parameter* that define the sorting order for a field<br /> By default **order** is used<br /> Part of the `sort` capacity 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsGet(radioProductId, stationId, with, _return, limit, skip, page, perPage, orderBy, order, orderFor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsGet");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |
| **_return** | **String**| *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  | [optional] [enum: total] |
| **limit** | **Integer**| *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **skip** | **Integer**| *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **page** | **Integer**| *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **perPage** | **Integer**| *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **orderBy** | [**OneOfstringAnyType**](.md)| *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |
| **order** | **String**| *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] [default to asc] [enum: asc, desc] |
| **orderFor** | [**Object**](.md)| *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsPost(radioProductId, stationId, requestBody9)

Store stream

This endpoint allows you to store a stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        RequestBody9 requestBody9 = new RequestBody9(); // RequestBody9 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsPost(radioProductId, stationId, requestBody9);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsPost");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **requestBody9** | [**RequestBody9**](RequestBody9.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdActualBitrateGet

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdActualBitrateGet(radioProductId, stationId, streamId)

Get actual bitrate

This endpoint allows you to check real the bitrate of the stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdActualBitrateGet(radioProductId, stationId, streamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdActualBitrateGet");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the stream to request. | |

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
| **404** | Not Found |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdAddFallbackPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdAddFallbackPost(radioProductId, stationId, streamId)

Add fallback stream

This endpoint allows you to add a fallback stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the source stream to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdAddFallbackPost(radioProductId, stationId, streamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdAddFallbackPost");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the source stream to request. | |

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
| **201** | Created |  -  |
| **404** | Not Found |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdDelete(radioProductId, stationId, streamId)

Delete stream

This endpoint allows you to delete a stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdDelete(radioProductId, stationId, streamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdDelete");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the stream to request. | |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdGet(radioProductId, stationId, streamId, with)

Get stream

This endpoint allows you to retrieve a stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdGet(radioProductId, stationId, streamId, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdGet");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the stream to request. | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileDelete(radioProductId, stationId, streamId)

Delete introduction file

This endpoint allows you to delete the introduction file for a stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileDelete(radioProductId, stationId, streamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileDelete");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the stream to request. | |

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
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet(radioProductId, stationId, streamId)

Get introduction file

This endpoint allows you to get the introduction file for a stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet(radioProductId, stationId, streamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the stream to request. | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFilePost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFilePost(radioProductId, stationId, streamId, requestBody10)

Update introduction file

This endpoint allows you to update the introduction file for a stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        RequestBody10 requestBody10 = new RequestBody10(); // RequestBody10 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFilePost(radioProductId, stationId, streamId, requestBody10);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFilePost");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the stream to request. | |
| **requestBody10** | [**RequestBody10**](RequestBody10.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

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
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdPut(radioProductId, stationId, streamId, requestBody21)

Update stream

This endpoint allows you to update a stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        RequestBody21 requestBody21 = new RequestBody21(); // RequestBody21 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdPut(radioProductId, stationId, streamId, requestBody21);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdPut");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the stream to request. | |
| **requestBody21** | [**RequestBody21**](RequestBody21.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

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
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdRemoveFallbackPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdRemoveFallbackPost(radioProductId, stationId, streamId)

Remove fallback stream

This endpoint allows you to remove the fallback stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the source stream to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdRemoveFallbackPost(radioProductId, stationId, streamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdRemoveFallbackPost");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the source stream to request. | |

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
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdUnbindDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdUnbindDelete(radioProductId, stationId, streamId, requestBody24)

Delete stream and unbind

This endpoint allows you to delete a stream and convert transcoding stream to standard stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        RequestBody24 requestBody24 = new RequestBody24(); // RequestBody24 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdUnbindDelete(radioProductId, stationId, streamId, requestBody24);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdUnbindDelete");
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
| **radioProductId** | **Integer**| The unique identifier (ID) of the radio product to request. | |
| **stationId** | **Integer**| The unique identifier (ID) of the station to request. | |
| **streamId** | **Integer**| The unique identifier (ID) of the stream to request. | |
| **requestBody24** | [**RequestBody24**](RequestBody24.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

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
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |
| **500** | Internal Server Error |  -  |


## call1radiosStreamsAvailableMountpointPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosStreamsAvailableMountpointPost(requestBody17)

Mountpoint is available

This endpoint allows you to check if a stream mountpoint is available.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        RequestBody17 requestBody17 = new RequestBody17(); // RequestBody17 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosStreamsAvailableMountpointPost(requestBody17);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosStreamsAvailableMountpointPost");
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
| **requestBody17** | [**RequestBody17**](RequestBody17.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response**](Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **422** | Unprocessable Entity |  -  |


## call1radiosStreamsStreamUuidIntroductionFileGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosStreamsStreamUuidIntroductionFileGet(streamUuid)

Get introduction file

This endpoint allows you to get the introduction file for a stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        String streamUuid = "streamUuid_example"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosStreamsStreamUuidIntroductionFileGet(streamUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosStreamsStreamUuidIntroductionFileGet");
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
| **streamUuid** | **String**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server Error |  -  |


## call1radiosStreamsStreamUuidPlaylistGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosStreamsStreamUuidPlaylistGet(streamUuid)

get playlist with stream url

This endpoint allows you to get playlist file with stream url.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        StreamsApi apiInstance = new StreamsApi(defaultClient);
        String streamUuid = "streamUuid_example"; // String | The unique identifier (ID) of the stream to request.
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosStreamsStreamUuidPlaylistGet(streamUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StreamsApi#call1radiosStreamsStreamUuidPlaylistGet");
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
| **streamUuid** | **String**| The unique identifier (ID) of the stream to request. | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |

