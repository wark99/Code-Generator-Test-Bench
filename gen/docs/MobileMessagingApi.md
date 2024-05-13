# MobileMessagingApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodMobileMessagingAddPhoneNumberPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingAddPhoneNumberPost) | **POST** /index.php?method&#x3D;MobileMessaging.addPhoneNumber |  |
| [**indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPost) | **POST** /index.php?method&#x3D;MobileMessaging.areSMSAPICredentialProvided |  |
| [**indexPhpmethodMobileMessagingDeleteSMSAPICredentialPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingDeleteSMSAPICredentialPost) | **POST** /index.php?method&#x3D;MobileMessaging.deleteSMSAPICredential |  |
| [**indexPhpmethodMobileMessagingGetCreditLeftPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingGetCreditLeftPost) | **POST** /index.php?method&#x3D;MobileMessaging.getCreditLeft |  |
| [**indexPhpmethodMobileMessagingGetDelegatedManagementPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingGetDelegatedManagementPost) | **POST** /index.php?method&#x3D;MobileMessaging.getDelegatedManagement |  |
| [**indexPhpmethodMobileMessagingGetSMSProviderPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingGetSMSProviderPost) | **POST** /index.php?method&#x3D;MobileMessaging.getSMSProvider |  |
| [**indexPhpmethodMobileMessagingRemovePhoneNumberPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingRemovePhoneNumberPost) | **POST** /index.php?method&#x3D;MobileMessaging.removePhoneNumber |  |
| [**indexPhpmethodMobileMessagingSetDelegatedManagementPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingSetDelegatedManagementPost) | **POST** /index.php?method&#x3D;MobileMessaging.setDelegatedManagement |  |
| [**indexPhpmethodMobileMessagingSetSMSAPICredentialPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingSetSMSAPICredentialPost) | **POST** /index.php?method&#x3D;MobileMessaging.setSMSAPICredential |  |
| [**indexPhpmethodMobileMessagingValidatePhoneNumberPost**](MobileMessagingApi.md#indexPhpmethodMobileMessagingValidatePhoneNumberPost) | **POST** /index.php?method&#x3D;MobileMessaging.validatePhoneNumber |  |



## indexPhpmethodMobileMessagingAddPhoneNumberPost

> indexPhpmethodMobileMessagingAddPhoneNumberPost(indexPhpMethodMobileMessagingAddPhoneNumberPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest indexPhpMethodMobileMessagingAddPhoneNumberPostRequest = new IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest(); // IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingAddPhoneNumberPost(indexPhpMethodMobileMessagingAddPhoneNumberPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingAddPhoneNumberPost");
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
| **indexPhpMethodMobileMessagingAddPhoneNumberPostRequest** | [**IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest**](IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPost

> indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingAreSMSAPICredentialProvidedPost");
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
| **indexPhpMethodAPIGetMatomoVersionPostRequest** | [**IndexPhpMethodAPIGetMatomoVersionPostRequest**](IndexPhpMethodAPIGetMatomoVersionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingDeleteSMSAPICredentialPost

> indexPhpmethodMobileMessagingDeleteSMSAPICredentialPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingDeleteSMSAPICredentialPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingDeleteSMSAPICredentialPost");
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
| **indexPhpMethodAPIGetMatomoVersionPostRequest** | [**IndexPhpMethodAPIGetMatomoVersionPostRequest**](IndexPhpMethodAPIGetMatomoVersionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingGetCreditLeftPost

> indexPhpmethodMobileMessagingGetCreditLeftPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingGetCreditLeftPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingGetCreditLeftPost");
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
| **indexPhpMethodAPIGetMatomoVersionPostRequest** | [**IndexPhpMethodAPIGetMatomoVersionPostRequest**](IndexPhpMethodAPIGetMatomoVersionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingGetDelegatedManagementPost

> indexPhpmethodMobileMessagingGetDelegatedManagementPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingGetDelegatedManagementPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingGetDelegatedManagementPost");
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
| **indexPhpMethodAPIGetMatomoVersionPostRequest** | [**IndexPhpMethodAPIGetMatomoVersionPostRequest**](IndexPhpMethodAPIGetMatomoVersionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingGetSMSProviderPost

> indexPhpmethodMobileMessagingGetSMSProviderPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingGetSMSProviderPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingGetSMSProviderPost");
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
| **indexPhpMethodAPIGetMatomoVersionPostRequest** | [**IndexPhpMethodAPIGetMatomoVersionPostRequest**](IndexPhpMethodAPIGetMatomoVersionPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingRemovePhoneNumberPost

> indexPhpmethodMobileMessagingRemovePhoneNumberPost(indexPhpMethodMobileMessagingAddPhoneNumberPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest indexPhpMethodMobileMessagingAddPhoneNumberPostRequest = new IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest(); // IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingRemovePhoneNumberPost(indexPhpMethodMobileMessagingAddPhoneNumberPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingRemovePhoneNumberPost");
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
| **indexPhpMethodMobileMessagingAddPhoneNumberPostRequest** | [**IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest**](IndexPhpMethodMobileMessagingAddPhoneNumberPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingSetDelegatedManagementPost

> indexPhpmethodMobileMessagingSetDelegatedManagementPost(indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodMobileMessagingSetDelegatedManagementPostRequest indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest = new IndexPhpMethodMobileMessagingSetDelegatedManagementPostRequest(); // IndexPhpMethodMobileMessagingSetDelegatedManagementPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingSetDelegatedManagementPost(indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingSetDelegatedManagementPost");
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
| **indexPhpMethodMobileMessagingSetDelegatedManagementPostRequest** | [**IndexPhpMethodMobileMessagingSetDelegatedManagementPostRequest**](IndexPhpMethodMobileMessagingSetDelegatedManagementPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingSetSMSAPICredentialPost

> indexPhpmethodMobileMessagingSetSMSAPICredentialPost(indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest = new IndexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest(); // IndexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingSetSMSAPICredentialPost(indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingSetSMSAPICredentialPost");
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
| **indexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest** | [**IndexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest**](IndexPhpMethodMobileMessagingSetSMSAPICredentialPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodMobileMessagingValidatePhoneNumberPost

> indexPhpmethodMobileMessagingValidatePhoneNumberPost(indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.MobileMessagingApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        MobileMessagingApi apiInstance = new MobileMessagingApi(defaultClient);
        IndexPhpMethodMobileMessagingValidatePhoneNumberPostRequest indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest = new IndexPhpMethodMobileMessagingValidatePhoneNumberPostRequest(); // IndexPhpMethodMobileMessagingValidatePhoneNumberPostRequest | 
        try {
            apiInstance.indexPhpmethodMobileMessagingValidatePhoneNumberPost(indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling MobileMessagingApi#indexPhpmethodMobileMessagingValidatePhoneNumberPost");
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
| **indexPhpMethodMobileMessagingValidatePhoneNumberPostRequest** | [**IndexPhpMethodMobileMessagingValidatePhoneNumberPostRequest**](IndexPhpMethodMobileMessagingValidatePhoneNumberPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


