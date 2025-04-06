# VisitApi

All URIs are relative to *http://localhost:9966/petclinic/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addVisit**](VisitApi.md#addVisit) | **POST** /visits | Create a visit |
| [**addVisitToOwner**](VisitApi.md#addVisitToOwner) | **POST** /owners/{ownerId}/pets/{petId}/visits | Adds a vet visit |
| [**deleteVisit**](VisitApi.md#deleteVisit) | **DELETE** /visits/{visitId} | Delete a visit by ID |
| [**getVisit**](VisitApi.md#getVisit) | **GET** /visits/{visitId} | Get a visit by ID |
| [**listVisits**](VisitApi.md#listVisits) | **GET** /visits | Lists visits |
| [**updateVisit**](VisitApi.md#updateVisit) | **PUT** /visits/{visitId} | Update a visit by ID |



## addVisit

> Visit addVisit(visit)

Create a visit

Creates a visit.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VisitApi apiInstance = new VisitApi(defaultClient);
        Visit visit = new Visit(); // Visit | The visit
        try {
            Visit result = apiInstance.addVisit(visit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitApi#addVisit");
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
| **visit** | [**Visit**](Visit.md)| The visit | |

### Return type

[**Visit**](Visit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | visit created successfully. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Visit not found. |  -  |
| **500** | Server error. |  -  |


## addVisitToOwner

> Visit addVisitToOwner(ownerId, petId, visitFields)

Adds a vet visit

Records the details of a new vet visit.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VisitApi apiInstance = new VisitApi(defaultClient);
        Integer ownerId = 1; // Integer | The ID of the pet owner.
        Integer petId = 1; // Integer | The ID of the pet.
        VisitFields visitFields = new VisitFields(); // VisitFields | The details of the new vet visit.
        try {
            Visit result = apiInstance.addVisitToOwner(ownerId, petId, visitFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitApi#addVisitToOwner");
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
| **visitFields** | [**VisitFields**](VisitFields.md)| The details of the new vet visit. | |

### Return type

[**Visit**](Visit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The vet visit was sucessfully added. |  -  |
| **400** | Bad request. |  -  |
| **404** | Pet not found for this owner. |  -  |
| **500** | Server error. |  -  |


## deleteVisit

> Visit deleteVisit(visitId)

Delete a visit by ID

Returns the visit or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VisitApi apiInstance = new VisitApi(defaultClient);
        Integer visitId = 1; // Integer | The ID of the visit.
        try {
            Visit result = apiInstance.deleteVisit(visitId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitApi#deleteVisit");
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
| **visitId** | **Integer**| The ID of the visit. | |

### Return type

[**Visit**](Visit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Visit details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Visit not found. |  -  |
| **500** | Server error. |  -  |


## getVisit

> Visit getVisit(visitId)

Get a visit by ID

Returns the visit or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VisitApi apiInstance = new VisitApi(defaultClient);
        Integer visitId = 1; // Integer | The ID of the visit.
        try {
            Visit result = apiInstance.getVisit(visitId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitApi#getVisit");
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
| **visitId** | **Integer**| The ID of the visit. | |

### Return type

[**Visit**](Visit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Visit details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Visit not found. |  -  |
| **500** | Server error. |  -  |


## listVisits

> List&lt;Visit&gt; listVisits()

Lists visits

Returns an array of visit .

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VisitApi apiInstance = new VisitApi(defaultClient);
        try {
            List<Visit> result = apiInstance.listVisits();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitApi#listVisits");
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

[**List&lt;Visit&gt;**](Visit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | visits found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **500** | Server error. |  -  |


## updateVisit

> Visit updateVisit(visitId, visit)

Update a visit by ID

Returns the visit or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VisitApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VisitApi apiInstance = new VisitApi(defaultClient);
        Integer visitId = 1; // Integer | The ID of the visit.
        Visit visit = new Visit(); // Visit | The visit
        try {
            Visit result = apiInstance.updateVisit(visitId, visit);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VisitApi#updateVisit");
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
| **visitId** | **Integer**| The ID of the visit. | |
| **visit** | [**Visit**](Visit.md)| The visit | |

### Return type

[**Visit**](Visit.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Visit details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Visit not found. |  -  |
| **500** | Server error. |  -  |

