# SpaceTraderApi

All URIs are relative to *https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**registerNewAgent**](SpaceTraderApi.md#registerNewAgent) | **POST** /register | Register a new Agent |



## registerNewAgent

> registerNewAgent(symbol)

Register a new Agent

Here you can register a new agent. After that, you get a token

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpaceTraderApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/THODA166_1/SpaceTrader/1.0.0");

        SpaceTraderApi apiInstance = new SpaceTraderApi(defaultClient);
        String symbol = "symbol_example"; // String | Enter a symbol and faction
        try {
            apiInstance.registerNewAgent(symbol);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpaceTraderApi#registerNewAgent");
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
| **symbol** | **String**| Enter a symbol and faction | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


