# MiscStreamApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosPasswordGet**](MiscStreamApi.md#call1videosPasswordGet) | **GET** /1/videos/password | Generate stream key |



## call1videosPasswordGet

> Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response call1videosPasswordGet()

Generate stream key

Generate a random password string in base 52 (0-9a-zA-Z minus aeiouAEIOU). The first 5 vowels have been removed to avoid bad luck passwords (1fUcky0u for example).

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MiscStreamApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        MiscStreamApi apiInstance = new MiscStreamApi(defaultClient);
        try {
            Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response result = apiInstance.call1videosPasswordGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscStreamApi#call1videosPasswordGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response**](Model1RadiosRadioProductIdPlayersPlayerIdThumbnailPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |

