# PasswordResetApi

All URIs are relative to *http://localhost:8080*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**forgotPasswordSendCodePost**](PasswordResetApi.md#forgotPasswordSendCodePost) | **POST** /forgot-password/send-code | verifies forgotten password email token |
| [**forgotPasswordSendEmailPost**](PasswordResetApi.md#forgotPasswordSendEmailPost) | **POST** /forgot-password/send-email | initiates forgotten password process |
| [**forgotPasswordSetNewPasswordPut**](PasswordResetApi.md#forgotPasswordSetNewPasswordPut) | **PUT** /forgot-password/set-new-password | Sets user new password |



## forgotPasswordSendCodePost

> ForgotPasswordSendCodePost200Response forgotPasswordSendCodePost(forgotPasswordSendCodePostRequest)

verifies forgotten password email token

After user clicks on the forgotten password email link. Token from email link should be sent to this endpoint to validate and trigger mfa code 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasswordResetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PasswordResetApi apiInstance = new PasswordResetApi(defaultClient);
        ForgotPasswordSendCodePostRequest forgotPasswordSendCodePostRequest = new ForgotPasswordSendCodePostRequest(); // ForgotPasswordSendCodePostRequest | 
        try {
            ForgotPasswordSendCodePost200Response result = apiInstance.forgotPasswordSendCodePost(forgotPasswordSendCodePostRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordResetApi#forgotPasswordSendCodePost");
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
| **forgotPasswordSendCodePostRequest** | [**ForgotPasswordSendCodePostRequest**](ForgotPasswordSendCodePostRequest.md)|  | [optional] |

### Return type

[**ForgotPasswordSendCodePost200Response**](ForgotPasswordSendCodePost200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | forgotten password email token valid |  -  |
| **400** | Unable to create profile. |  -  |
| **0** | Unexpected Error |  -  |


## forgotPasswordSendEmailPost

> forgotPasswordSendEmailPost(forgotPasswordSendEmailPostRequest)

initiates forgotten password process

This sends out the forgotten password email which is the beginning of forgot password process

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasswordResetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PasswordResetApi apiInstance = new PasswordResetApi(defaultClient);
        ForgotPasswordSendEmailPostRequest forgotPasswordSendEmailPostRequest = new ForgotPasswordSendEmailPostRequest(); // ForgotPasswordSendEmailPostRequest | 
        try {
            apiInstance.forgotPasswordSendEmailPost(forgotPasswordSendEmailPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordResetApi#forgotPasswordSendEmailPost");
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
| **forgotPasswordSendEmailPostRequest** | [**ForgotPasswordSendEmailPostRequest**](ForgotPasswordSendEmailPostRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Forgotten password initiated successfully. |  -  |
| **400** | Unable to create profile. |  -  |
| **0** | Unexpected Error |  -  |


## forgotPasswordSetNewPasswordPut

> forgotPasswordSetNewPasswordPut(forgotPasswordSetNewPasswordPutRequest)

Sets user new password

After user has verified their email token and gone through mfa authentication, this url allows them to set a new password for their account 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PasswordResetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8080");

        PasswordResetApi apiInstance = new PasswordResetApi(defaultClient);
        ForgotPasswordSetNewPasswordPutRequest forgotPasswordSetNewPasswordPutRequest = new ForgotPasswordSetNewPasswordPutRequest(); // ForgotPasswordSetNewPasswordPutRequest | 
        try {
            apiInstance.forgotPasswordSetNewPasswordPut(forgotPasswordSetNewPasswordPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PasswordResetApi#forgotPasswordSetNewPasswordPut");
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
| **forgotPasswordSetNewPasswordPutRequest** | [**ForgotPasswordSetNewPasswordPutRequest**](ForgotPasswordSetNewPasswordPutRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Password successfully reset |  -  |
| **400** | Unable to create profile. |  -  |
| **0** | Unexpected Error |  -  |

