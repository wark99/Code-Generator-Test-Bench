# VetApi

All URIs are relative to *http://localhost:9966/petclinic/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addVet**](VetApi.md#addVet) | **POST** /vets | Create a Vet |
| [**deleteVet**](VetApi.md#deleteVet) | **DELETE** /vets/{vetId} | Delete a vet by ID |
| [**getVet**](VetApi.md#getVet) | **GET** /vets/{vetId} | Get a vet by ID |
| [**listVets**](VetApi.md#listVets) | **GET** /vets | Lists vets |
| [**updateVet**](VetApi.md#updateVet) | **PUT** /vets/{vetId} | Update a vet  by ID |



## addVet

> Vet addVet(vet)

Create a Vet

Creates a vet .

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VetApi apiInstance = new VetApi(defaultClient);
        Vet vet = new Vet(); // Vet | The vet
        try {
            Vet result = apiInstance.addVet(vet);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VetApi#addVet");
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
| **vet** | [**Vet**](Vet.md)| The vet | |

### Return type

[**Vet**](Vet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vet created successfully. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Vet not found. |  -  |
| **500** | Server error. |  -  |


## deleteVet

> Vet deleteVet(vetId)

Delete a vet by ID

Returns the vet or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VetApi apiInstance = new VetApi(defaultClient);
        Integer vetId = 1; // Integer | The ID of the vet.
        try {
            Vet result = apiInstance.deleteVet(vetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VetApi#deleteVet");
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
| **vetId** | **Integer**| The ID of the vet. | |

### Return type

[**Vet**](Vet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vet details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Vet not found. |  -  |
| **500** | Server error. |  -  |


## getVet

> Vet getVet(vetId)

Get a vet by ID

Returns the vet or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VetApi apiInstance = new VetApi(defaultClient);
        Integer vetId = 1; // Integer | The ID of the vet.
        try {
            Vet result = apiInstance.getVet(vetId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VetApi#getVet");
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
| **vetId** | **Integer**| The ID of the vet. | |

### Return type

[**Vet**](Vet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vet details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Vet not found. |  -  |
| **500** | Server error. |  -  |


## listVets

> List&lt;Vet&gt; listVets()

Lists vets

Returns an array of vets.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VetApi apiInstance = new VetApi(defaultClient);
        try {
            List<Vet> result = apiInstance.listVets();
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VetApi#listVets");
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

[**List&lt;Vet&gt;**](Vet.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Vets found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **500** | Server error. |  -  |


## updateVet

> Vet updateVet(vetId, vet)

Update a vet  by ID

Returns the vet or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.VetApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        VetApi apiInstance = new VetApi(defaultClient);
        Integer vetId = 1; // Integer | The ID of the vet.
        Vet vet = new Vet(); // Vet | The vet
        try {
            Vet result = apiInstance.updateVet(vetId, vet);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling VetApi#updateVet");
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
| **vetId** | **Integer**| The ID of the vet. | |
| **vet** | [**Vet**](Vet.md)| The vet | |

### Return type

[**Vet**](Vet.md)

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
| **404** | Vet not found. |  -  |
| **500** | Server error. |  -  |

