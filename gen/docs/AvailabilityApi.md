# AvailabilityApi

All URIs are relative to *https://dev1.nationalservicealliance.com/clientapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getAvailability**](AvailabilityApi.md#getAvailability) | **POST** /availability/availability.php | Provides availability by NSA based on provided parameters |
| [**getAvailabilityVirtualTech**](AvailabilityApi.md#getAvailabilityVirtualTech) | **POST** /availability/availabilityVirtualTech.php | Provides availability by NSA&#39;s virtual technicians |
| [**getAvailabilityWithCODCost**](AvailabilityApi.md#getAvailabilityWithCODCost) | **POST** /availability/availabilityWithCODCost.php | Provides availability by NSA based on provided parameters and associated COD Cost |



## getAvailability

> List&lt;String&gt; getAvailability(availabilityRequest)

Provides availability by NSA based on provided parameters

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        AvailabilityRequest availabilityRequest = new AvailabilityRequest(); // AvailabilityRequest | 
        try {
            List<String> result = apiInstance.getAvailability(availabilityRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#getAvailability");
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
| **availabilityRequest** | [**AvailabilityRequest**](AvailabilityRequest.md)|  | [optional] |

### Return type

**List&lt;String&gt;**

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability  |  -  |
| **400** | User request error |  -  |
| **401** | Authentication error |  -  |
| **5XX** | Unexpected server error |  -  |


## getAvailabilityVirtualTech

> List&lt;AvailabilityVirutalTechResponseInner&gt; getAvailabilityVirtualTech(availabilityVirtualTechRequest)

Provides availability by NSA&#39;s virtual technicians

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        AvailabilityVirtualTechRequest availabilityVirtualTechRequest = new AvailabilityVirtualTechRequest(); // AvailabilityVirtualTechRequest | 
        try {
            List<AvailabilityVirutalTechResponseInner> result = apiInstance.getAvailabilityVirtualTech(availabilityVirtualTechRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#getAvailabilityVirtualTech");
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
| **availabilityVirtualTechRequest** | [**AvailabilityVirtualTechRequest**](AvailabilityVirtualTechRequest.md)|  | [optional] |

### Return type

[**List&lt;AvailabilityVirutalTechResponseInner&gt;**](AvailabilityVirutalTechResponseInner.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability  |  -  |
| **400** | User request error |  -  |
| **401** | Authentication error |  -  |
| **5XX** | Unexpected server error |  -  |


## getAvailabilityWithCODCost

> AvailabilityWithCODCostResponse getAvailabilityWithCODCost(availabilityRequest)

Provides availability by NSA based on provided parameters and associated COD Cost

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AvailabilityApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        AvailabilityApi apiInstance = new AvailabilityApi(defaultClient);
        AvailabilityRequest availabilityRequest = new AvailabilityRequest(); // AvailabilityRequest | 
        try {
            AvailabilityWithCODCostResponse result = apiInstance.getAvailabilityWithCODCost(availabilityRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AvailabilityApi#getAvailabilityWithCODCost");
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
| **availabilityRequest** | [**AvailabilityRequest**](AvailabilityRequest.md)|  | [optional] |

### Return type

[**AvailabilityWithCODCostResponse**](AvailabilityWithCODCostResponse.md)

### Authorization

[basicAuth](../README.md#basicAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful request. You will get one of two responses: 1) an array of dates with availability 2) an empty array signifiying that there is no availability  |  -  |
| **400** | User request error |  -  |
| **401** | Authentication error |  -  |
| **5XX** | Unexpected server error |  -  |

