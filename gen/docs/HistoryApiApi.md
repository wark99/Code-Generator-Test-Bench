# HistoryApiApi

All URIs are relative to *http://localhost:8000/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCommunicationWorkflowById**](HistoryApiApi.md#getCommunicationWorkflowById) | **GET** /history/workflowId/{workflowId} | Get the workflow by its Id |
| [**getCommunicationWorkflowTotalByQuery**](HistoryApiApi.md#getCommunicationWorkflowTotalByQuery) | **GET** /history/total | Get the total number of workflows that match the query |
| [**getPreviousCommunications**](HistoryApiApi.md#getPreviousCommunications) | **GET** /history | Get the previous communication workflows by status, userId or gatewayId |



## getCommunicationWorkflowById

> CommunicationWorkflow getCommunicationWorkflowById(workflowId)

Get the workflow by its Id

requires history:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HistoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HistoryApiApi apiInstance = new HistoryApiApi(defaultClient);
        Integer workflowId = 56; // Integer | The workflowId to search for
        try {
            CommunicationWorkflow result = apiInstance.getCommunicationWorkflowById(workflowId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApiApi#getCommunicationWorkflowById");
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
| **workflowId** | **Integer**| The workflowId to search for | |

### Return type

[**CommunicationWorkflow**](CommunicationWorkflow.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |


## getCommunicationWorkflowTotalByQuery

> GetCommunicationWorkflowTotalByQuery200Response getCommunicationWorkflowTotalByQuery(userId, gatewayId, status)

Get the total number of workflows that match the query

requires history:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HistoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HistoryApiApi apiInstance = new HistoryApiApi(defaultClient);
        Integer userId = 56; // Integer | The userId
        Integer gatewayId = 56; // Integer | The gatewayId
        Integer status = 0; // Integer | The integer ENUM value representing the temporal status
        try {
            GetCommunicationWorkflowTotalByQuery200Response result = apiInstance.getCommunicationWorkflowTotalByQuery(userId, gatewayId, status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApiApi#getCommunicationWorkflowTotalByQuery");
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
| **userId** | **Integer**| The userId | [optional] |
| **gatewayId** | **Integer**| The gatewayId | [optional] |
| **status** | **Integer**| The integer ENUM value representing the temporal status | [optional] [default to 0] |

### Return type

[**GetCommunicationWorkflowTotalByQuery200Response**](GetCommunicationWorkflowTotalByQuery200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |


## getPreviousCommunications

> GetPreviousCommunications200Response getPreviousCommunications(userId, gatewayId, status, pageNumber, pageSize)

Get the previous communication workflows by status, userId or gatewayId

requires history:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.HistoryApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        HistoryApiApi apiInstance = new HistoryApiApi(defaultClient);
        Integer userId = 56; // Integer | The userId
        Integer gatewayId = 56; // Integer | The gatewayId
        Integer status = 0; // Integer | The integer representing the temporal status
        Integer pageNumber = 0; // Integer | The page number to retrieve
        Integer pageSize = 50; // Integer | The number of items per page
        try {
            GetPreviousCommunications200Response result = apiInstance.getPreviousCommunications(userId, gatewayId, status, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling HistoryApiApi#getPreviousCommunications");
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
| **userId** | **Integer**| The userId | [optional] |
| **gatewayId** | **Integer**| The gatewayId | [optional] |
| **status** | **Integer**| The integer representing the temporal status | [optional] [default to 0] |
| **pageNumber** | **Integer**| The page number to retrieve | [optional] [default to 0] |
| **pageSize** | **Integer**| The number of items per page | [optional] [default to 50] |

### Return type

[**GetPreviousCommunications200Response**](GetPreviousCommunications200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |

