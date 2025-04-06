# LoansApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**applyForALoanUsingPOST**](LoansApi.md#applyForALoanUsingPOST) | **POST** /loans | Apply for a loan |



## applyForALoanUsingPOST

> LoanResponse applyForALoanUsingPOST(loanRequest)

Apply for a loan

One loan application request supported in the body.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LoansApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        LoansApi apiInstance = new LoansApi(defaultClient);
        LoanRequest loanRequest = new LoanRequest(); // LoanRequest | loanRequest
        try {
            LoanResponse result = apiInstance.applyForALoanUsingPOST(loanRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LoansApi#applyForALoanUsingPOST");
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
| **loanRequest** | [**LoanRequest**](LoanRequest.md)| loanRequest | |

### Return type

[**LoanResponse**](LoanResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |

