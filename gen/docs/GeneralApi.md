# GeneralApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get**](GeneralApi.md#v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get) | **GET** /v1/job/status/9e0f60b8-0299-46e9-be2e-02e216b8dc66 | Job Status |



## v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get

> Object v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get(accept)

Job Status

An endpoint is used to check on the progress of the requested API job.   RESULT EXAMPLE:      {       \&quot;data\&quot;: {         \&quot;type\&quot;: \&quot;api_job_result\&quot;,         \&quot;id\&quot;: \&quot;05f988ad-c39a-4d87-b866-efe99bdee885\&quot;,         \&quot;attributes\&quot;: {           \&quot;status\&quot;: \&quot;success\&quot;,           \&quot;type\&quot;: \&quot;tth_hospitality_product_categories\&quot;,           \&quot;result\&quot;: \&quot;[{\\\&quot;name\\\&quot;: \\\&quot;Hotel Accommodation\\\&quot;, \\\&quot;weight\\\&quot;: 9.5}, {\\\&quot;name\\\&quot;: \\\&quot;Restaurant and Dining\\\&quot;, \\\&quot;weight\\\&quot;: 8}, {\\\&quot;name\\\&quot;: \\\&quot;Tourist Attractions\\\&quot;, \\\&quot;weight\\\&quot;: 7.5}]\&quot;         }       }     } 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.GeneralApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        GeneralApi apiInstance = new GeneralApi(defaultClient);
        String accept = "application/json"; // String | 
        try {
            Object result = apiInstance.v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get(accept);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling GeneralApi#v1JobStatus9e0f60b8029946e9Be2e02e216b8dc66Get");
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

### Return type

**Object**

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **401** | Unauthorized |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **402** | Payment Required |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **404** | Not Found |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **429** | Too Many Requests |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * X-RateLimit-Limit -  <br>  * X-RateLimit-Remaining -  <br>  * Retry-After -  <br>  * X-RateLimit-Reset -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **500** | Internal Server Error |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * phpdebugbar-id -  <br>  * Access-Control-Allow-Origin -  <br>  |
| **503** | Service Unavailable |  * Server -  <br>  * Content-Type -  <br>  * Transfer-Encoding -  <br>  * Connection -  <br>  * X-Powered-By -  <br>  * Cache-Control -  <br>  * Date -  <br>  * Access-Control-Allow-Origin -  <br>  |

