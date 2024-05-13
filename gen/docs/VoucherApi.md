# VoucherApi

All URIs are relative to *https://api.demo.uniqrewards.com/v3*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**issueVouchers**](VoucherApi.md#issueVouchers) | **POST** /products/{code} | Issue vouchers |
| [**retrieveVoucher**](VoucherApi.md#retrieveVoucher) | **GET** /vouchers/{id} | Retrieve vouchers information |
| [**retrieveVouchers**](VoucherApi.md#retrieveVouchers) | **GET** /vouchers | Retrieve multiple vouchers information |



## issueVouchers

> IssueVouchers200Response issueVouchers(idempotencyKey, code, issueVouchersRequest)

Issue vouchers

Issue vouchers from the requested product identified by its code specified in the path.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoucherApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.demo.uniqrewards.com/v3");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        VoucherApi apiInstance = new VoucherApi(defaultClient);
        UUID idempotencyKey = UUID.randomUUID(); // UUID | The idempotency key in UUID v4 format to ensure issuing vouchers is idempotent.
        String code = "code_example"; // String | The product code of the product object to be retrieved.
        IssueVouchersRequest issueVouchersRequest = new IssueVouchersRequest(); // IssueVouchersRequest | Request parameters required to issue vouchers.
        try {
            IssueVouchers200Response result = apiInstance.issueVouchers(idempotencyKey, code, issueVouchersRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VoucherApi#issueVouchers");
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
| **idempotencyKey** | **UUID**| The idempotency key in UUID v4 format to ensure issuing vouchers is idempotent. | |
| **code** | **String**| The product code of the product object to be retrieved. | |
| **issueVouchersRequest** | [**IssueVouchersRequest**](IssueVouchersRequest.md)| Request parameters required to issue vouchers. | [optional] |

### Return type

[**IssueVouchers200Response**](IssueVouchers200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  * Idempotency-Record - This header is only provided in the response if obtained from the idempotency cache. <br>  |
| **500** |  |  -  |


## retrieveVoucher

> RetrieveVoucher200Response retrieveVoucher(id)

Retrieve vouchers information

Retrieve the information and updated status of 1 voucher.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoucherApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.demo.uniqrewards.com/v3");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        VoucherApi apiInstance = new VoucherApi(defaultClient);
        UUID id = UUID.randomUUID(); // UUID | The id of the voucher to be retrieved.
        try {
            RetrieveVoucher200Response result = apiInstance.retrieveVoucher(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VoucherApi#retrieveVoucher");
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
| **id** | **UUID**| The id of the voucher to be retrieved. | |

### Return type

[**RetrieveVoucher200Response**](RetrieveVoucher200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |


## retrieveVouchers

> RetrieveVouchers200Response retrieveVouchers(id)

Retrieve multiple vouchers information

Retrieve the details of multiple vouchers in a single request.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VoucherApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.demo.uniqrewards.com/v3");
        
        // Configure OAuth2 access token for authorization: Authorization
        OAuth Authorization = (OAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setAccessToken("YOUR ACCESS TOKEN");

        VoucherApi apiInstance = new VoucherApi(defaultClient);
        List<Object> id = Arrays.asList(null); // List<Object> | 
        try {
            RetrieveVouchers200Response result = apiInstance.retrieveVouchers(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VoucherApi#retrieveVouchers");
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
| **id** | [**List&lt;Object&gt;**](Object.md)|  | |

### Return type

[**RetrieveVouchers200Response**](RetrieveVouchers200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | OK |  -  |
| **404** |  |  -  |

