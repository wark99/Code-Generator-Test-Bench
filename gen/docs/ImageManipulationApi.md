# ImageManipulationApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**manipulationBackgroundswapBackgroundPatch**](ImageManipulationApi.md#manipulationBackgroundswapBackgroundPatch) | **PATCH** /manipulation/backgroundswap/background | Select and activate selected background for swap |
| [**manipulationBackgroundswapBackgroundPatch_0**](ImageManipulationApi.md#manipulationBackgroundswapBackgroundPatch_0) | **PATCH** /manipulation/backgroundswap/background | Select and activate selected background for swap |
| [**manipulationBackgroundswapPost**](ImageManipulationApi.md#manipulationBackgroundswapPost) | **POST** /manipulation/backgroundswap | Retrieve background swaps for a specific carstock |
| [**manipulationBackgroundswapPost_0**](ImageManipulationApi.md#manipulationBackgroundswapPost_0) | **POST** /manipulation/backgroundswap | Retrieve background swaps for a specific carstock |
| [**manipulationBackgroundswapSelectablesPost**](ImageManipulationApi.md#manipulationBackgroundswapSelectablesPost) | **POST** /manipulation/backgroundswap/selectables | Retrieve selectables for background swaps |
| [**manipulationBackgroundswapSelectablesPost_0**](ImageManipulationApi.md#manipulationBackgroundswapSelectablesPost_0) | **POST** /manipulation/backgroundswap/selectables | Retrieve selectables for background swaps |
| [**manipulationBackgroundswapSuitablePatch**](ImageManipulationApi.md#manipulationBackgroundswapSuitablePatch) | **PATCH** /manipulation/backgroundswap/suitable | Determine on what images background swap applies |
| [**manipulationBackgroundswapSuitablePatch_0**](ImageManipulationApi.md#manipulationBackgroundswapSuitablePatch_0) | **PATCH** /manipulation/backgroundswap/suitable | Determine on what images background swap applies |
| [**manipulationMarketingslidesActivePatch**](ImageManipulationApi.md#manipulationMarketingslidesActivePatch) | **PATCH** /manipulation/marketingslides/active | Set active state of a marketing slide |
| [**manipulationMarketingslidesActivePatch_0**](ImageManipulationApi.md#manipulationMarketingslidesActivePatch_0) | **PATCH** /manipulation/marketingslides/active | Set active state of a marketing slide |
| [**manipulationMarketingslidesPositionPatch**](ImageManipulationApi.md#manipulationMarketingslidesPositionPatch) | **PATCH** /manipulation/marketingslides/position | Update location of a marketing slide |
| [**manipulationMarketingslidesPositionPatch_0**](ImageManipulationApi.md#manipulationMarketingslidesPositionPatch_0) | **PATCH** /manipulation/marketingslides/position | Update location of a marketing slide |
| [**manipulationMarketingslidesPost**](ImageManipulationApi.md#manipulationMarketingslidesPost) | **POST** /manipulation/marketingslides | Retrieve marketing slides for a specific carstock |
| [**manipulationMarketingslidesPost_0**](ImageManipulationApi.md#manipulationMarketingslidesPost_0) | **POST** /manipulation/marketingslides | Retrieve marketing slides for a specific carstock |
| [**manipulationOverlaysDisplayPositionPost**](ImageManipulationApi.md#manipulationOverlaysDisplayPositionPost) | **POST** /manipulation/overlays/displayPosition | Endpoint to retreive current tenant settings for overlay display position |
| [**manipulationOverlaysDisplayPositionUpdatePost**](ImageManipulationApi.md#manipulationOverlaysDisplayPositionUpdatePost) | **POST** /manipulation/overlays/displayPosition/update | Endpoint to update tenant specific settings for overlay display position |
| [**manipulationOverlaysHexonPost**](ImageManipulationApi.md#manipulationOverlaysHexonPost) | **POST** /manipulation/overlays/hexon | Endpoint to cache overlays at hexon |
| [**manipulationOverlaysManualDisplayPositionPost**](ImageManipulationApi.md#manipulationOverlaysManualDisplayPositionPost) | **POST** /manipulation/overlays/manual/displayPosition | Set the display position settings for a specific carstock to manual and set values |
| [**manipulationOverlaysManualDisplayPositionPost_0**](ImageManipulationApi.md#manipulationOverlaysManualDisplayPositionPost_0) | **POST** /manipulation/overlays/manual/displayPosition | Set the display position settings for a specific carstock to manual and set values |
| [**manipulationOverlaysManualModePost**](ImageManipulationApi.md#manipulationOverlaysManualModePost) | **POST** /manipulation/overlays/manual/mode | Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock |
| [**manipulationOverlaysManualModePost_0**](ImageManipulationApi.md#manipulationOverlaysManualModePost_0) | **POST** /manipulation/overlays/manual/mode | Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock |
| [**manipulationOverlaysManualOrderPost**](ImageManipulationApi.md#manipulationOverlaysManualOrderPost) | **POST** /manipulation/overlays/manual/order | Re-order overlays on carstock level. Please be aware that this will also set the mode to manual |
| [**manipulationOverlaysManualOrderPost_0**](ImageManipulationApi.md#manipulationOverlaysManualOrderPost_0) | **POST** /manipulation/overlays/manual/order | Re-order overlays on carstock level. Please be aware that this will also set the mode to manual |
| [**manipulationOverlaysManualSelectionPost**](ImageManipulationApi.md#manipulationOverlaysManualSelectionPost) | **POST** /manipulation/overlays/manual/selection | Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection |
| [**manipulationOverlaysManualSelectionPost_0**](ImageManipulationApi.md#manipulationOverlaysManualSelectionPost_0) | **POST** /manipulation/overlays/manual/selection | Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection |
| [**manipulationOverlaysPost**](ImageManipulationApi.md#manipulationOverlaysPost) | **POST** /manipulation/overlays | Retrieve overlays for a specific carstock |
| [**manipulationOverlaysPost_0**](ImageManipulationApi.md#manipulationOverlaysPost_0) | **POST** /manipulation/overlays | Retrieve overlays for a specific carstock |



## manipulationBackgroundswapBackgroundPatch

> List&lt;BackgroundSwapBackgroundResponse&gt; manipulationBackgroundswapBackgroundPatch(backgroundSwapBackgroundRequest)

Select and activate selected background for swap

Select and activate selected background for swap

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        BackgroundSwapBackgroundRequest backgroundSwapBackgroundRequest = new BackgroundSwapBackgroundRequest(); // BackgroundSwapBackgroundRequest | 
        try {
            List<BackgroundSwapBackgroundResponse> result = apiInstance.manipulationBackgroundswapBackgroundPatch(backgroundSwapBackgroundRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationBackgroundswapBackgroundPatch");
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
| **backgroundSwapBackgroundRequest** | [**BackgroundSwapBackgroundRequest**](BackgroundSwapBackgroundRequest.md)|  | [optional] |

### Return type

[**List&lt;BackgroundSwapBackgroundResponse&gt;**](BackgroundSwapBackgroundResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationBackgroundswapBackgroundPatch_0

> List&lt;BackgroundSwapBackgroundResponse&gt; manipulationBackgroundswapBackgroundPatch_0(backgroundSwapBackgroundRequest)

Select and activate selected background for swap

Select and activate selected background for swap

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        BackgroundSwapBackgroundRequest backgroundSwapBackgroundRequest = new BackgroundSwapBackgroundRequest(); // BackgroundSwapBackgroundRequest | 
        try {
            List<BackgroundSwapBackgroundResponse> result = apiInstance.manipulationBackgroundswapBackgroundPatch_0(backgroundSwapBackgroundRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationBackgroundswapBackgroundPatch_0");
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
| **backgroundSwapBackgroundRequest** | [**BackgroundSwapBackgroundRequest**](BackgroundSwapBackgroundRequest.md)|  | [optional] |

### Return type

[**List&lt;BackgroundSwapBackgroundResponse&gt;**](BackgroundSwapBackgroundResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationBackgroundswapPost

> List&lt;BackgroundSwapResponse&gt; manipulationBackgroundswapPost(backgroundSwapRequest)

Retrieve background swaps for a specific carstock

Retrieve background swaps for a specific carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        BackgroundSwapRequest backgroundSwapRequest = new BackgroundSwapRequest(); // BackgroundSwapRequest | 
        try {
            List<BackgroundSwapResponse> result = apiInstance.manipulationBackgroundswapPost(backgroundSwapRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationBackgroundswapPost");
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
| **backgroundSwapRequest** | [**BackgroundSwapRequest**](BackgroundSwapRequest.md)|  | [optional] |

### Return type

[**List&lt;BackgroundSwapResponse&gt;**](BackgroundSwapResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationBackgroundswapPost_0

> List&lt;BackgroundSwapResponse&gt; manipulationBackgroundswapPost_0(backgroundSwapRequest)

Retrieve background swaps for a specific carstock

Retrieve background swaps for a specific carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        BackgroundSwapRequest backgroundSwapRequest = new BackgroundSwapRequest(); // BackgroundSwapRequest | 
        try {
            List<BackgroundSwapResponse> result = apiInstance.manipulationBackgroundswapPost_0(backgroundSwapRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationBackgroundswapPost_0");
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
| **backgroundSwapRequest** | [**BackgroundSwapRequest**](BackgroundSwapRequest.md)|  | [optional] |

### Return type

[**List&lt;BackgroundSwapResponse&gt;**](BackgroundSwapResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationBackgroundswapSelectablesPost

> List&lt;BackgroundSwapSelectablesResponse&gt; manipulationBackgroundswapSelectablesPost(backgroundSwapSelectablesRequest)

Retrieve selectables for background swaps

Retrieve selectables for background swaps

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        BackgroundSwapSelectablesRequest backgroundSwapSelectablesRequest = new BackgroundSwapSelectablesRequest(); // BackgroundSwapSelectablesRequest | 
        try {
            List<BackgroundSwapSelectablesResponse> result = apiInstance.manipulationBackgroundswapSelectablesPost(backgroundSwapSelectablesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationBackgroundswapSelectablesPost");
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
| **backgroundSwapSelectablesRequest** | [**BackgroundSwapSelectablesRequest**](BackgroundSwapSelectablesRequest.md)|  | [optional] |

### Return type

[**List&lt;BackgroundSwapSelectablesResponse&gt;**](BackgroundSwapSelectablesResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationBackgroundswapSelectablesPost_0

> List&lt;BackgroundSwapSelectablesResponse&gt; manipulationBackgroundswapSelectablesPost_0(backgroundSwapSelectablesRequest)

Retrieve selectables for background swaps

Retrieve selectables for background swaps

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        BackgroundSwapSelectablesRequest backgroundSwapSelectablesRequest = new BackgroundSwapSelectablesRequest(); // BackgroundSwapSelectablesRequest | 
        try {
            List<BackgroundSwapSelectablesResponse> result = apiInstance.manipulationBackgroundswapSelectablesPost_0(backgroundSwapSelectablesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationBackgroundswapSelectablesPost_0");
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
| **backgroundSwapSelectablesRequest** | [**BackgroundSwapSelectablesRequest**](BackgroundSwapSelectablesRequest.md)|  | [optional] |

### Return type

[**List&lt;BackgroundSwapSelectablesResponse&gt;**](BackgroundSwapSelectablesResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationBackgroundswapSuitablePatch

> List&lt;BackgroundSwapBackgroundResponse&gt; manipulationBackgroundswapSuitablePatch(backgroundSwapSuitableRequest)

Determine on what images background swap applies

Determine on what images background swap applies

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        BackgroundSwapSuitableRequest backgroundSwapSuitableRequest = new BackgroundSwapSuitableRequest(); // BackgroundSwapSuitableRequest | 
        try {
            List<BackgroundSwapBackgroundResponse> result = apiInstance.manipulationBackgroundswapSuitablePatch(backgroundSwapSuitableRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationBackgroundswapSuitablePatch");
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
| **backgroundSwapSuitableRequest** | [**BackgroundSwapSuitableRequest**](BackgroundSwapSuitableRequest.md)|  | [optional] |

### Return type

[**List&lt;BackgroundSwapBackgroundResponse&gt;**](BackgroundSwapBackgroundResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationBackgroundswapSuitablePatch_0

> List&lt;BackgroundSwapBackgroundResponse&gt; manipulationBackgroundswapSuitablePatch_0(backgroundSwapSuitableRequest)

Determine on what images background swap applies

Determine on what images background swap applies

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        BackgroundSwapSuitableRequest backgroundSwapSuitableRequest = new BackgroundSwapSuitableRequest(); // BackgroundSwapSuitableRequest | 
        try {
            List<BackgroundSwapBackgroundResponse> result = apiInstance.manipulationBackgroundswapSuitablePatch_0(backgroundSwapSuitableRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationBackgroundswapSuitablePatch_0");
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
| **backgroundSwapSuitableRequest** | [**BackgroundSwapSuitableRequest**](BackgroundSwapSuitableRequest.md)|  | [optional] |

### Return type

[**List&lt;BackgroundSwapBackgroundResponse&gt;**](BackgroundSwapBackgroundResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationMarketingslidesActivePatch

> List&lt;MarketingSlidesActiveResponse&gt; manipulationMarketingslidesActivePatch(marketingSlidesActiveRequest)

Set active state of a marketing slide

Set active state of a marketing slide

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        MarketingSlidesActiveRequest marketingSlidesActiveRequest = new MarketingSlidesActiveRequest(); // MarketingSlidesActiveRequest | 
        try {
            List<MarketingSlidesActiveResponse> result = apiInstance.manipulationMarketingslidesActivePatch(marketingSlidesActiveRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationMarketingslidesActivePatch");
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
| **marketingSlidesActiveRequest** | [**MarketingSlidesActiveRequest**](MarketingSlidesActiveRequest.md)|  | [optional] |

### Return type

[**List&lt;MarketingSlidesActiveResponse&gt;**](MarketingSlidesActiveResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationMarketingslidesActivePatch_0

> List&lt;MarketingSlidesActiveResponse&gt; manipulationMarketingslidesActivePatch_0(marketingSlidesActiveRequest)

Set active state of a marketing slide

Set active state of a marketing slide

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        MarketingSlidesActiveRequest marketingSlidesActiveRequest = new MarketingSlidesActiveRequest(); // MarketingSlidesActiveRequest | 
        try {
            List<MarketingSlidesActiveResponse> result = apiInstance.manipulationMarketingslidesActivePatch_0(marketingSlidesActiveRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationMarketingslidesActivePatch_0");
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
| **marketingSlidesActiveRequest** | [**MarketingSlidesActiveRequest**](MarketingSlidesActiveRequest.md)|  | [optional] |

### Return type

[**List&lt;MarketingSlidesActiveResponse&gt;**](MarketingSlidesActiveResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationMarketingslidesPositionPatch

> List&lt;MarketingSlidesPositionResponse&gt; manipulationMarketingslidesPositionPatch(marketingSlidesPositionRequest)

Update location of a marketing slide

Update location of a marketing slide

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        MarketingSlidesPositionRequest marketingSlidesPositionRequest = new MarketingSlidesPositionRequest(); // MarketingSlidesPositionRequest | 
        try {
            List<MarketingSlidesPositionResponse> result = apiInstance.manipulationMarketingslidesPositionPatch(marketingSlidesPositionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationMarketingslidesPositionPatch");
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
| **marketingSlidesPositionRequest** | [**MarketingSlidesPositionRequest**](MarketingSlidesPositionRequest.md)|  | [optional] |

### Return type

[**List&lt;MarketingSlidesPositionResponse&gt;**](MarketingSlidesPositionResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationMarketingslidesPositionPatch_0

> List&lt;MarketingSlidesPositionResponse&gt; manipulationMarketingslidesPositionPatch_0(marketingSlidesPositionRequest)

Update location of a marketing slide

Update location of a marketing slide

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        MarketingSlidesPositionRequest marketingSlidesPositionRequest = new MarketingSlidesPositionRequest(); // MarketingSlidesPositionRequest | 
        try {
            List<MarketingSlidesPositionResponse> result = apiInstance.manipulationMarketingslidesPositionPatch_0(marketingSlidesPositionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationMarketingslidesPositionPatch_0");
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
| **marketingSlidesPositionRequest** | [**MarketingSlidesPositionRequest**](MarketingSlidesPositionRequest.md)|  | [optional] |

### Return type

[**List&lt;MarketingSlidesPositionResponse&gt;**](MarketingSlidesPositionResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationMarketingslidesPost

> List&lt;MarketingSlidesResponse&gt; manipulationMarketingslidesPost(marketingSlidesRequest)

Retrieve marketing slides for a specific carstock

Retrieve marketing slides for a specific carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        MarketingSlidesRequest marketingSlidesRequest = new MarketingSlidesRequest(); // MarketingSlidesRequest | 
        try {
            List<MarketingSlidesResponse> result = apiInstance.manipulationMarketingslidesPost(marketingSlidesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationMarketingslidesPost");
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
| **marketingSlidesRequest** | [**MarketingSlidesRequest**](MarketingSlidesRequest.md)|  | [optional] |

### Return type

[**List&lt;MarketingSlidesResponse&gt;**](MarketingSlidesResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationMarketingslidesPost_0

> List&lt;MarketingSlidesResponse&gt; manipulationMarketingslidesPost_0(marketingSlidesRequest)

Retrieve marketing slides for a specific carstock

Retrieve marketing slides for a specific carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        MarketingSlidesRequest marketingSlidesRequest = new MarketingSlidesRequest(); // MarketingSlidesRequest | 
        try {
            List<MarketingSlidesResponse> result = apiInstance.manipulationMarketingslidesPost_0(marketingSlidesRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationMarketingslidesPost_0");
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
| **marketingSlidesRequest** | [**MarketingSlidesRequest**](MarketingSlidesRequest.md)|  | [optional] |

### Return type

[**List&lt;MarketingSlidesResponse&gt;**](MarketingSlidesResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysDisplayPositionPost

> ManipulationOverlaysDisplayPositionPost200Response manipulationOverlaysDisplayPositionPost(manipulationOverlaysDisplayPositionPostRequest)

Endpoint to retreive current tenant settings for overlay display position



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        ManipulationOverlaysDisplayPositionPostRequest manipulationOverlaysDisplayPositionPostRequest = new ManipulationOverlaysDisplayPositionPostRequest(); // ManipulationOverlaysDisplayPositionPostRequest | 
        try {
            ManipulationOverlaysDisplayPositionPost200Response result = apiInstance.manipulationOverlaysDisplayPositionPost(manipulationOverlaysDisplayPositionPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysDisplayPositionPost");
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
| **manipulationOverlaysDisplayPositionPostRequest** | [**ManipulationOverlaysDisplayPositionPostRequest**](ManipulationOverlaysDisplayPositionPostRequest.md)|  | [optional] |

### Return type

[**ManipulationOverlaysDisplayPositionPost200Response**](ManipulationOverlaysDisplayPositionPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## manipulationOverlaysDisplayPositionUpdatePost

> ModePost200Response manipulationOverlaysDisplayPositionUpdatePost(manipulationOverlaysDisplayPositionUpdatePostRequest)

Endpoint to update tenant specific settings for overlay display position



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        ManipulationOverlaysDisplayPositionUpdatePostRequest manipulationOverlaysDisplayPositionUpdatePostRequest = new ManipulationOverlaysDisplayPositionUpdatePostRequest(); // ManipulationOverlaysDisplayPositionUpdatePostRequest | 
        try {
            ModePost200Response result = apiInstance.manipulationOverlaysDisplayPositionUpdatePost(manipulationOverlaysDisplayPositionUpdatePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysDisplayPositionUpdatePost");
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
| **manipulationOverlaysDisplayPositionUpdatePostRequest** | [**ManipulationOverlaysDisplayPositionUpdatePostRequest**](ManipulationOverlaysDisplayPositionUpdatePostRequest.md)|  | [optional] |

### Return type

[**ModePost200Response**](ModePost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## manipulationOverlaysHexonPost

> ManipulationOverlaysHexonPost200Response manipulationOverlaysHexonPost(manipulationOverlaysHexonPostRequest)

Endpoint to cache overlays at hexon



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        ManipulationOverlaysHexonPostRequest manipulationOverlaysHexonPostRequest = new ManipulationOverlaysHexonPostRequest(); // ManipulationOverlaysHexonPostRequest | 
        try {
            ManipulationOverlaysHexonPost200Response result = apiInstance.manipulationOverlaysHexonPost(manipulationOverlaysHexonPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysHexonPost");
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
| **manipulationOverlaysHexonPostRequest** | [**ManipulationOverlaysHexonPostRequest**](ManipulationOverlaysHexonPostRequest.md)|  | [optional] |

### Return type

[**ManipulationOverlaysHexonPost200Response**](ManipulationOverlaysHexonPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Success |  -  |


## manipulationOverlaysManualDisplayPositionPost

> List&lt;CarstockoverlaydisplayPositionResponse&gt; manipulationOverlaysManualDisplayPositionPost(carstockoverlaydisplayPositionRequest)

Set the display position settings for a specific carstock to manual and set values

Set the display position settings for a specific carstock to manual and set values

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        CarstockoverlaydisplayPositionRequest carstockoverlaydisplayPositionRequest = new CarstockoverlaydisplayPositionRequest(); // CarstockoverlaydisplayPositionRequest | 
        try {
            List<CarstockoverlaydisplayPositionResponse> result = apiInstance.manipulationOverlaysManualDisplayPositionPost(carstockoverlaydisplayPositionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysManualDisplayPositionPost");
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
| **carstockoverlaydisplayPositionRequest** | [**CarstockoverlaydisplayPositionRequest**](CarstockoverlaydisplayPositionRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockoverlaydisplayPositionResponse&gt;**](CarstockoverlaydisplayPositionResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set the display position settings for a specific carstock to manual and set values |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysManualDisplayPositionPost_0

> List&lt;CarstockoverlaydisplayPositionResponse&gt; manipulationOverlaysManualDisplayPositionPost_0(carstockoverlaydisplayPositionRequest)

Set the display position settings for a specific carstock to manual and set values

Set the display position settings for a specific carstock to manual and set values

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        CarstockoverlaydisplayPositionRequest carstockoverlaydisplayPositionRequest = new CarstockoverlaydisplayPositionRequest(); // CarstockoverlaydisplayPositionRequest | 
        try {
            List<CarstockoverlaydisplayPositionResponse> result = apiInstance.manipulationOverlaysManualDisplayPositionPost_0(carstockoverlaydisplayPositionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysManualDisplayPositionPost_0");
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
| **carstockoverlaydisplayPositionRequest** | [**CarstockoverlaydisplayPositionRequest**](CarstockoverlaydisplayPositionRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockoverlaydisplayPositionResponse&gt;**](CarstockoverlaydisplayPositionResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Set the display position settings for a specific carstock to manual and set values |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysManualModePost

> List&lt;CarstockoverlayModeResponse&gt; manipulationOverlaysManualModePost(carstockoverlayModeRequest)

Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock

Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        CarstockoverlayModeRequest carstockoverlayModeRequest = new CarstockoverlayModeRequest(); // CarstockoverlayModeRequest | 
        try {
            List<CarstockoverlayModeResponse> result = apiInstance.manipulationOverlaysManualModePost(carstockoverlayModeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysManualModePost");
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
| **carstockoverlayModeRequest** | [**CarstockoverlayModeRequest**](CarstockoverlayModeRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockoverlayModeResponse&gt;**](CarstockoverlayModeResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysManualModePost_0

> List&lt;CarstockoverlayModeResponse&gt; manipulationOverlaysManualModePost_0(carstockoverlayModeRequest)

Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock

Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        CarstockoverlayModeRequest carstockoverlayModeRequest = new CarstockoverlayModeRequest(); // CarstockoverlayModeRequest | 
        try {
            List<CarstockoverlayModeResponse> result = apiInstance.manipulationOverlaysManualModePost_0(carstockoverlayModeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysManualModePost_0");
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
| **carstockoverlayModeRequest** | [**CarstockoverlayModeRequest**](CarstockoverlayModeRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockoverlayModeResponse&gt;**](CarstockoverlayModeResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Endpoint to set a specific overlay on active or inactive for a specific carstock. Please be aware this will set the overlay selection to manual for the given carstock |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysManualOrderPost

> List&lt;CarstockoverlayReorderResponse&gt; manipulationOverlaysManualOrderPost(carstockoverlayReorderRequest)

Re-order overlays on carstock level. Please be aware that this will also set the mode to manual

Re-order overlays on carstock level. Please be aware that this will also set the mode to manual

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        CarstockoverlayReorderRequest carstockoverlayReorderRequest = new CarstockoverlayReorderRequest(); // CarstockoverlayReorderRequest | 
        try {
            List<CarstockoverlayReorderResponse> result = apiInstance.manipulationOverlaysManualOrderPost(carstockoverlayReorderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysManualOrderPost");
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
| **carstockoverlayReorderRequest** | [**CarstockoverlayReorderRequest**](CarstockoverlayReorderRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockoverlayReorderResponse&gt;**](CarstockoverlayReorderResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Re-order overlays on carstock level. Please be aware that this will also set the mode to manual |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysManualOrderPost_0

> List&lt;CarstockoverlayReorderResponse&gt; manipulationOverlaysManualOrderPost_0(carstockoverlayReorderRequest)

Re-order overlays on carstock level. Please be aware that this will also set the mode to manual

Re-order overlays on carstock level. Please be aware that this will also set the mode to manual

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        CarstockoverlayReorderRequest carstockoverlayReorderRequest = new CarstockoverlayReorderRequest(); // CarstockoverlayReorderRequest | 
        try {
            List<CarstockoverlayReorderResponse> result = apiInstance.manipulationOverlaysManualOrderPost_0(carstockoverlayReorderRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysManualOrderPost_0");
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
| **carstockoverlayReorderRequest** | [**CarstockoverlayReorderRequest**](CarstockoverlayReorderRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockoverlayReorderResponse&gt;**](CarstockoverlayReorderResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Re-order overlays on carstock level. Please be aware that this will also set the mode to manual |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysManualSelectionPost

> List&lt;CarstockoverlaySelectionResponse&gt; manipulationOverlaysManualSelectionPost(carstockoverlaySelectionRequest)

Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection

Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        CarstockoverlaySelectionRequest carstockoverlaySelectionRequest = new CarstockoverlaySelectionRequest(); // CarstockoverlaySelectionRequest | 
        try {
            List<CarstockoverlaySelectionResponse> result = apiInstance.manipulationOverlaysManualSelectionPost(carstockoverlaySelectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysManualSelectionPost");
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
| **carstockoverlaySelectionRequest** | [**CarstockoverlaySelectionRequest**](CarstockoverlaySelectionRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockoverlaySelectionResponse&gt;**](CarstockoverlaySelectionResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysManualSelectionPost_0

> List&lt;CarstockoverlaySelectionResponse&gt; manipulationOverlaysManualSelectionPost_0(carstockoverlaySelectionRequest)

Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection

Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        CarstockoverlaySelectionRequest carstockoverlaySelectionRequest = new CarstockoverlaySelectionRequest(); // CarstockoverlaySelectionRequest | 
        try {
            List<CarstockoverlaySelectionResponse> result = apiInstance.manipulationOverlaysManualSelectionPost_0(carstockoverlaySelectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysManualSelectionPost_0");
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
| **carstockoverlaySelectionRequest** | [**CarstockoverlaySelectionRequest**](CarstockoverlaySelectionRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockoverlaySelectionResponse&gt;**](CarstockoverlaySelectionResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Endpoint to reset a manual adjusted overlay setting for a carstock to automatic selection |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysPost

> List&lt;ManipulationOverlaysPost200ResponseInner&gt; manipulationOverlaysPost(overlayRequest)

Retrieve overlays for a specific carstock

Retrieve overlays for a specific carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        OverlayRequest overlayRequest = new OverlayRequest(); // OverlayRequest | 
        try {
            List<ManipulationOverlaysPost200ResponseInner> result = apiInstance.manipulationOverlaysPost(overlayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysPost");
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
| **overlayRequest** | [**OverlayRequest**](OverlayRequest.md)|  | [optional] |

### Return type

[**List&lt;ManipulationOverlaysPost200ResponseInner&gt;**](ManipulationOverlaysPost200ResponseInner.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |


## manipulationOverlaysPost_0

> List&lt;ManipulationOverlaysPost200ResponseInner&gt; manipulationOverlaysPost_0(overlayRequest)

Retrieve overlays for a specific carstock

Retrieve overlays for a specific carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ImageManipulationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        ImageManipulationApi apiInstance = new ImageManipulationApi(defaultClient);
        OverlayRequest overlayRequest = new OverlayRequest(); // OverlayRequest | 
        try {
            List<ManipulationOverlaysPost200ResponseInner> result = apiInstance.manipulationOverlaysPost_0(overlayRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ImageManipulationApi#manipulationOverlaysPost_0");
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
| **overlayRequest** | [**OverlayRequest**](OverlayRequest.md)|  | [optional] |

### Return type

[**List&lt;ManipulationOverlaysPost200ResponseInner&gt;**](ManipulationOverlaysPost200ResponseInner.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Details of the given carstockids |  -  |
| **500** | Internal server error |  -  |

