# DeviceNetIdTypesApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDeviceNetIdType**](DeviceNetIdTypesApi.md#addDeviceNetIdType) | **POST** /device-netid-types/ | Add device net id type |
| [**deleteDeviceNetIdType**](DeviceNetIdTypesApi.md#deleteDeviceNetIdType) | **DELETE** /device-netid-types/{id}/ | Delete device net id type by id |
| [**getDeviceNetIdType**](DeviceNetIdTypesApi.md#getDeviceNetIdType) | **GET** /device-netid-types/{id}/ | Get device net id type by id |
| [**getDeviceNetIdTypes**](DeviceNetIdTypesApi.md#getDeviceNetIdTypes) | **GET** /device-netid-types/ | Get a list of device net id types |
| [**updateDeviceNetIdType**](DeviceNetIdTypesApi.md#updateDeviceNetIdType) | **PUT** /device-netid-types/{id}/ | Update device net id type by id |



## addDeviceNetIdType

> DeviceNetIdTypeScheme addDeviceNetIdType(createDeviceNetIdTypeScheme)

Add device net id type

Add device net id type

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceNetIdTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceNetIdTypesApi apiInstance = new DeviceNetIdTypesApi(defaultClient);
        CreateDeviceNetIdTypeScheme createDeviceNetIdTypeScheme = new CreateDeviceNetIdTypeScheme(); // CreateDeviceNetIdTypeScheme | 
        try {
            DeviceNetIdTypeScheme result = apiInstance.addDeviceNetIdType(createDeviceNetIdTypeScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceNetIdTypesApi#addDeviceNetIdType");
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
| **createDeviceNetIdTypeScheme** | [**CreateDeviceNetIdTypeScheme**](CreateDeviceNetIdTypeScheme.md)|  | |

### Return type

[**DeviceNetIdTypeScheme**](DeviceNetIdTypeScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Error |  -  |


## deleteDeviceNetIdType

> deleteDeviceNetIdType(id)

Delete device net id type by id

Delete device net id type by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceNetIdTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceNetIdTypesApi apiInstance = new DeviceNetIdTypesApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            apiInstance.deleteDeviceNetIdType(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceNetIdTypesApi#deleteDeviceNetIdType");
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
| **id** | **Integer**|  | |

### Return type

null (empty response body)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |


## getDeviceNetIdType

> DeviceNetIdTypeScheme getDeviceNetIdType(id)

Get device net id type by id

Get device net id type by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceNetIdTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceNetIdTypesApi apiInstance = new DeviceNetIdTypesApi(defaultClient);
        Integer id = 56; // Integer | 
        try {
            DeviceNetIdTypeScheme result = apiInstance.getDeviceNetIdType(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceNetIdTypesApi#getDeviceNetIdType");
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
| **id** | **Integer**|  | |

### Return type

[**DeviceNetIdTypeScheme**](DeviceNetIdTypeScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |


## getDeviceNetIdTypes

> PageDeviceNetIdTypeScheme getDeviceNetIdTypes(status, text, perPage, page)

Get a list of device net id types

Get a list of device net id types

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceNetIdTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceNetIdTypesApi apiInstance = new DeviceNetIdTypesApi(defaultClient);
        Status status = Status.fromValue("1"); // Status | Status:   * 1 - Inactive     * 2 - Active   
        String text = "text_example"; // String | text value for search by name
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageDeviceNetIdTypeScheme result = apiInstance.getDeviceNetIdTypes(status, text, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceNetIdTypesApi#getDeviceNetIdTypes");
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
| **status** | [**Status**](.md)| Status:   * 1 - Inactive     * 2 - Active    | [optional] [enum: 1, 2] |
| **text** | **String**| text value for search by name | [optional] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageDeviceNetIdTypeScheme**](PageDeviceNetIdTypeScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Error |  -  |


## updateDeviceNetIdType

> DeviceNetIdTypeScheme updateDeviceNetIdType(id, createDeviceNetIdTypeScheme)

Update device net id type by id

Update device net id type by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceNetIdTypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceNetIdTypesApi apiInstance = new DeviceNetIdTypesApi(defaultClient);
        Integer id = 56; // Integer | 
        CreateDeviceNetIdTypeScheme createDeviceNetIdTypeScheme = new CreateDeviceNetIdTypeScheme(); // CreateDeviceNetIdTypeScheme | 
        try {
            DeviceNetIdTypeScheme result = apiInstance.updateDeviceNetIdType(id, createDeviceNetIdTypeScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceNetIdTypesApi#updateDeviceNetIdType");
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
| **id** | **Integer**|  | |
| **createDeviceNetIdTypeScheme** | [**CreateDeviceNetIdTypeScheme**](CreateDeviceNetIdTypeScheme.md)|  | |

### Return type

[**DeviceNetIdTypeScheme**](DeviceNetIdTypeScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **404** | Not Found |  -  |
| **422** | Validation Error |  -  |

