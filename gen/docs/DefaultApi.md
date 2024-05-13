# DefaultApi

All URIs are relative to *http://localhost:3000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**devicesAutoConnectPost**](DefaultApi.md#devicesAutoConnectPost) | **POST** /devices/auto_connect | auto link device |
| [**devicesConnectPost**](DefaultApi.md#devicesConnectPost) | **POST** /devices/connect | link device |
| [**devicesStartGamePost**](DefaultApi.md#devicesStartGamePost) | **POST** /devices/start_game | start game |
| [**recordsAddPost**](DefaultApi.md#recordsAddPost) | **POST** /records/add | add playing recored |



## devicesAutoConnectPost

> DevicesConnectPost200Response devicesAutoConnectPost(devicesAutoConnectPostRequest)

auto link device

used to link new device to client license when the device is launche

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
        DevicesAutoConnectPostRequest devicesAutoConnectPostRequest = new DevicesAutoConnectPostRequest(); // DevicesAutoConnectPostRequest | 
        try {
            DevicesConnectPost200Response result = apiInstance.devicesAutoConnectPost(devicesAutoConnectPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#devicesAutoConnectPost");
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
| **devicesAutoConnectPostRequest** | [**DevicesAutoConnectPostRequest**](DevicesAutoConnectPostRequest.md)|  | |

### Return type

[**DevicesConnectPost200Response**](DevicesConnectPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | To test |  -  |


## devicesConnectPost

> DevicesConnectPost200Response devicesConnectPost(devicesConnectPostRequest)

link device

used to link new device to client license

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
        DevicesConnectPostRequest devicesConnectPostRequest = new DevicesConnectPostRequest(); // DevicesConnectPostRequest | 
        try {
            DevicesConnectPost200Response result = apiInstance.devicesConnectPost(devicesConnectPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#devicesConnectPost");
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
| **devicesConnectPostRequest** | [**DevicesConnectPostRequest**](DevicesConnectPostRequest.md)|  | |

### Return type

[**DevicesConnectPost200Response**](DevicesConnectPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | To test |  -  |


## devicesStartGamePost

> DevicesStartGamePost200Response devicesStartGamePost(devicesAutoConnectPostRequest)

start game

used to start the game after the client presses the start session button

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
        DevicesAutoConnectPostRequest devicesAutoConnectPostRequest = new DevicesAutoConnectPostRequest(); // DevicesAutoConnectPostRequest | 
        try {
            DevicesStartGamePost200Response result = apiInstance.devicesStartGamePost(devicesAutoConnectPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#devicesStartGamePost");
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
| **devicesAutoConnectPostRequest** | [**DevicesAutoConnectPostRequest**](DevicesAutoConnectPostRequest.md)|  | |

### Return type

[**DevicesStartGamePost200Response**](DevicesStartGamePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | To test |  -  |


## recordsAddPost

> RecordsAddPost200Response recordsAddPost(recordsAddPostRequest)

add playing recored

used after finishing the game to record the player results in the database

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
        RecordsAddPostRequest recordsAddPostRequest = new RecordsAddPostRequest(); // RecordsAddPostRequest | 
        try {
            RecordsAddPost200Response result = apiInstance.recordsAddPost(recordsAddPostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#recordsAddPost");
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
| **recordsAddPostRequest** | [**RecordsAddPostRequest**](RecordsAddPostRequest.md)|  | |

### Return type

[**RecordsAddPost200Response**](RecordsAddPost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | To test |  -  |

