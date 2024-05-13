# FormsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createFormApiV1FormsPost**](FormsApi.md#createFormApiV1FormsPost) | **POST** /api/v1/forms/ | Create Form |
| [**getAllFormsApiV1FormsGet**](FormsApi.md#getAllFormsApiV1FormsGet) | **GET** /api/v1/forms/ | Get All Forms |
| [**getFormIframeApiV1FormsFormIdIframeGet**](FormsApi.md#getFormIframeApiV1FormsFormIdIframeGet) | **GET** /api/v1/forms/{formId}/iframe | Get Form Iframe |



## createFormApiV1FormsPost

> Object createFormApiV1FormsPost(bodyCreateFormApiV1FormsPost)

Create Form

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        FormsApi apiInstance = new FormsApi(defaultClient);
        BodyCreateFormApiV1FormsPost bodyCreateFormApiV1FormsPost = new BodyCreateFormApiV1FormsPost(); // BodyCreateFormApiV1FormsPost | 
        try {
            Object result = apiInstance.createFormApiV1FormsPost(bodyCreateFormApiV1FormsPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsApi#createFormApiV1FormsPost");
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
| **bodyCreateFormApiV1FormsPost** | [**BodyCreateFormApiV1FormsPost**](BodyCreateFormApiV1FormsPost.md)|  | |

### Return type

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |


## getAllFormsApiV1FormsGet

> Object getAllFormsApiV1FormsGet()

Get All Forms

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        FormsApi apiInstance = new FormsApi(defaultClient);
        try {
            Object result = apiInstance.getAllFormsApiV1FormsGet();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsApi#getAllFormsApiV1FormsGet");
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

**Object**

### Authorization

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |


## getFormIframeApiV1FormsFormIdIframeGet

> Object getFormIframeApiV1FormsFormIdIframeGet(formId)

Get Form Iframe

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.FormsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        FormsApi apiInstance = new FormsApi(defaultClient);
        String formId = "formId_example"; // String | 
        try {
            Object result = apiInstance.getFormIframeApiV1FormsFormIdIframeGet(formId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling FormsApi#getFormIframeApiV1FormsFormIdIframeGet");
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

[OAuth2PasswordBearer](../README.md#OAuth2PasswordBearer)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful Response |  -  |
| **422** | Validation Error |  -  |

