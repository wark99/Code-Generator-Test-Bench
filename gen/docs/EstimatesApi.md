# EstimatesApi

All URIs are relative to *https://dev1.nationalservicealliance.com/clientapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getEstiamteByID**](EstimatesApi.md#getEstiamteByID) | **GET** /estimates/estimate.php | Get estimate by ID |
| [**getEstiamtes**](EstimatesApi.md#getEstiamtes) | **GET** /estimates/estimates.php | Get estimates list |
| [**processEstimate**](EstimatesApi.md#processEstimate) | **POST** /estimates/process.php | Process estimate |



## getEstiamteByID

> EstimateObject getEstiamteByID(estimateID)

Get estimate by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EstimatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EstimatesApi apiInstance = new EstimatesApi(defaultClient);
        Integer estimateID = 56; // Integer | 
        try {
            EstimateObject result = apiInstance.getEstiamteByID(estimateID);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EstimatesApi#getEstiamteByID");
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
| **estimateID** | **Integer**|  | |

### Return type

[**EstimateObject**](EstimateObject.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful request. |  -  |
| **401** | Authentication error |  -  |
| **5XX** | Unexpected server error |  -  |


## getEstiamtes

> List&lt;EstimateObject&gt; getEstiamtes(status, page, updateTimeUTC)

Get estimates list

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EstimatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EstimatesApi apiInstance = new EstimatesApi(defaultClient);
        String status = "open"; // String | 
        Integer page = 56; // Integer | 
        Integer updateTimeUTC = 2022-01-31 23:59:59; // Integer | format: YYYY-MM-DD hh:mm:ss
        try {
            List<EstimateObject> result = apiInstance.getEstiamtes(status, page, updateTimeUTC);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EstimatesApi#getEstiamtes");
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
| **status** | **String**|  | [enum: open, all] |
| **page** | **Integer**|  | [optional] |
| **updateTimeUTC** | **Integer**| format: YYYY-MM-DD hh:mm:ss | [optional] |

### Return type

[**List&lt;EstimateObject&gt;**](EstimateObject.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful request. |  -  |
| **401** | Authentication error |  -  |
| **5XX** | Unexpected server error |  -  |


## processEstimate

> processEstimate(estimateProcessRequest)

Process estimate

action values:      * approve   * partiallyApproved   * estDeclined   * rejectWithResubmit   * partsUnAvail   * estimateHold 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EstimatesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        EstimatesApi apiInstance = new EstimatesApi(defaultClient);
        EstimateProcessRequest estimateProcessRequest = new EstimateProcessRequest(); // EstimateProcessRequest | 
        try {
            apiInstance.processEstimate(estimateProcessRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling EstimatesApi#processEstimate");
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
| **estimateProcessRequest** | [**EstimateProcessRequest**](EstimateProcessRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful request.  |  -  |
| **401** | Authentication error |  -  |
| **5XX** | Unexpected server error |  -  |

