# StatsChannelsViewersApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosChannelStatsViewersGet**](StatsChannelsViewersApi.md#call1videosChannelStatsViewersGet) | **GET** /1/videos/{channel}/stats/viewers | Viewers share |
| [**call1videosChannelStatsViewersHistogramGet**](StatsChannelsViewersApi.md#call1videosChannelStatsViewersHistogramGet) | **GET** /1/videos/{channel}/stats/viewers/histogram | Viewers Histogram share |
| [**call1videosChannelStatsViewersResolutionsHistogramGet**](StatsChannelsViewersApi.md#call1videosChannelStatsViewersResolutionsHistogramGet) | **GET** /1/videos/{channel}/stats/viewers/resolutions/histogram | Viewers per resolution histogram. |
| [**call1videosChannelStatsViewersResolutionsSharesGet**](StatsChannelsViewersApi.md#call1videosChannelStatsViewersResolutionsSharesGet) | **GET** /1/videos/{channel}/stats/viewers/resolutions/shares | Viewers per resolution share. |
| [**call1videosChannelStatsViewersUniquesGet**](StatsChannelsViewersApi.md#call1videosChannelStatsViewersUniquesGet) | **GET** /1/videos/{channel}/stats/viewers/uniques | Unique viewers. |



## call1videosChannelStatsViewersGet

> Model1VideosStatsViewersGet200Response call1videosChannelStatsViewersGet(channel, from, to, per, accountId, with, requestBody69)

Viewers share

This endpoint allows you to retrieve get viewers share.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsViewersApi apiInstance = new StatsChannelsViewersApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosStatsViewersGet200Response result = apiInstance.call1videosChannelStatsViewersGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsViewersApi#call1videosChannelStatsViewersGet");
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


## call1videosChannelStatsViewersHistogramGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1videosChannelStatsViewersHistogramGet(channel, from, to, per, accountId, with, requestBody69)

Viewers Histogram share

This endpoint allows you to retrieve get viewers Histogram share.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsViewersApi apiInstance = new StatsChannelsViewersApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1videosChannelStatsViewersHistogramGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsViewersApi#call1videosChannelStatsViewersHistogramGet");
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

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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


## call1videosChannelStatsViewersResolutionsHistogramGet

> Model1VideosChannelStatsViewersResolutionsHistogramGet200Response call1videosChannelStatsViewersResolutionsHistogramGet(channel, from, to, per, accountId, with, requestBody69)

Viewers per resolution histogram.

This endpoint allows you to retrieve get viewers per resolution histogram.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsViewersApi apiInstance = new StatsChannelsViewersApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosChannelStatsViewersResolutionsHistogramGet200Response result = apiInstance.call1videosChannelStatsViewersResolutionsHistogramGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsViewersApi#call1videosChannelStatsViewersResolutionsHistogramGet");
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

[**Model1VideosChannelStatsViewersResolutionsHistogramGet200Response**](Model1VideosChannelStatsViewersResolutionsHistogramGet200Response.md)

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


## call1videosChannelStatsViewersResolutionsSharesGet

> Model1VideosChannelStatsViewersResolutionsSharesGet200Response call1videosChannelStatsViewersResolutionsSharesGet(channel, from, to, per, accountId, with, requestBody69)

Viewers per resolution share.

This endpoint allows you to retrieve get viewers per resolution share.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsViewersApi apiInstance = new StatsChannelsViewersApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosChannelStatsViewersResolutionsSharesGet200Response result = apiInstance.call1videosChannelStatsViewersResolutionsSharesGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsViewersApi#call1videosChannelStatsViewersResolutionsSharesGet");
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

[**Model1VideosChannelStatsViewersResolutionsSharesGet200Response**](Model1VideosChannelStatsViewersResolutionsSharesGet200Response.md)

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


## call1videosChannelStatsViewersUniquesGet

> Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response call1videosChannelStatsViewersUniquesGet(channel, from, to, per, accountId, with, requestBody69)

Unique viewers.

This endpoint allows you to retrieve get unique viewers.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsChannelsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsChannelsViewersApi apiInstance = new StatsChannelsViewersApi(defaultClient);
        Integer channel = 56; // Integer | The unique identifier (ID) of the Pack order to request.
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        String with = "with_example"; // String | *Optional* : Allows loading additional data about a resource, which may include related resources.
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response result = apiInstance.call1videosChannelStatsViewersUniquesGet(channel, from, to, per, accountId, with, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsChannelsViewersApi#call1videosChannelStatsViewersUniquesGet");
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

[**Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response**](Model1RadiosRadioProductIdStationsStationIdStreamsStreamIdIntroductionFileGet200Response.md)

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

