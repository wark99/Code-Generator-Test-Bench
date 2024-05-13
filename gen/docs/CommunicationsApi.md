# CommunicationsApi

All URIs are relative to *https://x5-communications.wiremockapi.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addComment**](CommunicationsApi.md#addComment) | **POST** /customers/{customerUuid}/topics/{topicId}/comments | Добавление нового комментария |
| [**addMessage**](CommunicationsApi.md#addMessage) | **POST** /customers/{customerUuid}/topics/{topicId}/messages | Добавление нового сообщения |
| [**addTopic**](CommunicationsApi.md#addTopic) | **POST** /customers/{customerUuid}/topics | Создание новой темы общения |
| [**deleteComment**](CommunicationsApi.md#deleteComment) | **DELETE** /customers/{customerUuid}/topics/{topicId}/comments/{commentId} | Удаление комментария |
| [**deleteTopic**](CommunicationsApi.md#deleteTopic) | **DELETE** /customers/{customerUuid}/topics/{topicId} | Удаление темы общения и всех сообщений по этой теме |
| [**getCustomerTopics**](CommunicationsApi.md#getCustomerTopics) | **GET** /customers/{customerUuid}/topics | Список тем общения с конкретным клиентом |
| [**getTopicComments**](CommunicationsApi.md#getTopicComments) | **GET** /customers/{customerUuid}/topics/{topicId}/comments | Список комментариев по теме |
| [**getTopicMessages**](CommunicationsApi.md#getTopicMessages) | **GET** /customers/{customerUuid}/topics/{topicId}/messages | Список сообщений по теме |
| [**updateComment**](CommunicationsApi.md#updateComment) | **PUT** /customers/{customerUuid}/topics/{topicId}/comments/{commentId} | Обновление комментария |
| [**updateTopic**](CommunicationsApi.md#updateTopic) | **PUT** /customers/{customerUuid}/topics/{topicId} | Обновление темы общения |



## addComment

> Comment addComment(comment)

Добавление нового комментария

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        Comment comment = new Comment(); // Comment | Данные нового комментария
        try {
            Comment result = apiInstance.addComment(comment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#addComment");
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
| **comment** | [**Comment**](Comment.md)| Данные нового комментария | [optional] |

### Return type

[**Comment**](Comment.md)

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


## addMessage

> Message addMessage(message)

Добавление нового сообщения

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        Message message = new Message(); // Message | Данные нового сообщения
        try {
            Message result = apiInstance.addMessage(message);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#addMessage");
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
| **message** | [**Message**](Message.md)| Данные нового сообщения | [optional] |

### Return type

[**Message**](Message.md)

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


## addTopic

> Topic addTopic(topic)

Создание новой темы общения

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        Topic topic = new Topic(); // Topic | Данные новой темы
        try {
            Topic result = apiInstance.addTopic(topic);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#addTopic");
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
| **topic** | [**Topic**](Topic.md)| Данные новой темы | [optional] |

### Return type

[**Topic**](Topic.md)

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


## deleteComment

> deleteComment(customerUuid, topicId, commentId)

Удаление комментария

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Long topicId = 56L; // Long | Идентификатор темы
        Long commentId = 56L; // Long | Идентификатор комментария
        try {
            apiInstance.deleteComment(customerUuid, topicId, commentId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#deleteComment");
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
| **topicId** | **Long**| Идентификатор темы | |
| **commentId** | **Long**| Идентификатор комментария | |

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


## deleteTopic

> deleteTopic(customerUuid, topicId)

Удаление темы общения и всех сообщений по этой теме

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Long topicId = 56L; // Long | Идентификатор темы
        try {
            apiInstance.deleteTopic(customerUuid, topicId);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#deleteTopic");
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
| **topicId** | **Long**| Идентификатор темы | |

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


## getCustomerTopics

> List&lt;Topic&gt; getCustomerTopics(customerUuid, channelId, fromDate, toDate, search, page, size)

Список тем общения с конкретным клиентом

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        String customerUuid = "customerUuid_example"; // String | 
        Long channelId = 56L; // Long | Фильтр по каналу коммуникации (опциональный)
        LocalDate fromDate = LocalDate.now(); // LocalDate | Фильтр по дате создания темы (включительно, опциональный)
        LocalDate toDate = LocalDate.now(); // LocalDate | 
        String search = "search_example"; // String | Поиск по теме и описанию
        Integer page = 56; // Integer | Номер страницы (начиная с 1)
        Integer size = 56; // Integer | Число элементов на странице
        try {
            List<Topic> result = apiInstance.getCustomerTopics(customerUuid, channelId, fromDate, toDate, search, page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#getCustomerTopics");
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
| **customerUuid** | **String**|  | |
| **channelId** | **Long**| Фильтр по каналу коммуникации (опциональный) | [optional] |
| **fromDate** | **LocalDate**| Фильтр по дате создания темы (включительно, опциональный) | [optional] |
| **toDate** | **LocalDate**|  | [optional] |
| **search** | **String**| Поиск по теме и описанию | [optional] |
| **page** | **Integer**| Номер страницы (начиная с 1) | [optional] |
| **size** | **Integer**| Число элементов на странице | [optional] |

### Return type

[**List&lt;Topic&gt;**](Topic.md)

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


## getTopicComments

> List&lt;Comment&gt; getTopicComments(customerUuid, topicId, page, size)

Список комментариев по теме

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Long topicId = 56L; // Long | Идентификатор темы
        Integer page = 56; // Integer | Номер страницы (начиная с 1)
        Integer size = 56; // Integer | Размер страницы
        try {
            List<Comment> result = apiInstance.getTopicComments(customerUuid, topicId, page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#getTopicComments");
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
| **topicId** | **Long**| Идентификатор темы | |
| **page** | **Integer**| Номер страницы (начиная с 1) | [optional] |
| **size** | **Integer**| Размер страницы | [optional] |

### Return type

[**List&lt;Comment&gt;**](Comment.md)

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


## getTopicMessages

> List&lt;Message&gt; getTopicMessages(customerUuid, topicId, page, size)

Список сообщений по теме

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Long topicId = 56L; // Long | Идентификатор темы
        Integer page = 56; // Integer | Номер страницы (начиная с 1)
        Integer size = 56; // Integer | Размер страницы
        try {
            List<Message> result = apiInstance.getTopicMessages(customerUuid, topicId, page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#getTopicMessages");
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
| **topicId** | **Long**| Идентификатор темы | |
| **page** | **Integer**| Номер страницы (начиная с 1) | [optional] |
| **size** | **Integer**| Размер страницы | [optional] |

### Return type

[**List&lt;Message&gt;**](Message.md)

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


## updateComment

> Comment updateComment(customerUuid, topicId, commentId, comment)

Обновление комментария

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Long topicId = 56L; // Long | Идентификатор темы
        Long commentId = 56L; // Long | Идентификатор комментария
        Comment comment = new Comment(); // Comment | Данные комментария
        try {
            Comment result = apiInstance.updateComment(customerUuid, topicId, commentId, comment);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#updateComment");
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
| **topicId** | **Long**| Идентификатор темы | |
| **commentId** | **Long**| Идентификатор комментария | |
| **comment** | [**Comment**](Comment.md)| Данные комментария | [optional] |

### Return type

[**Comment**](Comment.md)

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


## updateTopic

> Topic updateTopic(customerUuid, topicId, topic)

Обновление темы общения

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CommunicationsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://x5-communications.wiremockapi.cloud");
        
        // Configure API key authorization: ApiKeyAuth
        ApiKeyAuth ApiKeyAuth = (ApiKeyAuth) defaultClient.getAuthentication("ApiKeyAuth");
        ApiKeyAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //ApiKeyAuth.setApiKeyPrefix("Token");

        CommunicationsApi apiInstance = new CommunicationsApi(defaultClient);
        String customerUuid = "5387cef3-bb2e-4508-92a5-6d41d987c963"; // String | Идентификатор клиента
        Long topicId = 56L; // Long | Идентификатор темы
        Topic topic = new Topic(); // Topic | Данные темы
        try {
            Topic result = apiInstance.updateTopic(customerUuid, topicId, topic);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CommunicationsApi#updateTopic");
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
| **topicId** | **Long**| Идентификатор темы | |
| **topic** | [**Topic**](Topic.md)| Данные темы | [optional] |

### Return type

[**Topic**](Topic.md)

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

