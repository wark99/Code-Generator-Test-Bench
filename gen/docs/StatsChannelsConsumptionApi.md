# StatsChannelsConsumptionApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelStatsConsumptionGet**](StatsChannelsConsumptionApi.md#call1videosChannelStatsConsumptionGet) | **GET** /1/videos/{channel}/stats/consumption | Consumption |
| [**call1videosChannelStatsConsumptionResolutionsHistogramGet**](StatsChannelsConsumptionApi.md#call1videosChannelStatsConsumptionResolutionsHistogramGet) | **GET** /1/videos/{channel}/stats/consumption/resolutions/histogram | Consumption Per resolution |



## call1videosChannelStatsConsumptionGet

> Model1VideosStatsConsumptionGet200Response call1videosChannelStatsConsumptionGet(channel, from, to, per, accountId, with, requestBody69)

Consumption

This endpoint allows you to retrieve channel consumption stats.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsConsumptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsConsumptionApi apiInstance = new StatsChannelsConsumptionApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosStatsConsumptionGet200Response result = apiInstance.call1videosChannelStatsConsumptionGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsConsumptionApi#call1videosChannelStatsConsumptionGet");
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


## call1videosChannelStatsConsumptionResolutionsHistogramGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1videosChannelStatsConsumptionResolutionsHistogramGet(channel, from, to, per, accountId, with, requestBody69)

Consumption Per resolution

This endpoint allows you to retrieve consumption Per resolution histogram.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsConsumptionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsConsumptionApi apiInstance = new StatsChannelsConsumptionApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1videosChannelStatsConsumptionResolutionsHistogramGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsConsumptionApi#call1videosChannelStatsConsumptionResolutionsHistogramGet");
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

