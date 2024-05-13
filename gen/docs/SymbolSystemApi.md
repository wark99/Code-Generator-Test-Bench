# SymbolSystemApi

All URIs are relative to *https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**searchInventory**](SymbolSystemApi.md#searchInventory) | **GET** /systems | Get all available Systems |
| [**systemsSystemSymbolGet**](SymbolSystemApi.md#systemsSystemSymbolGet) | **GET** /systems/systemSymbol | Get all information about a specific system |
| [**systemsSystemSymbolWaypointsGet**](SymbolSystemApi.md#systemsSystemSymbolWaypointsGet) | **GET** /systems/{systemSymbol}/waypoints | Get all information about a specific system |
| [**systemsSystemSymbolWaypointsSymbolShipyardGet**](SymbolSystemApi.md#systemsSystemSymbolWaypointsSymbolShipyardGet) | **GET** /systems/{systemSymbol}/waypoints/{symbol}/shipyard | Get all information about a specific system |



## searchInventory

> List&lt;System&gt; searchInventory()

Get all available Systems

Getting all Systems in SpaceInvader 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SymbolSystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0");

        SymbolSystemApi apiInstance = new SymbolSystemApi(defaultClient);
        try {
            List<System> result = apiInstance.searchInventory();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SymbolSystemApi#searchInventory");
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

[**List&lt;System&gt;**](System.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | All Systems Resulat |  -  |
| **500** | Server Error |  -  |


## systemsSystemSymbolGet

> System systemsSystemSymbolGet(systemSymbol)

Get all information about a specific system

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SymbolSystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0");

        SymbolSystemApi apiInstance = new SymbolSystemApi(defaultClient);
        String systemSymbol = "systemSymbol_example"; // String | Enter a symbol of a system
        try {
            System result = apiInstance.systemsSystemSymbolGet(systemSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SymbolSystemApi#systemsSystemSymbolGet");
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
| **systemSymbol** | **String**| Enter a symbol of a system | |

### Return type

[**System**](System.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | The system you enter does not exist. Please another system |  -  |


## systemsSystemSymbolWaypointsGet

> System systemsSystemSymbolWaypointsGet(systemSymbol)

Get all information about a specific system

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SymbolSystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0");

        SymbolSystemApi apiInstance = new SymbolSystemApi(defaultClient);
        String systemSymbol = "systemSymbol_example"; // String | Enter a symbol of a systems
        try {
            System result = apiInstance.systemsSystemSymbolWaypointsGet(systemSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SymbolSystemApi#systemsSystemSymbolWaypointsGet");
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
| **systemSymbol** | **String**| Enter a symbol of a systems | |

### Return type

[**System**](System.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | The system you enter does not exist. Please another system |  -  |


## systemsSystemSymbolWaypointsSymbolShipyardGet

> System systemsSystemSymbolWaypointsSymbolShipyardGet(systemSymbol, symbol)

Get all information about a specific system

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SymbolSystemApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0");

        SymbolSystemApi apiInstance = new SymbolSystemApi(defaultClient);
        String systemSymbol = "systemSymbol_example"; // String | Enter a systemSymbol of a systems
        String symbol = "symbol_example"; // String | Enter a systemSymbol of a systems
        try {
            System result = apiInstance.systemsSystemSymbolWaypointsSymbolShipyardGet(systemSymbol, symbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SymbolSystemApi#systemsSystemSymbolWaypointsSymbolShipyardGet");
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
| **systemSymbol** | **String**| Enter a systemSymbol of a systems | |
| **symbol** | **String**| Enter a systemSymbol of a systems | |

### Return type

[**System**](System.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **404** | The system you enter does not exist. Please another system |  -  |

