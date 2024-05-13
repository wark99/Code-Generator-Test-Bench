# CommunicationGatewayApiApi

All URIs are relative to *http://localhost:8000/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCommunicationGateway**](CommunicationGatewayApiApi.md#createCommunicationGateway) | **POST** /gateway | Create a communication gateway |
| [**deleteCommunicationGateway**](CommunicationGatewayApiApi.md#deleteCommunicationGateway) | **DELETE** /gateway/{gatewayId} | Delete a communication gateway |
| [**getCommunicationGatewayById**](CommunicationGatewayApiApi.md#getCommunicationGatewayById) | **GET** /gateway/{gatewayId} | Get gateway by ID |
| [**getCommunicationGateways**](CommunicationGatewayApiApi.md#getCommunicationGateways) | **GET** /gateway | Get all communication gateways |
| [**updateCommunicationGateway**](CommunicationGatewayApiApi.md#updateCommunicationGateway) | **PUT** /gateway | Update a communication gateway |



## createCommunicationGateway

> CommunicationGateway createCommunicationGateway(createCommunicationGateway)

Create a communication gateway

requires gateway:write scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationGatewayApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CommunicationGatewayApiApi apiInstance = new CommunicationGatewayApiApi(defaultClient);
        CreateCommunicationGateway createCommunicationGateway = new CreateCommunicationGateway(); // CreateCommunicationGateway | Communication gateway to create
        try {
            CommunicationGateway result = apiInstance.createCommunicationGateway(createCommunicationGateway);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationGatewayApiApi#createCommunicationGateway");
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
| **createCommunicationGateway** | [**CreateCommunicationGateway**](CreateCommunicationGateway.md)| Communication gateway to create | |

### Return type

[**CommunicationGateway**](CommunicationGateway.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |
| **409** | Conflict |  -  |


## deleteCommunicationGateway

> deleteCommunicationGateway(gatewayId)

Delete a communication gateway

requires gateway:delete scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationGatewayApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CommunicationGatewayApiApi apiInstance = new CommunicationGatewayApiApi(defaultClient);
        UUID gatewayId = UUID.randomUUID(); // UUID | ID of the communication gateway to delete
        try {
            apiInstance.deleteCommunicationGateway(gatewayId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationGatewayApiApi#deleteCommunicationGateway");
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
| **gatewayId** | **UUID**| ID of the communication gateway to delete | |

### Return type

null (empty response body)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No Content |  -  |
| **404** | Not Found |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |


## getCommunicationGatewayById

> Object getCommunicationGatewayById(gatewayId)

Get gateway by ID

requires gateway:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationGatewayApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CommunicationGatewayApiApi apiInstance = new CommunicationGatewayApiApi(defaultClient);
        UUID gatewayId = UUID.randomUUID(); // UUID | ID of the communication gateway to return
        try {
            Object result = apiInstance.getCommunicationGatewayById(gatewayId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationGatewayApiApi#getCommunicationGatewayById");
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
| **gatewayId** | **UUID**| ID of the communication gateway to return | |

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
| **200** | OK |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |


## getCommunicationGateways

> GetCommunicationGateways200Response getCommunicationGateways(pageNumber, pageSize, friendlyName, endpointUrl)

Get all communication gateways

requires gateway:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationGatewayApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CommunicationGatewayApiApi apiInstance = new CommunicationGatewayApiApi(defaultClient);
        Integer pageNumber = 0; // Integer | The page number to retrieve
        Integer pageSize = 25; // Integer | The number of items per page
        String friendlyName = "friendlyName_example"; // String | The friendly name to search for
        String endpointUrl = "endpointUrl_example"; // String | The endpointUrl to search for
        try {
            GetCommunicationGateways200Response result = apiInstance.getCommunicationGateways(pageNumber, pageSize, friendlyName, endpointUrl);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationGatewayApiApi#getCommunicationGateways");
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
| **pageNumber** | **Integer**| The page number to retrieve | [optional] [default to 0] |
| **pageSize** | **Integer**| The number of items per page | [optional] [default to 25] |
| **friendlyName** | **String**| The friendly name to search for | [optional] |
| **endpointUrl** | **String**| The endpointUrl to search for | [optional] |

### Return type

[**GetCommunicationGateways200Response**](GetCommunicationGateways200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |


## updateCommunicationGateway

> CommunicationGateway updateCommunicationGateway(communicationGateway)

Update a communication gateway

requires gateway:write scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationGatewayApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        CommunicationGatewayApiApi apiInstance = new CommunicationGatewayApiApi(defaultClient);
        CommunicationGateway communicationGateway = new CommunicationGateway(); // CommunicationGateway | Communication gateway to update
        try {
            CommunicationGateway result = apiInstance.updateCommunicationGateway(communicationGateway);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationGatewayApiApi#updateCommunicationGateway");
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
| **communicationGateway** | [**CommunicationGateway**](CommunicationGateway.md)| Communication gateway to update | |

### Return type

[**CommunicationGateway**](CommunicationGateway.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorised |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |

