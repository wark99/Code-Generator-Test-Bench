# OwnerApi

All URIs are relative to *http://localhost:9966/petclinic/api*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**addOwner**](OwnerApi.md#addOwner) | **POST** /owners | Adds a pet owner |
| [**deleteOwner**](OwnerApi.md#deleteOwner) | **DELETE** /owners/{ownerId} | Delete an owner by ID |
| [**getOwner**](OwnerApi.md#getOwner) | **GET** /owners/{ownerId} | Get a pet owner by ID |
| [**listOwners**](OwnerApi.md#listOwners) | **GET** /owners | Lists pet owners |
| [**updateOwner**](OwnerApi.md#updateOwner) | **PUT** /owners/{ownerId} | Update a pet owner&#39;s details |



## addOwner

> Owner addOwner(ownerFields)

Adds a pet owner

Records the details of a new pet owner.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OwnerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        OwnerFields ownerFields = new OwnerFields(); // OwnerFields | The pet owner
        try {
            Owner result = apiInstance.addOwner(ownerFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#addOwner");
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
| **ownerFields** | [**OwnerFields**](OwnerFields.md)| The pet owner | |

### Return type

[**Owner**](Owner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **201** | The pet owner was sucessfully added. |  -  |
| **400** | Bad request. |  -  |
| **500** | Server error. |  -  |


## deleteOwner

> Owner deleteOwner(ownerId)

Delete an owner by ID

Returns the owner or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OwnerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        Integer ownerId = 1; // Integer | The ID of the owner.
        try {
            Owner result = apiInstance.deleteOwner(ownerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#deleteOwner");
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
| **ownerId** | **Integer**| The ID of the owner. | |

### Return type

[**Owner**](Owner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Owner details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Owner  not found. |  -  |
| **500** | Server error. |  -  |


## getOwner

> Owner getOwner(ownerId)

Get a pet owner by ID

Returns the pet owner or a 404 error.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OwnerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        Integer ownerId = 1; // Integer | The ID of the pet owner.
        try {
            Owner result = apiInstance.getOwner(ownerId);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#getOwner");
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

### Return type

[**Owner**](Owner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Owner details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **400** | Bad request. |  -  |
| **404** | Owner not found. |  -  |
| **500** | Server error. |  -  |


## listOwners

> List&lt;Owner&gt; listOwners(lastName)

Lists pet owners

Returns an array of pet owners.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OwnerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        String lastName = "Davis"; // String | Last name.
        try {
            List<Owner> result = apiInstance.listOwners(lastName);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#listOwners");
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
| **lastName** | **String**| Last name. | [optional] |

### Return type

[**List&lt;Owner&gt;**](Owner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Owner details found and returned. |  * ETag - An ID for this version of the response. <br>  |
| **304** | Not modified. |  * ETag - An ID for this version of the response. <br>  |
| **500** | Server error. |  -  |


## updateOwner

> Owner updateOwner(ownerId, ownerFields)

Update a pet owner&#39;s details

Updates the pet owner record with the specified details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.OwnerApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://localhost:9966/petclinic/api");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        Integer ownerId = 1; // Integer | The ID of the pet owner.
        OwnerFields ownerFields = new OwnerFields(); // OwnerFields | The pet owner details to use for the update.
        try {
            Owner result = apiInstance.updateOwner(ownerId, ownerFields);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#updateOwner");
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
| **ownerFields** | [**OwnerFields**](OwnerFields.md)| The pet owner details to use for the update. | |

### Return type

[**Owner**](Owner.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Update successful. |  -  |
| **400** | Bad request. |  -  |
| **404** | Owner not found. |  -  |
| **500** | Server error. |  -  |

