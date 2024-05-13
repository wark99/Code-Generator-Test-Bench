# ContactsApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createContactApiV1ContactsPost**](ContactsApi.md#createContactApiV1ContactsPost) | **POST** /api/v1/contacts/ | Create Contact |
| [**createContactSchemaApiV1ContactsSchemaPost**](ContactsApi.md#createContactSchemaApiV1ContactsSchemaPost) | **POST** /api/v1/contacts/schema | Create Contact Schema |
| [**getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGet**](ContactsApi.md#getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGet) | **GET** /api/v1/contacts/schema/{schemaId}/fields | Get Schema Fields |
| [**listContactSchemaApiV1ContactsSchemaOrganizationIdGet**](ContactsApi.md#listContactSchemaApiV1ContactsSchemaOrganizationIdGet) | **GET** /api/v1/contacts/schema/{organizationId} | List Contact Schema |
| [**listContactsApiV1ContactsOrganizationIdGet**](ContactsApi.md#listContactsApiV1ContactsOrganizationIdGet) | **GET** /api/v1/contacts/{organizationId} | List Contacts |



## createContactApiV1ContactsPost

> Object createContactApiV1ContactsPost(bodyCreateContactApiV1ContactsPost)

Create Contact

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        BodyCreateContactApiV1ContactsPost bodyCreateContactApiV1ContactsPost = new BodyCreateContactApiV1ContactsPost(); // BodyCreateContactApiV1ContactsPost | 
        try {
            Object result = apiInstance.createContactApiV1ContactsPost(bodyCreateContactApiV1ContactsPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#createContactApiV1ContactsPost");
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
| **bodyCreateContactApiV1ContactsPost** | [**BodyCreateContactApiV1ContactsPost**](BodyCreateContactApiV1ContactsPost.md)|  | |

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


## createContactSchemaApiV1ContactsSchemaPost

> Object createContactSchemaApiV1ContactsSchemaPost(bodyCreateContactSchemaApiV1ContactsSchemaPost)

Create Contact Schema

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        BodyCreateContactSchemaApiV1ContactsSchemaPost bodyCreateContactSchemaApiV1ContactsSchemaPost = new BodyCreateContactSchemaApiV1ContactsSchemaPost(); // BodyCreateContactSchemaApiV1ContactsSchemaPost | 
        try {
            Object result = apiInstance.createContactSchemaApiV1ContactsSchemaPost(bodyCreateContactSchemaApiV1ContactsSchemaPost);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#createContactSchemaApiV1ContactsSchemaPost");
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
| **bodyCreateContactSchemaApiV1ContactsSchemaPost** | [**BodyCreateContactSchemaApiV1ContactsSchemaPost**](BodyCreateContactSchemaApiV1ContactsSchemaPost.md)|  | |

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


## getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGet

> Object getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGet(schemaId)

Get Schema Fields

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String schemaId = "schemaId_example"; // String | 
        try {
            Object result = apiInstance.getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGet(schemaId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#getSchemaFieldsApiV1ContactsSchemaSchemaIdFieldsGet");
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
| **schemaId** | **String**|  | |

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


## listContactSchemaApiV1ContactsSchemaOrganizationIdGet

> Object listContactSchemaApiV1ContactsSchemaOrganizationIdGet(organizationId, populate)

List Contact Schema

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        Object populate = null; // Object | 
        try {
            Object result = apiInstance.listContactSchemaApiV1ContactsSchemaOrganizationIdGet(organizationId, populate);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#listContactSchemaApiV1ContactsSchemaOrganizationIdGet");
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
| **organizationId** | **String**|  | |
| **populate** | [**Object**](.md)|  | [optional] |

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


## listContactsApiV1ContactsOrganizationIdGet

> Object listContactsApiV1ContactsOrganizationIdGet(organizationId)

List Contacts

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");
        
        // Configure OAuth2 access token for authorization: OAuth2PasswordBearer
        OAuth OAuth2PasswordBearer = (OAuth) defaultClient.getAuthentication("OAuth2PasswordBearer");
        OAuth2PasswordBearer.setAccessToken("YOUR ACCESS TOKEN");

        ContactsApi apiInstance = new ContactsApi(defaultClient);
        String organizationId = "organizationId_example"; // String | 
        try {
            Object result = apiInstance.listContactsApiV1ContactsOrganizationIdGet(organizationId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactsApi#listContactsApiV1ContactsOrganizationIdGet");
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
| **organizationId** | **String**|  | |

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

