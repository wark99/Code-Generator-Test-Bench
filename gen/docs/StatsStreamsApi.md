# StatsStreamsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsConsumptionGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsConsumptionGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/consumption | Get consumption |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesContinentGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesContinentGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/countries_continent | Get countries by continent |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/countries | Get countries |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsExportCsvGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsExportCsvGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/export_csv | Export stats |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/listeners | Get listeners |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersPerMinuteGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersPerMinuteGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/listeners_per_minute | Get listeners by minute |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsPlayersGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsPlayersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/players | Get players |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalConsumptionGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalConsumptionGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/total_consumption | Get total consumption |
| [**call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalPlayersGet**](StatsStreamsApi.md#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalPlayersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/streams/{stream_id}/stats/total_players | Get total players |



## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsConsumptionGet(radioProductId, stationId, streamId, from, to)

Get consumption

This endpoint allows you to retrieve stream consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsConsumptionGet(radioProductId, stationId, streamId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsConsumptionGet");
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


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesContinentGet

> Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesContinentGet(radioProductId, stationId, streamId, from, to)

Get countries by continent

This endpoint allows you to retrieve stream total countries stats by continent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesContinentGet(radioProductId, stationId, streamId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesContinentGet");
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


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesGet(radioProductId, stationId, streamId, from, to)

Get countries

This endpoint allows you to retrieve stream countries stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesGet(radioProductId, stationId, streamId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsCountriesGet");
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


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsExportCsvGet

> Object call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsExportCsvGet(radioProductId, stationId, streamId, datatype, from, to)

Export stats

This endpoint allows you to export stream stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String datatype = "consumption"; // String | 
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Object result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsExportCsvGet(radioProductId, stationId, streamId, datatype, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsExportCsvGet");
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


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersGet(radioProductId, stationId, streamId, from, to)

Get listeners

This endpoint allows you to retrieve stream listeners stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersGet(radioProductId, stationId, streamId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersGet");
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


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersPerMinuteGet

> Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersPerMinuteGet(radioProductId, stationId, streamId, from, to)

Get listeners by minute

This endpoint allows you to retrieve stream listeners stats by minute on last 24h.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersPerMinuteGet(radioProductId, stationId, streamId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsListenersPerMinuteGet");
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


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsPlayersGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsPlayersGet(radioProductId, stationId, streamId, from, to)

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
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsPlayersGet(radioProductId, stationId, streamId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsPlayersGet");
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


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalConsumptionGet(radioProductId, stationId, streamId, from, to)

Get total consumption

This endpoint allows you to retrieve total stream consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalConsumptionGet(radioProductId, stationId, streamId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalConsumptionGet");
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


## call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalPlayersGet

> Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalPlayersGet(radioProductId, stationId, streamId, from, to)

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
import org.openapitools.client.api.StatsStreamsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStreamsApi apiInstance = new StatsStreamsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        Integer streamId = 56; // Integer | The unique identifier (ID) of the stream to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalPlayersGet(radioProductId, stationId, streamId, from, to);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStreamsApi#call1radiosRadioProductIdStationsStationIdStreamsStreamIdStatsTotalPlayersGet");
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

