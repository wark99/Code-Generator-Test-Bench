# CouponsApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getApplyCoupon**](CouponsApi.md#getApplyCoupon) | **GET** /coupons/apply | Apply coupon |



## getApplyCoupon

> GetApplyCoupon200Response getApplyCoupon(filterCode, filterClass)

Apply coupon

Retrieve a Discount or Voucher.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.CouponsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        CouponsApi apiInstance = new CouponsApi(defaultClient);
        String filterCode = "filterCode_example"; // String | Coupon code
        Integer filterClass = 56; // Integer | ID of the class
        try {
            GetApplyCoupon200Response result = apiInstance.getApplyCoupon(filterCode, filterClass);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling CouponsApi#getApplyCoupon");
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
| **filterCode** | **String**| Coupon code | |
| **filterClass** | **Integer**| ID of the class | |

### Return type

[**GetApplyCoupon200Response**](GetApplyCoupon200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Discount or Voucher object. |  -  |

