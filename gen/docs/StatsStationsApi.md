# StatsStationsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosRadioProductIdStationsStationIdStatsConsumptionGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsConsumptionGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/consumption | Get consumption |
| [**call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/countries_continent | Get countries by continent |
| [**call1radiosRadioProductIdStationsStationIdStatsCountriesGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsCountriesGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/countries | Get countries |
| [**call1radiosRadioProductIdStationsStationIdStatsExportCsvGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsExportCsvGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/export_csv | Export stats |
| [**call1radiosRadioProductIdStationsStationIdStatsLinksGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsLinksGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/links | List stats links |
| [**call1radiosRadioProductIdStationsStationIdStatsListenersGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsListenersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/listeners | Get listeners |
| [**call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/listeners_per_minute | Get listeners per minute |
| [**call1radiosRadioProductIdStationsStationIdStatsPlayersGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsPlayersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/players | Get players |
| [**call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/stats_by_stream | Get stats by streams |
| [**call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/stream_consumption | Get consumption by stream |
| [**call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/stream_listeners | Get listeners by stream |
| [**call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/total_consumption | Get total consumption |
| [**call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet**](StatsStationsApi.md#call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet) | **GET** /1/radios/{radio_product_id}/stations/{station_id}/stats/total_players | Get total players |



## call1radiosRadioProductIdStationsStationIdStatsConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response call1radiosRadioProductIdStationsStationIdStatsConsumptionGet(radioProductId, stationId, from, to, streamIds, withHlsStats)

Get consumption

This endpoint allows you to retrieve station consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsConsumptionGet(radioProductId, stationId, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsConsumptionGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet

> Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet(radioProductId, stationId, from, to, streamIds, withHlsStats)

Get countries by continent

This endpoint allows you to retrieve station total countries stats by continent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet(radioProductId, stationId, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsCountriesContinentGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdStatsCountriesGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStatsCountriesGet(radioProductId, stationId, from, to, streamIds, withHlsStats)

Get countries

This endpoint allows you to retrieve station countries stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsCountriesGet(radioProductId, stationId, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsCountriesGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdStatsExportCsvGet

> Object call1radiosRadioProductIdStationsStationIdStatsExportCsvGet(radioProductId, stationId, datatype, from, to, streamIds, withHlsStats)

Export stats

This endpoint allows you to export station stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String datatype = "consumption"; // String | 
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Object result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsExportCsvGet(radioProductId, stationId, datatype, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsExportCsvGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdStatsLinksGet

> Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response call1radiosRadioProductIdStationsStationIdStatsLinksGet(radioProductId, stationId)

List stats links

This endpoint allows you to get all stats links.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsLinksGet(radioProductId, stationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsLinksGet");
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

[**Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsLinksGet200Response.md)

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


## call1radiosRadioProductIdStationsStationIdStatsListenersGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStatsListenersGet(radioProductId, stationId, from, to, streamIds, withHlsStats)

Get listeners

This endpoint allows you to retrieve station listeners stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsListenersGet(radioProductId, stationId, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsListenersGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet

> Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet(radioProductId, stationId, from, to, stationIds)

Get listeners per minute

This endpoint allows you to retrieve station listeners stats per minute on last 24h.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet(radioProductId, stationId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet");
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
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdStatsPlayersGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStationsStationIdStatsPlayersGet(radioProductId, stationId, from, to, streamIds, withHlsStats)

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
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsPlayersGet(radioProductId, stationId, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsPlayersGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet(radioProductId, stationId, datatype, from, to, streamIds)

Get stats by streams

This endpoint allows you to retrieve stats group by streams.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String stationId = "stationId_example"; // String | 
        String datatype = "consumption"; // String | 
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet(radioProductId, stationId, datatype, from, to, streamIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsStatsByStreamGet");
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
| **stationId** | **String**|  | |
| **datatype** | **String**|  | [enum: consumption, countries, listeners, players] |
| **from** | **String**|  | |
| **to** | **String**|  | |
| **streamIds** | **String**|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdAdminPut200Response**](Model1SwissBackupsSwissBackupIdAdminPut200Response.md)

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


## call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet(radioProductId, stationId, from, to, streamIds, withHlsStats)

Get consumption by stream

This endpoint allows you to retrieve station consumption stats by stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet(radioProductId, stationId, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsStreamConsumptionGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsStreamConsumptionGet200Response.md)

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


## call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet

> Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet(radioProductId, stationId, from, to, streamIds, withEmpty, withHlsStats)

Get listeners by stream

This endpoint allows you to retrieve station listeners stats by stream.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withEmpty = true; // Boolean | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet(radioProductId, stationId, from, to, streamIds, withEmpty, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsStreamListenersGet");
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
| **streamIds** | **String**|  | [optional] |
| **withEmpty** | **Boolean**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response**](Model1RadiosRadioProductIdStationsStationIdStatsStreamListenersGet200Response.md)

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


## call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet(radioProductId, stationId, from, to, streamIds, withHlsStats)

Get total consumption

This endpoint allows you to retrieve station total consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet(radioProductId, stationId, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsTotalConsumptionGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

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


## call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet

> Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet(radioProductId, stationId, from, to, streamIds, withHlsStats)

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
import org.openapitools.client.api.StatsStationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsStationsApi apiInstance = new StatsStationsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        Integer stationId = 56; // Integer | The unique identifier (ID) of the station to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String streamIds = "1,3,5"; // String | 
        Boolean withHlsStats = false; // Boolean | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response result = apiInstance.call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet(radioProductId, stationId, from, to, streamIds, withHlsStats);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsStationsApi#call1radiosRadioProductIdStationsStationIdStatsTotalPlayersGet");
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
| **streamIds** | **String**|  | [optional] |
| **withHlsStats** | **Boolean**|  | [optional] |

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

