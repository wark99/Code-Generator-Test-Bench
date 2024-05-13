# ScheduleApiApi

All URIs are relative to *http://localhost:8000/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createCommunicationSchedule**](ScheduleApiApi.md#createCommunicationSchedule) | **POST** /schedule | Create a new communication schedule |
| [**deleteCommunicationSchedule**](ScheduleApiApi.md#deleteCommunicationSchedule) | **DELETE** /schedule/{scheduleId} | Delete an existing communication schedule by id |
| [**deleteCommunicationSchedulesByGatewayId**](ScheduleApiApi.md#deleteCommunicationSchedulesByGatewayId) | **DELETE** /schedule/gateway/{gatewayId} | Delete all communication schedules by gatewayId |
| [**deleteCommunicationSchedulesByUserId**](ScheduleApiApi.md#deleteCommunicationSchedulesByUserId) | **DELETE** /schedule/user/{userId} | Delete all communication schedules by userId |
| [**getCommunicationSchedules**](ScheduleApiApi.md#getCommunicationSchedules) | **GET** /schedule | Get all communication schedules |
| [**getCommunicationSchedulesByGatewayId**](ScheduleApiApi.md#getCommunicationSchedulesByGatewayId) | **GET** /schedule/gateway/{gatewayId} | Get all communication schedules by gatewayId |
| [**getCommunicationSchedulesByScheduleId**](ScheduleApiApi.md#getCommunicationSchedulesByScheduleId) | **GET** /schedule/{scheduleId} | Get communication schedule by scheduleId |
| [**getCommunicationSchedulesByUserId**](ScheduleApiApi.md#getCommunicationSchedulesByUserId) | **GET** /schedule/user/{userId} | Get all communication schedules by userId |
| [**updateCommunicationSchedule**](ScheduleApiApi.md#updateCommunicationSchedule) | **PUT** /schedule | Updates an existing communication schedule |
| [**updateCommunicationSchedulesByGatewayId**](ScheduleApiApi.md#updateCommunicationSchedulesByGatewayId) | **PUT** /schedule/gateway/{gatewayId} | Updates all communication schedules by gatewayId to the given request body |
| [**updateCommunicationSchedulesByUserId**](ScheduleApiApi.md#updateCommunicationSchedulesByUserId) | **PUT** /schedule/user/{userId} | Updates all communication schedules by userId to the given request body |



## createCommunicationSchedule

> CommunicationSchedule createCommunicationSchedule(createCommunicationSchedule)

Create a new communication schedule

requires schedule:write scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        CreateCommunicationSchedule createCommunicationSchedule = new CreateCommunicationSchedule(); // CreateCommunicationSchedule | 
        try {
            CommunicationSchedule result = apiInstance.createCommunicationSchedule(createCommunicationSchedule);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#createCommunicationSchedule");
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
| **createCommunicationSchedule** | [**CreateCommunicationSchedule**](CreateCommunicationSchedule.md)|  | [optional] |

### Return type

[**CommunicationSchedule**](CommunicationSchedule.md)

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
| **409** | Conflict - already exists |  -  |


## deleteCommunicationSchedule

> deleteCommunicationSchedule(scheduleId)

Delete an existing communication schedule by id

requires schedule:delete scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        UUID scheduleId = UUID.randomUUID(); // UUID | 
        try {
            apiInstance.deleteCommunicationSchedule(scheduleId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#deleteCommunicationSchedule");
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
| **scheduleId** | **UUID**|  | |

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


## deleteCommunicationSchedulesByGatewayId

> deleteCommunicationSchedulesByGatewayId(gatewayId)

Delete all communication schedules by gatewayId

requires schedule:delete scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        Integer gatewayId = 56; // Integer | The schedules to retrieve by gatewayId
        try {
            apiInstance.deleteCommunicationSchedulesByGatewayId(gatewayId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#deleteCommunicationSchedulesByGatewayId");
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
| **gatewayId** | **Integer**| The schedules to retrieve by gatewayId | |

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


## deleteCommunicationSchedulesByUserId

> deleteCommunicationSchedulesByUserId(userId)

Delete all communication schedules by userId

requires schedule:delete scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        Integer userId = 56; // Integer | The schedules to retrieve by userId
        try {
            apiInstance.deleteCommunicationSchedulesByUserId(userId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#deleteCommunicationSchedulesByUserId");
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
| **userId** | **Integer**| The schedules to retrieve by userId | |

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


## getCommunicationSchedules

> GetCommunicationSchedules200Response getCommunicationSchedules(pageNumber, pageSize)

Get all communication schedules

requires schedule:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        Integer pageNumber = 0; // Integer | The page number to retrieve
        Integer pageSize = 50; // Integer | The number of items per page
        try {
            GetCommunicationSchedules200Response result = apiInstance.getCommunicationSchedules(pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#getCommunicationSchedules");
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
| **pageSize** | **Integer**| The number of items per page | [optional] [default to 50] |

### Return type

[**GetCommunicationSchedules200Response**](GetCommunicationSchedules200Response.md)

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


## getCommunicationSchedulesByGatewayId

> GetCommunicationSchedules200Response getCommunicationSchedulesByGatewayId(gatewayId, pageNumber, pageSize)

Get all communication schedules by gatewayId

requires schedule:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        Integer gatewayId = 56; // Integer | The schedules to retrieve by gatewayId
        Integer pageNumber = 0; // Integer | The page number to retrieve
        Integer pageSize = 50; // Integer | The number of items per page
        try {
            GetCommunicationSchedules200Response result = apiInstance.getCommunicationSchedulesByGatewayId(gatewayId, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#getCommunicationSchedulesByGatewayId");
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
| **gatewayId** | **Integer**| The schedules to retrieve by gatewayId | |
| **pageNumber** | **Integer**| The page number to retrieve | [optional] [default to 0] |
| **pageSize** | **Integer**| The number of items per page | [optional] [default to 50] |

### Return type

[**GetCommunicationSchedules200Response**](GetCommunicationSchedules200Response.md)

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


## getCommunicationSchedulesByScheduleId

> CommunicationSchedule getCommunicationSchedulesByScheduleId(scheduleId)

Get communication schedule by scheduleId

requires schedule:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        Integer scheduleId = 56; // Integer | The schedules to retrieve by scheduleId
        try {
            CommunicationSchedule result = apiInstance.getCommunicationSchedulesByScheduleId(scheduleId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#getCommunicationSchedulesByScheduleId");
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
| **scheduleId** | **Integer**| The schedules to retrieve by scheduleId | |

### Return type

[**CommunicationSchedule**](CommunicationSchedule.md)

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


## getCommunicationSchedulesByUserId

> GetCommunicationSchedules200Response getCommunicationSchedulesByUserId(userId, pageNumber, pageSize)

Get all communication schedules by userId

requires schedule:read scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        Integer userId = 56; // Integer | The schedules to retrieve by userId
        Integer pageNumber = 0; // Integer | The page number to retrieve
        Integer pageSize = 50; // Integer | The number of items per page
        try {
            GetCommunicationSchedules200Response result = apiInstance.getCommunicationSchedulesByUserId(userId, pageNumber, pageSize);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#getCommunicationSchedulesByUserId");
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
| **userId** | **Integer**| The schedules to retrieve by userId | |
| **pageNumber** | **Integer**| The page number to retrieve | [optional] [default to 0] |
| **pageSize** | **Integer**| The number of items per page | [optional] [default to 50] |

### Return type

[**GetCommunicationSchedules200Response**](GetCommunicationSchedules200Response.md)

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


## updateCommunicationSchedule

> CommunicationSchedule updateCommunicationSchedule(updateCommunicationScheduleRequest)

Updates an existing communication schedule

requires schedule:write scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        UpdateCommunicationScheduleRequest updateCommunicationScheduleRequest = new UpdateCommunicationScheduleRequest(); // UpdateCommunicationScheduleRequest | 
        try {
            CommunicationSchedule result = apiInstance.updateCommunicationSchedule(updateCommunicationScheduleRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#updateCommunicationSchedule");
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
| **updateCommunicationScheduleRequest** | [**UpdateCommunicationScheduleRequest**](UpdateCommunicationScheduleRequest.md)|  | [optional] |

### Return type

[**CommunicationSchedule**](CommunicationSchedule.md)

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
| **404** | Not Found |  -  |
| **409** | Conflict - already exists |  -  |


## updateCommunicationSchedulesByGatewayId

> CommunicationSchedule updateCommunicationSchedulesByGatewayId(updateCommunicationSchedulesByGatewayIdRequest)

Updates all communication schedules by gatewayId to the given request body

requires schedule:write scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        UpdateCommunicationSchedulesByGatewayIdRequest updateCommunicationSchedulesByGatewayIdRequest = new UpdateCommunicationSchedulesByGatewayIdRequest(); // UpdateCommunicationSchedulesByGatewayIdRequest | 
        try {
            CommunicationSchedule result = apiInstance.updateCommunicationSchedulesByGatewayId(updateCommunicationSchedulesByGatewayIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#updateCommunicationSchedulesByGatewayId");
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
| **updateCommunicationSchedulesByGatewayIdRequest** | [**UpdateCommunicationSchedulesByGatewayIdRequest**](UpdateCommunicationSchedulesByGatewayIdRequest.md)|  | [optional] |

### Return type

[**CommunicationSchedule**](CommunicationSchedule.md)

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
| **404** | Not Found |  -  |
| **409** | Conflict - already exists |  -  |


## updateCommunicationSchedulesByUserId

> CommunicationSchedule updateCommunicationSchedulesByUserId(updateCommunicationSchedulesByUserIdRequest)

Updates all communication schedules by userId to the given request body

requires schedule:write scope

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ScheduleApiApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000/v1");
        
        // Configure HTTP bearer authorization: bearerAuth
        HttpBearerAuth bearerAuth = (HttpBearerAuth) defaultClient.getAuthentication("bearerAuth");
        bearerAuth.setBearerToken("BEARER TOKEN");

        ScheduleApiApi apiInstance = new ScheduleApiApi(defaultClient);
        UpdateCommunicationSchedulesByUserIdRequest updateCommunicationSchedulesByUserIdRequest = new UpdateCommunicationSchedulesByUserIdRequest(); // UpdateCommunicationSchedulesByUserIdRequest | 
        try {
            CommunicationSchedule result = apiInstance.updateCommunicationSchedulesByUserId(updateCommunicationSchedulesByUserIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ScheduleApiApi#updateCommunicationSchedulesByUserId");
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
| **updateCommunicationSchedulesByUserIdRequest** | [**UpdateCommunicationSchedulesByUserIdRequest**](UpdateCommunicationSchedulesByUserIdRequest.md)|  | [optional] |

### Return type

[**CommunicationSchedule**](CommunicationSchedule.md)

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
| **404** | Not Found |  -  |
| **409** | Conflict - already exists |  -  |

