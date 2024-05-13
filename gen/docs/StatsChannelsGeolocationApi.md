# StatsChannelsGeolocationApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelStatsGeolocationClustersGet**](StatsChannelsGeolocationApi.md#call1videosChannelStatsGeolocationClustersGet) | **GET** /1/videos/{channel}/stats/geolocation/clusters | Clusters |
| [**call1videosChannelStatsGeolocationCountriesGet**](StatsChannelsGeolocationApi.md#call1videosChannelStatsGeolocationCountriesGet) | **GET** /1/videos/{channel}/stats/geolocation/countries | Countries |



## call1videosChannelStatsGeolocationClustersGet

> Model1VideosChannelStatsGeolocationClustersGet200Response call1videosChannelStatsGeolocationClustersGet(channel, from, to, per, accountId, with, requestBody69)

Clusters

This endpoint allows you to retrieve get clusters.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsGeolocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsGeolocationApi apiInstance = new StatsChannelsGeolocationApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosChannelStatsGeolocationClustersGet200Response result = apiInstance.call1videosChannelStatsGeolocationClustersGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsGeolocationApi#call1videosChannelStatsGeolocationClustersGet");
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

[**Model1VideosChannelStatsGeolocationClustersGet200Response**](Model1VideosChannelStatsGeolocationClustersGet200Response.md)

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


## call1videosChannelStatsGeolocationCountriesGet

> Model1VideosChannelStatsGeolocationCountriesGet200Response call1videosChannelStatsGeolocationCountriesGet(channel, from, to, per, accountId, with, requestBody69)

Countries

This endpoint allows you to retrieve get countries.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsGeolocationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsGeolocationApi apiInstance = new StatsChannelsGeolocationApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosChannelStatsGeolocationCountriesGet200Response result = apiInstance.call1videosChannelStatsGeolocationCountriesGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsGeolocationApi#call1videosChannelStatsGeolocationCountriesGet");
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

[**Model1VideosChannelStatsGeolocationCountriesGet200Response**](Model1VideosChannelStatsGeolocationCountriesGet200Response.md)

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

