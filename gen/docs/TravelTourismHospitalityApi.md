# TravelTourismHospitalityApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1TthHospitalityProductCategoriesPost**](TravelTourismHospitalityApi.md#v1TthHospitalityProductCategoriesPost) | **POST** /v1/tth/hospitality_product_categories | Hospitality Product Categories |
| [**v1TthReviewSentimentPost**](TravelTourismHospitalityApi.md#v1TthReviewSentimentPost) | **POST** /v1/tth/review_sentiment | Travel Review Sentiment |
| [**v1TthTaProductCategoriesPost**](TravelTourismHospitalityApi.md#v1TthTaProductCategoriesPost) | **POST** /v1/tth/ta_product_categories | Tours &amp; Activities Product Categories |



## v1TthHospitalityProductCategoriesPost

> Object v1TthHospitalityProductCategoriesPost(accept, body)

Hospitality Product Categories

Generates a a list of suitable categories for the Hospitality type product with relevance weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score. Provide the product name and its parameters to get the best category matches possible. Comes in handy with populating products catalogs data and bulk products&#39; processing. Only the &#x60;content&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;categories\&quot;: [         {           \&quot;name\&quot;: \&quot;Górskie Noclegi\&quot;,           \&quot;weight\&quot;: 8         },         {           \&quot;name\&quot;: \&quot;Regionalna Kuchnia\&quot;,           \&quot;weight\&quot;: 7.5         },         {           \&quot;name\&quot;: \&quot;Przyrodnicze Spa\&quot;,           \&quot;weight\&quot;: 6.8         },         {           \&quot;name\&quot;: \&quot;Wypożyczalnia Sprzętu Sportowego\&quot;,           \&quot;weight\&quot;: 6.3         }       ]     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TravelTourismHospitalityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TravelTourismHospitalityApi apiInstance = new TravelTourismHospitalityApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1TthHospitalityProductCategoriesPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelTourismHospitalityApi#v1TthHospitalityProductCategoriesPost");
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
| **accept** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Location -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **401** | Unauthorized |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **402** | Payment Required |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **422** | Unprocessable Content |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **429** | Too Many Requests |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * Retry-After -  <br>  * X-RateLimit-Reset -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |


## v1TthReviewSentimentPost

> Object v1TthReviewSentimentPost(accept, body)

Travel Review Sentiment

Parses the Travel/Hospitality product review and provides its sentiment (POSITIVE/NEGATIVE/NEUTRAL) with a score between 0-100%. Great for sentiment report processing for any online store.  RESULT EXAMPLE:      {       \&quot;opinion\&quot;: \&quot;POSITIVE\&quot;,       \&quot;score\&quot;: 95     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TravelTourismHospitalityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TravelTourismHospitalityApi apiInstance = new TravelTourismHospitalityApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1TthReviewSentimentPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelTourismHospitalityApi#v1TthReviewSentimentPost");
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
| **accept** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Location -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **401** | Unauthorized |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **402** | Payment Required |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **422** | Unprocessable Content |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **429** | Too Many Requests |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * Retry-After -  <br>  * X-RateLimit-Reset -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |


## v1TthTaProductCategoriesPost

> Object v1TthTaProductCategoriesPost(accept, body)

Tours &amp; Activities Product Categories

Generates a list of suitable categories for the Tours &amp; Activities product with relevance weights as float value (1.0-10.0) where 10 equals 100%, the highest relevance score. Provide the product name and its parameters to get the best category matches possible. Comes in handy with populating product catalogue data and bulk product processing. Only the &#x60;content&#x60; parameter is required.  RESULT EXAMPLE:      {       \&quot;categories\&quot;: [         {           \&quot;name\&quot;: \&quot;Halong Bay Cruise\&quot;,           \&quot;weight\&quot;: 9.5         },         {           \&quot;name\&quot;: \&quot;Day Cruises\&quot;,           \&quot;weight\&quot;: 8.8         },         {           \&quot;name\&quot;: \&quot;Kayaking Tours\&quot;,           \&quot;weight\&quot;: 7.2         },         {           \&quot;name\&quot;: \&quot;Scenic Boat Tours\&quot;,           \&quot;weight\&quot;: 6.5         }       ]     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.TravelTourismHospitalityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        TravelTourismHospitalityApi apiInstance = new TravelTourismHospitalityApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1TthTaProductCategoriesPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling TravelTourismHospitalityApi#v1TthTaProductCategoriesPost");
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
| **accept** | **String**|  | [optional] |
| **body** | **Object**|  | [optional] |

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **202** | Accepted |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Location -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **401** | Unauthorized |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **402** | Payment Required |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **422** | Unprocessable Content |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **429** | Too Many Requests |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * Retry-After -  <br>  * X-RateLimit-Reset -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |

