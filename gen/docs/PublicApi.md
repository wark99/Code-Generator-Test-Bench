# PublicApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**getFormSchemaApiV1PublicContactFormSchemaFormIdGet**](PublicApi.md#getFormSchemaApiV1PublicContactFormSchemaFormIdGet) | **GET** /api/v1/public/contact-form/schema/{formId} | Get Form Schema |
| [**postFormDataApiV1PublicContactFormFormIdPost**](PublicApi.md#postFormDataApiV1PublicContactFormFormIdPost) | **POST** /api/v1/public/contact-form/{formId} | Post Form Data |
| [**registerApiV1PublicUserRegisterPost**](PublicApi.md#registerApiV1PublicUserRegisterPost) | **POST** /api/v1/public/user/register | Register |



## getFormSchemaApiV1PublicContactFormSchemaFormIdGet

> Object getFormSchemaApiV1PublicContactFormSchemaFormIdGet(formId)

Get Form Schema

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PublicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PublicApi apiInstance = new PublicApi(defaultClient);
        String formId = "formId_example"; // String | 
        try {
            Object result = apiInstance.getFormSchemaApiV1PublicContactFormSchemaFormIdGet(formId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicApi#getFormSchemaApiV1PublicContactFormSchemaFormIdGet");
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
| **formId** | **String**|  | |

### Return type

**Object**

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


## postFormDataApiV1PublicContactFormFormIdPost

> Object postFormDataApiV1PublicContactFormFormIdPost(formId, body)

Post Form Data

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PublicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PublicApi apiInstance = new PublicApi(defaultClient);
        String formId = "formId_example"; // String | 
        Object body = null; // Object | 
        try {
            Object result = apiInstance.postFormDataApiV1PublicContactFormFormIdPost(formId, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicApi#postFormDataApiV1PublicContactFormFormIdPost");
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
| **formId** | **String**|  | |
| **body** | **Object**|  | |

### Return type

**Object**

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


## registerApiV1PublicUserRegisterPost

> Object registerApiV1PublicUserRegisterPost(userRegisterDTO)

Register

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PublicApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PublicApi apiInstance = new PublicApi(defaultClient);
        UserRegisterDTO userRegisterDTO = new UserRegisterDTO(); // UserRegisterDTO | 
        try {
            Object result = apiInstance.registerApiV1PublicUserRegisterPost(userRegisterDTO);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PublicApi#registerApiV1PublicUserRegisterPost");
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
| **userRegisterDTO** | [**UserRegisterDTO**](UserRegisterDTO.md)|  | |

### Return type

**Object**

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

