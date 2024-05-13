# SponsorAdsApi

All URIs are relative to *https://ads-firebender.vercel.app/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**fetchAds**](SponsorAdsApi.md#fetchAds) | **POST** /sponsors_v2 | Fetch Contextually Relevant Ads |



## fetchAds

> FetchAds200Response fetchAds(fetchAdsRequest)

Fetch Contextually Relevant Ads

Responds with a product or service relevant to the provided conversation context.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SponsorAdsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ads-firebender.vercel.app/api");
        
        // Configure HTTP bearer authorization: BearerAuth
        HttpBearerAuth BearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("BearerAuth");
        BearerAuth.setBearerToken("BEARER TOKEN");

        SponsorAdsApi apiInstance = new SponsorAdsApi(defaultClient);
        FetchAdsRequest fetchAdsRequest = new FetchAdsRequest(); // FetchAdsRequest | 
        try {
            FetchAds200Response result = apiInstance.fetchAds(fetchAdsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SponsorAdsApi#fetchAds");
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
| **fetchAdsRequest** | [**FetchAdsRequest**](FetchAdsRequest.md)|  | |

### Return type

[**FetchAds200Response**](FetchAds200Response.md)

### Authorization

[BearerAuth](../README.md#BearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **400** | Malformed Request |  -  |
| **401** | Invalid API Key or User ID |  -  |
| **5XX** | Server Issues |  -  |

