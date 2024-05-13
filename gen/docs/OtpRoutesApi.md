# OtpRoutesApi

All URIs are relative to *http://localhost:5001/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**sendEmailOtp**](OtpRoutesApi.md#sendEmailOtp) | **POST** /otp/send-email-otp | send-email-otp |
| [**sendSmsOtp**](OtpRoutesApi.md#sendSmsOtp) | **POST** /otp/send-sms-otp | send-sms-otp |
| [**verifyEmailOtp**](OtpRoutesApi.md#verifyEmailOtp) | **POST** /otp/verify-email-otp | verify-email-otp |
| [**verifySmsOtp**](OtpRoutesApi.md#verifySmsOtp) | **POST** /otp/verify-sms-otp | verify-sms-otp |



## sendEmailOtp

> sendEmailOtp(sendEmailOtpRequest)

send-email-otp

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OtpRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        OtpRoutesApi apiInstance = new OtpRoutesApi(defaultClient);
        SendEmailOtpRequest sendEmailOtpRequest = new SendEmailOtpRequest(); // SendEmailOtpRequest | 
        try {
            apiInstance.sendEmailOtp(sendEmailOtpRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OtpRoutesApi#sendEmailOtp");
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
| **sendEmailOtpRequest** | [**SendEmailOtpRequest**](SendEmailOtpRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## sendSmsOtp

> sendSmsOtp(sendSmsOtpRequest)

send-sms-otp

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OtpRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        OtpRoutesApi apiInstance = new OtpRoutesApi(defaultClient);
        SendSmsOtpRequest sendSmsOtpRequest = new SendSmsOtpRequest(); // SendSmsOtpRequest | 
        try {
            apiInstance.sendSmsOtp(sendSmsOtpRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OtpRoutesApi#sendSmsOtp");
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
| **sendSmsOtpRequest** | [**SendSmsOtpRequest**](SendSmsOtpRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## verifyEmailOtp

> verifyEmailOtp(verifyEmailOtpRequest)

verify-email-otp

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OtpRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        OtpRoutesApi apiInstance = new OtpRoutesApi(defaultClient);
        VerifyEmailOtpRequest verifyEmailOtpRequest = new VerifyEmailOtpRequest(); // VerifyEmailOtpRequest | 
        try {
            apiInstance.verifyEmailOtp(verifyEmailOtpRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OtpRoutesApi#verifyEmailOtp");
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
| **verifyEmailOtpRequest** | [**VerifyEmailOtpRequest**](VerifyEmailOtpRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## verifySmsOtp

> verifySmsOtp(verifySmsOtpRequest)

verify-sms-otp

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OtpRoutesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:5001/v1");

        OtpRoutesApi apiInstance = new OtpRoutesApi(defaultClient);
        VerifySmsOtpRequest verifySmsOtpRequest = new VerifySmsOtpRequest(); // VerifySmsOtpRequest | 
        try {
            apiInstance.verifySmsOtp(verifySmsOtpRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OtpRoutesApi#verifySmsOtp");
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
| **verifySmsOtpRequest** | [**VerifySmsOtpRequest**](VerifySmsOtpRequest.md)|  | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |

