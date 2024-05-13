# CustomersApi

All URIs are relative to *https://x5-communications.wiremockapi.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addCustomer**](CustomersApi.md#addCustomer) | **POST** /customers | Добавление нового клиента |
| [**deleteCustomer**](CustomersApi.md#deleteCustomer) | **DELETE** /customers/{customerUuid} | Удаление клиента |
| [**getCustomer**](CustomersApi.md#getCustomer) | **GET** /customers/{customerUuid} | Информация о клиенте |
| [**getCustomers**](CustomersApi.md#getCustomers) | **GET** /customers | Список клиентов компании |
| [**updateCustomer**](CustomersApi.md#updateCustomer) | **PUT** /customers/{customerUuid} | Обновление информации о клиенте |



## addCustomer

> Customer addCustomer(customer)

Добавление нового клиента

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        Customer customer = new Customer(); // Customer | Данные нового клиента
        try {
            Customer result = apiInstance.addCustomer(customer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#addCustomer");
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
| **customer** | [**Customer**](Customer.md)| Данные нового клиента | [optional] |

### Return type

[**Customer**](Customer.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: application/json, application/xml
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## deleteCustomer

> deleteCustomer(customerUuid)

Удаление клиента

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        try {
            apiInstance.deleteCustomer(customerUuid);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#deleteCustomer");
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


## getCustomer

> Customer getCustomer(customerUuid)

Информация о клиенте

Информация о клиенте по его идентификатору

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        try {
            Customer result = apiInstance.getCustomer(customerUuid);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#getCustomer");
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

[**Customer**](Customer.md)

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


## getCustomers

> List&lt;Customer&gt; getCustomers(page, size)

Список клиентов компании

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        Integer page = 56; // Integer | Номер страницы (начиная с 1)
        Integer size = 56; // Integer | Размер страницы
        try {
            List<Customer> result = apiInstance.getCustomers(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#getCustomers");
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
| **page** | **Integer**| Номер страницы (начиная с 1) | [optional] |
| **size** | **Integer**| Размер страницы | [optional] |

### Return type

[**List&lt;Customer&gt;**](Customer.md)

### Authorization

[ApiKeyAuth](../README.md#ApiKeyAuth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |


## updateCustomer

> Customer updateCustomer(customerUuid, customer)

Обновление информации о клиенте

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CustomersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CustomersApi apiInstance = new CustomersApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Customer customer = new Customer(); // Customer | Данные клиента
        try {
            Customer result = apiInstance.updateCustomer(customerUuid, customer);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CustomersApi#updateCustomer");
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
| **customer** | [**Customer**](Customer.md)| Данные клиента | [optional] |

### Return type

[**Customer**](Customer.md)

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

