# PaymentIntentsApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**patchPaymentIntent**](PaymentIntentsApi.md#patchPaymentIntent) | **PATCH** /payment-intents | Update a payment intent |
| [**postPaymentIntent**](PaymentIntentsApi.md#postPaymentIntent) | **POST** /payment-intents | Create a payment intent |



## patchPaymentIntent

> PostPaymentIntent200Response patchPaymentIntent(patchPaymentIntentRequest)

Update a payment intent

Updates a payment intent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentIntentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        PaymentIntentsApi apiInstance = new PaymentIntentsApi(defaultClient);
        PatchPaymentIntentRequest patchPaymentIntentRequest = new PatchPaymentIntentRequest(); // PatchPaymentIntentRequest | Updates the payment intent on Stripe.
        try {
            PostPaymentIntent200Response result = apiInstance.patchPaymentIntent(patchPaymentIntentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentIntentsApi#patchPaymentIntent");
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
| **patchPaymentIntentRequest** | [**PatchPaymentIntentRequest**](PatchPaymentIntentRequest.md)| Updates the payment intent on Stripe. | [optional] |

### Return type

[**PostPaymentIntent200Response**](PostPaymentIntent200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment intent updated. |  -  |


## postPaymentIntent

> PostPaymentIntent200Response postPaymentIntent(postPaymentIntentRequest)

Create a payment intent

Create a new payment intent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PaymentIntentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        PaymentIntentsApi apiInstance = new PaymentIntentsApi(defaultClient);
        PostPaymentIntentRequest postPaymentIntentRequest = new PostPaymentIntentRequest(); // PostPaymentIntentRequest | Creates a new payment intent on Stripe.
        try {
            PostPaymentIntent200Response result = apiInstance.postPaymentIntent(postPaymentIntentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PaymentIntentsApi#postPaymentIntent");
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
| **postPaymentIntentRequest** | [**PostPaymentIntentRequest**](PostPaymentIntentRequest.md)| Creates a new payment intent on Stripe. | [optional] |

### Return type

[**PostPaymentIntent200Response**](PostPaymentIntent200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Payment intent created. |  -  |

