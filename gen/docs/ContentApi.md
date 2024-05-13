# ContentApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1ContentDetectEmailsPost**](ContentApi.md#v1ContentDetectEmailsPost) | **POST** /v1/content/detect_emails | Detect Emails |
| [**v1ContentDetectPhonesPost**](ContentApi.md#v1ContentDetectPhonesPost) | **POST** /v1/content/detect_phones | Detect Phones Numbers |
| [**v1ContentDetectSpamPost**](ContentApi.md#v1ContentDetectSpamPost) | **POST** /v1/content/detect_spam | Detect Spam |
| [**v1ContentKeywordsPost**](ContentApi.md#v1ContentKeywordsPost) | **POST** /v1/content/keywords | Generate Keywords/Tags |
| [**v1ContentSummarizePost**](ContentApi.md#v1ContentSummarizePost) | **POST** /v1/content/summarize | Summarize Text |
| [**v1ContentTranslatePost**](ContentApi.md#v1ContentTranslatePost) | **POST** /v1/content/translate | Translate Text |



## v1ContentDetectEmailsPost

> Object v1ContentDetectEmailsPost(accept, body)

Detect Emails

Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContentApi apiInstance = new ContentApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1ContentDetectEmailsPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentApi#v1ContentDetectEmailsPost");
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


## v1ContentDetectPhonesPost

> Object v1ContentDetectPhonesPost(accept, body)

Detect Phones Numbers

Parses the provided text for any phone numbers and returns the original detected version and its E.164 format. Might come in handy in the case of processing and validating big chunks of data against phone numbers or f.e. if you want to detect phone numbers in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       {         \&quot;parsed_number\&quot;: \&quot;+18003947486\&quot;,         \&quot;detected_number\&quot;: \&quot;1800-394-7486\&quot;       },       {         \&quot;parsed_number\&quot;: \&quot;+6588888888\&quot;,         \&quot;detected_number\&quot;: \&quot;+65 8888 8888\&quot;       }     ] 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContentApi apiInstance = new ContentApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1ContentDetectPhonesPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentApi#v1ContentDetectPhonesPost");
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
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |


## v1ContentDetectSpamPost

> Object v1ContentDetectSpamPost(accept, body)

Detect Spam

Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContentApi apiInstance = new ContentApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1ContentDetectSpamPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentApi#v1ContentDetectSpamPost");
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


## v1ContentKeywordsPost

> Object v1ContentKeywordsPost(accept, body)

Generate Keywords/Tags

Generates a summarized version of the provided content. Perfect for generating marketing introductions of longer texts.  RESULT EXAMPLE:      {       \&quot;summary\&quot;: \&quot;The Las Vegas Grand Prix is being described as a show rather than a sporting event by some drivers, with Max Verstappen expressing his lack of enthusiasm for the hype. Other drivers, such as Fernando Alonso and Lewis Hamilton, acknowledge the unique treatment and extra show that the event deserves, while also emphasizing the business aspect and the potential for good racing at the new track.\&quot;     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContentApi apiInstance = new ContentApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1ContentKeywordsPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentApi#v1ContentKeywordsPost");
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


## v1ContentSummarizePost

> Object v1ContentSummarizePost(accept, body)

Summarize Text

Generates a summarized version of the provided content. Perfect for generating marketing introductions of longer texts.  RESULT EXAMPLE:      {       \&quot;summary\&quot;: \&quot;The Las Vegas Grand Prix is being described as a show rather than a sporting event by some drivers, with Max Verstappen expressing his lack of enthusiasm for the hype. Other drivers, such as Fernando Alonso and Lewis Hamilton, acknowledge the unique treatment and extra show that the event deserves, while also emphasizing the business aspect and the potential for good racing at the new track.\&quot;     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContentApi apiInstance = new ContentApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1ContentSummarizePost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentApi#v1ContentSummarizePost");
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


## v1ContentTranslatePost

> Object v1ContentTranslatePost(accept, body)

Translate Text

Parses the provided text for any possible emails. Might come in handy in case of processing and validating big chunks of data against email addresses or f.e. if you want to detect emails in places where they&#39;re not supposed to be.  RESULT EXAMPLE:      [       \&quot;example@email.com\&quot;,       \&quot;lorem.ipsum@email.com\&quot;     ] 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContentApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ContentApi apiInstance = new ContentApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1ContentTranslatePost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContentApi#v1ContentTranslatePost");
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

