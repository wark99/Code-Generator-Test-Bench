# OwnerApi

All URIs are relative to *http://localhost*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**ownersGet**](OwnerApi.md#ownersGet) | **GET** /owners |  |
| [**ownersIdDelete**](OwnerApi.md#ownersIdDelete) | **DELETE** /owners/{id} |  |
| [**ownersIdGet**](OwnerApi.md#ownersIdGet) | **GET** /owners/{id} |  |
| [**ownersPost**](OwnerApi.md#ownersPost) | **POST** /owners |  |



## ownersGet

> OwnersGet200Response ownersGet(page, size)



List all owners by the given page number and page size. The page parameters such as &#x60;last&#x60; and &#x60;first&#x60; must be used to check the data set boundtries when paginating the owners list. Using invalid values such as out of boundary values will result in &#x60;400&#x60; errors. 

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
        defaultClient.setBasePath("http://localhost");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        Integer page = 56; // Integer | The page number to fetch.
        Integer size = 56; // Integer | The page size to fetch.
        try {
            OwnersGet200Response result = apiInstance.ownersGet(page, size);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#ownersGet");
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

[**OwnersGet200Response**](OwnersGet200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | The current requested page of owners |  -  |
| **400** | If the page parameters are invalid, for example if the page number of out of boundary of maximum number of pages. |  -  |


## ownersIdDelete

> ownersIdDelete(id)



Unregister a owner will remove the connection with the current pets this owner has. All connected pets will considered as ophant. 

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
        defaultClient.setBasePath("http://localhost");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        String id = "id_example"; // String | The owner id in the system.
        try {
            apiInstance.ownersIdDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#ownersIdDelete");
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
| **id** | **String**| The owner id in the system. | |

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
| **200** | Owner is successfully unregistered from the registry. |  -  |


## ownersIdGet

> Owner ownersIdGet(id)



Get information about a single owner identified by the system id

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
        defaultClient.setBasePath("http://localhost");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        String id = "id_example"; // String | The owner id in the system.
        try {
            Owner result = apiInstance.ownersIdGet(id);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#ownersIdGet");
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
| **id** | **String**| The owner id in the system. | |

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
| **200** | The owner for the given system id. |  -  |
| **404** | A owner could not be identified by the given system id. |  -  |


## ownersPost

> ownersPost(ownerRequest)



Register a new owner in the registry.

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
        defaultClient.setBasePath("http://localhost");

        OwnerApi apiInstance = new OwnerApi(defaultClient);
        OwnerRequest ownerRequest = new OwnerRequest(); // OwnerRequest | 
        try {
            apiInstance.ownersPost(ownerRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling OwnerApi#ownersPost");
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
| **ownerRequest** | [**OwnerRequest**](OwnerRequest.md)|  | [optional] |

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
| **200** | Successfully registered the owner. |  -  |

