# DefaultApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createNewAccountCreateAccountPost**](DefaultApi.md#createNewAccountCreateAccountPost) | **POST** /create-account/ | Create New Account |
| [**deleteAccountInformationPatientIdAccountInfoDelete**](DefaultApi.md#deleteAccountInformationPatientIdAccountInfoDelete) | **DELETE** /{patient_id}/account-info/ | Delete Account Information |
| [**deleteTriagePatientIdTriagesTriageIdDelete**](DefaultApi.md#deleteTriagePatientIdTriagesTriageIdDelete) | **DELETE** /{patient_id}/triages/{triage_id} | Delete Triage |
| [**deleteUserHealthInfoPatientIdHealthInfoDelete**](DefaultApi.md#deleteUserHealthInfoPatientIdHealthInfoDelete) | **DELETE** /{patient_id}/health-info/ | Delete User Health Info |
| [**getSpecificTriagePatientIdTriagesTriageIdGet**](DefaultApi.md#getSpecificTriagePatientIdTriagesTriageIdGet) | **GET** /{patient_id}/triages/{triage_id} | Get Specific Triage |
| [**getTriageListPatientIdTriagesGet**](DefaultApi.md#getTriageListPatientIdTriagesGet) | **GET** /{patient_id}/triages/ | Get Triage List |
| [**getUserHealthInfoPatientIdGet**](DefaultApi.md#getUserHealthInfoPatientIdGet) | **GET** /{patient_id}/ | Get User Health Info |
| [**updateAccountInformationPatientIdAccountInfoPut**](DefaultApi.md#updateAccountInformationPatientIdAccountInfoPut) | **PUT** /{patient_id}/account-info/ | Update Account Information |
| [**updateTriagePatientIdTriagesTriageIdPut**](DefaultApi.md#updateTriagePatientIdTriagesTriageIdPut) | **PUT** /{patient_id}/triages/{triage_id} | Update Triage |
| [**updateUserHealthInfoPatientIdHealthInfoPut**](DefaultApi.md#updateUserHealthInfoPatientIdHealthInfoPut) | **PUT** /{patient_id}/health-info/ | Update User Health Info |
| [**userValidationLoginPost**](DefaultApi.md#userValidationLoginPost) | **POST** /login/ | User Validation |



## createNewAccountCreateAccountPost

> AccountCreationResponse createNewAccountCreateAccountPost(accountCreationRequest)

Create New Account

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        AccountCreationRequest accountCreationRequest = new AccountCreationRequest(); // AccountCreationRequest | 
        try {
            AccountCreationResponse result = apiInstance.createNewAccountCreateAccountPost(accountCreationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#createNewAccountCreateAccountPost");
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
| **accountCreationRequest** | [**AccountCreationRequest**](AccountCreationRequest.md)|  | |

### Return type

[**AccountCreationResponse**](AccountCreationResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteAccountInformationPatientIdAccountInfoDelete

> ResponseMessage deleteAccountInformationPatientIdAccountInfoDelete(patientId)

Delete Account Information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String patientId = "patientId_example"; // String | 
        try {
            ResponseMessage result = apiInstance.deleteAccountInformationPatientIdAccountInfoDelete(patientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteAccountInformationPatientIdAccountInfoDelete");
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
| **patientId** | **String**|  | |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteTriagePatientIdTriagesTriageIdDelete

> ResponseMessage deleteTriagePatientIdTriagesTriageIdDelete(patientId, triageId)

Delete Triage

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String patientId = "patientId_example"; // String | 
        String triageId = "triageId_example"; // String | 
        try {
            ResponseMessage result = apiInstance.deleteTriagePatientIdTriagesTriageIdDelete(patientId, triageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteTriagePatientIdTriagesTriageIdDelete");
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
| **patientId** | **String**|  | |
| **triageId** | **String**|  | |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## deleteUserHealthInfoPatientIdHealthInfoDelete

> ResponseMessage deleteUserHealthInfoPatientIdHealthInfoDelete(patientId)

Delete User Health Info

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String patientId = "patientId_example"; // String | 
        try {
            ResponseMessage result = apiInstance.deleteUserHealthInfoPatientIdHealthInfoDelete(patientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#deleteUserHealthInfoPatientIdHealthInfoDelete");
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
| **patientId** | **String**|  | |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getSpecificTriagePatientIdTriagesTriageIdGet

> TriageDetailResponse getSpecificTriagePatientIdTriagesTriageIdGet(patientId, triageId)

Get Specific Triage

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Object patientId = null; // Object | 
        Object triageId = null; // Object | 
        try {
            TriageDetailResponse result = apiInstance.getSpecificTriagePatientIdTriagesTriageIdGet(patientId, triageId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getSpecificTriagePatientIdTriagesTriageIdGet");
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
| **patientId** | [**Object**](.md)|  | |
| **triageId** | [**Object**](.md)|  | |

### Return type

[**TriageDetailResponse**](TriageDetailResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getTriageListPatientIdTriagesGet

> TriageListResponse getTriageListPatientIdTriagesGet(patientId)

Get Triage List

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Object patientId = null; // Object | 
        try {
            TriageListResponse result = apiInstance.getTriageListPatientIdTriagesGet(patientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getTriageListPatientIdTriagesGet");
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
| **patientId** | [**Object**](.md)|  | |

### Return type

[**TriageListResponse**](TriageListResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getUserHealthInfoPatientIdGet

> UserHealthInfoResponse getUserHealthInfoPatientIdGet(patientId)

Get User Health Info

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        Object patientId = null; // Object | 
        try {
            UserHealthInfoResponse result = apiInstance.getUserHealthInfoPatientIdGet(patientId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#getUserHealthInfoPatientIdGet");
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
| **patientId** | [**Object**](.md)|  | |

### Return type

[**UserHealthInfoResponse**](UserHealthInfoResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## updateAccountInformationPatientIdAccountInfoPut

> ResponseMessage updateAccountInformationPatientIdAccountInfoPut(patientId, updateAccountInformationRequest)

Update Account Information

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String patientId = "patientId_example"; // String | 
        UpdateAccountInformationRequest updateAccountInformationRequest = new UpdateAccountInformationRequest(); // UpdateAccountInformationRequest | 
        try {
            ResponseMessage result = apiInstance.updateAccountInformationPatientIdAccountInfoPut(patientId, updateAccountInformationRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateAccountInformationPatientIdAccountInfoPut");
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
| **patientId** | **String**|  | |
| **updateAccountInformationRequest** | [**UpdateAccountInformationRequest**](UpdateAccountInformationRequest.md)|  | |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## updateTriagePatientIdTriagesTriageIdPut

> ResponseMessage updateTriagePatientIdTriagesTriageIdPut(patientId, triageId, updateTriageRequest)

Update Triage

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String patientId = "patientId_example"; // String | 
        String triageId = "triageId_example"; // String | 
        UpdateTriageRequest updateTriageRequest = new UpdateTriageRequest(); // UpdateTriageRequest | 
        try {
            ResponseMessage result = apiInstance.updateTriagePatientIdTriagesTriageIdPut(patientId, triageId, updateTriageRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateTriagePatientIdTriagesTriageIdPut");
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
| **patientId** | **String**|  | |
| **triageId** | **String**|  | |
| **updateTriageRequest** | [**UpdateTriageRequest**](UpdateTriageRequest.md)|  | |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## updateUserHealthInfoPatientIdHealthInfoPut

> ResponseMessage updateUserHealthInfoPatientIdHealthInfoPut(patientId, updateUserHealthInfoRequest)

Update User Health Info

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        String patientId = "patientId_example"; // String | 
        UpdateUserHealthInfoRequest updateUserHealthInfoRequest = new UpdateUserHealthInfoRequest(); // UpdateUserHealthInfoRequest | 
        try {
            ResponseMessage result = apiInstance.updateUserHealthInfoPatientIdHealthInfoPut(patientId, updateUserHealthInfoRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#updateUserHealthInfoPatientIdHealthInfoPut");
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
| **patientId** | **String**|  | |
| **updateUserHealthInfoRequest** | [**UpdateUserHealthInfoRequest**](UpdateUserHealthInfoRequest.md)|  | |

### Return type

[**ResponseMessage**](ResponseMessage.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## userValidationLoginPost

> LoginResponse userValidationLoginPost(loginData)

User Validation

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.DefaultApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        DefaultApi apiInstance = new DefaultApi(defaultClient);
        LoginData loginData = new LoginData(); // LoginData | 
        try {
            LoginResponse result = apiInstance.userValidationLoginPost(loginData);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling DefaultApi#userValidationLoginPost");
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
| **loginData** | [**LoginData**](LoginData.md)|  | |

### Return type

[**LoginResponse**](LoginResponse.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

