# DeviceApi

All URIs are relative to *http://geo-api.air-bit.ru:8081*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addDevice**](DeviceApi.md#addDevice) | **POST** /devices/ | Add device |
| [**deleteDevice**](DeviceApi.md#deleteDevice) | **DELETE** /devices/{id}/ | Delete device by id |
| [**getDevice**](DeviceApi.md#getDevice) | **GET** /devices/{id}/ | Get device by id |
| [**getDevices**](DeviceApi.md#getDevices) | **GET** /devices/ | Get a list of devices |
| [**updateDevice**](DeviceApi.md#updateDevice) | **PUT** /devices/{id}/ | Update device by id |



## addDevice

> DeviceScheme addDevice(createDeviceScheme)

Add device

Add device

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceApi apiInstance = new DeviceApi(defaultClient);
        CreateDeviceScheme createDeviceScheme = new CreateDeviceScheme(); // CreateDeviceScheme | 
        try {
            DeviceScheme result = apiInstance.addDevice(createDeviceScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceApi#addDevice");
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
| **createDeviceScheme** | [**CreateDeviceScheme**](CreateDeviceScheme.md)|  | |

### Return type

[**DeviceScheme**](DeviceScheme.md)

### Authorization

[AWSAuthenticator](../README.md#AWSAuthenticator)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **403** | Forbidden |  -  |
| **422** | Validation Error |  -  |


## deleteDevice

> deleteDevice(id)

Delete device by id

Delete device by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceApi apiInstance = new DeviceApi(defaultClient);
        Integer id = 56; // Integer | unique device id
        try {
            apiInstance.deleteDevice(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceApi#deleteDevice");
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
| **id** | **Integer**| unique device id | |

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


## getDevice

> DeviceScheme getDevice(id)

Get device by id

Get device by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceApi apiInstance = new DeviceApi(defaultClient);
        Integer id = 56; // Integer | unique device id
        try {
            DeviceScheme result = apiInstance.getDevice(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceApi#getDevice");
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
| **id** | **Integer**| unique device id | |

### Return type

[**DeviceScheme**](DeviceScheme.md)

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


## getDevices

> PageDeviceScheme getDevices(addrId, groupIds, status, text, perPage, page)

Get a list of devices

Get a list of devices

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceApi apiInstance = new DeviceApi(defaultClient);
        Integer addrId = 56; // Integer | unique address identifier
        List<Integer> groupIds = Arrays.asList(); // List<Integer> | list of unique group identifiers
        Status status = Status.fromValue("1"); // Status | Status:   * 1 - Inactive     * 2 - Active   
        String text = "text_example"; // String | text value for search by name
        Integer perPage = 1000; // Integer | 
        Integer page = 1; // Integer | 
        try {
            PageDeviceScheme result = apiInstance.getDevices(addrId, groupIds, status, text, perPage, page);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceApi#getDevices");
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
| **addrId** | **Integer**| unique address identifier | [optional] |
| **groupIds** | [**List&lt;Integer&gt;**](Integer.md)| list of unique group identifiers | [optional] |
| **status** | [**Status**](.md)| Status:   * 1 - Inactive     * 2 - Active    | [optional] [enum: 1, 2] |
| **text** | **String**| text value for search by name | [optional] |
| **perPage** | **Integer**|  | [optional] [default to 1000] |
| **page** | **Integer**|  | [optional] [default to 1] |

### Return type

[**PageDeviceScheme**](PageDeviceScheme.md)

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


## updateDevice

> DeviceScheme updateDevice(id, createDeviceScheme)

Update device by id

Update device by id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8081");
        
        // Configure HTTP basic authorization: AWSAuthenticator
        HttpBasicAuth AWSAuthenticator = (HttpBasicAuth) defaultClient.getAuthentication("AWSAuthenticator");
        AWSAuthenticator.setUsername("YOUR USERNAME");
        AWSAuthenticator.setPassword("YOUR PASSWORD");

        DeviceApi apiInstance = new DeviceApi(defaultClient);
        Integer id = 56; // Integer | 
        CreateDeviceScheme createDeviceScheme = new CreateDeviceScheme(); // CreateDeviceScheme | 
        try {
            DeviceScheme result = apiInstance.updateDevice(id, createDeviceScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceApi#updateDevice");
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
| **createDeviceScheme** | [**CreateDeviceScheme**](CreateDeviceScheme.md)|  | |

### Return type

[**DeviceScheme**](DeviceScheme.md)

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

