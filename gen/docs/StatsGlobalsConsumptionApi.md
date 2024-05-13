# StatsGlobalsConsumptionApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosStatsConsumptionChannelsHistogramGet**](StatsGlobalsConsumptionApi.md#call1videosStatsConsumptionChannelsHistogramGet) | **GET** /1/videos/stats/consumption/channels/histogram | Consumption per Channel histogram |
| [**call1videosStatsConsumptionGet**](StatsGlobalsConsumptionApi.md#call1videosStatsConsumptionGet) | **GET** /1/videos/stats/consumption | Consumption |



## call1videosStatsConsumptionChannelsHistogramGet

> Model1VideosStatsConsumptionGet200Response call1videosStatsConsumptionChannelsHistogramGet(from)

Consumption per Channel histogram

This endpoint allows you to retrieve Global Histogram per channel on the pack order.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsGlobalsConsumptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsConsumptionApi apiInstance = new StatsGlobalsConsumptionApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        try {
            Model1VideosStatsConsumptionGet200Response result = apiInstance.call1videosStatsConsumptionChannelsHistogramGet(from);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsConsumptionApi#call1videosStatsConsumptionChannelsHistogramGet");
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
| **from** | **String**| Specify the starting date to get Consumption | |

### Return type

[**Model1VideosStatsConsumptionGet200Response**](Model1VideosStatsConsumptionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |


## call1videosStatsConsumptionGet

> Model1VideosStatsConsumptionGet200Response call1videosStatsConsumptionGet(from, accountId, requestBody69)

Consumption

This endpoint allows you to retrieve Global consumption all channel on the pack order.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsGlobalsConsumptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsConsumptionApi apiInstance = new StatsGlobalsConsumptionApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosStatsConsumptionGet200Response result = apiInstance.call1videosStatsConsumptionGet(from, accountId, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsConsumptionApi#call1videosStatsConsumptionGet");
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
| **from** | **String**| Specify the starting date to get Consumption | |
| **accountId** | **Integer**| The account identifier | |
| **requestBody69** | [**RequestBody69**](RequestBody69.md)|  | [optional] |

### Return type

[**Model1VideosStatsConsumptionGet200Response**](Model1VideosStatsConsumptionGet200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **500** | Internal Server Error |  -  |

