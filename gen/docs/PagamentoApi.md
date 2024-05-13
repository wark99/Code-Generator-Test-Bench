# PagamentoApi

All URIs are relative to *https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postPayment**](PagamentoApi.md#postPayment) | **POST** /payments | Efetua emissão de seguro |



## postPayment

> PaymentResponse postPayment(ocpApimSubscriptionKey, paymentRequest)

Efetua emissão de seguro

Efetua emissão de seguro

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PagamentoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        PagamentoApi apiInstance = new PagamentoApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        PaymentRequest paymentRequest = new PaymentRequest(); // PaymentRequest | 
        try {
            PaymentResponse result = apiInstance.postPayment(ocpApimSubscriptionKey, paymentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PagamentoApi#postPayment");
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
| **paymentRequest** | [**PaymentRequest**](PaymentRequest.md)|  | [optional] |

### Return type

[**PaymentResponse**](PaymentResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Created |  -  |
| **400** | Bad Request |  -  |
| **404** | Not Found |  -  |
| **500** | Internal Server error |  -  |

