# StatsChannelsViewingApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelStatsViewingGet**](StatsChannelsViewingApi.md#call1videosChannelStatsViewingGet) | **GET** /1/videos/{channel}/stats/viewing | Viewing time |
| [**call1videosChannelStatsViewingResolutionsHistogramGet**](StatsChannelsViewingApi.md#call1videosChannelStatsViewingResolutionsHistogramGet) | **GET** /1/videos/{channel}/stats/viewing/resolutions/histogram | Viewing histogram par channel |



## call1videosChannelStatsViewingGet

> Model1VideosStatsViewersGet200Response call1videosChannelStatsViewingGet(channel, from, to, per, accountId, with, requestBody69)

Viewing time

This endpoint allows you to retrieve Global Viewing histogram per channel.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsViewingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsViewingApi apiInstance = new StatsChannelsViewingApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosStatsViewersGet200Response result = apiInstance.call1videosChannelStatsViewingGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsViewingApi#call1videosChannelStatsViewingGet");
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
| **channel** | **Integer**| The unique identifier (ID) of the Pack order to request. | |
| **from** | **String**| Specify the starting date to get Consumption | |
| **to** | **String**| Specify the ending date to get Consumption | |
| **per** | **String**| Specify the ending date to get Consumption | |
| **accountId** | **Integer**| The account identifier | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |
| **requestBody69** | [**RequestBody69**](RequestBody69.md)|  | [optional] |

### Return type

[**Model1VideosStatsViewersGet200Response**](Model1VideosStatsViewersGet200Response.md)

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


## call1videosChannelStatsViewingResolutionsHistogramGet

> Model1VideosChannelStatsViewersResolutionsHistogramGet200Response call1videosChannelStatsViewingResolutionsHistogramGet(channel, from, to, per, with)

Viewing histogram par channel

This endpoint allows you to retrieve Global Viewing histogram per channel.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsViewingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsViewingApi apiInstance = new StatsChannelsViewingApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        try {
            Model1VideosChannelStatsViewersResolutionsHistogramGet200Response result = apiInstance.call1videosChannelStatsViewingResolutionsHistogramGet(channel, from, to, per, with);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsViewingApi#call1videosChannelStatsViewingResolutionsHistogramGet");
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
| **channel** | **Integer**| The unique identifier (ID) of the Pack order to request. | |
| **from** | **String**| Specify the starting date to get Consumption | |
| **to** | **String**| Specify the ending date to get Consumption | |
| **per** | **String**| Specify the ending date to get Consumption | |
| **with** | **String**| *Optional* : Allows loading additional data about a resource, which may include related resources. | [optional] |

### Return type

[**Model1VideosChannelStatsViewersResolutionsHistogramGet200Response**](Model1VideosChannelStatsViewersResolutionsHistogramGet200Response.md)

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

