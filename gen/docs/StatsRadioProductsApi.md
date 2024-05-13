# StatsRadioProductsApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1radiosRadioProductIdStatsConsumptionGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsConsumptionGet) | **GET** /1/radios/{radio_product_id}/stats/consumption | Get consumption |
| [**call1radiosRadioProductIdStatsCountriesContinentGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsCountriesContinentGet) | **GET** /1/radios/{radio_product_id}/stats/countries_continent | Get countries by continent |
| [**call1radiosRadioProductIdStatsCountriesGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsCountriesGet) | **GET** /1/radios/{radio_product_id}/stats/countries | Get countries |
| [**call1radiosRadioProductIdStatsExportCsvGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsExportCsvGet) | **GET** /1/radios/{radio_product_id}/stats/export_csv | Export stats |
| [**call1radiosRadioProductIdStatsListenersGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsListenersGet) | **GET** /1/radios/{radio_product_id}/stats/listeners | Get listeners |
| [**call1radiosRadioProductIdStatsListenersPerMinuteGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsListenersPerMinuteGet) | **GET** /1/radios/{radio_product_id}/stats/listeners_per_minute | Get listeners per minute |
| [**call1radiosRadioProductIdStatsPlayersGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsPlayersGet) | **GET** /1/radios/{radio_product_id}/stats/players | Get players |
| [**call1radiosRadioProductIdStatsStationConsumptionGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsStationConsumptionGet) | **GET** /1/radios/{radio_product_id}/stats/station_consumption | Get consumption by station |
| [**call1radiosRadioProductIdStatsStationListenersGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsStationListenersGet) | **GET** /1/radios/{radio_product_id}/stats/station_listeners | Get listeners by station |
| [**call1radiosRadioProductIdStatsStatsByStationGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsStatsByStationGet) | **GET** /1/radios/{radio_product_id}/stats/stats_by_station | Get stats by stations |
| [**call1radiosRadioProductIdStatsTotalConsumptionGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsTotalConsumptionGet) | **GET** /1/radios/{radio_product_id}/stats/total_consumption | Get total consumption |
| [**call1radiosRadioProductIdStatsTotalPlayersGet**](StatsRadioProductsApi.md#call1radiosRadioProductIdStatsTotalPlayersGet) | **GET** /1/radios/{radio_product_id}/stats/total_players | Get total players |



## call1radiosRadioProductIdStatsConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response call1radiosRadioProductIdStatsConsumptionGet(radioProductId, from, to, stationIds)

Get consumption

This endpoint allows you to retrieve product consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStatsConsumptionGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsConsumptionGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStatsCountriesContinentGet

> Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response call1radiosRadioProductIdStatsCountriesContinentGet(radioProductId, from, to, stationIds)

Get countries by continent

This endpoint allows you to retrieve product total countries stats by continent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsCountriesContinentGet200Response result = apiInstance.call1radiosRadioProductIdStatsCountriesContinentGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsCountriesContinentGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStatsCountriesGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStatsCountriesGet(radioProductId, from, to, stationIds)

Get countries

This endpoint allows you to retrieve product countries stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStatsCountriesGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsCountriesGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStatsExportCsvGet

> Object call1radiosRadioProductIdStatsExportCsvGet(radioProductId, datatype, from, to, stationIds)

Export stats

This endpoint allows you to export product stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String datatype = "consumption"; // String | 
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Object result = apiInstance.call1radiosRadioProductIdStatsExportCsvGet(radioProductId, datatype, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsExportCsvGet");
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
| **datatype** | **String**|  | [enum: consumption, countries, listeners, listeners_per_minute, players] |
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStatsListenersGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStatsListenersGet(radioProductId, from, to, stationIds)

Get listeners

This endpoint allows you to retrieve product listeners stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStatsListenersGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsListenersGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStatsListenersPerMinuteGet

> Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response call1radiosRadioProductIdStatsListenersPerMinuteGet(radioProductId, from, to, stationIds)

Get listeners per minute

This endpoint allows you to retrieve product listeners stats per minute on last 24h.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsListenersPerMinuteGet200Response result = apiInstance.call1radiosRadioProductIdStatsListenersPerMinuteGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsListenersPerMinuteGet");
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


## call1radiosRadioProductIdStatsPlayersGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1radiosRadioProductIdStatsPlayersGet(radioProductId, from, to, stationIds)

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
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1radiosRadioProductIdStatsPlayersGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsPlayersGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStatsStationConsumptionGet

> Model1RadiosRadioProductIdStatsStationConsumptionGet200Response call1radiosRadioProductIdStatsStationConsumptionGet(radioProductId, from, to, stationIds)

Get consumption by station

This endpoint allows you to retrieve product consumption stats by station.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStatsStationConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStatsStationConsumptionGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsStationConsumptionGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStatsStationConsumptionGet200Response**](Model1RadiosRadioProductIdStatsStationConsumptionGet200Response.md)

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


## call1radiosRadioProductIdStatsStationListenersGet

> Model1RadiosRadioProductIdStatsStationListenersGet200Response call1radiosRadioProductIdStatsStationListenersGet(radioProductId, from, to, stationIds, withEmpty)

Get listeners by station

This endpoint allows you to retrieve product listeners stats by station.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        Boolean withEmpty = true; // Boolean | 
        try {
            Model1RadiosRadioProductIdStatsStationListenersGet200Response result = apiInstance.call1radiosRadioProductIdStatsStationListenersGet(radioProductId, from, to, stationIds, withEmpty);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsStationListenersGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |
| **withEmpty** | **Boolean**|  | [optional] |

### Return type

[**Model1RadiosRadioProductIdStatsStationListenersGet200Response**](Model1RadiosRadioProductIdStatsStationListenersGet200Response.md)

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


## call1radiosRadioProductIdStatsStatsByStationGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1radiosRadioProductIdStatsStatsByStationGet(radioProductId, datatype, from, to, stationIds)

Get stats by stations

This endpoint allows you to retrieve stats group by stations.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String datatype = "consumption"; // String | 
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1radiosRadioProductIdStatsStatsByStationGet(radioProductId, datatype, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsStatsByStationGet");
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
| **datatype** | **String**|  | [enum: consumption, countries, listeners, players] |
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStatsTotalConsumptionGet

> Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response call1radiosRadioProductIdStatsTotalConsumptionGet(radioProductId, from, to, stationIds)

Get total consumption

This endpoint allows you to retrieve product total consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalConsumptionGet200Response result = apiInstance.call1radiosRadioProductIdStatsTotalConsumptionGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsTotalConsumptionGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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


## call1radiosRadioProductIdStatsTotalPlayersGet

> Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response call1radiosRadioProductIdStatsTotalPlayersGet(radioProductId, from, to, stationIds)

Get total players

This endpoint allows you to retrieve total players stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsRadioProductsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsRadioProductsApi apiInstance = new StatsRadioProductsApi(defaultClient);
        Integer radioProductId = 56; // Integer | The unique identifier (ID) of the radio product to request.
        String from = "2022-01-01, 2022-01-01 00:00:00, 1640995200"; // String | 
        String to = "2022-12-31, 2022-12-31 00:00:00, 1672444800"; // String | 
        String stationIds = "1,3,5"; // String | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStatsTotalPlayersGet200Response result = apiInstance.call1radiosRadioProductIdStatsTotalPlayersGet(radioProductId, from, to, stationIds);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsRadioProductsApi#call1radiosRadioProductIdStatsTotalPlayersGet");
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
| **from** | **String**|  | |
| **to** | **String**|  | |
| **stationIds** | **String**|  | [optional] |

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

