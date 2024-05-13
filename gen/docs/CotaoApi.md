# CotaoApi

All URIs are relative to *https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postQuotation**](CotaoApi.md#postQuotation) | **POST** /quotation | Efetua cotação de seguro |



## postQuotation

> QuotationResponse postQuotation(ocpApimSubscriptionKey, quotationRequest)

Efetua cotação de seguro

Efetua cotação de seguro

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CotaoApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://hostname-dev.sennatech.com.br/api/sddo/insurance/v1");

        CotaoApi apiInstance = new CotaoApi(defaultClient);
        String ocpApimSubscriptionKey = "ocpApimSubscriptionKey_example"; // String | Api-Key
        QuotationRequest quotationRequest = new QuotationRequest(); // QuotationRequest | 
        try {
            QuotationResponse result = apiInstance.postQuotation(ocpApimSubscriptionKey, quotationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CotaoApi#postQuotation");
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
| **quotationRequest** | [**QuotationRequest**](QuotationRequest.md)|  | [optional] |

### Return type

[**QuotationResponse**](QuotationResponse.md)

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

