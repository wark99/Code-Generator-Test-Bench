# MultiChannelConversionAttributionApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodMultiChannelConversionAttributionGetAvailableCampaignDimensionCombinationsPost**](MultiChannelConversionAttributionApi.md#indexPhpmethodMultiChannelConversionAttributionGetAvailableCampaignDimensionCombinationsPost) | **POST** /index.php?method&#x3D;MultiChannelConversionAttribution.getAvailableCampaignDimensionCombinations |  |
| [**indexPhpmethodMultiChannelConversionAttributionGetChannelAttributionPost**](MultiChannelConversionAttributionApi.md#indexPhpmethodMultiChannelConversionAttributionGetChannelAttributionPost) | **POST** /index.php?method&#x3D;MultiChannelConversionAttribution.getChannelAttribution |  |
| [**indexPhpmethodMultiChannelConversionAttributionGetGoalAttributionPost**](MultiChannelConversionAttributionApi.md#indexPhpmethodMultiChannelConversionAttributionGetGoalAttributionPost) | **POST** /index.php?method&#x3D;MultiChannelConversionAttribution.getGoalAttribution |  |
| [**indexPhpmethodMultiChannelConversionAttributionGetSiteAttributionGoalsPost**](MultiChannelConversionAttributionApi.md#indexPhpmethodMultiChannelConversionAttributionGetSiteAttributionGoalsPost) | **POST** /index.php?method&#x3D;MultiChannelConversionAttribution.getSiteAttributionGoals |  |
| [**indexPhpmethodMultiChannelConversionAttributionSetGoalAttributionPost**](MultiChannelConversionAttributionApi.md#indexPhpmethodMultiChannelConversionAttributionSetGoalAttributionPost) | **POST** /index.php?method&#x3D;MultiChannelConversionAttribution.setGoalAttribution |  |



## indexPhpmethodMultiChannelConversionAttributionGetAvailableCampaignDimensionCombinationsPost

> indexPhpmethodMultiChannelConversionAttributionGetAvailableCampaignDimensionCombinationsPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MultiChannelConversionAttributionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MultiChannelConversionAttributionApi apiInstance = new MultiChannelConversionAttributionApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodMultiChannelConversionAttributionGetAvailableCampaignDimensionCombinationsPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiChannelConversionAttributionApi#indexPhpmethodMultiChannelConversionAttributionGetAvailableCampaignDimensionCombinationsPost");
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
| **indexPhpMethodAPIGetMatomoVersionPostRequest** | [**IndexPhpMethodAPIGetMatomoVersionPostRequest**](IndexPhpMethodAPIGetMatomoVersionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMultiChannelConversionAttributionGetChannelAttributionPost

> indexPhpmethodMultiChannelConversionAttributionGetChannelAttributionPost(indexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MultiChannelConversionAttributionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MultiChannelConversionAttributionApi apiInstance = new MultiChannelConversionAttributionApi(defaultClient);
        IndexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest indexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest = new IndexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest(); // IndexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest | 
        try {
            apiInstance.indexPhpmethodMultiChannelConversionAttributionGetChannelAttributionPost(indexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiChannelConversionAttributionApi#indexPhpmethodMultiChannelConversionAttributionGetChannelAttributionPost");
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
| **indexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest** | [**IndexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest**](IndexPhpMethodMultiChannelConversionAttributionGetChannelAttributionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMultiChannelConversionAttributionGetGoalAttributionPost

> indexPhpmethodMultiChannelConversionAttributionGetGoalAttributionPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MultiChannelConversionAttributionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MultiChannelConversionAttributionApi apiInstance = new MultiChannelConversionAttributionApi(defaultClient);
        IndexPhpMethodFunnelsGetGoalFunnelPostRequest indexPhpMethodFunnelsGetGoalFunnelPostRequest = new IndexPhpMethodFunnelsGetGoalFunnelPostRequest(); // IndexPhpMethodFunnelsGetGoalFunnelPostRequest | 
        try {
            apiInstance.indexPhpmethodMultiChannelConversionAttributionGetGoalAttributionPost(indexPhpMethodFunnelsGetGoalFunnelPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiChannelConversionAttributionApi#indexPhpmethodMultiChannelConversionAttributionGetGoalAttributionPost");
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
| **indexPhpMethodFunnelsGetGoalFunnelPostRequest** | [**IndexPhpMethodFunnelsGetGoalFunnelPostRequest**](IndexPhpMethodFunnelsGetGoalFunnelPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMultiChannelConversionAttributionGetSiteAttributionGoalsPost

> indexPhpmethodMultiChannelConversionAttributionGetSiteAttributionGoalsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MultiChannelConversionAttributionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MultiChannelConversionAttributionApi apiInstance = new MultiChannelConversionAttributionApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodMultiChannelConversionAttributionGetSiteAttributionGoalsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiChannelConversionAttributionApi#indexPhpmethodMultiChannelConversionAttributionGetSiteAttributionGoalsPost");
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
| **indexPhpMethodAPIGetReportPagesMetadataPostRequest** | [**IndexPhpMethodAPIGetReportPagesMetadataPostRequest**](IndexPhpMethodAPIGetReportPagesMetadataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMultiChannelConversionAttributionSetGoalAttributionPost

> indexPhpmethodMultiChannelConversionAttributionSetGoalAttributionPost(indexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MultiChannelConversionAttributionApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MultiChannelConversionAttributionApi apiInstance = new MultiChannelConversionAttributionApi(defaultClient);
        IndexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest indexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest = new IndexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest(); // IndexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest | 
        try {
            apiInstance.indexPhpmethodMultiChannelConversionAttributionSetGoalAttributionPost(indexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MultiChannelConversionAttributionApi#indexPhpmethodMultiChannelConversionAttributionSetGoalAttributionPost");
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
| **indexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest** | [**IndexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest**](IndexPhpMethodMultiChannelConversionAttributionSetGoalAttributionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


