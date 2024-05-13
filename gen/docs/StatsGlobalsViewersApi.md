# StatsGlobalsViewersApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosStatsViewersChannelsHistogramGet**](StatsGlobalsViewersApi.md#call1videosStatsViewersChannelsHistogramGet) | **GET** /1/videos/stats/viewers/channels/histogram | Viewers per channel histogram |
| [**call1videosStatsViewersChannelsSharesGet**](StatsGlobalsViewersApi.md#call1videosStatsViewersChannelsSharesGet) | **GET** /1/videos/stats/viewers/channels/shares | Viewers per channel share |
| [**call1videosStatsViewersGet**](StatsGlobalsViewersApi.md#call1videosStatsViewersGet) | **GET** /1/videos/stats/viewers | Viewers |
| [**call1videosStatsViewersHistogramGet**](StatsGlobalsViewersApi.md#call1videosStatsViewersHistogramGet) | **GET** /1/videos/stats/viewers/histogram | Viewers Histogram |
| [**call1videosStatsViewersUniquesGet**](StatsGlobalsViewersApi.md#call1videosStatsViewersUniquesGet) | **GET** /1/videos/stats/viewers/uniques | Unique Viewers |



## call1videosStatsViewersChannelsHistogramGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1videosStatsViewersChannelsHistogramGet(from, to, per, accountId, requestBody69)

Viewers per channel histogram

This endpoint allows you to retrieve Global viewers histogram per channel.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsGlobalsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsViewersApi apiInstance = new StatsGlobalsViewersApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1videosStatsViewersChannelsHistogramGet(from, to, per, accountId, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsViewersApi#call1videosStatsViewersChannelsHistogramGet");
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


## call1videosStatsViewersChannelsSharesGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1videosStatsViewersChannelsSharesGet(from, accountId, requestBody69)

Viewers per channel share

This endpoint allows you to retrieve Global viewers histogram share per channel.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsGlobalsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsViewersApi apiInstance = new StatsGlobalsViewersApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1videosStatsViewersChannelsSharesGet(from, accountId, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsViewersApi#call1videosStatsViewersChannelsSharesGet");
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


## call1videosStatsViewersGet

> Model1VideosStatsViewersGet200Response call1videosStatsViewersGet(from, to, per, accountId, requestBody69)

Viewers

This endpoint allows you to retrieve Global viewers on the pack order.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsGlobalsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsViewersApi apiInstance = new StatsGlobalsViewersApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosStatsViewersGet200Response result = apiInstance.call1videosStatsViewersGet(from, to, per, accountId, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsViewersApi#call1videosStatsViewersGet");
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


## call1videosStatsViewersHistogramGet

> Model1VideosStatsViewersHistogramGet200Response call1videosStatsViewersHistogramGet(from, to, per)

Viewers Histogram

This endpoint allows you to retrieve Global unique viewers histogram on the pack order.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsGlobalsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsViewersApi apiInstance = new StatsGlobalsViewersApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        try {
            Model1VideosStatsViewersHistogramGet200Response result = apiInstance.call1videosStatsViewersHistogramGet(from, to, per);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsViewersApi#call1videosStatsViewersHistogramGet");
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

[**Model1VideosStatsViewersHistogramGet200Response**](Model1VideosStatsViewersHistogramGet200Response.md)

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


## call1videosStatsViewersUniquesGet

> Model1VideosStatsViewersGet200Response call1videosStatsViewersUniquesGet(from, to, per, accountId, requestBody69)

Unique Viewers

This endpoint allows you to retrieve Global unique viewers on the pack order.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.StatsGlobalsViewersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        StatsGlobalsViewersApi apiInstance = new StatsGlobalsViewersApi(defaultClient);
        String from = "from_example"; // String | Specify the starting date to get Consumption
        String to = "to_example"; // String | Specify the ending date to get Consumption
        String per = "per_example"; // String | Specify the ending date to get Consumption
        Integer accountId = 42000; // Integer | The account identifier
        RequestBody69 requestBody69 = new RequestBody69(); // RequestBody69 | 
        try {
            Model1VideosStatsViewersGet200Response result = apiInstance.call1videosStatsViewersUniquesGet(from, to, per, accountId, requestBody69);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling StatsGlobalsViewersApi#call1videosStatsViewersUniquesGet");
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

