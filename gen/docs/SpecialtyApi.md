# SpecialtyApi

All URIs are relative to *http://localhost:9966/petclinic/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addSpecialty**](SpecialtyApi.md#addSpecialty) | **POST** /specialties | Create a specialty |
| [**deleteSpecialty**](SpecialtyApi.md#deleteSpecialty) | **DELETE** /specialties/{specialtyId} | Delete a specialty by ID |
| [**getSpecialty**](SpecialtyApi.md#getSpecialty) | **GET** /specialties/{specialtyId} | Get a specialty by ID |
| [**listSpecialties**](SpecialtyApi.md#listSpecialties) | **GET** /specialties | Lists specialties |
| [**updateSpecialty**](SpecialtyApi.md#updateSpecialty) | **PUT** /specialties/{specialtyId} | Update a specialty by ID |



## addSpecialty

> Specialty addSpecialty(specialty)

Create a specialty

Creates a specialty .

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpecialtyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        SpecialtyApi apiInstance = new SpecialtyApi(defaultClient);
        Specialty specialty = new Specialty(); // Specialty | The specialty
        try {
            Specialty result = apiInstance.addSpecialty(specialty);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpecialtyApi#addSpecialty");
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
| **specialty** | [**Specialty**](Specialty.md)| The specialty | |

### Return type

[**Specialty**](Specialty.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specialty created successfully. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Specialty not found. |  -  |
| **500** | Server error. |  -  |


## deleteSpecialty

> Specialty deleteSpecialty(specialtyId)

Delete a specialty by ID

Returns the specialty or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpecialtyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        SpecialtyApi apiInstance = new SpecialtyApi(defaultClient);
        Integer specialtyId = 1; // Integer | The ID of the specialty.
        try {
            Specialty result = apiInstance.deleteSpecialty(specialtyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpecialtyApi#deleteSpecialty");
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
| **specialtyId** | **Integer**| The ID of the specialty. | |

### Return type

[**Specialty**](Specialty.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specialty details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Specialty not found. |  -  |
| **500** | Server error. |  -  |


## getSpecialty

> Specialty getSpecialty(specialtyId)

Get a specialty by ID

Returns the specialty or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpecialtyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        SpecialtyApi apiInstance = new SpecialtyApi(defaultClient);
        Integer specialtyId = 1; // Integer | The ID of the speciality.
        try {
            Specialty result = apiInstance.getSpecialty(specialtyId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpecialtyApi#getSpecialty");
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
| **specialtyId** | **Integer**| The ID of the speciality. | |

### Return type

[**Specialty**](Specialty.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specialty details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Specialty not found. |  -  |
| **500** | Server error. |  -  |


## listSpecialties

> List&lt;Specialty&gt; listSpecialties()

Lists specialties

Returns an array of specialty .

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpecialtyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        SpecialtyApi apiInstance = new SpecialtyApi(defaultClient);
        try {
            List<Specialty> result = apiInstance.listSpecialties();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpecialtyApi#listSpecialties");
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

[**List&lt;Specialty&gt;**](Specialty.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specialties found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **500** | Server error. |  -  |


## updateSpecialty

> Specialty updateSpecialty(specialtyId, specialty)

Update a specialty by ID

Returns the specialty or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.SpecialtyApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        SpecialtyApi apiInstance = new SpecialtyApi(defaultClient);
        Integer specialtyId = 1; // Integer | The ID of the specialty.
        Specialty specialty = new Specialty(); // Specialty | The pet
        try {
            Specialty result = apiInstance.updateSpecialty(specialtyId, specialty);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling SpecialtyApi#updateSpecialty");
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
| **specialtyId** | **Integer**| The ID of the specialty. | |
| **specialty** | [**Specialty**](Specialty.md)| The pet | |

### Return type

[**Specialty**](Specialty.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Specialty details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Specialty not found. |  -  |
| **500** | Server error. |  -  |

