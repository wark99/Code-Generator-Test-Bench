# StatsGlobalsViewingApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosStatsViewingChannelsHistogramGet**](StatsGlobalsViewingApi.md#call1videosStatsViewingChannelsHistogramGet) | **GET** /1/videos/stats/viewing/channels/histogram | Viewing histogram par channel |
| [**call1videosStatsViewingGet**](StatsGlobalsViewingApi.md#call1videosStatsViewingGet) | **GET** /1/videos/stats/viewing | Viewing time |



## call1videosStatsViewingChannelsHistogramGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1videosStatsViewingChannelsHistogramGet(from, to, per, accountId, requestBody69)

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
import org.openapitools.client.api.StatsGlobalsViewingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsViewingApi apiInstance = new StatsGlobalsViewingApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1videosStatsViewingChannelsHistogramGet(from, to, per, accountId, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsViewingApi#call1videosStatsViewingChannelsHistogramGet");
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
| **to** | **String**| Specify the ending date to get Consumption | |
| **per** | **String**| Specify the ending date to get Consumption | |
| **accountId** | **Integer**| The account identifier | |
| **requestBody69** | [**RequestBody69**](RequestBody69.md)|  | [optional] |

### Return type

[**Model1SwissBackupsSwissBackupIdAdminPut200Response**](Model1SwissBackupsSwissBackupIdAdminPut200Response.md)

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


## call1videosStatsViewingGet

> Model1VideosStatsViewersGet200Response call1videosStatsViewingGet(from, to, per)

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
import org.openapitools.client.api.StatsGlobalsViewingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsViewingApi apiInstance = new StatsGlobalsViewingApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        try {
            Model1VideosStatsViewersGet200Response result = apiInstance.call1videosStatsViewingGet(from, to, per);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsViewingApi#call1videosStatsViewingGet");
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
| **to** | **String**| Specify the ending date to get Consumption | |
| **per** | **String**| Specify the ending date to get Consumption | |

### Return type

[**Model1VideosStatsViewersGet200Response**](Model1VideosStatsViewersGet200Response.md)

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

