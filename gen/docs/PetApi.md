# PetApi

All URIs are relative to *https://api.staging-test.fun/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPet**](PetApi.md#addPet) | **POST** /pet | Add a new pet to the store |
| [**deletePet**](PetApi.md#deletePet) | **DELETE** /pet/{petId} | Deletes a pet |
| [**findPetsByStatus**](PetApi.md#findPetsByStatus) | **GET** /pet/findByStatus | Finds Pets by status |
| [**findPetsByTags**](PetApi.md#findPetsByTags) | **GET** /pet/findByTags | Finds Pets by tags |
| [**getPetById**](PetApi.md#getPetById) | **GET** /pet/{petId} | Find pet by ID |
| [**updatePet**](PetApi.md#updatePet) | **PUT** /pet | Update an existing pet |
| [**updatePetWithForm**](PetApi.md#updatePetWithForm) | **POST** /pet/{petId} | Updates a pet in the store with form data |
| [**uploadFile**](PetApi.md#uploadFile) | **POST** /pet/{petId}/uploadImage | uploads an image |



## addPet

> UpdatePetRequest addPet(updatePetRequest)

Add a new pet to the store

Add a new pet to the store

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        PetApi apiInstance = new PetApi(defaultClient);
        UpdatePetRequest updatePetRequest = new UpdatePetRequest(); // UpdatePetRequest | Create a new pet in the store
        try {
            UpdatePetRequest result = apiInstance.addPet(updatePetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#addPet");
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
| **updatePetRequest** | [**UpdatePetRequest**](UpdatePetRequest.md)| Create a new pet in the store | |

### Return type

[**UpdatePetRequest**](UpdatePetRequest.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **405** | Invalid input |  -  |


## deletePet

> deletePet(petId, apiKey)

Deletes a pet

delete a pet

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        PetApi apiInstance = new PetApi(defaultClient);
        Long petId = 56L; // Long | Pet id to delete
        String apiKey = "apiKey_example"; // String | 
        try {
            apiInstance.deletePet(petId, apiKey);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#deletePet");
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
| **petId** | **Long**| Pet id to delete | |
| **apiKey** | **String**|  | [optional] |

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **400** | Invalid pet value |  -  |


## findPetsByStatus

> List&lt;UpdatePetRequest&gt; findPetsByStatus(status)

Finds Pets by status

Multiple status values can be provided with comma separated strings

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        PetApi apiInstance = new PetApi(defaultClient);
        String status = "available"; // String | Status values that need to be considered for filter
        try {
            List<UpdatePetRequest> result = apiInstance.findPetsByStatus(status);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#findPetsByStatus");
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
| **status** | **String**| Status values that need to be considered for filter | [optional] [default to available] [enum: available, pending, sold] |

### Return type

[**List&lt;UpdatePetRequest&gt;**](UpdatePetRequest.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid status value |  -  |


## findPetsByTags

> List&lt;UpdatePetRequest&gt; findPetsByTags(tags)

Finds Pets by tags

Multiple tags can be provided with comma separated strings. Use tag1, tag2, tag3 for testing.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        PetApi apiInstance = new PetApi(defaultClient);
        List<String> tags = Arrays.asList(); // List<String> | Tags to filter by
        try {
            List<UpdatePetRequest> result = apiInstance.findPetsByTags(tags);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#findPetsByTags");
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
| **tags** | [**List&lt;String&gt;**](String.md)| Tags to filter by | [optional] |

### Return type

[**List&lt;UpdatePetRequest&gt;**](UpdatePetRequest.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid tag value |  -  |


## getPetById

> UpdatePetRequest getPetById(petId)

Find pet by ID

Returns a single pet

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        // Configure API key authorization: api_key
        ApiKeyAuth api_key = (ApiKeyAuth) defaultClient.getAuthentication("api_key");
        api_key.setApiKey("YOUR API KEY");
        // Uncomment the following line to set a prefix for the API key, e.g. "Token" (defaults to null)
        //api_key.setApiKeyPrefix("Token");

        PetApi apiInstance = new PetApi(defaultClient);
        Long petId = 56L; // Long | ID of pet to return
        try {
            UpdatePetRequest result = apiInstance.getPetById(petId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#getPetById");
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
| **petId** | **Long**| ID of pet to return | |

### Return type

[**UpdatePetRequest**](UpdatePetRequest.md)

### Authorization

[petstore_auth](../README.md#petstore_auth), [api_key](../README.md#api_key)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Pet not found |  -  |


## updatePet

> UpdatePetRequest updatePet(updatePetRequest)

Update an existing pet

Update an existing pet by Id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        PetApi apiInstance = new PetApi(defaultClient);
        UpdatePetRequest updatePetRequest = new UpdatePetRequest(); // UpdatePetRequest | Update an existent pet in the store
        try {
            UpdatePetRequest result = apiInstance.updatePet(updatePetRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#updatePet");
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
| **updatePetRequest** | [**UpdatePetRequest**](UpdatePetRequest.md)| Update an existent pet in the store | |

### Return type

[**UpdatePetRequest**](UpdatePetRequest.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/json, application/xml, application/x-www-form-urlencoded
- **Accept**: application/json, application/xml


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successful operation |  -  |
| **400** | Invalid ID supplied |  -  |
| **404** | Pet not found |  -  |
| **405** | Validation exception |  -  |


## updatePetWithForm

> updatePetWithForm(petId, name, status)

Updates a pet in the store with form data



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        PetApi apiInstance = new PetApi(defaultClient);
        Long petId = 56L; // Long | ID of pet that needs to be updated
        String name = "name_example"; // String | Name of pet that needs to be updated
        String status = "status_example"; // String | Status of pet that needs to be updated
        try {
            apiInstance.updatePetWithForm(petId, name, status);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#updatePetWithForm");
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
| **petId** | **Long**| ID of pet that needs to be updated | |
| **name** | **String**| Name of pet that needs to be updated | [optional] |
| **status** | **String**| Status of pet that needs to be updated | [optional] |

### Return type

null (empty response body)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **405** | Invalid input |  -  |


## uploadFile

> UploadFile200Response uploadFile(petId, additionalMetadata, body)

uploads an image



### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://api.staging-test.fun/api/v1");
        
        // Configure OAuth2 access token for authorization: petstore_auth
        OAuth petstore_auth = (OAuth) defaultClient.getAuthentication("petstore_auth");
        petstore_auth.setAccessToken("YOUR ACCESS TOKEN");

        PetApi apiInstance = new PetApi(defaultClient);
        Long petId = 56L; // Long | ID of pet to update
        String additionalMetadata = "additionalMetadata_example"; // String | Additional Metadata
        File body = new File("/path/to/file"); // File | 
        try {
            UploadFile200Response result = apiInstance.uploadFile(petId, additionalMetadata, body);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#uploadFile");
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
| **petId** | **Long**| ID of pet to update | |
| **additionalMetadata** | **String**| Additional Metadata | [optional] |
| **body** | **File**|  | [optional] |

### Return type

[**UploadFile200Response**](UploadFile200Response.md)

### Authorization

[petstore_auth](../README.md#petstore_auth)

### HTTP request headers

- **Content-Type**: application/octet-stream
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | successful operation |  -  |

