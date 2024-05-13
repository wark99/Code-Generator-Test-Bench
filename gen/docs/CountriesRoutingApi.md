# CountriesRoutingApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAllApiCountryAllGet**](CountriesRoutingApi.md#getAllApiCountryAllGet) | **GET** /api/country/all | Get All |
| [**getCountryApiCountryGet**](CountriesRoutingApi.md#getCountryApiCountryGet) | **GET** /api/country | Get Country |



## getAllApiCountryAllGet

> CountriesGetAllExampleResponse getAllApiCountryAllGet()

Get All

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesRoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CountriesRoutingApi apiInstance = new CountriesRoutingApi(defaultClient);
        try {
            CountriesGetAllExampleResponse result = apiInstance.getAllApiCountryAllGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CountriesRoutingApi#getAllApiCountryAllGet");
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

[**CountriesGetAllExampleResponse**](CountriesGetAllExampleResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешный запрос |  -  |


## getCountryApiCountryGet

> CountriesGetExampleResponse getCountryApiCountryGet(code)

Get Country

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CountriesRoutingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        CountriesRoutingApi apiInstance = new CountriesRoutingApi(defaultClient);
        String code = "code_example"; // String | 
        try {
            CountriesGetExampleResponse result = apiInstance.getCountryApiCountryGet(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CountriesRoutingApi#getCountryApiCountryGet");
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
| **code** | **String**|  | |

### Return type

[**CountriesGetExampleResponse**](CountriesGetExampleResponse.md)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Успешный запрос |  -  |
| **422** | Validation Error |  -  |

