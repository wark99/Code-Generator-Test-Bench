# DefaultApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**clientsAddDeviceGet**](DefaultApi.md#clientsAddDeviceGet) | **GET** /clients/add_device | add new device  |
| [**clientsListDevicesGet**](DefaultApi.md#clientsListDevicesGet) | **GET** /clients/list_devices | list devices |
| [**clientsLoginPost**](DefaultApi.md#clientsLoginPost) | **POST** /clients/login | client login |
| [**clientsStartSessionPost**](DefaultApi.md#clientsStartSessionPost) | **POST** /clients/start_session | start game session |



## clientsAddDeviceGet

> ClientsAddDeviceGet200Response clientsAddDeviceGet()

add new device 

add new device to client license using the generated code

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ClientsAddDeviceGet200Response result = apiInstance.clientsAddDeviceGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clientsAddDeviceGet");
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

[**ClientsAddDeviceGet200Response**](ClientsAddDeviceGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | the generated code |  -  |


## clientsListDevicesGet

> ClientsListDevicesGet200Response clientsListDevicesGet()

list devices

list all devices connected to client

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            ClientsListDevicesGet200Response result = apiInstance.clientsListDevicesGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clientsListDevicesGet");
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

[**ClientsListDevicesGet200Response**](ClientsListDevicesGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: array


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | devices list |  -  |


## clientsLoginPost

> ClientsLoginPost200Response clientsLoginPost(clientsLoginPostRequest)

client login

login using pocketbase auth with password and username

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ClientsLoginPostRequest clientsLoginPostRequest = new ClientsLoginPostRequest(); // ClientsLoginPostRequest | 
        try {
            ClientsLoginPost200Response result = apiInstance.clientsLoginPost(clientsLoginPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clientsLoginPost");
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
| **clientsLoginPostRequest** | [**ClientsLoginPostRequest**](ClientsLoginPostRequest.md)|  | |

### Return type

[**ClientsLoginPost200Response**](ClientsLoginPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | To test |  -  |


## clientsStartSessionPost

> ClientsLoginPost200Response clientsStartSessionPost(clientsStartSessionPostRequest)

start game session

start game session so the player can start the game from device

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:3000");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        ClientsStartSessionPostRequest clientsStartSessionPostRequest = new ClientsStartSessionPostRequest(); // ClientsStartSessionPostRequest | 
        try {
            ClientsLoginPost200Response result = apiInstance.clientsStartSessionPost(clientsStartSessionPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#clientsStartSessionPost");
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
| **clientsStartSessionPostRequest** | [**ClientsStartSessionPostRequest**](ClientsStartSessionPostRequest.md)|  | |

### Return type

[**ClientsLoginPost200Response**](ClientsLoginPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | To test |  -  |

