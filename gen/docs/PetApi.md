# PetApi

All URIs are relative to *http://localhost:9966/petclinic/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addPet**](PetApi.md#addPet) | **POST** /pets | Create a pet |
| [**addPetToOwner**](PetApi.md#addPetToOwner) | **POST** /owners/{ownerId}/pets | Adds a pet to an owner |
| [**deletePet**](PetApi.md#deletePet) | **DELETE** /pets/{petId} | Delete a pet by ID |
| [**getOwnersPet**](PetApi.md#getOwnersPet) | **GET** /owners/{ownerId}/pets/{petId} | Get a pet by ID |
| [**getPet**](PetApi.md#getPet) | **GET** /pets/{petId} | Get a pet by ID |
| [**listPets**](PetApi.md#listPets) | **GET** /pets | Lists pet |
| [**updateOwnersPet**](PetApi.md#updateOwnersPet) | **PUT** /owners/{ownerId}/pets/{petId} | Update a pet&#39;s details |
| [**updatePet**](PetApi.md#updatePet) | **PUT** /pets/{petId} | Update a pet by ID |



## addPet

> Pet addPet(pet)

Create a pet

Creates a pet .

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
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PetApi apiInstance = new PetApi(defaultClient);
        Pet pet = new Pet(); // Pet | The pet
        try {
            Pet result = apiInstance.addPet(pet);
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
| **pet** | [**Pet**](Pet.md)| The pet | |

### Return type

[**Pet**](Pet.md)

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
| **404** | Pet not found. |  -  |
| **500** | Server error. |  -  |


## addPetToOwner

> Pet addPetToOwner(ownerId, petFields)

Adds a pet to an owner

Records the details of a new pet.

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
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PetApi apiInstance = new PetApi(defaultClient);
        Integer ownerId = 1; // Integer | The ID of the pet owner.
        PetFields petFields = new PetFields(); // PetFields | The details of the new pet.
        try {
            Pet result = apiInstance.addPetToOwner(ownerId, petFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#addPetToOwner");
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
| **ownerId** | **Integer**| The ID of the pet owner. | |
| **petFields** | [**PetFields**](PetFields.md)| The details of the new pet. | |

### Return type

[**Pet**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The pet was sucessfully added. |  -  |
| **400** | Bad request. |  -  |
| **404** | Pet not found. |  -  |
| **500** | Server error. |  -  |


## deletePet

> Pet deletePet(petId)

Delete a pet by ID

Returns the pet or a 404 error.

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
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PetApi apiInstance = new PetApi(defaultClient);
        Integer petId = 1; // Integer | The ID of the pet.
        try {
            Pet result = apiInstance.deletePet(petId);
            System.out.println(result);
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
| **petId** | **Integer**| The ID of the pet. | |

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
| **200** | Pet details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Pet not found. |  -  |
| **500** | Server error. |  -  |


## getOwnersPet

> Pet getOwnersPet(ownerId, petId)

Get a pet by ID

Returns the pet or a 404 error.

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
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PetApi apiInstance = new PetApi(defaultClient);
        Integer ownerId = 1; // Integer | The ID of the pet owner.
        Integer petId = 1; // Integer | The ID of the pet.
        try {
            Pet result = apiInstance.getOwnersPet(ownerId, petId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#getOwnersPet");
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
| **ownerId** | **Integer**| The ID of the pet owner. | |
| **petId** | **Integer**| The ID of the pet. | |

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
| **200** | Pet details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Pet not found. |  -  |
| **500** | Server error. |  -  |


## getPet

> Pet getPet(petId)

Get a pet by ID

Returns the pet  or a 404 error.

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
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PetApi apiInstance = new PetApi(defaultClient);
        Integer petId = 1; // Integer | The ID of the pet.
        try {
            Pet result = apiInstance.getPet(petId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#getPet");
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
| **petId** | **Integer**| The ID of the pet. | |

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
| **200** | Pet details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Pet not found. |  -  |
| **500** | Server error. |  -  |


## listPets

> List&lt;Pet&gt; listPets()

Lists pet

Returns an array of pet .

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
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PetApi apiInstance = new PetApi(defaultClient);
        try {
            List<Pet> result = apiInstance.listPets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#listPets");
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

[**List&lt;Pet&gt;**](Pet.md)

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


## updateOwnersPet

> updateOwnersPet(ownerId, petId, petFields)

Update a pet&#39;s details

Updates the pet record with the specified details.

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
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PetApi apiInstance = new PetApi(defaultClient);
        Integer ownerId = 1; // Integer | The ID of the pet owner.
        Integer petId = 1; // Integer | The ID of the pet.
        PetFields petFields = new PetFields(); // PetFields | The pet details to use for the update.
        try {
            apiInstance.updateOwnersPet(ownerId, petId, petFields);
        } catch (ApiException e) {
            System.err.println("Exception when calling PetApi#updateOwnersPet");
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
| **ownerId** | **Integer**| The ID of the pet owner. | |
| **petId** | **Integer**| The ID of the pet. | |
| **petFields** | [**PetFields**](PetFields.md)| The pet details to use for the update. | |

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
| **204** | Update successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Pet not found for this owner. |  -  |
| **500** | Server error. |  -  |


## updatePet

> Pet updatePet(petId, pet)

Update a pet by ID

Returns the pet or a 404 error.

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
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        PetApi apiInstance = new PetApi(defaultClient);
        Integer petId = 1; // Integer | The ID of the pet.
        Pet pet = new Pet(); // Pet | The pet
        try {
            Pet result = apiInstance.updatePet(petId, pet);
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
| **petId** | **Integer**| The ID of the pet. | |
| **pet** | [**Pet**](Pet.md)| The pet | |

### Return type

[**Pet**](Pet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Pet details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Pet not found. |  -  |
| **500** | Server error. |  -  |

