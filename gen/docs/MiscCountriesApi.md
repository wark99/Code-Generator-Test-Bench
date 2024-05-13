# MiscCountriesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosCountriesGet**](MiscCountriesApi.md#call1videosCountriesGet) | **GET** /1/videos/countries | List countries |
| [**call1videosTimezonesGet**](MiscCountriesApi.md#call1videosTimezonesGet) | **GET** /1/videos/timezones | List timezones |



## call1videosCountriesGet

> Model1VideosCountriesGet200Response call1videosCountriesGet()

List countries

List all the countries available for anything as Code &#x3D;&gt; Name.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MiscCountriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        MiscCountriesApi apiInstance = new MiscCountriesApi(defaultClient);
        try {
            Model1VideosCountriesGet200Response result = apiInstance.call1videosCountriesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscCountriesApi#call1videosCountriesGet");
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

[**Model1VideosCountriesGet200Response**](Model1VideosCountriesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosTimezonesGet

> Model1VideosTimezonesGet200Response call1videosTimezonesGet()

List timezones

List all the timezones available for  \&quot;America/Asuncion\&quot;: \&quot;(GMT-03:00) Asuncion\&quot;,.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MiscCountriesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");

        MiscCountriesApi apiInstance = new MiscCountriesApi(defaultClient);
        try {
            Model1VideosTimezonesGet200Response result = apiInstance.call1videosTimezonesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MiscCountriesApi#call1videosTimezonesGet");
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

[**Model1VideosTimezonesGet200Response**](Model1VideosTimezonesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

