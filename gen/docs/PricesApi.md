# PricesApi

All URIs are relative to *https://api.infomaniak.com*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**call1videosPricesDescriptionGet**](PricesApi.md#call1videosPricesDescriptionGet) | **GET** /1/videos/prices/description | Get description |
| [**call1videosPricesGet**](PricesApi.md#call1videosPricesGet) | **GET** /1/videos/prices | Get price |



## call1videosPricesDescriptionGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1videosPricesDescriptionGet()

Get description

This endpoint allows you to retrieve get the description on the pack order.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PricesApi apiInstance = new PricesApi(defaultClient);
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1videosPricesDescriptionGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#call1videosPricesDescriptionGet");
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

[**Model1SwissBackupsSwissBackupIdAdminPut200Response**](Model1SwissBackupsSwissBackupIdAdminPut200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## call1videosPricesGet

> Model1SwissBackupsSwissBackupIdAdminPut200Response call1videosPricesGet()

Get price

This endpoint allows you to retrieve get the price on the pack order.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PricesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.infomaniak.com");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        PricesApi apiInstance = new PricesApi(defaultClient);
        try {
            Model1SwissBackupsSwissBackupIdAdminPut200Response result = apiInstance.call1videosPricesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PricesApi#call1videosPricesGet");
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

[**Model1SwissBackupsSwissBackupIdAdminPut200Response**](Model1SwissBackupsSwissBackupIdAdminPut200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

