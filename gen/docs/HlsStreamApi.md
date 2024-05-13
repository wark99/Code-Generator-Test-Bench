# HlsStreamApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosHlsStreamSubdomainKeyGet**](HlsStreamApi.md#call1radiosHlsStreamSubdomainKeyGet) | **GET** /1/radios/hls_stream/{subdomain}/key | Get hls stream key |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamAddPost**](HlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamAddPost) | **POST** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/add | Add hls stream |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamDelete**](HlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamDelete) | **DELETE** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream | Delete hls stream |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamGet**](HlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream | Get hls stream |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamPut**](HlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamPut) | **PUT** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream | Update hls stream |



## call1radiosHlsStreamSubdomainKeyGet

> Object call1radiosHlsStreamSubdomainKeyGet(subdomain, index)

Get hls stream key

This endpoint allows you to get the hls stream key to decrypt hls chunk.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        HlsStreamApi apiInstance = new HlsStreamApi(defaultClient);
        String subdomain = "subdomain_example"; // String | The subdomain of the hls stream.
        Integer index = 1; // Integer | 
        try {
            Object result = apiInstance.call1radiosHlsStreamSubdomainKeyGet(subdomain, index);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HlsStreamApi#call1radiosHlsStreamSubdomainKeyGet");
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
| **subdomain** | **String**| The subdomain of the hls stream. | |
| **index** | **Integer**|  | |

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
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamAddPost

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdHlsStreamAddPost(radioProductId, stationId, requestBody11)

Add hls stream

This endpoint allows you to add a hls stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HlsStreamApi apiInstance = new HlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        RequestBody11 requestBody11 = new RequestBody11(); // RequestBody11 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamAddPost(radioProductId, stationId, requestBody11);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamAddPost");
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
| **requestBody11** | [**RequestBody11**](RequestBody11.md)|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdHlsStreamDelete

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdHlsStreamDelete(radioProductId, stationId)

Delete hls stream

This endpoint allows you to delete a hls stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HlsStreamApi apiInstance = new HlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamDelete(radioProductId, stationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamDelete");
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


## call1radiosRadioProductIdStationsStationIdHlsStreamGet

> Model1RadiosRadioProductIdStationsStationIdHlsStreamGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamGet(radioProductId, stationId, _return, limit, skip, page, perPage, orderBy, order, orderFor)

Get hls stream

This endpoint allows you to retrieve a hls stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HlsStreamApi apiInstance = new HlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String _return = "total"; // String | *Optional* :  If you pass this parameter with the value `total`, then the response will be the number of items in the collection, instead of the items themselves.<br /> Part of the `total` capacity 
        Integer limit = 10; // Integer | *Optional parameter* that define the number of items to return<br /> Part of the `offset` capacity 
        Integer skip = 2; // Integer | *Optional parameter* that define the index of the first item to return (0 = first item)<br /> Part of the `offset` capacity 
        Integer page = 5; // Integer | *Optional parameter* that define the page number<br /> Part of the `pagination` capacity 
        Integer perPage = 10; // Integer | *Optional parameter* that define the number of items per page<br /> Part of the `pagination` capacity 
        OneOfstringAnyType orderBy = new OneOfstringAnyType(); // OneOfstringAnyType | *Optional parameter* that define the field used for sorting<br /> Part of the `sort` capacity 
        String order = "asc"; // String | *Optional parameter* that define the default sort order<br /> Part of the `sort` capacity 
        Object orderFor = null; // Object | *Optional parameter* that define the sorting order for a field<br /> By default **order** is used<br /> Part of the `sort` capacity 
        try {
            Model1RadiosRadioProductIdStationsStationIdHlsStreamGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamGet(radioProductId, stationId, _return, limit, skip, page, perPage, orderBy, order, orderFor);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamGet");
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
| **_return** | **String**| *Optional* :  If you pass this parameter with the value &#x60;total&#x60;, then the response will be the number of items in the collection, instead of the items themselves.&lt;br /&gt; Part of the &#x60;total&#x60; capacity  | [optional] [enum: total] |
| **limit** | **Integer**| *Optional parameter* that define the number of items to return&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **skip** | **Integer**| *Optional parameter* that define the index of the first item to return (0 &#x3D; first item)&lt;br /&gt; Part of the &#x60;offset&#x60; capacity  | [optional] |
| **page** | **Integer**| *Optional parameter* that define the page number&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **perPage** | **Integer**| *Optional parameter* that define the number of items per page&lt;br /&gt; Part of the &#x60;pagination&#x60; capacity  | [optional] |
| **orderBy** | [**OneOfstringAnyType**](.md)| *Optional parameter* that define the field used for sorting&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |
| **order** | **String**| *Optional parameter* that define the default sort order&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] [default to asc] [enum: asc, desc] |
| **orderFor** | [**Object**](.md)| *Optional parameter* that define the sorting order for a field&lt;br /&gt; By default **order** is used&lt;br /&gt; Part of the &#x60;sort&#x60; capacity  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdHlsStreamGet200Response**](Model1RadiosRadioProductIdStationsStationIdHlsStreamGet200Response.md)

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


## call1radiosRadioProductIdStationsStationIdHlsStreamPut

> Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response call1radiosRadioProductIdStationsStationIdHlsStreamPut(radioProductId, stationId, requestBody22)

Update hls stream

This endpoint allows you to update a hls stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HlsStreamApi apiInstance = new HlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        RequestBody22 requestBody22 = new RequestBody22(); // RequestBody22 | 
        try {
            Model1SwissBackupsSwissBackupIdSlotsSlotIdDisablePost200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamPut(radioProductId, stationId, requestBody22);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamPut");
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
| **requestBody22** | [**RequestBody22**](RequestBody22.md)|  | [optional] |

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

