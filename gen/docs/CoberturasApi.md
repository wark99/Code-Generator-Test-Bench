# CoberturasApi

All URIs are relative to *https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteCoverages**](CoberturasApi.md#deleteCoverages) | **DELETE** /coverages/{code} | Remove coberturas existentes |
| [**getCoverages**](CoberturasApi.md#getCoverages) | **GET** /coverages | Consulta coberturas existentes |
| [**getCoveragesByPolicy**](CoberturasApi.md#getCoveragesByPolicy) | **GET** /coverages/{policy} | Consulta coberturas de uma apólice |
| [**postCoverages**](CoberturasApi.md#postCoverages) | **POST** /coverages | Cadastra coberturas novas |
| [**putCoverages**](CoberturasApi.md#putCoverages) | **PUT** /coverages/{code} | Atualiza coberturas existentes |



## deleteCoverages

> deleteCoverages(ocpApimSubscriptionKey, code)

Remove coberturas existentes

Remove coberturas existentes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoberturasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        CoberturasApi apiInstance = new CoberturasApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String code = "code_example"; // String | Código de cobertura
        try {
            apiInstance.deleteCoverages(ocpApimSubscriptionKey, code);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoberturasApi#deleteCoverages");
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
| **code** | **String**| Código de cobertura | |

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


## getCoverages

> List&lt;Coverage&gt; getCoverages(ocpApimSubscriptionKey)

Consulta coberturas existentes

Consulta coberturas existentes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoberturasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        CoberturasApi apiInstance = new CoberturasApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        try {
            List<Coverage> result = apiInstance.getCoverages(ocpApimSubscriptionKey);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoberturasApi#getCoverages");
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

[**List&lt;Coverage&gt;**](Coverage.md)

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


## getCoveragesByPolicy

> List&lt;Coverage&gt; getCoveragesByPolicy(ocpApimSubscriptionKey, policy)

Consulta coberturas de uma apólice

Consulta coberturas de uma apólice

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoberturasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        CoberturasApi apiInstance = new CoberturasApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String policy = "policy_example"; // String | Número e apólice
        try {
            List<Coverage> result = apiInstance.getCoveragesByPolicy(ocpApimSubscriptionKey, policy);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoberturasApi#getCoveragesByPolicy");
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
| **policy** | **String**| Número e apólice | |

### Return type

[**List&lt;Coverage&gt;**](Coverage.md)

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


## postCoverages

> postCoverages(ocpApimSubscriptionKey, coverageRequest)

Cadastra coberturas novas

Cadastra coberturas novas

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoberturasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        CoberturasApi apiInstance = new CoberturasApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        CoverageRequest coverageRequest = new CoverageRequest(); // CoverageRequest | 
        try {
            apiInstance.postCoverages(ocpApimSubscriptionKey, coverageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoberturasApi#postCoverages");
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
| **coverageRequest** | [**CoverageRequest**](CoverageRequest.md)|  | [optional] |

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


## putCoverages

> putCoverages(ocpApimSubscriptionKey, code, coverageRequest)

Atualiza coberturas existentes

Atualiza coberturas existentes

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CoberturasApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        CoberturasApi apiInstance = new CoberturasApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String code = "code_example"; // String | Código de cobertura
        CoverageRequest coverageRequest = new CoverageRequest(); // CoverageRequest | 
        try {
            apiInstance.putCoverages(ocpApimSubscriptionKey, code, coverageRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling CoberturasApi#putCoverages");
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
| **code** | **String**| Código de cobertura | |
| **coverageRequest** | [**CoverageRequest**](CoverageRequest.md)|  | [optional] |

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

