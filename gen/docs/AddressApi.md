# AddressApi

All URIs are relative to *http://localhost:8000*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addressesGet**](AddressApi.md#addressesGet) | **GET** /addresses | Retrieve all addresses |
| [**addressesIdDelete**](AddressApi.md#addressesIdDelete) | **DELETE** /addresses/{id} | Delete a specific address |
| [**addressesIdGet**](AddressApi.md#addressesIdGet) | **GET** /addresses/{id} | Retrieve a specific address |
| [**addressesIdPatch**](AddressApi.md#addressesIdPatch) | **PATCH** /addresses/{id} | Partially update a specific address |
| [**addressesIdPut**](AddressApi.md#addressesIdPut) | **PUT** /addresses/{id} | Update a specific address by ID |
| [**addressesPost**](AddressApi.md#addressesPost) | **POST** /addresses | Create a new address |



## addressesGet

> addressesGet()

Retrieve all addresses

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        AddressApi apiInstance = new AddressApi(defaultClient);
        try {
            apiInstance.addressesGet();
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressesGet");
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

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |


## addressesIdDelete

> addressesIdDelete(id)

Delete a specific address

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        AddressApi apiInstance = new AddressApi(defaultClient);
        Integer id = 2; // Integer | ID of the address to delete
        try {
            apiInstance.addressesIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressesIdDelete");
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
| **id** | **Integer**| ID of the address to delete | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **404** | The requested address could not be found. |  -  |


## addressesIdGet

> addressesIdGet(id)

Retrieve a specific address

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        AddressApi apiInstance = new AddressApi(defaultClient);
        Integer id = 2; // Integer | ID of the address to retrieve
        try {
            apiInstance.addressesIdGet(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressesIdGet");
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
| **id** | **Integer**| ID of the address to retrieve | |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The request was successful. |  -  |
| **404** | The requested address could not be found. |  -  |


## addressesIdPatch

> addressesIdPatch(id, addressesIdPatchRequest)

Partially update a specific address

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        AddressApi apiInstance = new AddressApi(defaultClient);
        Integer id = 2; // Integer | ID of the address to update
        AddressesIdPatchRequest addressesIdPatchRequest = new AddressesIdPatchRequest(); // AddressesIdPatchRequest | 
        try {
            apiInstance.addressesIdPatch(id, addressesIdPatchRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressesIdPatch");
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
| **id** | **Integer**| ID of the address to update | |
| **addressesIdPatchRequest** | [**AddressesIdPatchRequest**](AddressesIdPatchRequest.md)|  | |

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
| **200** | The request was successful. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |
| **404** | The requested address could not be found. |  -  |


## addressesIdPut

> addressesIdPut(id, addressesPostRequest)

Update a specific address by ID

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        AddressApi apiInstance = new AddressApi(defaultClient);
        Integer id = 2; // Integer | ID of the address to update
        AddressesPostRequest addressesPostRequest = new AddressesPostRequest(); // AddressesPostRequest | 
        try {
            apiInstance.addressesIdPut(id, addressesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressesIdPut");
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
| **id** | **Integer**| ID of the address to update | |
| **addressesPostRequest** | [**AddressesPostRequest**](AddressesPostRequest.md)|  | |

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
| **200** | The request was successful. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |
| **404** | The requested address could not be found. |  -  |


## addressesPost

> addressesPost(addressesPostRequest)

Create a new address

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.AddressApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:8000");

        AddressApi apiInstance = new AddressApi(defaultClient);
        AddressesPostRequest addressesPostRequest = new AddressesPostRequest(); // AddressesPostRequest | 
        try {
            apiInstance.addressesPost(addressesPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling AddressApi#addressesPost");
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
| **addressesPostRequest** | [**AddressesPostRequest**](AddressesPostRequest.md)|  | |

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
| **201** | The address was successfully created. |  -  |
| **400** | The request body is missing or contains invalid parameters. |  -  |

