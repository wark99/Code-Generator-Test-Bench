# SeoApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1SeoGenerateTagsPost**](SeoApi.md#v1SeoGenerateTagsPost) | **POST** /v1/seo/generate_tags | Generate SEO Tags |



## v1SeoGenerateTagsPost

> Object v1SeoGenerateTagsPost(accept, body)

Generate SEO Tags

Generates all most important META tags based on the content provided. Make sure to imclude link to the website and pictures URL to get as many tags populated as possible.  RESULT EXAMPLE:      {       \&quot;meta_tags\&quot;: {         \&quot;title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;keywords\&quot;: \&quot;Las Vegas Grand Prix, F1, Max Verstappen, Fernando Alonso, Lewis Hamilton, racing, spectacle, Las Vegas Strip\&quot;,         \&quot;description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it.\&quot;,         \&quot;author\&quot;: \&quot;BBC\&quot;,         \&quot;og:url\&quot;: \&quot;https://bbc.com/\&quot;,         \&quot;og:type\&quot;: \&quot;article\&quot;,         \&quot;og:image\&quot;: \&quot;\&quot;,         \&quot;og:title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;og:site_name\&quot;: \&quot;BBC\&quot;,         \&quot;og:description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it.\&quot;,         \&quot;twitter:card\&quot;: \&quot;summary_large_image\&quot;,         \&quot;twitter:image\&quot;: \&quot;\&quot;,         \&quot;twitter:title\&quot;: \&quot;Las Vegas Grand Prix: A Spectacle of Lights and Racing\&quot;,         \&quot;twitter:creator\&quot;: \&quot;BBC\&quot;,         \&quot;twitter:description\&quot;: \&quot;Max Verstappen and other F1 drivers share their thoughts on the inaugural Las Vegas Grand Prix and the spectacle surrounding it\&quot;       }     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SeoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        SeoApi apiInstance = new SeoApi(defaultClient);
        String accept = "application/json"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.v1SeoGenerateTagsPost(accept, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SeoApi#v1SeoGenerateTagsPost");
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

