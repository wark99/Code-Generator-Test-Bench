# BusinessesApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut**](BusinessesApi.md#changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut) | **PUT** /api/v1/businesses/{businessId}/phase | Change Business Phase |
| [**createBussinesApiV1BusinessesPost**](BusinessesApi.md#createBussinesApiV1BusinessesPost) | **POST** /api/v1/businesses/ | Create Bussines |
| [**getBusinessApiV1BusinessesBusinessIdGet**](BusinessesApi.md#getBusinessApiV1BusinessesBusinessIdGet) | **GET** /api/v1/businesses/{businessId} | Get Business |
| [**getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet**](BusinessesApi.md#getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet) | **GET** /api/v1/businesses/pipeline/{pipelineId} | Get Business In Pipeline |



## changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut

> Object changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut(businessId, bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut)

Change Business Phase

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        BusinessesApi apiInstance = new BusinessesApi(defaultClient);
        String businessId = "businessId_example"; // String | 
        BodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut = new BodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut(); // BodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut | 
        try {
            Object result = apiInstance.changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut(businessId, bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessesApi#changeBusinessPhaseApiV1BusinessesBusinessIdPhasePut");
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
| **businessId** | **String**|  | |
| **bodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut** | [**BodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut**](BodyChangeBusinessPhaseApiV1BusinessesBusinessIdPhasePut.md)|  | |

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


## createBussinesApiV1BusinessesPost

> Object createBussinesApiV1BusinessesPost(bodyCreateBussinesApiV1BusinessesPost)

Create Bussines

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        BusinessesApi apiInstance = new BusinessesApi(defaultClient);
        BodyCreateBussinesApiV1BusinessesPost bodyCreateBussinesApiV1BusinessesPost = new BodyCreateBussinesApiV1BusinessesPost(); // BodyCreateBussinesApiV1BusinessesPost | 
        try {
            Object result = apiInstance.createBussinesApiV1BusinessesPost(bodyCreateBussinesApiV1BusinessesPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessesApi#createBussinesApiV1BusinessesPost");
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
| **bodyCreateBussinesApiV1BusinessesPost** | [**BodyCreateBussinesApiV1BusinessesPost**](BodyCreateBussinesApiV1BusinessesPost.md)|  | |

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


## getBusinessApiV1BusinessesBusinessIdGet

> Object getBusinessApiV1BusinessesBusinessIdGet(businessId, populate)

Get Business

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        BusinessesApi apiInstance = new BusinessesApi(defaultClient);
        String businessId = "businessId_example"; // String | 
        Boolean populate = false; // Boolean | 
        try {
            Object result = apiInstance.getBusinessApiV1BusinessesBusinessIdGet(businessId, populate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessesApi#getBusinessApiV1BusinessesBusinessIdGet");
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
| **businessId** | **String**|  | |
| **populate** | **Boolean**|  | [optional] [default to false] |

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


## getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet

> Object getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet(pipelineId, bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet, populate)

Get Business In Pipeline

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.BusinessesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        BusinessesApi apiInstance = new BusinessesApi(defaultClient);
        String pipelineId = "pipelineId_example"; // String | 
        BodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet = new BodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet(); // BodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet | 
        Boolean populate = false; // Boolean | 
        try {
            Object result = apiInstance.getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet(pipelineId, bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet, populate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling BusinessesApi#getBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet");
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
| **pipelineId** | **String**|  | |
| **bodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet** | [**BodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet**](BodyGetBusinessInPipelineApiV1BusinessesPipelinePipelineIdGet.md)|  | |
| **populate** | **Boolean**|  | [optional] [default to false] |

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

