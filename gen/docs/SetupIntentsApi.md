# SetupIntentsApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postSetupIntent**](SetupIntentsApi.md#postSetupIntent) | **POST** /setup-intents | Create a setup intent |



## postSetupIntent

> PostSetupIntent200Response postSetupIntent(postSetupIntentRequest)

Create a setup intent

Create a new setup intent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SetupIntentsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        SetupIntentsApi apiInstance = new SetupIntentsApi(defaultClient);
        PostSetupIntentRequest postSetupIntentRequest = new PostSetupIntentRequest(); // PostSetupIntentRequest | Creates a new setup intent on Stripe.
        try {
            PostSetupIntent200Response result = apiInstance.postSetupIntent(postSetupIntentRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SetupIntentsApi#postSetupIntent");
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
| **postSetupIntentRequest** | [**PostSetupIntentRequest**](PostSetupIntentRequest.md)| Creates a new setup intent on Stripe. | [optional] |

### Return type

[**PostSetupIntent200Response**](PostSetupIntent200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Setup intent created. |  -  |

