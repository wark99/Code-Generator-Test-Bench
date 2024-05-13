# PetApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**petsGet**](PetApi.md#petsGet) | **GET** /pets |  |
| [**petsIdDelete**](PetApi.md#petsIdDelete) | **DELETE** /pets/{id} |  |
| [**petsIdGet**](PetApi.md#petsIdGet) | **GET** /pets/{id} |  |
| [**petsPost**](PetApi.md#petsPost) | **POST** /pets |  |



## petsGet

> PetsGet200Response petsGet(page, size)



List all pets by the given page number and page size. The page parameters such as &#x60;last&#x60; and &#x60;first&#x60; must be used to check the data set boundtries when paginating the pets list. Using invalid values such as out of boundary values will result in &#x60;400&#x60; errors. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PetApi apiInstance = new PetApi(defaultClient);
        Integer page = 56; // Integer | The page number to fetch.
        Integer size = 56; // Integer | The page size to fetch.
        try {
            PetsGet200Response result = apiInstance.petsGet(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#petsGet");
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
| **page** | **Integer**| The page number to fetch. | |
| **size** | **Integer**| The page size to fetch. | |

### Return type

[**PetsGet200Response**](PetsGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The current requested page of pets |  -  |
| **400** | If the page parameters are invalid, for example if the page number of out of boundary of maximum number of pages. |  -  |


## petsIdDelete

> petsIdDelete(id)



Unregister a pet incase of the pet is migrated or deceased. 

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PetApi apiInstance = new PetApi(defaultClient);
        String id = "id_example"; // String | The pet id in the system.
        try {
            apiInstance.petsIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#petsIdDelete");
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
| **id** | **String**| The pet id in the system. | |

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
| **200** | Pet is successfully unregistered from the registry. |  -  |


## petsIdGet

> Pet petsIdGet(id)



Get information about a single pet identified by the system id

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PetApi apiInstance = new PetApi(defaultClient);
        String id = "id_example"; // String | The pet id in the system.
        try {
            Pet result = apiInstance.petsIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#petsIdGet");
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
| **id** | **String**| The pet id in the system. | |

### Return type

[**Pet**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The pet for the given system id. |  -  |
| **404** | A pet could not be identified by the given system id. |  -  |


## petsPost

> petsPost(petRequest)



Register a new pet in the registry.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost");

        PetApi apiInstance = new PetApi(defaultClient);
        PetRequest petRequest = new PetRequest(); // PetRequest | 
        try {
            apiInstance.petsPost(petRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#petsPost");
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
| **petRequest** | [**PetRequest**](PetRequest.md)|  | [optional] |

### Return type

null (empty response body)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Successfully registered the pet. |  -  |

