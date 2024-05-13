# CarstockImagesApi

All URIs are relative to *https://cic-api.dev.nl*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**carstockImagesBrandrendersPost**](CarstockImagesApi.md#carstockImagesBrandrendersPost) | **POST** /carstock/images/brandrenders | Get the current carstock images of type brand render |
| [**carstockImagesBrandrendersPost_0**](CarstockImagesApi.md#carstockImagesBrandrendersPost_0) | **POST** /carstock/images/brandrenders | Get the current carstock images of type brand render |
| [**carstockImagesCarouselPost**](CarstockImagesApi.md#carstockImagesCarouselPost) | **POST** /carstock/images/carousel | Get the current active carstock images |
| [**carstockImagesCarouselPost_0**](CarstockImagesApi.md#carstockImagesCarouselPost_0) | **POST** /carstock/images/carousel | Get the current active carstock images |
| [**carstockImagesChildsPost**](CarstockImagesApi.md#carstockImagesChildsPost) | **POST** /carstock/images/childs | Re-used images |
| [**carstockImagesChildsPost_0**](CarstockImagesApi.md#carstockImagesChildsPost_0) | **POST** /carstock/images/childs | Re-used images |
| [**carstockImagesComparablePost**](CarstockImagesApi.md#carstockImagesComparablePost) | **POST** /carstock/images/comparable | Get the current carstock images of type comparable carstock images |
| [**carstockImagesComparablePost_0**](CarstockImagesApi.md#carstockImagesComparablePost_0) | **POST** /carstock/images/comparable | Get the current carstock images of type comparable carstock images |
| [**carstockImagesGenericrendersPost**](CarstockImagesApi.md#carstockImagesGenericrendersPost) | **POST** /carstock/images/genericrenders | Get the current carstock images of type generic render |
| [**carstockImagesGenericrendersPost_0**](CarstockImagesApi.md#carstockImagesGenericrendersPost_0) | **POST** /carstock/images/genericrenders | Get the current carstock images of type generic render |
| [**carstockImagesPlaceholdersPost**](CarstockImagesApi.md#carstockImagesPlaceholdersPost) | **POST** /carstock/images/placeholders | Get the current carstock images of type placeholder |
| [**carstockImagesPlaceholdersPost_0**](CarstockImagesApi.md#carstockImagesPlaceholdersPost_0) | **POST** /carstock/images/placeholders | Get the current carstock images of type placeholder |
| [**carstockImagesSelectionPost**](CarstockImagesApi.md#carstockImagesSelectionPost) | **POST** /carstock/images/selection | Get the current carstock imagesources |
| [**carstockImagesSelectionPost_0**](CarstockImagesApi.md#carstockImagesSelectionPost_0) | **POST** /carstock/images/selection | Get the current carstock imagesources |
| [**carstockImagesSpecificPost**](CarstockImagesApi.md#carstockImagesSpecificPost) | **POST** /carstock/images/specific | Get the current carstock images of type car specific |
| [**carstockImagesSpecificPost_0**](CarstockImagesApi.md#carstockImagesSpecificPost_0) | **POST** /carstock/images/specific | Get the current carstock images of type car specific |



## carstockImagesBrandrendersPost

> List&lt;CarstockBrandRendersResponse&gt; carstockImagesBrandrendersPost(carstockBrandRendersRequest)

Get the current carstock images of type brand render

Get the current carstock images of type brand render

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockBrandRendersRequest carstockBrandRendersRequest = new CarstockBrandRendersRequest(); // CarstockBrandRendersRequest | 
        try {
            List<CarstockBrandRendersResponse> result = apiInstance.carstockImagesBrandrendersPost(carstockBrandRendersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesBrandrendersPost");
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
| **carstockBrandRendersRequest** | [**CarstockBrandRendersRequest**](CarstockBrandRendersRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockBrandRendersResponse&gt;**](CarstockBrandRendersResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesBrandrendersPost_0

> List&lt;CarstockBrandRendersResponse&gt; carstockImagesBrandrendersPost_0(carstockBrandRendersRequest)

Get the current carstock images of type brand render

Get the current carstock images of type brand render

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockBrandRendersRequest carstockBrandRendersRequest = new CarstockBrandRendersRequest(); // CarstockBrandRendersRequest | 
        try {
            List<CarstockBrandRendersResponse> result = apiInstance.carstockImagesBrandrendersPost_0(carstockBrandRendersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesBrandrendersPost_0");
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
| **carstockBrandRendersRequest** | [**CarstockBrandRendersRequest**](CarstockBrandRendersRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockBrandRendersResponse&gt;**](CarstockBrandRendersResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesCarouselPost

> List&lt;CarstockCarouselResponse&gt; carstockImagesCarouselPost(carstockCarouselRequest)

Get the current active carstock images

Get the current active carstock images

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockCarouselRequest carstockCarouselRequest = new CarstockCarouselRequest(); // CarstockCarouselRequest | 
        try {
            List<CarstockCarouselResponse> result = apiInstance.carstockImagesCarouselPost(carstockCarouselRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesCarouselPost");
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
| **carstockCarouselRequest** | [**CarstockCarouselRequest**](CarstockCarouselRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockCarouselResponse&gt;**](CarstockCarouselResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesCarouselPost_0

> List&lt;CarstockCarouselResponse&gt; carstockImagesCarouselPost_0(carstockCarouselRequest)

Get the current active carstock images

Get the current active carstock images

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockCarouselRequest carstockCarouselRequest = new CarstockCarouselRequest(); // CarstockCarouselRequest | 
        try {
            List<CarstockCarouselResponse> result = apiInstance.carstockImagesCarouselPost_0(carstockCarouselRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesCarouselPost_0");
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
| **carstockCarouselRequest** | [**CarstockCarouselRequest**](CarstockCarouselRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockCarouselResponse&gt;**](CarstockCarouselResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesChildsPost

> CarstockImagesChildsPost200Response carstockImagesChildsPost(carstockChildsRequest)

Re-used images

Get the child carstocks that are using images of the givin carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockChildsRequest carstockChildsRequest = new CarstockChildsRequest(); // CarstockChildsRequest | 
        try {
            CarstockImagesChildsPost200Response result = apiInstance.carstockImagesChildsPost(carstockChildsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesChildsPost");
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
| **carstockChildsRequest** | [**CarstockChildsRequest**](CarstockChildsRequest.md)|  | [optional] |

### Return type

[**CarstockImagesChildsPost200Response**](CarstockImagesChildsPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesChildsPost_0

> CarstockImagesChildsPost200Response carstockImagesChildsPost_0(carstockChildsRequest)

Re-used images

Get the child carstocks that are using images of the givin carstock

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockChildsRequest carstockChildsRequest = new CarstockChildsRequest(); // CarstockChildsRequest | 
        try {
            CarstockImagesChildsPost200Response result = apiInstance.carstockImagesChildsPost_0(carstockChildsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesChildsPost_0");
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
| **carstockChildsRequest** | [**CarstockChildsRequest**](CarstockChildsRequest.md)|  | [optional] |

### Return type

[**CarstockImagesChildsPost200Response**](CarstockImagesChildsPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesComparablePost

> List&lt;CarstockComparableResponse&gt; carstockImagesComparablePost(carstockComparableRequest)

Get the current carstock images of type comparable carstock images

Get the current carstock images of type comparable carstock images

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockComparableRequest carstockComparableRequest = new CarstockComparableRequest(); // CarstockComparableRequest | 
        try {
            List<CarstockComparableResponse> result = apiInstance.carstockImagesComparablePost(carstockComparableRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesComparablePost");
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
| **carstockComparableRequest** | [**CarstockComparableRequest**](CarstockComparableRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockComparableResponse&gt;**](CarstockComparableResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesComparablePost_0

> List&lt;CarstockComparableResponse&gt; carstockImagesComparablePost_0(carstockComparableRequest)

Get the current carstock images of type comparable carstock images

Get the current carstock images of type comparable carstock images

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockComparableRequest carstockComparableRequest = new CarstockComparableRequest(); // CarstockComparableRequest | 
        try {
            List<CarstockComparableResponse> result = apiInstance.carstockImagesComparablePost_0(carstockComparableRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesComparablePost_0");
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
| **carstockComparableRequest** | [**CarstockComparableRequest**](CarstockComparableRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockComparableResponse&gt;**](CarstockComparableResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesGenericrendersPost

> List&lt;CarstockGenericRendersResponse&gt; carstockImagesGenericrendersPost(carstockGenericRendersRequest)

Get the current carstock images of type generic render

Get the current carstock images of type generic render

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockGenericRendersRequest carstockGenericRendersRequest = new CarstockGenericRendersRequest(); // CarstockGenericRendersRequest | 
        try {
            List<CarstockGenericRendersResponse> result = apiInstance.carstockImagesGenericrendersPost(carstockGenericRendersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesGenericrendersPost");
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
| **carstockGenericRendersRequest** | [**CarstockGenericRendersRequest**](CarstockGenericRendersRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockGenericRendersResponse&gt;**](CarstockGenericRendersResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesGenericrendersPost_0

> List&lt;CarstockGenericRendersResponse&gt; carstockImagesGenericrendersPost_0(carstockGenericRendersRequest)

Get the current carstock images of type generic render

Get the current carstock images of type generic render

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockGenericRendersRequest carstockGenericRendersRequest = new CarstockGenericRendersRequest(); // CarstockGenericRendersRequest | 
        try {
            List<CarstockGenericRendersResponse> result = apiInstance.carstockImagesGenericrendersPost_0(carstockGenericRendersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesGenericrendersPost_0");
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
| **carstockGenericRendersRequest** | [**CarstockGenericRendersRequest**](CarstockGenericRendersRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockGenericRendersResponse&gt;**](CarstockGenericRendersResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesPlaceholdersPost

> List&lt;CarstockPlaceHoldersResponse&gt; carstockImagesPlaceholdersPost(carstockPlaceHoldersRequest)

Get the current carstock images of type placeholder

Get the current carstock images of type placeholder

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockPlaceHoldersRequest carstockPlaceHoldersRequest = new CarstockPlaceHoldersRequest(); // CarstockPlaceHoldersRequest | 
        try {
            List<CarstockPlaceHoldersResponse> result = apiInstance.carstockImagesPlaceholdersPost(carstockPlaceHoldersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesPlaceholdersPost");
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
| **carstockPlaceHoldersRequest** | [**CarstockPlaceHoldersRequest**](CarstockPlaceHoldersRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockPlaceHoldersResponse&gt;**](CarstockPlaceHoldersResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesPlaceholdersPost_0

> List&lt;CarstockPlaceHoldersResponse&gt; carstockImagesPlaceholdersPost_0(carstockPlaceHoldersRequest)

Get the current carstock images of type placeholder

Get the current carstock images of type placeholder

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockPlaceHoldersRequest carstockPlaceHoldersRequest = new CarstockPlaceHoldersRequest(); // CarstockPlaceHoldersRequest | 
        try {
            List<CarstockPlaceHoldersResponse> result = apiInstance.carstockImagesPlaceholdersPost_0(carstockPlaceHoldersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesPlaceholdersPost_0");
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
| **carstockPlaceHoldersRequest** | [**CarstockPlaceHoldersRequest**](CarstockPlaceHoldersRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockPlaceHoldersResponse&gt;**](CarstockPlaceHoldersResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesSelectionPost

> CarstockImagesSelectionPost200Response carstockImagesSelectionPost(carstockSelectionRequest)

Get the current carstock imagesources

Get the current carstock images of type car specific

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockSelectionRequest carstockSelectionRequest = new CarstockSelectionRequest(); // CarstockSelectionRequest | 
        try {
            CarstockImagesSelectionPost200Response result = apiInstance.carstockImagesSelectionPost(carstockSelectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesSelectionPost");
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
| **carstockSelectionRequest** | [**CarstockSelectionRequest**](CarstockSelectionRequest.md)|  | [optional] |

### Return type

[**CarstockImagesSelectionPost200Response**](CarstockImagesSelectionPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesSelectionPost_0

> CarstockImagesSelectionPost200Response carstockImagesSelectionPost_0(carstockSelectionRequest)

Get the current carstock imagesources

Get the current carstock images of type car specific

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockSelectionRequest carstockSelectionRequest = new CarstockSelectionRequest(); // CarstockSelectionRequest | 
        try {
            CarstockImagesSelectionPost200Response result = apiInstance.carstockImagesSelectionPost_0(carstockSelectionRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesSelectionPost_0");
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
| **carstockSelectionRequest** | [**CarstockSelectionRequest**](CarstockSelectionRequest.md)|  | [optional] |

### Return type

[**CarstockImagesSelectionPost200Response**](CarstockImagesSelectionPost200Response.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesSpecificPost

> List&lt;CarstockSpecificResponse&gt; carstockImagesSpecificPost(carstockSpecificRequest)

Get the current carstock images of type car specific

Get the current carstock images of type car specific

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockSpecificRequest carstockSpecificRequest = new CarstockSpecificRequest(); // CarstockSpecificRequest | 
        try {
            List<CarstockSpecificResponse> result = apiInstance.carstockImagesSpecificPost(carstockSpecificRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesSpecificPost");
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
| **carstockSpecificRequest** | [**CarstockSpecificRequest**](CarstockSpecificRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockSpecificResponse&gt;**](CarstockSpecificResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |


## carstockImagesSpecificPost_0

> List&lt;CarstockSpecificResponse&gt; carstockImagesSpecificPost_0(carstockSpecificRequest)

Get the current carstock images of type car specific

Get the current carstock images of type car specific

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CarstockImagesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://cic-api.dev.nl");
        
        // Configure HTTP basic authorization: basic
        HttpBasicAuth basic = (HttpBasicAuth) defaultClient.getAuthentication("basic");
        basic.setUsername("YOUR USERNAME");
        basic.setPassword("YOUR PASSWORD");

        CarstockImagesApi apiInstance = new CarstockImagesApi(defaultClient);
        CarstockSpecificRequest carstockSpecificRequest = new CarstockSpecificRequest(); // CarstockSpecificRequest | 
        try {
            List<CarstockSpecificResponse> result = apiInstance.carstockImagesSpecificPost_0(carstockSpecificRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CarstockImagesApi#carstockImagesSpecificPost_0");
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
| **carstockSpecificRequest** | [**CarstockSpecificRequest**](CarstockSpecificRequest.md)|  | [optional] |

### Return type

[**List&lt;CarstockSpecificResponse&gt;**](CarstockSpecificResponse.md)

### Authorization

[basic](../README.md#basic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Carstock specific images for the given carstockid |  -  |
| **500** | Internal server error |  -  |

