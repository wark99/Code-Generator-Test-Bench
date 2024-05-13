# DefaultApi

All URIs are relative to *https://virtserver.swaggerhub.com/laurourbano/APIusers/1.0.1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**usersDeleteCodigoExcluirDelete**](DefaultApi.md#usersDeleteCodigoExcluirDelete) | **DELETE** /users-delete/{codigo}/excluir | Exclui um User por código |
| [**usersEditCodigoAtualizarPut**](DefaultApi.md#usersEditCodigoAtualizarPut) | **PUT** /users-edit/{codigo}/atualizar | Atualiza um User por código |
| [**usersListCodigoGet**](DefaultApi.md#usersListCodigoGet) | **GET** /users-list/{codigo} | Retorna um user por código |
| [**usersListGet**](DefaultApi.md#usersListGet) | **GET** /users-list | Retorna todos os users |
| [**usersPostPost**](DefaultApi.md#usersPostPost) | **POST** /users-post | Cria um novo User |



## usersDeleteCodigoExcluirDelete

> usersDeleteCodigoExcluirDelete(codigo)

Exclui um User por código

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
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/laurourbano/APIusers/1.0.1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String codigo = "codigo_example"; // String | 
        try {
            apiInstance.usersDeleteCodigoExcluirDelete(codigo);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#usersDeleteCodigoExcluirDelete");
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
| **codigo** | **String**|  | |

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
| **204** | User excluído com sucesso |  -  |
| **404** | User não encontrado |  -  |


## usersEditCodigoAtualizarPut

> usersEditCodigoAtualizarPut(codigo, user)

Atualiza um User por código

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
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/laurourbano/APIusers/1.0.1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String codigo = "codigo_example"; // String | 
        User user = new User(); // User | 
        try {
            apiInstance.usersEditCodigoAtualizarPut(codigo, user);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#usersEditCodigoAtualizarPut");
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
| **codigo** | **String**|  | |
| **user** | [**User**](User.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | User atualizado com sucesso |  -  |
| **404** | User não encontrado |  -  |
| **400** | Dados inválidos |  -  |


## usersListCodigoGet

> usersListCodigoGet(codigo)

Retorna um user por código

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
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/laurourbano/APIusers/1.0.1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String codigo = "codigo_example"; // String | 
        try {
            apiInstance.usersListCodigoGet(codigo);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#usersListCodigoGet");
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
| **codigo** | **String**|  | |

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
| **200** | User encontrado |  -  |
| **404** | User não encontrado |  -  |


## usersListGet

> usersListGet()

Retorna todos os users

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
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/laurourbano/APIusers/1.0.1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        try {
            apiInstance.usersListGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#usersListGet");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Lista de users |  -  |


## usersPostPost

> usersPostPost(user)

Cria um novo User

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
        defaultClient.setBasePath("https://virtserver.swaggerhub.com/laurourbano/APIusers/1.0.1");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        User user = new User(); // User | 
        try {
            apiInstance.usersPostPost(user);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#usersPostPost");
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
| **user** | [**User**](User.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | User criado com sucesso |  -  |
| **400** | Dados inválidos |  -  |

