# EconomyApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**publicApiV1EconomyMyBalanceGet**](EconomyApi.md#publicApiV1EconomyMyBalanceGet) | **GET** /public-api/v1/economy/my-balance | Get My Balance |



## publicApiV1EconomyMyBalanceGet

> PublicApiV1EconomyMyBalanceGet200Response publicApiV1EconomyMyBalanceGet()

Get My Balance

Retrieve the balance of the authenticated user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.EconomyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        EconomyApi apiInstance = new EconomyApi(defaultClient);
        try {
            PublicApiV1EconomyMyBalanceGet200Response result = apiInstance.publicApiV1EconomyMyBalanceGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling EconomyApi#publicApiV1EconomyMyBalanceGet");
            System.err.println("Status code: " + e.getCode());
            System.err.println("Reason: " + e.getResponseBody());
            System.err.println("Response headers: " + e.getResponseHeaders());
            e.printStackTrace();
        }
    }
}
```

### Parameters

This endpoint does not need any parameter.

### Return type

[**PublicApiV1EconomyMyBalanceGet200Response**](PublicApiV1EconomyMyBalanceGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Not Logged In |  -  |

