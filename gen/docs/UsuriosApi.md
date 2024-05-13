# UsuriosApi

All URIs are relative to *https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteUsers**](UsuriosApi.md#deleteUsers) | **DELETE** /users/{documentNumber} | Remove usuários |
| [**getUsers**](UsuriosApi.md#getUsers) | **GET** /users | Lista todos os usuários cadastrados |
| [**getUsersByEmail**](UsuriosApi.md#getUsersByEmail) | **GET** /users/{documentNumber} | Consulta detalhes de usuário por e-mail |
| [**getUsersValidation**](UsuriosApi.md#getUsersValidation) | **GET** /users-validation/{hash} | Valida acesso do cliente com base no usuário e senha criptografados |
| [**postUserPasswordRecovery**](UsuriosApi.md#postUserPasswordRecovery) | **POST** /users/password/recovery | Solicita recuperação de senha de usuário |
| [**postUsers**](UsuriosApi.md#postUsers) | **POST** /users | Cadastra novo usuário |
| [**putUserPassword**](UsuriosApi.md#putUserPassword) | **PUT** /users/password/{documentNumber} | Atualiza senha de usuário |
| [**putUserPasswordHashValidation**](UsuriosApi.md#putUserPasswordHashValidation) | **GET** /users/password/hash-validation/{hash} | Efetua a validação do hash de recuperação de senha |
| [**putUserPasswordRecovery**](UsuriosApi.md#putUserPasswordRecovery) | **PUT** /users/password/recovery/{hash} | Efetua a atualização de senha por fluxo de recuperação |
| [**putUsers**](UsuriosApi.md#putUsers) | **PUT** /users/{documentNumber} | Atualiza usuário |



## deleteUsers

> deleteUsers(ocpApimSubscriptionKey, documentNumber)

Remove usuários

remove usuário

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String documentNumber = "documentNumber_example"; // String | Número de documento do usuário
        try {
            apiInstance.deleteUsers(ocpApimSubscriptionKey, documentNumber);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#deleteUsers");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **documentNumber** | **String**| Número de documento do usuário | |

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
| **204** | No content |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## getUsers

> List&lt;GetUserResponse&gt; getUsers(ocpApimSubscriptionKey)

Lista todos os usuários cadastrados

Lista todos os usuários cadastrados

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        try {
            List<GetUserResponse> result = apiInstance.getUsers(ocpApimSubscriptionKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#getUsers");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |

### Return type

[**List&lt;GetUserResponse&gt;**](GetUserResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## getUsersByEmail

> User getUsersByEmail(ocpApimSubscriptionKey, documentNumber)

Consulta detalhes de usuário por e-mail

Consulta detalhes de usuário por e-mail

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String documentNumber = "documentNumber_example"; // String | Número de documento do usuário
        try {
            User result = apiInstance.getUsersByEmail(ocpApimSubscriptionKey, documentNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#getUsersByEmail");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **documentNumber** | **String**| Número de documento do usuário | |

### Return type

[**User**](User.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Ok |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## getUsersValidation

> getUsersValidation(ocpApimSubscriptionKey, hash)

Valida acesso do cliente com base no usuário e senha criptografados

Valida acesso do cliente com base no usuário e senha criptografados

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String hash = "hash_example"; // String | base64(user:pass)
        try {
            apiInstance.getUsersValidation(ocpApimSubscriptionKey, hash);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#getUsersValidation");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **hash** | **String**| base64(user:pass) | |

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
| **200** | Ok |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## postUserPasswordRecovery

> postUserPasswordRecovery(ocpApimSubscriptionKey, passwordRecovery)

Solicita recuperação de senha de usuário

Solicita recuperação de senha de usuário

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        PasswordRecovery passwordRecovery = new PasswordRecovery(); // PasswordRecovery | 
        try {
            apiInstance.postUserPasswordRecovery(ocpApimSubscriptionKey, passwordRecovery);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#postUserPasswordRecovery");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **passwordRecovery** | [**PasswordRecovery**](PasswordRecovery.md)|  | |

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## postUsers

> postUsers(ocpApimSubscriptionKey, user)

Cadastra novo usuário

Cadastra novo usuário

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        User user = new User(); // User | Recebe um evento
        try {
            apiInstance.postUsers(ocpApimSubscriptionKey, user);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#postUsers");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **user** | [**User**](User.md)| Recebe um evento | |

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
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## putUserPassword

> putUserPassword(ocpApimSubscriptionKey, documentNumber, changePassword)

Atualiza senha de usuário

Atualiza senha de usuário

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String documentNumber = "documentNumber_example"; // String | Número de documento do usuário
        ChangePassword changePassword = new ChangePassword(); // ChangePassword | 
        try {
            apiInstance.putUserPassword(ocpApimSubscriptionKey, documentNumber, changePassword);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#putUserPassword");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **documentNumber** | **String**| Número de documento do usuário | |
| **changePassword** | [**ChangePassword**](ChangePassword.md)|  | |

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
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## putUserPasswordHashValidation

> putUserPasswordHashValidation(ocpApimSubscriptionKey, ocpApimSubscriptionKey2)

Efetua a validação do hash de recuperação de senha

Efetua a validação do hash de recuperação de senha

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String ocpApimSubscriptionKey2 = "ocpApimSubscriptionKey_example"; // String | hash
        try {
            apiInstance.putUserPasswordHashValidation(ocpApimSubscriptionKey, ocpApimSubscriptionKey2);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#putUserPasswordHashValidation");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **ocpApimSubscriptionKey2** | **String**| hash | |

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
| **200** | Ok |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## putUserPasswordRecovery

> putUserPasswordRecovery(ocpApimSubscriptionKey, ocpApimSubscriptionKey2, updatePasswordRecovery)

Efetua a atualização de senha por fluxo de recuperação

Efetua a atualização de senha por fluxo de recuperação

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String ocpApimSubscriptionKey2 = "ocpApimSubscriptionKey_example"; // String | hash
        UpdatePasswordRecovery updatePasswordRecovery = new UpdatePasswordRecovery(); // UpdatePasswordRecovery | 
        try {
            apiInstance.putUserPasswordRecovery(ocpApimSubscriptionKey, ocpApimSubscriptionKey2, updatePasswordRecovery);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#putUserPasswordRecovery");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **ocpApimSubscriptionKey2** | **String**| hash | |
| **updatePasswordRecovery** | [**UpdatePasswordRecovery**](UpdatePasswordRecovery.md)|  | |

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
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |


## putUsers

> putUsers(ocpApimSubscriptionKey, documentNumber, user)

Atualiza usuário

Atualiza usuário

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.UsuriosApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        UsuriosApi apiInstance = new UsuriosApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String documentNumber = "documentNumber_example"; // String | Número de documento do usuário
        User user = new User(); // User | Recebe um evento
        try {
            apiInstance.putUsers(ocpApimSubscriptionKey, documentNumber, user);
        } catch (ApiException e) {
            System.err.println("Exception when calling UsuriosApi#putUsers");
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
| **ocpApimSubscriptionKey** | **String**| Api-Key | |
| **documentNumber** | **String**| Número de documento do usuário | |
| **user** | [**User**](User.md)| Recebe um evento | |

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
| **202** | Accepted |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

