# TranscodingsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosRadioProductIdStationsStationIdTranscodingAddPost**](TranscodingsApi.md#call1radiosRadioProductIdStationsStationIdTranscodingAddPost) | **POST** /1/radios/{radio_product_id}/stations/{station_id}/transcoding/add | Add transcoded stream |
| [**call1radiosRadioProductIdStationsStationIdTranscodingDelete**](TranscodingsApi.md#call1radiosRadioProductIdStationsStationIdTranscodingDelete) | **DELETE** /1/radios/{radio_product_id}/stations/{station_id}/transcoding | Delete transcoding |
| [**call1radiosRadioProductIdStationsStationIdTranscodingStreamIdDelete**](TranscodingsApi.md#call1radiosRadioProductIdStationsStationIdTranscodingStreamIdDelete) | **DELETE** /1/radios/{radio_product_id}/stations/{station_id}/transcoding/{stream_id} | Remove transcoded stream |
| [**call1radiosRadioProductIdStationsStationIdTranscodingStreamIdUnbindPost**](TranscodingsApi.md#call1radiosRadioProductIdStationsStationIdTranscodingStreamIdUnbindPost) | **POST** /1/radios/{radio_product_id}/stations/{station_id}/transcoding/{stream_id}/unbind | Unbind transcoded stream |



## call1radiosRadioProductIdStationsStationIdTranscodingAddPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdTranscodingAddPost(radioProductId, stationId, requestBody12)

Add transcoded stream

This endpoint allows you to add transcoded stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TranscodingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TranscodingsApi apiInstance = new TranscodingsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        RequestBody12 requestBody12 = new RequestBody12(); // RequestBody12 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdTranscodingAddPost(radioProductId, stationId, requestBody12);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TranscodingsApi#call1radiosRadioProductIdStationsStationIdTranscodingAddPost");
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
| **requestBody12** | [**RequestBody12**](RequestBody12.md)|  | [optional] |

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
| **500** | Internal Server Error |  -  |


## call1radiosRadioProductIdStationsStationIdTranscodingDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdTranscodingDelete(radioProductId, stationId)

Delete transcoding

This endpoint allows you to delete transcoding.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TranscodingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TranscodingsApi apiInstance = new TranscodingsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdTranscodingDelete(radioProductId, stationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TranscodingsApi#call1radiosRadioProductIdStationsStationIdTranscodingDelete");
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


## call1radiosRadioProductIdStationsStationIdTranscodingStreamIdDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdTranscodingStreamIdDelete(radioProductId, stationId, streamId)

Remove transcoded stream

This endpoint allows you to remove transcoded stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TranscodingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TranscodingsApi apiInstance = new TranscodingsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the transcoded stream to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdTranscodingStreamIdDelete(radioProductId, stationId, streamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TranscodingsApi#call1radiosRadioProductIdStationsStationIdTranscodingStreamIdDelete");
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
| **streamId** | **Integer**| The unique identifier (ID) of the transcoded stream to request. | |

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


## call1radiosRadioProductIdStationsStationIdTranscodingStreamIdUnbindPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdTranscodingStreamIdUnbindPost(radioProductId, stationId, streamId)

Unbind transcoded stream

This endpoint allows you to unbind transcoding on transcoded stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TranscodingsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TranscodingsApi apiInstance = new TranscodingsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the transcoded stream to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdTranscodingStreamIdUnbindPost(radioProductId, stationId, streamId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TranscodingsApi#call1radiosRadioProductIdStationsStationIdTranscodingStreamIdUnbindPost");
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
| **streamId** | **Integer**| The unique identifier (ID) of the transcoded stream to request. | |

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

