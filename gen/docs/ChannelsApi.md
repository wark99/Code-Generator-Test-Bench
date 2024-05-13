# ChannelsApi

All URIs are relative to *https://x5-communications.wiremockapi.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addChannel**](ChannelsApi.md#addChannel) | **POST** /channels | Добавление нового канала коммуникации |
| [**addCustomerChannel**](ChannelsApi.md#addCustomerChannel) | **POST** /customers/{customerUuid}/channels | Добавление нового канала коммуникации для клиента |
| [**deleteAllCustomerChannels**](ChannelsApi.md#deleteAllCustomerChannels) | **DELETE** /customers/{customerUuid}/channels | Удаление всех каналов коммуникации одного клиента |
| [**deleteChannel**](ChannelsApi.md#deleteChannel) | **DELETE** /channels/{channelId} | Удаление канала коммуникации |
| [**deleteCustomerChannel**](ChannelsApi.md#deleteCustomerChannel) | **DELETE** /customers/{customerUuid}/channels/{channelId} | Удаление канала коммуникации для клиента |
| [**getChannels**](ChannelsApi.md#getChannels) | **GET** /channels | Список каналов коммуникации, поддерживаемый сервисом |
| [**getCustomerChannels**](ChannelsApi.md#getCustomerChannels) | **GET** /customers/{customerUuid}/channels | Список всех каналов коммуникации одного клиента |
| [**updateChannel**](ChannelsApi.md#updateChannel) | **PUT** /channels/{channelId} | Обновление канала коммуникации |
| [**updateCustomerChannel**](ChannelsApi.md#updateCustomerChannel) | **PUT** /customers/{customerUuid}/channels/{channelId} | Обновление канала коммуникации для клиента |



## addChannel

> CommunicationChannel addChannel(communicationChannel)

Добавление нового канала коммуникации

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        CommunicationChannel communicationChannel = new CommunicationChannel(); // CommunicationChannel | Данные нового канала
        try {
            CommunicationChannel result = apiInstance.addChannel(communicationChannel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#addChannel");
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
| **communicationChannel** | [**CommunicationChannel**](CommunicationChannel.md)| Данные нового канала | [optional] |

### Return type

[**CommunicationChannel**](CommunicationChannel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **5XX** | Unexpected server error |  -  |


## addCustomerChannel

> CustomerChannel addCustomerChannel(customerUuid, customerChannel)

Добавление нового канала коммуникации для клиента

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        CustomerChannel customerChannel = new CustomerChannel(); // CustomerChannel | Данные нового канала
        try {
            CustomerChannel result = apiInstance.addCustomerChannel(customerUuid, customerChannel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#addCustomerChannel");
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
| **customerUuid** | **String**| Идентификатор клиента | |
| **customerChannel** | [**CustomerChannel**](CustomerChannel.md)| Данные нового канала | [optional] |

### Return type

[**CustomerChannel**](CustomerChannel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **5XX** | Unexpected server error |  -  |


## deleteAllCustomerChannels

> deleteAllCustomerChannels(customerUuid)

Удаление всех каналов коммуникации одного клиента

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        try {
            apiInstance.deleteAllCustomerChannels(customerUuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#deleteAllCustomerChannels");
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
| **customerUuid** | **String**| Идентификатор клиента | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **5XX** | Unexpected server error |  -  |


## deleteChannel

> deleteChannel(channelId)

Удаление канала коммуникации

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        Long channelId = 56L; // Long | Идентификатор канала
        try {
            apiInstance.deleteChannel(channelId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#deleteChannel");
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
| **channelId** | **Long**| Идентификатор канала | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **5XX** | Unexpected server error |  -  |


## deleteCustomerChannel

> deleteCustomerChannel(customerUuid, channelId)

Удаление канала коммуникации для клиента

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Long channelId = 56L; // Long | Идентификатор канала
        try {
            apiInstance.deleteCustomerChannel(customerUuid, channelId);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#deleteCustomerChannel");
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
| **customerUuid** | **String**| Идентификатор клиента | |
| **channelId** | **Long**| Идентификатор канала | |

### Return type

null (empty response body)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **5XX** | Unexpected server error |  -  |


## getChannels

> List&lt;CommunicationChannel&gt; getChannels()

Список каналов коммуникации, поддерживаемый сервисом

email, SMS, Push-уведомления и т.д.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        try {
            List<CommunicationChannel> result = apiInstance.getChannels();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getChannels");
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

[**List&lt;CommunicationChannel&gt;**](CommunicationChannel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **5XX** | Unexpected server error |  -  |


## getCustomerChannels

> List&lt;CustomerChannel&gt; getCustomerChannels(customerUuid)

Список всех каналов коммуникации одного клиента

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        try {
            List<CustomerChannel> result = apiInstance.getCustomerChannels(customerUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#getCustomerChannels");
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
| **customerUuid** | **String**| Идентификатор клиента | |

### Return type

[**List&lt;CustomerChannel&gt;**](CustomerChannel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **5XX** | Unexpected server error |  -  |


## updateChannel

> CommunicationChannel updateChannel(channelId, communicationChannel)

Обновление канала коммуникации

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        Long channelId = 56L; // Long | Идентификатор канала
        CommunicationChannel communicationChannel = new CommunicationChannel(); // CommunicationChannel | Данные канала
        try {
            CommunicationChannel result = apiInstance.updateChannel(channelId, communicationChannel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateChannel");
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
| **channelId** | **Long**| Идентификатор канала | |
| **communicationChannel** | [**CommunicationChannel**](CommunicationChannel.md)| Данные канала | [optional] |

### Return type

[**CommunicationChannel**](CommunicationChannel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **5XX** | Unexpected server error |  -  |


## updateCustomerChannel

> CustomerChannel updateCustomerChannel(customerUuid, channelId, customerChannel)

Обновление канала коммуникации для клиента

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ChannelsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        ChannelsApi apiInstance = new ChannelsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Long channelId = 56L; // Long | Идентификатор канала
        CustomerChannel customerChannel = new CustomerChannel(); // CustomerChannel | Данные канала
        try {
            CustomerChannel result = apiInstance.updateCustomerChannel(customerUuid, channelId, customerChannel);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ChannelsApi#updateCustomerChannel");
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
| **customerUuid** | **String**| Идентификатор клиента | |
| **channelId** | **Long**| Идентификатор канала | |
| **customerChannel** | [**CustomerChannel**](CustomerChannel.md)| Данные канала | [optional] |

### Return type

[**CustomerChannel**](CustomerChannel.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **400** | Bad Request |  -  |
| **401** | Unauthorized |  -  |
| **404** | Not Found |  -  |
| **5XX** | Unexpected server error |  -  |

