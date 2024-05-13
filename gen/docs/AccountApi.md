# AccountApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**patchDetails**](AccountApi.md#patchDetails) | **PATCH** /account/details | Update details |
| [**patchEmergencyContact**](AccountApi.md#patchEmergencyContact) | **PATCH** /account/emergency-contact | Update emergency contact |
| [**patchMarketingConsent**](AccountApi.md#patchMarketingConsent) | **PATCH** /account/marketing-consent | Update marketing consent |
| [**patchPassword**](AccountApi.md#patchPassword) | **PATCH** /account/password | Update password |
| [**patchPhotoConsent**](AccountApi.md#patchPhotoConsent) | **PATCH** /account/photo-consent | Update photo consent |
| [**patchSessionReminders**](AccountApi.md#patchSessionReminders) | **PATCH** /account/session-reminders | Update session reminders |
| [**postAttachPaymentMethod**](AccountApi.md#postAttachPaymentMethod) | **POST** /account/attach-payment-method | Attach Payment Method |



## patchDetails

> Object patchDetails(patchDetailsRequest)

Update details

Update the account holders details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        PatchDetailsRequest patchDetailsRequest = new PatchDetailsRequest(); // PatchDetailsRequest | Updates the users account.
        try {
            Object result = apiInstance.patchDetails(patchDetailsRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#patchDetails");
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
| **patchDetailsRequest** | [**PatchDetailsRequest**](PatchDetailsRequest.md)| Updates the users account. | [optional] |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## patchEmergencyContact

> Object patchEmergencyContact(patchEmergencyContactRequest)

Update emergency contact

Update the account holders emergency contact.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        PatchEmergencyContactRequest patchEmergencyContactRequest = new PatchEmergencyContactRequest(); // PatchEmergencyContactRequest | Updates the users emergency contact.
        try {
            Object result = apiInstance.patchEmergencyContact(patchEmergencyContactRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#patchEmergencyContact");
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
| **patchEmergencyContactRequest** | [**PatchEmergencyContactRequest**](PatchEmergencyContactRequest.md)| Updates the users emergency contact. | [optional] |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## patchMarketingConsent

> patchMarketingConsent(patchMarketingConsentRequest)

Update marketing consent

Update the account holders marketing consent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        PatchMarketingConsentRequest patchMarketingConsentRequest = new PatchMarketingConsentRequest(); // PatchMarketingConsentRequest | Toggles the users marketing consent for a given organiser.
        try {
            apiInstance.patchMarketingConsent(patchMarketingConsentRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#patchMarketingConsent");
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
| **patchMarketingConsentRequest** | [**PatchMarketingConsentRequest**](PatchMarketingConsentRequest.md)| Toggles the users marketing consent for a given organiser. | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |


## patchPassword

> Object patchPassword(patchPasswordRequest)

Update password

Update the account password.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        PatchPasswordRequest patchPasswordRequest = new PatchPasswordRequest(); // PatchPasswordRequest | Updates the users password.
        try {
            Object result = apiInstance.patchPassword(patchPasswordRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#patchPassword");
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
| **patchPasswordRequest** | [**PatchPasswordRequest**](PatchPasswordRequest.md)| Updates the users password. | [optional] |

### Return type

**Object**

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** |  |  -  |


## patchPhotoConsent

> patchPhotoConsent(patchMarketingConsentRequest)

Update photo consent

Update the account holders photo consent.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        PatchMarketingConsentRequest patchMarketingConsentRequest = new PatchMarketingConsentRequest(); // PatchMarketingConsentRequest | Toggles the users photo consent for a given organiser.
        try {
            apiInstance.patchPhotoConsent(patchMarketingConsentRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#patchPhotoConsent");
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
| **patchMarketingConsentRequest** | [**PatchMarketingConsentRequest**](PatchMarketingConsentRequest.md)| Toggles the users photo consent for a given organiser. | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |


## patchSessionReminders

> patchSessionReminders(patchMarketingConsentRequest)

Update session reminders

Update the account holders session reminders.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        PatchMarketingConsentRequest patchMarketingConsentRequest = new PatchMarketingConsentRequest(); // PatchMarketingConsentRequest | Toggles the users session reminders setting for a given organiser.
        try {
            apiInstance.patchSessionReminders(patchMarketingConsentRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#patchSessionReminders");
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
| **patchMarketingConsentRequest** | [**PatchMarketingConsentRequest**](PatchMarketingConsentRequest.md)| Toggles the users session reminders setting for a given organiser. | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |


## postAttachPaymentMethod

> postAttachPaymentMethod(postAttachPaymentMethodRequest)

Attach Payment Method

Attach a payment method to the user.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AccountApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        AccountApi apiInstance = new AccountApi(defaultClient);
        PostAttachPaymentMethodRequest postAttachPaymentMethodRequest = new PostAttachPaymentMethodRequest(); // PostAttachPaymentMethodRequest | Attaches a new payment method to the authenticated user for a given organiser.
        try {
            apiInstance.postAttachPaymentMethod(postAttachPaymentMethodRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AccountApi#postAttachPaymentMethod");
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
| **postAttachPaymentMethodRequest** | [**PostAttachPaymentMethodRequest**](PostAttachPaymentMethodRequest.md)| Attaches a new payment method to the authenticated user for a given organiser. | [optional] |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | No content. |  -  |

