# CarstockListApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**newCarstocklistPost**](CarstockListApi.md#newCarstocklistPost) | **POST** /new/carstocklist | Get preview and status info for several carstocks to provide in list overview |
| [**newCarstocklistPost_0**](CarstockListApi.md#newCarstocklistPost_0) | **POST** /new/carstocklist | Get preview and status info for several carstocks to provide in list overview |



## newCarstocklistPost

> List&lt;CarstocklistResponse&gt; newCarstocklistPost(carstocklistRequest)

Get preview and status info for several carstocks to provide in list overview

Get preview and status info for several carstocks to provide in list overview

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockListApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockListApi apiInstance = new CarstockListApi(defaultClient);
        CarstocklistRequest carstocklistRequest = new CarstocklistRequest(); // CarstocklistRequest | 
        try {
            List<CarstocklistResponse> result = apiInstance.newCarstocklistPost(carstocklistRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockListApi#newCarstocklistPost");
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
| **carstocklistRequest** | [**CarstocklistRequest**](CarstocklistRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstocklistResponse&gt;**](CarstocklistResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## newCarstocklistPost_0

> List&lt;CarstocklistResponse&gt; newCarstocklistPost_0(carstocklistRequest)

Get preview and status info for several carstocks to provide in list overview

Get preview and status info for several carstocks to provide in list overview

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockListApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockListApi apiInstance = new CarstockListApi(defaultClient);
        CarstocklistRequest carstocklistRequest = new CarstocklistRequest(); // CarstocklistRequest | 
        try {
            List<CarstocklistResponse> result = apiInstance.newCarstocklistPost_0(carstocklistRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockListApi#newCarstocklistPost_0");
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
| **carstocklistRequest** | [**CarstocklistRequest**](CarstocklistRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstocklistResponse&gt;**](CarstocklistResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |

