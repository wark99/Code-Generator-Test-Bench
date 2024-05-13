# CallsApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCalls**](CallsApi.md#addCalls) | **POST** /Calls | Add a new Calls to the Inventory Management System |
| [**deleteCalls**](CallsApi.md#deleteCalls) | **DELETE** /Calls/findById | Deletes a Call |
| [**findCallsById**](CallsApi.md#findCallsById) | **GET** /Calls/findById | Finds Calls by Id |
| [**updateCalls**](CallsApi.md#updateCalls) | **PUT** /Calls | Update an existing Calls |
| [**updateCallsById**](CallsApi.md#updateCallsById) | **PATCH** /Calls/findById | Update Calls by ID |



## addCalls

> List&lt;AddCallsRequestInner&gt; addCalls(addCallsRequestInner)

Add a new Calls to the Inventory Management System

Add a new Calls to the Inventory Management System

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        CallsApi apiInstance = new CallsApi(defaultClient);
        List<AddCallsRequestInner> addCallsRequestInner = Arrays.asList(); // List<AddCallsRequestInner> | Create a new Calls
        try {
            List<AddCallsRequestInner> result = apiInstance.addCalls(addCallsRequestInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallsApi#addCalls");
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
| **addCallsRequestInner** | [**List&lt;AddCallsRequestInner&gt;**](AddCallsRequestInner.md)| Create a new Calls | |

### Return type

[**List&lt;AddCallsRequestInner&gt;**](AddCallsRequestInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **405** | Invalid input |  -  |


## deleteCalls

> deleteCalls(apiKey)

Deletes a Call

delete a Call

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        CallsApi apiInstance = new CallsApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            apiInstance.deleteCalls(apiKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallsApi#deleteCalls");
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
| **apiKey** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid call value |  -  |


## findCallsById

> List&lt;AddCallsRequestInner&gt; findCallsById(id)

Finds Calls by Id

Multiple Calls values can be provided with comma separated strings

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        CallsApi apiInstance = new CallsApi(defaultClient);
        String id = "id_example"; // String | IDs values that need to be considered for filter
        try {
            List<AddCallsRequestInner> result = apiInstance.findCallsById(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallsApi#findCallsById");
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
| **id** | **String**| IDs values that need to be considered for filter | [optional] |

### Return type

[**List&lt;AddCallsRequestInner&gt;**](AddCallsRequestInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID value |  -  |
| **404** | Call not found |  -  |


## updateCalls

> List&lt;UpdateCallsRequestInner&gt; updateCalls(updateCallsRequestInner)

Update an existing Calls

Update an existing Calls by Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        CallsApi apiInstance = new CallsApi(defaultClient);
        List<UpdateCallsRequestInner> updateCallsRequestInner = Arrays.asList(); // List<UpdateCallsRequestInner> | Update an existent Calls in Inventory Management System
        try {
            List<UpdateCallsRequestInner> result = apiInstance.updateCalls(updateCallsRequestInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallsApi#updateCalls");
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
| **updateCallsRequestInner** | [**List&lt;UpdateCallsRequestInner&gt;**](UpdateCallsRequestInner.md)| Update an existent Calls in Inventory Management System | |

### Return type

[**List&lt;UpdateCallsRequestInner&gt;**](UpdateCallsRequestInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Calls not found |  -  |
| **405** | Validation exception |  -  |


## updateCallsById

> UpdateEmployeeById200Response updateCallsById(updateEmployeeByIdRequest)

Update Calls by ID

Updates specific fields of a Calls identified by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CallsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        CallsApi apiInstance = new CallsApi(defaultClient);
        UpdateEmployeeByIdRequest updateEmployeeByIdRequest = new UpdateEmployeeByIdRequest(); // UpdateEmployeeByIdRequest | 
        try {
            UpdateEmployeeById200Response result = apiInstance.updateCallsById(updateEmployeeByIdRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CallsApi#updateCallsById");
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
| **updateEmployeeByIdRequest** | [**UpdateEmployeeByIdRequest**](UpdateEmployeeByIdRequest.md)|  | |

### Return type

[**UpdateEmployeeById200Response**](UpdateEmployeeById200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully updated Calls |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Calls not found |  -  |

