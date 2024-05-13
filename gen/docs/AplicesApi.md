# AplicesApi

All URIs are relative to *https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getPoliciesByDocumentNumber**](AplicesApi.md#getPoliciesByDocumentNumber) | **GET** /policies/{documentNumber} | Consulta de apólices por cliente |
| [**getPoliciesDetails**](AplicesApi.md#getPoliciesDetails) | **GET** /policies/{policyNumber} | Consulta de detalhes e apólice |



## getPoliciesByDocumentNumber

> List&lt;PolicyResponse&gt; getPoliciesByDocumentNumber(ocpApimSubscriptionKey, documentNumber)

Consulta de apólices por cliente

Consulta de apólices por cliente

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AplicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        AplicesApi apiInstance = new AplicesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String documentNumber = "documentNumber_example"; // String | Número de documento do usuário
        try {
            List<PolicyResponse> result = apiInstance.getPoliciesByDocumentNumber(ocpApimSubscriptionKey, documentNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AplicesApi#getPoliciesByDocumentNumber");
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

[**List&lt;PolicyResponse&gt;**](PolicyResponse.md)

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


## getPoliciesDetails

> PolicyDetailsResponse getPoliciesDetails(ocpApimSubscriptionKey, documentNumber)

Consulta de detalhes e apólice

Consulta de detalhes e apólice

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AplicesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        AplicesApi apiInstance = new AplicesApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        String documentNumber = "documentNumber_example"; // String | Número da apólice
        try {
            PolicyDetailsResponse result = apiInstance.getPoliciesDetails(ocpApimSubscriptionKey, documentNumber);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AplicesApi#getPoliciesDetails");
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
| **documentNumber** | **String**| Número da apólice | |

### Return type

[**PolicyDetailsResponse**](PolicyDetailsResponse.md)

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

