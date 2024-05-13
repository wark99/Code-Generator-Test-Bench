# ShipyardApi

All URIs are relative to *https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**myShipsPost**](ShipyardApi.md#myShipsPost) | **POST** /my/ships | Purchase a ship |



## myShipsPost

> System myShipsPost(shipType, waypointSymbol)

Purchase a ship

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ShipyardApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0");

        ShipyardApi apiInstance = new ShipyardApi(defaultClient);
        String shipType = "shipType_example"; // String | Enter a ship type
        String waypointSymbol = "waypointSymbol_example"; // String | Enter a waypoint symbol
        try {
            System result = apiInstance.myShipsPost(shipType, waypointSymbol);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ShipyardApi#myShipsPost");
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
| **shipType** | **String**| Enter a ship type | |
| **waypointSymbol** | **String**| Enter a waypoint symbol | |

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
| **404** | The header you enter does not exist. Please another system |  -  |

