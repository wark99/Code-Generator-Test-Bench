# ImageSourceSelectionApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**imagesourceActivePost**](ImageSourceSelectionApi.md#imagesourceActivePost) | **POST** /imagesource/active | set new imagesource |
| [**imagesourceActivePost_0**](ImageSourceSelectionApi.md#imagesourceActivePost_0) | **POST** /imagesource/active | set new imagesource |



## imagesourceActivePost

> ImagesourceActivePost200Response imagesourceActivePost(imagesourceActivePostRequest)

set new imagesource



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageSourceSelectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageSourceSelectionApi apiInstance = new ImageSourceSelectionApi(defaultClient);
        ImagesourceActivePostRequest imagesourceActivePostRequest = new ImagesourceActivePostRequest(); // ImagesourceActivePostRequest | 
        try {
            ImagesourceActivePost200Response result = apiInstance.imagesourceActivePost(imagesourceActivePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageSourceSelectionApi#imagesourceActivePost");
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
| **imagesourceActivePostRequest** | [**ImagesourceActivePostRequest**](ImagesourceActivePostRequest.md)|  | [optional] |

### Return type

[**ImagesourceActivePost200Response**](ImagesourceActivePost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## imagesourceActivePost_0

> ImagesourceActivePost200Response imagesourceActivePost_0(imagesourceActivePostRequest)

set new imagesource



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageSourceSelectionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageSourceSelectionApi apiInstance = new ImageSourceSelectionApi(defaultClient);
        ImagesourceActivePostRequest imagesourceActivePostRequest = new ImagesourceActivePostRequest(); // ImagesourceActivePostRequest | 
        try {
            ImagesourceActivePost200Response result = apiInstance.imagesourceActivePost_0(imagesourceActivePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageSourceSelectionApi#imagesourceActivePost_0");
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
| **imagesourceActivePostRequest** | [**ImagesourceActivePostRequest**](ImagesourceActivePostRequest.md)|  | [optional] |

### Return type

[**ImagesourceActivePost200Response**](ImagesourceActivePost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |

