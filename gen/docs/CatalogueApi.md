# CatalogueApi

All URIs are relative to *https://api.demo.uniqrewards.com/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**retrieveProduct**](CatalogueApi.md#retrieveProduct) | **GET** /products/{code} | Retrieve product details |
| [**retrieveProducts**](CatalogueApi.md#retrieveProducts) | **GET** /products | Retrieve catalogue of products |



## retrieveProduct

> RetrieveProduct200Response retrieveProduct(code)

Retrieve product details

Retrieve the details of the product from the path.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CatalogueApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.demo.uniqrewards.com/v3");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        CatalogueApi apiInstance = new CatalogueApi(defaultClient);
        String code = "code_example"; // String | The product code of the product object to be retrieved.
        try {
            RetrieveProduct200Response result = apiInstance.retrieveProduct(code);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogueApi#retrieveProduct");
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
| **code** | **String**| The product code of the product object to be retrieved. | |

### Return type

[**RetrieveProduct200Response**](RetrieveProduct200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |


## retrieveProducts

> RetrieveProducts200Response retrieveProducts()

Retrieve catalogue of products

Retrieve the catalogue of products, listing all configured products available for issuance. Can be used to discover available products and their codes.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CatalogueApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.demo.uniqrewards.com/v3");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        CatalogueApi apiInstance = new CatalogueApi(defaultClient);
        try {
            RetrieveProducts200Response result = apiInstance.retrieveProducts();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CatalogueApi#retrieveProducts");
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

[**RetrieveProducts200Response**](RetrieveProducts200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |

