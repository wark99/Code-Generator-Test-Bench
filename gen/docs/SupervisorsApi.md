# SupervisorsApi

All URIs are relative to *https://petstore3.swagger.io/api/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createSupervisorsWithListInput**](SupervisorsApi.md#createSupervisorsWithListInput) | **POST** /Supervisors/SupervisorbyID | Creates list of Supervisors with given input array |
| [**deleteSupervisors**](SupervisorsApi.md#deleteSupervisors) | **DELETE** /Supervisors/{username} | Deletes a Supervisors |
| [**getSupervisorsByUserName**](SupervisorsApi.md#getSupervisorsByUserName) | **GET** /Supervisors/{username} | Get Supervisors by user name |
| [**getsupervisorById**](SupervisorsApi.md#getsupervisorById) | **GET** /Supervisors/SupervisorbyID | Find supervisor by ID |
| [**updateSupervisors**](SupervisorsApi.md#updateSupervisors) | **PUT** /Supervisors/{username} | Update Supervisors |



## createSupervisorsWithListInput

> List&lt;CreateSupervisorsWithListInputRequestInner&gt; createSupervisorsWithListInput(createSupervisorsWithListInputRequestInner)

Creates list of Supervisors with given input array

Creates list of Supervisors with given input array

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupervisorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupervisorsApi apiInstance = new SupervisorsApi(defaultClient);
        List<CreateSupervisorsWithListInputRequestInner> createSupervisorsWithListInputRequestInner = Arrays.asList(); // List<CreateSupervisorsWithListInputRequestInner> | 
        try {
            List<CreateSupervisorsWithListInputRequestInner> result = apiInstance.createSupervisorsWithListInput(createSupervisorsWithListInputRequestInner);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisorsApi#createSupervisorsWithListInput");
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
| **createSupervisorsWithListInputRequestInner** | [**List&lt;CreateSupervisorsWithListInputRequestInner&gt;**](CreateSupervisorsWithListInputRequestInner.md)|  | [optional] |

### Return type

[**List&lt;CreateSupervisorsWithListInputRequestInner&gt;**](CreateSupervisorsWithListInputRequestInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **0** | successful operation |  -  |


## deleteSupervisors

> deleteSupervisors(apiKey)

Deletes a Supervisors

delete a Supervisors

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupervisorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupervisorsApi apiInstance = new SupervisorsApi(defaultClient);
        String apiKey = "apiKey_example"; // String | 
        try {
            apiInstance.deleteSupervisors(apiKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisorsApi#deleteSupervisors");
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
| **400** | Invalid pet value |  -  |


## getSupervisorsByUserName

> List&lt;CreateSupervisorsWithListInputRequestInner&gt; getSupervisorsByUserName(username)

Get Supervisors by user name



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupervisorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupervisorsApi apiInstance = new SupervisorsApi(defaultClient);
        String username = "username_example"; // String | The username that needs to be fetched. Use Supervisors1 for testing. 
        try {
            List<CreateSupervisorsWithListInputRequestInner> result = apiInstance.getSupervisorsByUserName(username);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisorsApi#getSupervisorsByUserName");
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
| **username** | **String**| The username that needs to be fetched. Use Supervisors1 for testing.  | |

### Return type

[**List&lt;CreateSupervisorsWithListInputRequestInner&gt;**](CreateSupervisorsWithListInputRequestInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid username supplied |  -  |
| **404** | UserName not found |  -  |


## getsupervisorById

> List&lt;GetsupervisorById200ResponseInner&gt; getsupervisorById()

Find supervisor by ID

Returns a single supervisor

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupervisorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupervisorsApi apiInstance = new SupervisorsApi(defaultClient);
        try {
            List<GetsupervisorById200ResponseInner> result = apiInstance.getsupervisorById();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisorsApi#getsupervisorById");
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

[**List&lt;GetsupervisorById200ResponseInner&gt;**](GetsupervisorById200ResponseInner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Supervisore not found |  -  |


## updateSupervisors

> updateSupervisors(username, createSupervisorsWithListInputRequestInner)

Update Supervisors

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SupervisorsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://petstore3.swagger.io/api/v3");

        SupervisorsApi apiInstance = new SupervisorsApi(defaultClient);
        String username = "username_example"; // String | username that need to be deleted
        List<CreateSupervisorsWithListInputRequestInner> createSupervisorsWithListInputRequestInner = Arrays.asList(); // List<CreateSupervisorsWithListInputRequestInner> | Update an existent Supervisors
        try {
            apiInstance.updateSupervisors(username, createSupervisorsWithListInputRequestInner);
        } catch (ApiException e) {
            System.err.println("Exception when calling SupervisorsApi#updateSupervisors");
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
| **username** | **String**| username that need to be deleted | |
| **createSupervisorsWithListInputRequestInner** | [**List&lt;CreateSupervisorsWithListInputRequestInner&gt;**](CreateSupervisorsWithListInputRequestInner.md)| Update an existent Supervisors | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **0** | successful operation |  -  |

