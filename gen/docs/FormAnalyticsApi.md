# FormAnalyticsApi

All URIs are relative to *https://demo.matomo.cloud*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**indexPhpmethodFormAnalyticsAddFormPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsAddFormPost) | **POST** /index.php?method&#x3D;FormAnalytics.addForm |  |
| [**indexPhpmethodFormAnalyticsArchiveFormPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsArchiveFormPost) | **POST** /index.php?method&#x3D;FormAnalytics.archiveForm |  |
| [**indexPhpmethodFormAnalyticsDeleteFormPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsDeleteFormPost) | **POST** /index.php?method&#x3D;FormAnalytics.deleteForm |  |
| [**indexPhpmethodFormAnalyticsGetAutoCreationSettingsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetAutoCreationSettingsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getAutoCreationSettings |  |
| [**indexPhpmethodFormAnalyticsGetAvailableConversionRuleOptionsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetAvailableConversionRuleOptionsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getAvailableConversionRuleOptions |  |
| [**indexPhpmethodFormAnalyticsGetAvailableFormRulesPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetAvailableFormRulesPost) | **POST** /index.php?method&#x3D;FormAnalytics.getAvailableFormRules |  |
| [**indexPhpmethodFormAnalyticsGetAvailablePageRulesPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetAvailablePageRulesPost) | **POST** /index.php?method&#x3D;FormAnalytics.getAvailablePageRules |  |
| [**indexPhpmethodFormAnalyticsGetAvailableStatusesPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetAvailableStatusesPost) | **POST** /index.php?method&#x3D;FormAnalytics.getAvailableStatuses |  |
| [**indexPhpmethodFormAnalyticsGetCountersPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetCountersPost) | **POST** /index.php?method&#x3D;FormAnalytics.getCounters |  |
| [**indexPhpmethodFormAnalyticsGetCurrentMostPopularFormsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetCurrentMostPopularFormsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getCurrentMostPopularForms |  |
| [**indexPhpmethodFormAnalyticsGetDropOffFieldsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetDropOffFieldsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getDropOffFields |  |
| [**indexPhpmethodFormAnalyticsGetEntryFieldsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetEntryFieldsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getEntryFields |  |
| [**indexPhpmethodFormAnalyticsGetFieldCorrectionsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetFieldCorrectionsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getFieldCorrections |  |
| [**indexPhpmethodFormAnalyticsGetFieldSizePost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetFieldSizePost) | **POST** /index.php?method&#x3D;FormAnalytics.getFieldSize |  |
| [**indexPhpmethodFormAnalyticsGetFieldTimingsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetFieldTimingsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getFieldTimings |  |
| [**indexPhpmethodFormAnalyticsGetFormPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetFormPost) | **POST** /index.php?method&#x3D;FormAnalytics.getForm |  |
| [**indexPhpmethodFormAnalyticsGetFormsByStatusesPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetFormsByStatusesPost) | **POST** /index.php?method&#x3D;FormAnalytics.getFormsByStatuses |  |
| [**indexPhpmethodFormAnalyticsGetFormsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetFormsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getForms |  |
| [**indexPhpmethodFormAnalyticsGetMostUsedFieldsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetMostUsedFieldsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getMostUsedFields |  |
| [**indexPhpmethodFormAnalyticsGetPageUrlsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetPageUrlsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getPageUrls |  |
| [**indexPhpmethodFormAnalyticsGetPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetPost) | **POST** /index.php?method&#x3D;FormAnalytics.get |  |
| [**indexPhpmethodFormAnalyticsGetUneededFieldsPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsGetUneededFieldsPost) | **POST** /index.php?method&#x3D;FormAnalytics.getUneededFields |  |
| [**indexPhpmethodFormAnalyticsUpdateFormFieldDisplayNamePost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsUpdateFormFieldDisplayNamePost) | **POST** /index.php?method&#x3D;FormAnalytics.updateFormFieldDisplayName |  |
| [**indexPhpmethodFormAnalyticsUpdateFormPost**](FormAnalyticsApi.md#indexPhpmethodFormAnalyticsUpdateFormPost) | **POST** /index.php?method&#x3D;FormAnalytics.updateForm |  |



## indexPhpmethodFormAnalyticsAddFormPost

> indexPhpmethodFormAnalyticsAddFormPost(indexPhpMethodFormAnalyticsAddFormPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsAddFormPostRequest indexPhpMethodFormAnalyticsAddFormPostRequest = new IndexPhpMethodFormAnalyticsAddFormPostRequest(); // IndexPhpMethodFormAnalyticsAddFormPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsAddFormPost(indexPhpMethodFormAnalyticsAddFormPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsAddFormPost");
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
| **indexPhpMethodFormAnalyticsAddFormPostRequest** | [**IndexPhpMethodFormAnalyticsAddFormPostRequest**](IndexPhpMethodFormAnalyticsAddFormPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsArchiveFormPost

> indexPhpmethodFormAnalyticsArchiveFormPost(indexPhpMethodFormAnalyticsGetFormPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetFormPostRequest indexPhpMethodFormAnalyticsGetFormPostRequest = new IndexPhpMethodFormAnalyticsGetFormPostRequest(); // IndexPhpMethodFormAnalyticsGetFormPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsArchiveFormPost(indexPhpMethodFormAnalyticsGetFormPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsArchiveFormPost");
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
| **indexPhpMethodFormAnalyticsGetFormPostRequest** | [**IndexPhpMethodFormAnalyticsGetFormPostRequest**](IndexPhpMethodFormAnalyticsGetFormPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsDeleteFormPost

> indexPhpmethodFormAnalyticsDeleteFormPost(indexPhpMethodFormAnalyticsGetFormPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetFormPostRequest indexPhpMethodFormAnalyticsGetFormPostRequest = new IndexPhpMethodFormAnalyticsGetFormPostRequest(); // IndexPhpMethodFormAnalyticsGetFormPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsDeleteFormPost(indexPhpMethodFormAnalyticsGetFormPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsDeleteFormPost");
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
| **indexPhpMethodFormAnalyticsGetFormPostRequest** | [**IndexPhpMethodFormAnalyticsGetFormPostRequest**](IndexPhpMethodFormAnalyticsGetFormPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetAutoCreationSettingsPost

> indexPhpmethodFormAnalyticsGetAutoCreationSettingsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetAutoCreationSettingsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetAutoCreationSettingsPost");
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
| **indexPhpMethodAPIGetReportPagesMetadataPostRequest** | [**IndexPhpMethodAPIGetReportPagesMetadataPostRequest**](IndexPhpMethodAPIGetReportPagesMetadataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetAvailableConversionRuleOptionsPost

> indexPhpmethodFormAnalyticsGetAvailableConversionRuleOptionsPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetAvailableConversionRuleOptionsPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetAvailableConversionRuleOptionsPost");
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



## indexPhpmethodFormAnalyticsGetAvailableFormRulesPost

> indexPhpmethodFormAnalyticsGetAvailableFormRulesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetAvailableFormRulesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetAvailableFormRulesPost");
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



## indexPhpmethodFormAnalyticsGetAvailablePageRulesPost

> indexPhpmethodFormAnalyticsGetAvailablePageRulesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetAvailablePageRulesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetAvailablePageRulesPost");
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



## indexPhpmethodFormAnalyticsGetAvailableStatusesPost

> indexPhpmethodFormAnalyticsGetAvailableStatusesPost(indexPhpMethodAPIGetMatomoVersionPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodAPIGetMatomoVersionPostRequest indexPhpMethodAPIGetMatomoVersionPostRequest = new IndexPhpMethodAPIGetMatomoVersionPostRequest(); // IndexPhpMethodAPIGetMatomoVersionPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetAvailableStatusesPost(indexPhpMethodAPIGetMatomoVersionPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetAvailableStatusesPost");
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



## indexPhpmethodFormAnalyticsGetCountersPost

> indexPhpmethodFormAnalyticsGetCountersPost(indexPhpMethodFormAnalyticsGetCountersPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetCountersPostRequest indexPhpMethodFormAnalyticsGetCountersPostRequest = new IndexPhpMethodFormAnalyticsGetCountersPostRequest(); // IndexPhpMethodFormAnalyticsGetCountersPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetCountersPost(indexPhpMethodFormAnalyticsGetCountersPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetCountersPost");
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
| **indexPhpMethodFormAnalyticsGetCountersPostRequest** | [**IndexPhpMethodFormAnalyticsGetCountersPostRequest**](IndexPhpMethodFormAnalyticsGetCountersPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetCurrentMostPopularFormsPost

> indexPhpmethodFormAnalyticsGetCurrentMostPopularFormsPost(indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest = new IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest(); // IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetCurrentMostPopularFormsPost(indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetCurrentMostPopularFormsPost");
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
| **indexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest** | [**IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest**](IndexPhpMethodFormAnalyticsGetCurrentMostPopularFormsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetDropOffFieldsPost

> indexPhpmethodFormAnalyticsGetDropOffFieldsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest = new IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest(); // IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetDropOffFieldsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetDropOffFieldsPost");
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
| **indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest** | [**IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest**](IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetEntryFieldsPost

> indexPhpmethodFormAnalyticsGetEntryFieldsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest = new IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest(); // IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetEntryFieldsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetEntryFieldsPost");
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
| **indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest** | [**IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest**](IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetFieldCorrectionsPost

> indexPhpmethodFormAnalyticsGetFieldCorrectionsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest = new IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest(); // IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetFieldCorrectionsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetFieldCorrectionsPost");
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
| **indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest** | [**IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest**](IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetFieldSizePost

> indexPhpmethodFormAnalyticsGetFieldSizePost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest = new IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest(); // IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetFieldSizePost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetFieldSizePost");
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
| **indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest** | [**IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest**](IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetFieldTimingsPost

> indexPhpmethodFormAnalyticsGetFieldTimingsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest = new IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest(); // IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetFieldTimingsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetFieldTimingsPost");
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
| **indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest** | [**IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest**](IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetFormPost

> indexPhpmethodFormAnalyticsGetFormPost(indexPhpMethodFormAnalyticsGetFormPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetFormPostRequest indexPhpMethodFormAnalyticsGetFormPostRequest = new IndexPhpMethodFormAnalyticsGetFormPostRequest(); // IndexPhpMethodFormAnalyticsGetFormPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetFormPost(indexPhpMethodFormAnalyticsGetFormPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetFormPost");
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
| **indexPhpMethodFormAnalyticsGetFormPostRequest** | [**IndexPhpMethodFormAnalyticsGetFormPostRequest**](IndexPhpMethodFormAnalyticsGetFormPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetFormsByStatusesPost

> indexPhpmethodFormAnalyticsGetFormsByStatusesPost(indexPhpMethodAbTestingGetExperimentsByStatusesPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest indexPhpMethodAbTestingGetExperimentsByStatusesPostRequest = new IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest(); // IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetFormsByStatusesPost(indexPhpMethodAbTestingGetExperimentsByStatusesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetFormsByStatusesPost");
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
| **indexPhpMethodAbTestingGetExperimentsByStatusesPostRequest** | [**IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest**](IndexPhpMethodAbTestingGetExperimentsByStatusesPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetFormsPost

> indexPhpmethodFormAnalyticsGetFormsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodAPIGetReportPagesMetadataPostRequest indexPhpMethodAPIGetReportPagesMetadataPostRequest = new IndexPhpMethodAPIGetReportPagesMetadataPostRequest(); // IndexPhpMethodAPIGetReportPagesMetadataPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetFormsPost(indexPhpMethodAPIGetReportPagesMetadataPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetFormsPost");
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
| **indexPhpMethodAPIGetReportPagesMetadataPostRequest** | [**IndexPhpMethodAPIGetReportPagesMetadataPostRequest**](IndexPhpMethodAPIGetReportPagesMetadataPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetMostUsedFieldsPost

> indexPhpmethodFormAnalyticsGetMostUsedFieldsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest = new IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest(); // IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetMostUsedFieldsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetMostUsedFieldsPost");
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
| **indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest** | [**IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest**](IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetPageUrlsPost

> indexPhpmethodFormAnalyticsGetPageUrlsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest = new IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest(); // IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetPageUrlsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetPageUrlsPost");
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
| **indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest** | [**IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest**](IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetPost

> indexPhpmethodFormAnalyticsGetPost(indexPhpMethodFormAnalyticsGetPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetPostRequest indexPhpMethodFormAnalyticsGetPostRequest = new IndexPhpMethodFormAnalyticsGetPostRequest(); // IndexPhpMethodFormAnalyticsGetPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetPost(indexPhpMethodFormAnalyticsGetPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetPost");
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
| **indexPhpMethodFormAnalyticsGetPostRequest** | [**IndexPhpMethodFormAnalyticsGetPostRequest**](IndexPhpMethodFormAnalyticsGetPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsGetUneededFieldsPost

> indexPhpmethodFormAnalyticsGetUneededFieldsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest = new IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest(); // IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsGetUneededFieldsPost(indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsGetUneededFieldsPost");
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
| **indexPhpMethodFormAnalyticsGetEntryFieldsPostRequest** | [**IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest**](IndexPhpMethodFormAnalyticsGetEntryFieldsPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsUpdateFormFieldDisplayNamePost

> indexPhpmethodFormAnalyticsUpdateFormFieldDisplayNamePost(indexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest indexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest = new IndexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest(); // IndexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsUpdateFormFieldDisplayNamePost(indexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsUpdateFormFieldDisplayNamePost");
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
| **indexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest** | [**IndexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest**](IndexPhpMethodFormAnalyticsUpdateFormFieldDisplayNamePostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined



## indexPhpmethodFormAnalyticsUpdateFormPost

> indexPhpmethodFormAnalyticsUpdateFormPost(indexPhpMethodFormAnalyticsUpdateFormPostRequest)



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormAnalyticsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://demo.matomo.cloud");
        
        // Configure API key authorization: TokenAuth
        ApiKeyAuth TokenAuth = (ApiKeyAuth) defaultClient.getAuthentication("TokenAuth");
        TokenAuth.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //TokenAuth.setApiKeyPrefix("Token");

        FormAnalyticsApi apiInstance = new FormAnalyticsApi(defaultClient);
        IndexPhpMethodFormAnalyticsUpdateFormPostRequest indexPhpMethodFormAnalyticsUpdateFormPostRequest = new IndexPhpMethodFormAnalyticsUpdateFormPostRequest(); // IndexPhpMethodFormAnalyticsUpdateFormPostRequest | 
        try {
            apiInstance.indexPhpmethodFormAnalyticsUpdateFormPost(indexPhpMethodFormAnalyticsUpdateFormPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormAnalyticsApi#indexPhpmethodFormAnalyticsUpdateFormPost");
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
| **indexPhpMethodFormAnalyticsUpdateFormPostRequest** | [**IndexPhpMethodFormAnalyticsUpdateFormPostRequest**](IndexPhpMethodFormAnalyticsUpdateFormPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

[TokenAuth](../README.md#TokenAuth)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


