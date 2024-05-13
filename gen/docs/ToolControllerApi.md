# ToolControllerApi

All URIs are relative to *https://eam.matix.cloud/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCompanies**](ToolControllerApi.md#getCompanies) | **GET** /companies | Get information about all your companies |
| [**getPlants**](ToolControllerApi.md#getPlants) | **GET** /plants | Get information about all your plants |
| [**getTelemetry**](ToolControllerApi.md#getTelemetry) | **GET** /telemetry | Get tool telemetry |
| [**getTool**](ToolControllerApi.md#getTool) | **GET** /tool | Get information about all a specific tool |
| [**getTools**](ToolControllerApi.md#getTools) | **GET** /tools | Get information about all your tools |



## getCompanies

> List&lt;List&lt;Company&gt;&gt; getCompanies()

Get information about all your companies

All company catalog, along with tool information is returned as a JSON array

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://eam.matix.cloud/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ToolControllerApi apiInstance = new ToolControllerApi(defaultClient);
        try {
            List<List<Company>> result = apiInstance.getCompanies();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolControllerApi#getCompanies");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;List&lt;Company&gt;&gt;**](List.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |


## getPlants

> List&lt;List&lt;Plant&gt;&gt; getPlants()

Get information about all your plants

All plants catalog, along with tool information is returned as a JSON array

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://eam.matix.cloud/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ToolControllerApi apiInstance = new ToolControllerApi(defaultClient);
        try {
            List<List<Plant>> result = apiInstance.getPlants();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolControllerApi#getPlants");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**List&lt;List&lt;Plant&gt;&gt;**](List.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |


## getTelemetry

> GetTelemetry200Response getTelemetry(id, externalId, from, to, keys)

Get tool telemetry

The tool telemetry, for the specified keys, is returned. Custom aggregation can be chosen among the available ones.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://eam.matix.cloud/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ToolControllerApi apiInstance = new ToolControllerApi(defaultClient);
        Integer id = 56; // Integer | Id of the tool
        String externalId = "externalId_example"; // String | Id to be used as a key to external database
        Integer from = 56; // Integer | Start of telemetry interval to be returned
        Integer to = 56; // Integer | End of telemetry interval to be returned
        String keys = "keys_example"; // String | Telemetry keys to be exported, comma separated (CYCLES, CYCLE_TIME, RUNTIME, UPTIME, TEMPERATURE)
        try {
            GetTelemetry200Response result = apiInstance.getTelemetry(id, externalId, from, to, keys);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolControllerApi#getTelemetry");
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
| **id** | **Integer**| Id of the tool | [optional] |
| **externalId** | **String**| Id to be used as a key to external database | [optional] |
| **from** | **Integer**| Start of telemetry interval to be returned | [optional] |
| **to** | **Integer**| End of telemetry interval to be returned | [optional] |
| **keys** | **String**| Telemetry keys to be exported, comma separated (CYCLES, CYCLE_TIME, RUNTIME, UPTIME, TEMPERATURE) | [optional] |

### Return type

[**GetTelemetry200Response**](GetTelemetry200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getTool

> Tool getTool(id, externalId)

Get information about all a specific tool

A single tool is returned in a JSON object

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://eam.matix.cloud/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ToolControllerApi apiInstance = new ToolControllerApi(defaultClient);
        Integer id = 56; // Integer | Id of the tool
        String externalId = "externalId_example"; // String | Id to be used as a key to external database
        try {
            Tool result = apiInstance.getTool(id, externalId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolControllerApi#getTool");
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
| **id** | **Integer**| Id of the tool | [optional] |
| **externalId** | **String**| Id to be used as a key to external database | [optional] |

### Return type

[**Tool**](Tool.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not found |  -  |


## getTools

> GetTools200Response getTools(page)

Get information about all your tools

All tool catalog, along with tool information is returned as a JSON array. Output is paginated.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ToolControllerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://eam.matix.cloud/api");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ToolControllerApi apiInstance = new ToolControllerApi(defaultClient);
        Integer page = 56; // Integer | Id of the desired page
        try {
            GetTools200Response result = apiInstance.getTools(page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ToolControllerApi#getTools");
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
| **page** | **Integer**| Id of the desired page | [optional] |

### Return type

[**GetTools200Response**](GetTools200Response.md)

### Authorization

[bearerAuth](../README.md#bearerAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **401** | Unauthorized |  -  |

