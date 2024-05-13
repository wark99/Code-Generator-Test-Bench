# EventApi

All URIs are relative to *https://api.beakon.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**eventFindGet**](EventApi.md#eventFindGet) | **GET** /event/find | Find Events |



## eventFindGet

> List&lt;Event&gt; eventFindGet(tags, startTimestamp, endTimestamp)

Find Events

Finds all events after applying filters. Returns results in reverse chronological order.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EventApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.beakon.com");
        
        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        EventApi apiInstance = new EventApi(defaultClient);
        List<Tag> tags = Arrays.asList(); // List<Tag> | Tag values that need to be considered for filter
        Integer startTimestamp = 1696143600; // Integer | Restrict events to those containing an alert after startTimestamp, which is a UNIX timestamp (seconds since January 1, 1970).
        Integer endTimestamp = 1696143720; // Integer | Restrict events to those containing an alert before endTimestamp, which is a UNIX timestamp (seconds since January 1, 1970).
        try {
            List<Event> result = apiInstance.eventFindGet(tags, startTimestamp, endTimestamp);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EventApi#eventFindGet");
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
| **tags** | [**List&lt;Tag&gt;**](Tag.md)| Tag values that need to be considered for filter | [optional] |
| **startTimestamp** | **Integer**| Restrict events to those containing an alert after startTimestamp, which is a UNIX timestamp (seconds since January 1, 1970). | [optional] |
| **endTimestamp** | **Integer**| Restrict events to those containing an alert before endTimestamp, which is a UNIX timestamp (seconds since January 1, 1970). | [optional] |

### Return type

[**List&lt;Event&gt;**](Event.md)

### Authorization

[api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid parameter value |  -  |
| **403** | Missing or invalid authentication token |  -  |

