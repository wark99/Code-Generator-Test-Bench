# MarketplaceApi

All URIs are relative to *https://ptu.uexcorp.space/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getMarketplaceFavorites**](MarketplaceApi.md#getMarketplaceFavorites) | **GET** /marketplace_favorites/ | List all advertisements favorited by an user |
| [**getMarketplaceListings**](MarketplaceApi.md#getMarketplaceListings) | **GET** /marketplace_listings/ | List all active marketplace advertisements, limited by 100 |



## getMarketplaceFavorites

> GetMarketplaceFavoritesOkResponse getMarketplaceFavorites()

List all advertisements favorited by an user

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketplaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        MarketplaceApi apiInstance = new MarketplaceApi(defaultClient);
        try {
            GetMarketplaceFavoritesOkResponse result = apiInstance.getMarketplaceFavorites();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceApi#getMarketplaceFavorites");
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

[**GetMarketplaceFavoritesOkResponse**](GetMarketplaceFavoritesOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## getMarketplaceListings

> GetMarketplaceListingsOkResponse getMarketplaceListings(id)

List all active marketplace advertisements, limited by 100

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MarketplaceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ptu.uexcorp.space/api");

        MarketplaceApi apiInstance = new MarketplaceApi(defaultClient);
        String id = "id_example"; // String | 
        try {
            GetMarketplaceListingsOkResponse result = apiInstance.getMarketplaceListings(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling MarketplaceApi#getMarketplaceListings");
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
| **id** | **String**|  | [optional] |

### Return type

[**GetMarketplaceListingsOkResponse**](GetMarketplaceListingsOkResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

