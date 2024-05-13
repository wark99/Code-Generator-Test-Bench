# CommoditiesApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCommodities**](CommoditiesApi.md#getCommodities) | **GET** /commodities/ | Get a list of all commodities covered by UEX. |
| [**getCommoditiesAveragesByCommodity**](CommoditiesApi.md#getCommoditiesAveragesByCommodity) | **GET** /commodities_averages/id_commodity/{id_commodity}/ | Retrieve a list of average prices and stock data of a specific commodity in the last 180 days. (CAX Index) |
| [**getCommoditiesPricesAll**](CommoditiesApi.md#getCommoditiesPricesAll) | **GET** /commodities_prices_all/ | Retrieve a list of prices for all commodities in all terminals, all at once |
| [**getCommoditiesPricesByCommodity**](CommoditiesApi.md#getCommoditiesPricesByCommodity) | **GET** /commodities_prices/id_commodity/{id_commodity}/ | Retrieve a list of prices for all commodities. |
| [**getCommoditiesPricesByTerminal**](CommoditiesApi.md#getCommoditiesPricesByTerminal) | **GET** /commodities_prices/id_terminal/{id_terminal}/ | Retrieve a list of prices for all commodities. |
| [**getCommoditiesPricesHistoryByTerminalAndCommodity**](CommoditiesApi.md#getCommoditiesPricesHistoryByTerminalAndCommodity) | **GET** /commodities_prices_history/id_terminal/{id_terminal}/id_commodity/{id_commodity}/ | Obtain a price history of a commodity at a specific location |
| [**getCommoditiesRanking**](CommoditiesApi.md#getCommoditiesRanking) | **GET** /commodities_ranking/ | Retrieves the UEX Commodities Average Index™ Ranking |
| [**getCommoditiesRawPricesAll**](CommoditiesApi.md#getCommoditiesRawPricesAll) | **GET** /commodities_raw_prices_all/ | Retrieve a list of prices for all raw commodities in all terminals, all at once |
| [**getCommoditiesRawPricesByCommodity**](CommoditiesApi.md#getCommoditiesRawPricesByCommodity) | **GET** /commodities_raw_prices/id_commodity/{id_commodity}/ | Retrieve a list of prices for all unrefined (raw/ore) commodities. |
| [**getCommoditiesRawPricesByTerminal**](CommoditiesApi.md#getCommoditiesRawPricesByTerminal) | **GET** /commodities_raw_prices/id_terminal/{id_terminal}/ | Retrieve a list of prices for all unrefined (raw/ore) commodities. |
| [**getCommoditiesRoutesByCommodity**](CommoditiesApi.md#getCommoditiesRoutesByCommodity) | **GET** /commodities_routes/id_commodity/{id_commodity}/ | Retrieve a list of common routes calculated based on data reports |
| [**getCommoditiesRoutesByOrbitOrigin**](CommoditiesApi.md#getCommoditiesRoutesByOrbitOrigin) | **GET** /commodities_routes/id_orbit_origin/{id_orbit_origin}/ | Retrieve a list of common routes calculated based on data reports |
| [**getCommoditiesRoutesByPlanetOrigin**](CommoditiesApi.md#getCommoditiesRoutesByPlanetOrigin) | **GET** /commodities_routes/id_planet_origin/{id_planet_origin}/ | Retrieve a list of common routes calculated based on data reports |
| [**getCommoditiesRoutesByTerminalOrigin**](CommoditiesApi.md#getCommoditiesRoutesByTerminalOrigin) | **GET** /commodities_routes/id_terminal_origin/{id_terminal_origin}/ | Retrieve a list of common routes calculated based on data reports |
| [**getCommoditiesStatus**](CommoditiesApi.md#getCommoditiesStatus) | **GET** /commodities_status/ | Obtain a list of inventory states that are displayed at every trading terminal. |



## getCommodities

> GetCommoditiesOkResponse getCommodities()

Get a list of all commodities covered by UEX.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        try {
            GetCommoditiesOkResponse result = apiInstance.getCommodities();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommodities");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetCommoditiesOkResponse**](GetCommoditiesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesAveragesByCommodity

> GetCommoditiesAveragesOkResponse getCommoditiesAveragesByCommodity(idCommodity)

Retrieve a list of average prices and stock data of a specific commodity in the last 180 days. (CAX Index)

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idCommodity = "idCommodity_example"; // String | 
        try {
            GetCommoditiesAveragesOkResponse result = apiInstance.getCommoditiesAveragesByCommodity(idCommodity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesAveragesByCommodity");
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
| **idCommodity** | **String**|  | |

### Return type

[**GetCommoditiesAveragesOkResponse**](GetCommoditiesAveragesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesPricesAll

> GetCommoditiesPricesAllOkResponse getCommoditiesPricesAll()

Retrieve a list of prices for all commodities in all terminals, all at once

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        try {
            GetCommoditiesPricesAllOkResponse result = apiInstance.getCommoditiesPricesAll();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesPricesAll");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetCommoditiesPricesAllOkResponse**](GetCommoditiesPricesAllOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesPricesByCommodity

> GetCommoditiesPricesOkResponse getCommoditiesPricesByCommodity(idCommodity)

Retrieve a list of prices for all commodities.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idCommodity = "idCommodity_example"; // String | 
        try {
            GetCommoditiesPricesOkResponse result = apiInstance.getCommoditiesPricesByCommodity(idCommodity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesPricesByCommodity");
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
| **idCommodity** | **String**|  | |

### Return type

[**GetCommoditiesPricesOkResponse**](GetCommoditiesPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesPricesByTerminal

> GetCommoditiesPricesOkResponse getCommoditiesPricesByTerminal(idTerminal)

Retrieve a list of prices for all commodities.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idTerminal = "idTerminal_example"; // String | 
        try {
            GetCommoditiesPricesOkResponse result = apiInstance.getCommoditiesPricesByTerminal(idTerminal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesPricesByTerminal");
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
| **idTerminal** | **String**|  | |

### Return type

[**GetCommoditiesPricesOkResponse**](GetCommoditiesPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesPricesHistoryByTerminalAndCommodity

> GetCommoditiesPricesHistoryOkResponse getCommoditiesPricesHistoryByTerminalAndCommodity(idTerminal, idCommodity)

Obtain a price history of a commodity at a specific location

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idTerminal = "idTerminal_example"; // String | 
        String idCommodity = "idCommodity_example"; // String | 
        try {
            GetCommoditiesPricesHistoryOkResponse result = apiInstance.getCommoditiesPricesHistoryByTerminalAndCommodity(idTerminal, idCommodity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesPricesHistoryByTerminalAndCommodity");
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
| **idTerminal** | **String**|  | |
| **idCommodity** | **String**|  | |

### Return type

[**GetCommoditiesPricesHistoryOkResponse**](GetCommoditiesPricesHistoryOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesRanking

> GetCommoditiesRankingOkResponse getCommoditiesRanking()

Retrieves the UEX Commodities Average Index™ Ranking

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        try {
            GetCommoditiesRankingOkResponse result = apiInstance.getCommoditiesRanking();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesRanking");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetCommoditiesRankingOkResponse**](GetCommoditiesRankingOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesRawPricesAll

> GetCommoditiesRawPricesAllOkResponse getCommoditiesRawPricesAll()

Retrieve a list of prices for all raw commodities in all terminals, all at once

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        try {
            GetCommoditiesRawPricesAllOkResponse result = apiInstance.getCommoditiesRawPricesAll();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesRawPricesAll");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetCommoditiesRawPricesAllOkResponse**](GetCommoditiesRawPricesAllOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesRawPricesByCommodity

> GetCommoditiesRawPricesOkResponse getCommoditiesRawPricesByCommodity(idCommodity)

Retrieve a list of prices for all unrefined (raw/ore) commodities.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idCommodity = "idCommodity_example"; // String | 
        try {
            GetCommoditiesRawPricesOkResponse result = apiInstance.getCommoditiesRawPricesByCommodity(idCommodity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesRawPricesByCommodity");
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
| **idCommodity** | **String**|  | |

### Return type

[**GetCommoditiesRawPricesOkResponse**](GetCommoditiesRawPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesRawPricesByTerminal

> GetCommoditiesRawPricesOkResponse getCommoditiesRawPricesByTerminal(idTerminal)

Retrieve a list of prices for all unrefined (raw/ore) commodities.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idTerminal = "idTerminal_example"; // String | 
        try {
            GetCommoditiesRawPricesOkResponse result = apiInstance.getCommoditiesRawPricesByTerminal(idTerminal);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesRawPricesByTerminal");
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
| **idTerminal** | **String**|  | |

### Return type

[**GetCommoditiesRawPricesOkResponse**](GetCommoditiesRawPricesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesRoutesByCommodity

> GetCommoditiesRoutesOkResponse getCommoditiesRoutesByCommodity(idCommodity)

Retrieve a list of common routes calculated based on data reports

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idCommodity = "idCommodity_example"; // String | 
        try {
            GetCommoditiesRoutesOkResponse result = apiInstance.getCommoditiesRoutesByCommodity(idCommodity);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesRoutesByCommodity");
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
| **idCommodity** | **String**|  | |

### Return type

[**GetCommoditiesRoutesOkResponse**](GetCommoditiesRoutesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesRoutesByOrbitOrigin

> GetCommoditiesRoutesOkResponse getCommoditiesRoutesByOrbitOrigin(idOrbitOrigin)

Retrieve a list of common routes calculated based on data reports

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idOrbitOrigin = "idOrbitOrigin_example"; // String | 
        try {
            GetCommoditiesRoutesOkResponse result = apiInstance.getCommoditiesRoutesByOrbitOrigin(idOrbitOrigin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesRoutesByOrbitOrigin");
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
| **idOrbitOrigin** | **String**|  | |

### Return type

[**GetCommoditiesRoutesOkResponse**](GetCommoditiesRoutesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesRoutesByPlanetOrigin

> GetCommoditiesRoutesOkResponse getCommoditiesRoutesByPlanetOrigin(idPlanetOrigin)

Retrieve a list of common routes calculated based on data reports

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idPlanetOrigin = "idPlanetOrigin_example"; // String | 
        try {
            GetCommoditiesRoutesOkResponse result = apiInstance.getCommoditiesRoutesByPlanetOrigin(idPlanetOrigin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesRoutesByPlanetOrigin");
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
| **idPlanetOrigin** | **String**|  | |

### Return type

[**GetCommoditiesRoutesOkResponse**](GetCommoditiesRoutesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesRoutesByTerminalOrigin

> GetCommoditiesRoutesOkResponse getCommoditiesRoutesByTerminalOrigin(idTerminalOrigin)

Retrieve a list of common routes calculated based on data reports

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        String idTerminalOrigin = "idTerminalOrigin_example"; // String | 
        try {
            GetCommoditiesRoutesOkResponse result = apiInstance.getCommoditiesRoutesByTerminalOrigin(idTerminalOrigin);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesRoutesByTerminalOrigin");
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
| **idTerminalOrigin** | **String**|  | |

### Return type

[**GetCommoditiesRoutesOkResponse**](GetCommoditiesRoutesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getCommoditiesStatus

> GetCommoditiesStatusOkResponse getCommoditiesStatus()

Obtain a list of inventory states that are displayed at every trading terminal.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommoditiesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        CommoditiesApi apiInstance = new CommoditiesApi(defaultClient);
        try {
            GetCommoditiesStatusOkResponse result = apiInstance.getCommoditiesStatus();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommoditiesApi#getCommoditiesStatus");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**GetCommoditiesStatusOkResponse**](GetCommoditiesStatusOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

