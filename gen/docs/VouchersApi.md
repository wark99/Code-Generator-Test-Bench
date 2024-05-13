# VouchersApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**postVoucher**](VouchersApi.md#postVoucher) | **POST** /vouchers | Create a voucher |
| [**postVoucherCheck**](VouchersApi.md#postVoucherCheck) | **POST** /vouchers/check | Check a voucher |



## postVoucher

> PostVoucher200Response postVoucher(postVoucherRequest)

Create a voucher

Create a new voucher.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VouchersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        VouchersApi apiInstance = new VouchersApi(defaultClient);
        PostVoucherRequest postVoucherRequest = new PostVoucherRequest(); // PostVoucherRequest | Creates a new voucher.
        try {
            PostVoucher200Response result = apiInstance.postVoucher(postVoucherRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VouchersApi#postVoucher");
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
| **postVoucherRequest** | [**PostVoucherRequest**](PostVoucherRequest.md)| Creates a new voucher. | [optional] |

### Return type

[**PostVoucher200Response**](PostVoucher200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Voucher created. |  -  |


## postVoucherCheck

> PostVoucherCheck200Response postVoucherCheck(postVoucherCheckRequest)

Check a voucher

Check a voucher code.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VouchersApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        VouchersApi apiInstance = new VouchersApi(defaultClient);
        PostVoucherCheckRequest postVoucherCheckRequest = new PostVoucherCheckRequest(); // PostVoucherCheckRequest | Checks a voucher code exists.
        try {
            PostVoucherCheck200Response result = apiInstance.postVoucherCheck(postVoucherCheckRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VouchersApi#postVoucherCheck");
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
| **postVoucherCheckRequest** | [**PostVoucherCheckRequest**](PostVoucherCheckRequest.md)| Checks a voucher code exists. | [optional] |

### Return type

[**PostVoucherCheck200Response**](PostVoucherCheck200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a message relating to the status of the voucher. |  -  |

