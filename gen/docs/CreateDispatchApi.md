# CreateDispatchApi

All URIs are relative to *https://dev1.nationalservicealliance.com/clientapi*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createDispatch**](CreateDispatchApi.md#createDispatch) | **POST** /create/create.php | Create new Dispatch |
| [**createVirtualTechDispatch**](CreateDispatchApi.md#createVirtualTechDispatch) | **POST** /create/createVirtualTech.php | Create new Virtual Tech Dispatch |



## createDispatch

> CreateResponse createDispatch(createRequest)

Create new Dispatch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreateDispatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CreateDispatchApi apiInstance = new CreateDispatchApi(defaultClient);
        CreateRequest createRequest = new CreateRequest(); // CreateRequest | 
        try {
            CreateResponse result = apiInstance.createDispatch(createRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateDispatchApi#createDispatch");
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
| **createRequest** | [**CreateRequest**](CreateRequest.md)|  | [optional] |

### Return type

[**CreateResponse**](CreateResponse.md)

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


## createVirtualTechDispatch

> CreateResponse createVirtualTechDispatch(createVirtualTechRequest)

Create new Virtual Tech Dispatch

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CreateDispatchApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://dev1.nationalservicealliance.com/clientapi");
        
        // Configure HTTP basic authorization: basicAuth
        HttpBasicAuth basicAuth = (HttpBasicAuth) defaultClient.getAuthentication("basicAuth");
        basicAuth.setUsername("YOUR USERNAME");
        basicAuth.setPassword("YOUR PASSWORD");

        CreateDispatchApi apiInstance = new CreateDispatchApi(defaultClient);
        CreateVirtualTechRequest createVirtualTechRequest = new CreateVirtualTechRequest(); // CreateVirtualTechRequest | 
        try {
            CreateResponse result = apiInstance.createVirtualTechDispatch(createVirtualTechRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CreateDispatchApi#createVirtualTechDispatch");
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
| **createVirtualTechRequest** | [**CreateVirtualTechRequest**](CreateVirtualTechRequest.md)|  | [optional] |

### Return type

[**CreateResponse**](CreateResponse.md)

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

