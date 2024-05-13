# StatsHlsStreamApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsConsumptionGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsConsumptionGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/consumption | Get consumption |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesContinentGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesContinentGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/countries_continent | Get countries by continent |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/countries | Get countries |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsExportCsvGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsExportCsvGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/export_csv | Export stats |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/listeners | Get listeners |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersPerMinuteGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersPerMinuteGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/listeners_per_minute | Get listeners by minute |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsPlayersGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsPlayersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/players | Get players |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalConsumptionGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalConsumptionGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/total_consumption | Get total consumption |
| [**call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalPlayersGet**](StatsHlsStreamApi.md#call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalPlayersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/hls_stream/stats/total_players | Get total players |



## call1radiosRadioProductIdStationsStationIdHlsStreamStatsConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamStatsConsumptionGet(radioProductId, stationId, from, to)

Get consumption

This endpoint allows you to retrieve hls stream consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsConsumptionGet(radioProductId, stationId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsConsumptionGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response.md)

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
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesContinentGet

> Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesContinentGet(radioProductId, stationId, from, to)

Get countries by continent

This endpoint allows you to retrieve hls stream total countries stats by continent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesContinentGet(radioProductId, stationId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesContinentGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response.md)

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
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesGet(radioProductId, stationId, from, to)

Get countries

This endpoint allows you to retrieve hls stream countries stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesGet(radioProductId, stationId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsCountriesGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

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
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamStatsExportCsvGet

> Object call1radiosRadioProductIdStationsStationIdHlsStreamStatsExportCsvGet(radioProductId, stationId, datatype, from, to)

Export stats

This endpoint allows you to export hls stream stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String datatype = "consumption"; // String | 
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Object result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsExportCsvGet(radioProductId, stationId, datatype, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsExportCsvGet");
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
| **datatype** | **String**|  | [enum: consumption, countries, listeners, listeners_per_minute, players] |
| **from** | **String**|  | |
| **to** | **String**|  | |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/octet-stream, application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** | Not Found |  -  |
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersGet(radioProductId, stationId, from, to)

Get listeners

This endpoint allows you to retrieve hls stream listeners stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersGet(radioProductId, stationId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

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
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersPerMinuteGet

> Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersPerMinuteGet(radioProductId, stationId, from, to)

Get listeners by minute

This endpoint allows you to retrieve hls stream listeners stats by minute on last 24h.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersPerMinuteGet(radioProductId, stationId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsListenersPerMinuteGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response.md)

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
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamStatsPlayersGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamStatsPlayersGet(radioProductId, stationId, from, to)

Get players

This endpoint allows you to retrieve players stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsPlayersGet(radioProductId, stationId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsPlayersGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

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
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalConsumptionGet(radioProductId, stationId, from, to)

Get total consumption

This endpoint allows you to retrieve total hls stream consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalConsumptionGet(radioProductId, stationId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalConsumptionGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response.md)

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
| **422** | Unprocessable Entity |  -  |


## call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalPlayersGet

> Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalPlayersGet(radioProductId, stationId, from, to)

Get total players

This endpoint allows you to retrieve players total stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsHlsStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsHlsStreamApi apiInstance = new StatsHlsStreamApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalPlayersGet(radioProductId, stationId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsHlsStreamApi#call1radiosRadioProductIdStationsStationIdHlsStreamStatsTotalPlayersGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response.md)

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
| **422** | Unprocessable Entity |  -  |

