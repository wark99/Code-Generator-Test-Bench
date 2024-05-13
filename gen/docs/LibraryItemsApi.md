# LibraryItemsApi

All URIs are relative to *https://ncp-iam.easygov.co.in/api-gateway/be*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**createLibrary**](LibraryItemsApi.md#createLibrary) | **POST** /api/v1/libraries | Create Library |
| [**deleteLibrary**](LibraryItemsApi.md#deleteLibrary) | **DELETE** /api/v1/libraries/{id} | Delete a Library |
| [**getAllLibraries**](LibraryItemsApi.md#getAllLibraries) | **GET** /api/v1/libraries | Get Libraries |
| [**updateLibrary**](LibraryItemsApi.md#updateLibrary) | **PATCH** /api/v1/libraries/{id} | Update a Library |



## createLibrary

> Library createLibrary(library)

Create Library

Create a new library.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        LibraryItemsApi apiInstance = new LibraryItemsApi(defaultClient);
        Library library = new Library(); // Library | 
        try {
            Library result = apiInstance.createLibrary(library);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LibraryItemsApi#createLibrary");
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
| **library** | [**Library**](Library.md)|  | |

### Return type

[**Library**](Library.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Library created successfully |  -  |
| **400** | Bad Request |  -  |


## deleteLibrary

> deleteLibrary(id)

Delete a Library

Remove an existing library resource.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        LibraryItemsApi apiInstance = new LibraryItemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the library to delete.
        try {
            apiInstance.deleteLibrary(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling LibraryItemsApi#deleteLibrary");
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
| **id** | **String**| The ID of the library to delete. | |

### Return type

null (empty response body)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Library deleted successfully. |  -  |
| **404** | Not Found. The library with the specified ID was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |


## getAllLibraries

> List&lt;Library&gt; getAllLibraries(page, limit, sortBy, sortOrder)

Get Libraries

Retrieve a list of libraries with optional filtering and pagination.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        LibraryItemsApi apiInstance = new LibraryItemsApi(defaultClient);
        Integer page = 1; // Integer | Page number (optional, default: 1, can't be negative). 
        Integer limit = 10; // Integer | Number of items per page (optional, default: 10, max: 100). 
        String sortBy = "modifiedOn"; // String | Field to sort by (optional, default: modifiedOn). 
        String sortOrder = "asc"; // String | Sort order (optional, default: desc). 
        try {
            List<Library> result = apiInstance.getAllLibraries(page, limit, sortBy, sortOrder);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling LibraryItemsApi#getAllLibraries");
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
| **page** | **Integer**| Page number (optional, default: 1, can&#39;t be negative).  | [optional] [default to 1] |
| **limit** | **Integer**| Number of items per page (optional, default: 10, max: 100).  | [optional] [default to 10] |
| **sortBy** | **String**| Field to sort by (optional, default: modifiedOn).  | [optional] [default to modifiedOn] [enum: modifiedOn] |
| **sortOrder** | **String**| Sort order (optional, default: desc).  | [optional] [default to desc] [enum: asc, desc] |

### Return type

[**List&lt;Library&gt;**](Library.md)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Libraries retrieved successfully |  -  |
| **400** | Bad Request |  -  |


## updateLibrary

> updateLibrary(id, library)

Update a Library

Update an existing library resource.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.LibraryItemsApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("https://ncp-iam.easygov.co.in/api-gateway/be");
        
        // Configure OAuth2 access token for authorization: studio_oauth2
        OAuth studio_oauth2 = (OAuth) defaultClient.getAuthentication("studio_oauth2");
        studio_oauth2.setAccessToken("YOUR ACCESS TOKEN");

        LibraryItemsApi apiInstance = new LibraryItemsApi(defaultClient);
        String id = "id_example"; // String | The ID of the library to update.
        Library library = new Library(); // Library | Library data to update.
        try {
            apiInstance.updateLibrary(id, library);
        } catch (ApiException e) {
            System.err.println("Exception when calling LibraryItemsApi#updateLibrary");
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
| **id** | **String**| The ID of the library to update. | |
| **library** | [**Library**](Library.md)| Library data to update. | |

### Return type

null (empty response body)

### Authorization

[studio_oauth2](../README.md#studio_oauth2)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | Library updated successfully. |  -  |
| **400** | Bad Request. Invalid input or validation error. |  -  |
| **404** | Not Found. The library with the specified ID was not found. |  -  |
| **500** | Internal Server Error. Something went wrong on the server. |  -  |

