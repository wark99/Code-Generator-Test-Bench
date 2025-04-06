# PettypesApi

All URIs are relative to *http://localhost:9966/petclinic/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPetType**](PettypesApi.md#addPetType) | **POST** /pettypes | Create a pet type |
| [**deletePetType**](PettypesApi.md#deletePetType) | **DELETE** /pettypes/{petTypeId} | Delete a pet type by ID |
| [**getPetType**](PettypesApi.md#getPetType) | **GET** /pettypes/{petTypeId} | Get a pet type by ID |
| [**listPetTypes**](PettypesApi.md#listPetTypes) | **GET** /pettypes | Lists pet types |
| [**updatePetType**](PettypesApi.md#updatePetType) | **PUT** /pettypes/{petTypeId} | Update a pet type by ID |



## addPetType

> PetType addPetType(petType)

Create a pet type

Creates a pet type .

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PettypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PettypesApi apiInstance = new PettypesApi(defaultClient);
        PetType petType = new PetType(); // PetType | The pet type
        try {
            PetType result = apiInstance.addPetType(petType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PettypesApi#addPetType");
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
| **petType** | [**PetType**](PetType.md)| The pet type | |

### Return type

[**PetType**](PetType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pet type created successfully. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Pet Type not found. |  -  |
| **500** | Server error. |  -  |


## deletePetType

> PetType deletePetType(petTypeId)

Delete a pet type by ID

Returns the pet type or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PettypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PettypesApi apiInstance = new PettypesApi(defaultClient);
        Integer petTypeId = 1; // Integer | The ID of the pet type.
        try {
            PetType result = apiInstance.deletePetType(petTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PettypesApi#deletePetType");
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
| **petTypeId** | **Integer**| The ID of the pet type. | |

### Return type

[**PetType**](PetType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pet type details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Pet type not found. |  -  |
| **500** | Server error. |  -  |


## getPetType

> PetType getPetType(petTypeId)

Get a pet type by ID

Returns the pet type or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PettypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PettypesApi apiInstance = new PettypesApi(defaultClient);
        Integer petTypeId = 1; // Integer | The ID of the pet type.
        try {
            PetType result = apiInstance.getPetType(petTypeId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PettypesApi#getPetType");
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
| **petTypeId** | **Integer**| The ID of the pet type. | |

### Return type

[**PetType**](PetType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pet type details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Pet Type not found. |  -  |
| **500** | Server error. |  -  |


## listPetTypes

> List&lt;PetType&gt; listPetTypes()

Lists pet types

Returns an array of pet types.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PettypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PettypesApi apiInstance = new PettypesApi(defaultClient);
        try {
            List<PetType> result = apiInstance.listPetTypes();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PettypesApi#listPetTypes");
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

[**List&lt;PetType&gt;**](PetType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pet types found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **500** | Server error. |  -  |


## updatePetType

> PetType updatePetType(petTypeId, petType)

Update a pet type by ID

Returns the pet type or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.PettypesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PettypesApi apiInstance = new PettypesApi(defaultClient);
        Integer petTypeId = 1; // Integer | The ID of the pet type.
        PetType petType = new PetType(); // PetType | The pet type
        try {
            PetType result = apiInstance.updatePetType(petTypeId, petType);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PettypesApi#updatePetType");
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
| **petTypeId** | **Integer**| The ID of the pet type. | |
| **petType** | [**PetType**](PetType.md)| The pet type | |

### Return type

[**PetType**](PetType.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pet type details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Pet Type not found. |  -  |
| **500** | Server error. |  -  |

