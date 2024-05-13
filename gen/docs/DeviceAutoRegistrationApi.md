# DeviceAutoRegistrationApi

All URIs are relative to *http://geo-api.air-bit.ru:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addConfigAutoRegistrationConfigsPost**](DeviceAutoRegistrationApi.md#addConfigAutoRegistrationConfigsPost) | **POST** /auto-registration/configs/ | Saving device configuration on the IoT platform |
| [**addDeviceAutoRegistrationDevicesPost**](DeviceAutoRegistrationApi.md#addDeviceAutoRegistrationDevicesPost) | **POST** /auto-registration/devices/ | Adds device to the IoT platform |
| [**dataPushAutoRegistrationDataPushPost**](DeviceAutoRegistrationApi.md#dataPushAutoRegistrationDataPushPost) | **POST** /auto-registration/data/push/ | Sending device measurement data to the IoT platform |
| [**deviceLogAutoRegistrationDevicesLogPost**](DeviceAutoRegistrationApi.md#deviceLogAutoRegistrationDevicesLogPost) | **POST** /auto-registration/devices/log/ | Log device information |
| [**getConfigAutoRegistrationConfigsIdGet**](DeviceAutoRegistrationApi.md#getConfigAutoRegistrationConfigsIdGet) | **GET** /auto-registration/configs/{id}/ | Get a single device configuration |
| [**getConfigsAutoRegistrationConfigsGet**](DeviceAutoRegistrationApi.md#getConfigsAutoRegistrationConfigsGet) | **GET** /auto-registration/configs/ | Get a list of device configurations |
| [**getFirmwareAutoRegistrationFirmwaresIdGet**](DeviceAutoRegistrationApi.md#getFirmwareAutoRegistrationFirmwaresIdGet) | **GET** /auto-registration/firmwares/{id}/ | Get a firmware data |
| [**getFirmwaresAutoRegistrationFirmwaresGet**](DeviceAutoRegistrationApi.md#getFirmwaresAutoRegistrationFirmwaresGet) | **GET** /auto-registration/firmwares/ | Get a list of firmwares |
| [**updateConfigAutoRegistrationConfigsIdPut**](DeviceAutoRegistrationApi.md#updateConfigAutoRegistrationConfigsIdPut) | **PUT** /auto-registration/configs/{id}/ | Update device configuration on the IoT platform |



## addConfigAutoRegistrationConfigsPost

> ConfigScheme addConfigAutoRegistrationConfigsPost(configCreateScheme)

Saving device configuration on the IoT platform

Used to back up user configurations on the IoT platform for future use

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure HTTP basic authorization: HTTPBasic
        HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
        HTTPBasic.setUsername("YOUR USERNAME");
        HTTPBasic.setPassword("YOUR PASSWORD");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        ConfigCreateScheme configCreateScheme = new ConfigCreateScheme(); // ConfigCreateScheme | 
        try {
            ConfigScheme result = apiInstance.addConfigAutoRegistrationConfigsPost(configCreateScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#addConfigAutoRegistrationConfigsPost");
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
| **configCreateScheme** | [**ConfigCreateScheme**](ConfigCreateScheme.md)|  | |

### Return type

[**ConfigScheme**](ConfigScheme.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Successful Response |  -  |
| **403** | No access |  -  |
| **422** | Validation Error |  -  |


## addDeviceAutoRegistrationDevicesPost

> Object addDeviceAutoRegistrationDevicesPost(deviceNameScheme)

Adds device to the IoT platform

Used to add a device to the IoT platform for further use. Should only be used after at least one log operation has been successfully completed.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure HTTP basic authorization: HTTPBasic
        HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
        HTTPBasic.setUsername("YOUR USERNAME");
        HTTPBasic.setPassword("YOUR PASSWORD");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        DeviceNameScheme deviceNameScheme = new DeviceNameScheme(); // DeviceNameScheme | 
        try {
            Object result = apiInstance.addDeviceAutoRegistrationDevicesPost(deviceNameScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#addDeviceAutoRegistrationDevicesPost");
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
| **deviceNameScheme** | [**DeviceNameScheme**](DeviceNameScheme.md)|  | |

### Return type

**Object**

### Authorization

[HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | No access |  -  |
| **422** | Validation Error |  -  |


## dataPushAutoRegistrationDataPushPost

> Object dataPushAutoRegistrationDataPushPost(deviceDataScheme)

Sending device measurement data to the IoT platform

Used to send to the IoT platform measurements of accumulated by device for the period

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure HTTP basic authorization: HTTPBasic
        HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
        HTTPBasic.setUsername("YOUR USERNAME");
        HTTPBasic.setPassword("YOUR PASSWORD");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        DeviceDataScheme deviceDataScheme = new DeviceDataScheme(); // DeviceDataScheme | 
        try {
            Object result = apiInstance.dataPushAutoRegistrationDataPushPost(deviceDataScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#dataPushAutoRegistrationDataPushPost");
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
| **deviceDataScheme** | [**DeviceDataScheme**](DeviceDataScheme.md)|  | |

### Return type

**Object**

### Authorization

[HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | No access |  -  |
| **422** | Validation Error |  -  |


## deviceLogAutoRegistrationDevicesLogPost

> Object deviceLogAutoRegistrationDevicesLogPost(deviceInfoScheme)

Log device information

Used to periodically log device information. Sent automatically when the configuration software is connected to the device

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure API key authorization: APIKeyHeader
        ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
        APIKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //APIKeyHeader.setApiKeyPrefix("Token");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        DeviceInfoScheme deviceInfoScheme = new DeviceInfoScheme(); // DeviceInfoScheme | 
        try {
            Object result = apiInstance.deviceLogAutoRegistrationDevicesLogPost(deviceInfoScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#deviceLogAutoRegistrationDevicesLogPost");
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
| **deviceInfoScheme** | [**DeviceInfoScheme**](DeviceInfoScheme.md)|  | |

### Return type

**Object**

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | No access |  -  |
| **422** | Validation Error |  -  |


## getConfigAutoRegistrationConfigsIdGet

> ConfigScheme getConfigAutoRegistrationConfigsIdGet(id)

Get a single device configuration

Get a single device configuration saved on the IoT platform

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure HTTP basic authorization: HTTPBasic
        HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
        HTTPBasic.setUsername("YOUR USERNAME");
        HTTPBasic.setPassword("YOUR PASSWORD");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        Integer id = 56; // Integer | unique config id
        try {
            ConfigScheme result = apiInstance.getConfigAutoRegistrationConfigsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#getConfigAutoRegistrationConfigsIdGet");
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
| **id** | **Integer**| unique config id | |

### Return type

[**ConfigScheme**](ConfigScheme.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | No access |  -  |
| **404** | Config not found |  -  |
| **422** | Validation Error |  -  |


## getConfigsAutoRegistrationConfigsGet

> List&lt;ConfigScheme&gt; getConfigsAutoRegistrationConfigsGet(modelId, firmware, name)

Get a list of device configurations

Get a list of device configurations saved on the IoT platform

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure HTTP basic authorization: HTTPBasic
        HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
        HTTPBasic.setUsername("YOUR USERNAME");
        HTTPBasic.setPassword("YOUR PASSWORD");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        Integer modelId = 98; // Integer | device model identifier
        String firmware = "1.6"; // String | device firmware version
        String name = "config"; // String | the part of the device configuration name (search by name)
        try {
            List<ConfigScheme> result = apiInstance.getConfigsAutoRegistrationConfigsGet(modelId, firmware, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#getConfigsAutoRegistrationConfigsGet");
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
| **modelId** | **Integer**| device model identifier | |
| **firmware** | **String**| device firmware version | |
| **name** | **String**| the part of the device configuration name (search by name) | [optional] |

### Return type

[**List&lt;ConfigScheme&gt;**](ConfigScheme.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | No access |  -  |
| **422** | Validation Error |  -  |


## getFirmwareAutoRegistrationFirmwaresIdGet

> FirmwareScheme getFirmwareAutoRegistrationFirmwaresIdGet(id)

Get a firmware data

Get a firmware data available on the IoT platform

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure API key authorization: APIKeyHeader
        ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
        APIKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //APIKeyHeader.setApiKeyPrefix("Token");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        Integer id = 56; // Integer | unique firmware id
        try {
            FirmwareScheme result = apiInstance.getFirmwareAutoRegistrationFirmwaresIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#getFirmwareAutoRegistrationFirmwaresIdGet");
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
| **id** | **Integer**| unique firmware id | |

### Return type

[**FirmwareScheme**](FirmwareScheme.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | No access |  -  |
| **404** | Firmware not found |  -  |
| **422** | Validation Error |  -  |


## getFirmwaresAutoRegistrationFirmwaresGet

> List&lt;FirmwareScheme&gt; getFirmwaresAutoRegistrationFirmwaresGet(modelId, name)

Get a list of firmwares

Get a list of firmware available on the IoT platform

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure API key authorization: APIKeyHeader
        ApiKeyAuth APIKeyHeader = (ApiKeyAuth) defaultClient.getAuthentication("APIKeyHeader");
        APIKeyHeader.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //APIKeyHeader.setApiKeyPrefix("Token");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        Integer modelId = 98; // Integer | device model identifier
        String name = "pulse-14.05.01"; // String | the part of the firmware name (search by name)
        try {
            List<FirmwareScheme> result = apiInstance.getFirmwaresAutoRegistrationFirmwaresGet(modelId, name);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#getFirmwaresAutoRegistrationFirmwaresGet");
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
| **modelId** | **Integer**| device model identifier | |
| **name** | **String**| the part of the firmware name (search by name) | [optional] |

### Return type

[**List&lt;FirmwareScheme&gt;**](FirmwareScheme.md)

### Authorization

[APIKeyHeader](../README.md#APIKeyHeader)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | No access |  -  |
| **422** | Validation Error |  -  |


## updateConfigAutoRegistrationConfigsIdPut

> ConfigScheme updateConfigAutoRegistrationConfigsIdPut(id, configCreateScheme)

Update device configuration on the IoT platform

Used to back up user configurations on the IoT platform for future use

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DeviceAutoRegistrationApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://geo-api.air-bit.ru:8080");
        
        // Configure HTTP basic authorization: HTTPBasic
        HttpBasicAuth HTTPBasic = (HttpBasicAuth) defaultClient.getAuthentication("HTTPBasic");
        HTTPBasic.setUsername("YOUR USERNAME");
        HTTPBasic.setPassword("YOUR PASSWORD");

        DeviceAutoRegistrationApi apiInstance = new DeviceAutoRegistrationApi(defaultClient);
        Integer id = 56; // Integer | 
        ConfigCreateScheme configCreateScheme = new ConfigCreateScheme(); // ConfigCreateScheme | 
        try {
            ConfigScheme result = apiInstance.updateConfigAutoRegistrationConfigsIdPut(id, configCreateScheme);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DeviceAutoRegistrationApi#updateConfigAutoRegistrationConfigsIdPut");
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
| **configCreateScheme** | [**ConfigCreateScheme**](ConfigCreateScheme.md)|  | |

### Return type

[**ConfigScheme**](ConfigScheme.md)

### Authorization

[HTTPBasic](../README.md#HTTPBasic)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **403** | No access |  -  |
| **404** | Config not found |  -  |
| **422** | Validation Error |  -  |

