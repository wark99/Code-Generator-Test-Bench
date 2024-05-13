# ReferralsApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getReferrals**](ReferralsApi.md#getReferrals) | **GET** /referrals | List referrals |



## getReferrals

> GetActivities200Response getReferrals()

List referrals

Retrieve a list of referrals.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ReferralsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        ReferralsApi apiInstance = new ReferralsApi(defaultClient);
        try {
            GetActivities200Response result = apiInstance.getReferrals();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ReferralsApi#getReferrals");
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

[**GetActivities200Response**](GetActivities200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a list of referrals. |  -  |

