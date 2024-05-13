# ClientesApi

All URIs are relative to *https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getCustomers**](ClientesApi.md#getCustomers) | **GET** /customers | Lista todos os clientes cadastrados |
| [**getCustomersByDocumentNumber**](ClientesApi.md#getCustomersByDocumentNumber) | **GET** /customers/{documentNumber} | Consulta detalhes de usuário por número de documento |
| [**getCustomersValidation**](ClientesApi.md#getCustomersValidation) | **GET** /customers-validation/{hash} | Valida acesso do cliente com base no usuário e senha criptografados |
| [**postCustomers**](ClientesApi.md#postCustomers) | **POST** /customers | Cadastra novo cliente |
| [**postCustomersPasswordRecovery**](ClientesApi.md#postCustomersPasswordRecovery) | **POST** /customers/password/recovery | Solicita recuperação de senha de usuário |
| [**putCustomerPassword**](ClientesApi.md#putCustomerPassword) | **PUT** /customers/password/{documentNumber} | Atualiza senha de cliente |
| [**putCustomers**](ClientesApi.md#putCustomers) | **PUT** /customers/{documentNumber} | Atualiza cliente |
| [**putCustomersPasswordHashValidation**](ClientesApi.md#putCustomersPasswordHashValidation) | **GET** /customers/password/hash-validation/{hash} | Efetua a validação do hash de recuperação de senha |
| [**putCustomersPasswordRecovery**](ClientesApi.md#putCustomersPasswordRecovery) | **PUT** /customers/password/recovery/{hash} | Efetua a atualização de senha por fluxo de recuperação |



## getCustomers

> List&lt;GetCustomerResponse&gt; getCustomers(ocpApimSubscriptionKey)

Lista todos os clientes cadastrados

Lista todos os usuários cadastrados

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        try {
            List<GetCustomerResponse> result = apiInstance.getCustomers(ocpApimSubscriptionKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#getCustomers");
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

[**List&lt;GetCustomerResponse&gt;**](GetCustomerResponse.md)

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


## getCustomersByDocumentNumber

> Customer getCustomersByDocumentNumber(ocpApimSubscriptionKey, documentNumber)

Consulta detalhes de usuário por número de documento

Consulta detalhes de usuário por número de documento

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String documentNumber = "documentNumber_example"; // String | Documento de identificação do cliente
        try {
            Customer result = apiInstance.getCustomersByDocumentNumber(ocpApimSubscriptionKey, documentNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#getCustomersByDocumentNumber");
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
| **documentNumber** | **String**| Documento de identificação do cliente | |

### Return type

[**Customer**](Customer.md)

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


## getCustomersValidation

> getCustomersValidation(ocpApimSubscriptionKey, hash)

Valida acesso do cliente com base no usuário e senha criptografados

Valida acesso do cliente com base no usuário e senha criptografados

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String hash = "hash_example"; // String | base64(user:pass)
        try {
            apiInstance.getCustomersValidation(ocpApimSubscriptionKey, hash);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#getCustomersValidation");
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


## postCustomers

> postCustomers(ocpApimSubscriptionKey, customer)

Cadastra novo cliente

Cadastra novo cliente

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        Customer customer = new Customer(); // Customer | Recebe um evento
        try {
            apiInstance.postCustomers(ocpApimSubscriptionKey, customer);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#postCustomers");
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
| **customer** | [**Customer**](Customer.md)| Recebe um evento | |

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


## postCustomersPasswordRecovery

> postCustomersPasswordRecovery(ocpApimSubscriptionKey, passwordRecovery)

Solicita recuperação de senha de usuário

Solicita recuperação de senha de usuário

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        PasswordRecovery passwordRecovery = new PasswordRecovery(); // PasswordRecovery | 
        try {
            apiInstance.postCustomersPasswordRecovery(ocpApimSubscriptionKey, passwordRecovery);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#postCustomersPasswordRecovery");
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


## putCustomerPassword

> putCustomerPassword(ocpApimSubscriptionKey, documentNumber, changePassword)

Atualiza senha de cliente

Atualiza senha de cliente

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String documentNumber = "documentNumber_example"; // String | Número de documento do cliente
        ChangePassword changePassword = new ChangePassword(); // ChangePassword | 
        try {
            apiInstance.putCustomerPassword(ocpApimSubscriptionKey, documentNumber, changePassword);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#putCustomerPassword");
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
| **documentNumber** | **String**| Número de documento do cliente | |
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


## putCustomers

> putCustomers(ocpApimSubscriptionKey, putCustomerRequest)

Atualiza cliente

Atualiza cliente

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        PutCustomerRequest putCustomerRequest = new PutCustomerRequest(); // PutCustomerRequest | Recebe um evento
        try {
            apiInstance.putCustomers(ocpApimSubscriptionKey, putCustomerRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#putCustomers");
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
| **putCustomerRequest** | [**PutCustomerRequest**](PutCustomerRequest.md)| Recebe um evento | |

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


## putCustomersPasswordHashValidation

> putCustomersPasswordHashValidation(ocpApimSubscriptionKey, ocpApimSubscriptionKey2)

Efetua a validação do hash de recuperação de senha

Efetua a validação do hash de recuperação de senha

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String ocpApimSubscriptionKey2 = "ocpApimSubscriptionKey_example"; // String | hash
        try {
            apiInstance.putCustomersPasswordHashValidation(ocpApimSubscriptionKey, ocpApimSubscriptionKey2);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#putCustomersPasswordHashValidation");
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


## putCustomersPasswordRecovery

> putCustomersPasswordRecovery(ocpApimSubscriptionKey, ocpApimSubscriptionKey2, updatePasswordRecovery)

Efetua a atualização de senha por fluxo de recuperação

Efetua a atualização de senha por fluxo de recuperação

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ClientesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        ClientesApi apiInstance = new ClientesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String ocpApimSubscriptionKey2 = "ocpApimSubscriptionKey_example"; // String | hash
        UpdatePasswordRecovery updatePasswordRecovery = new UpdatePasswordRecovery(); // UpdatePasswordRecovery | 
        try {
            apiInstance.putCustomersPasswordRecovery(ocpApimSubscriptionKey, ocpApimSubscriptionKey2, updatePasswordRecovery);
        } catch (ApiException e) {
            System.err.println("Exception when calling ClientesApi#putCustomersPasswordRecovery");
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

