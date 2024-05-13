# ContactApi

All URIs are relative to *http://poosd.com/api/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**pHPCreateContactPhpPost**](ContactApi.md#pHPCreateContactPhpPost) | **POST** /PHP/createContact.php | Create a new contact |
| [**pHPDeleteContactPhpDelete**](ContactApi.md#pHPDeleteContactPhpDelete) | **DELETE** /PHP/deleteContact.php | Delete a contact |
| [**pHPSearchContactPhpGet**](ContactApi.md#pHPSearchContactPhpGet) | **GET** /PHP/searchContact.php | Search for a contact |
| [**pHPUpdateContactPhpPut**](ContactApi.md#pHPUpdateContactPhpPut) | **PUT** /PHP/updateContact.php | Update a contact |



## pHPCreateContactPhpPost

> pHPCreateContactPhpPost(phPCreateContactPhpPostRequest)

Create a new contact

This endpoint allows for the creation of a new contact by providing the necessary details.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://poosd.com/api/v1");

        ContactApi apiInstance = new ContactApi(defaultClient);
        PHPCreateContactPhpPostRequest phPCreateContactPhpPostRequest = new PHPCreateContactPhpPostRequest(); // PHPCreateContactPhpPostRequest | 
        try {
            apiInstance.pHPCreateContactPhpPost(phPCreateContactPhpPostRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactApi#pHPCreateContactPhpPost");
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
| **phPCreateContactPhpPostRequest** | [**PHPCreateContactPhpPostRequest**](PHPCreateContactPhpPostRequest.md)|  | |

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
| **200** | The contact has been successfully created. |  -  |


## pHPDeleteContactPhpDelete

> pHPDeleteContactPhpDelete(id)

Delete a contact

This endpoint allows for the deletion of a contact by providing the contact&#39;s ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://poosd.com/api/v1");

        ContactApi apiInstance = new ContactApi(defaultClient);
        Integer id = 56; // Integer | The ID of the contact to be deleted.
        try {
            apiInstance.pHPDeleteContactPhpDelete(id);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactApi#pHPDeleteContactPhpDelete");
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
| **id** | **Integer**| The ID of the contact to be deleted. | |

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
| **200** | The contact has been successfully deleted. |  -  |


## pHPSearchContactPhpGet

> pHPSearchContactPhpGet(searchquery, userid)

Search for a contact

This endpoint allows users to search for a contact by providing a search query and user ID.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://poosd.com/api/v1");

        ContactApi apiInstance = new ContactApi(defaultClient);
        String searchquery = "searchquery_example"; // String | The query used to search for the contact.
        String userid = "userid_example"; // String | The user ID associated with the contact.
        try {
            apiInstance.pHPSearchContactPhpGet(searchquery, userid);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactApi#pHPSearchContactPhpGet");
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
| **searchquery** | **String**| The query used to search for the contact. | |
| **userid** | **String**| The user ID associated with the contact. | |

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
| **200** | The search results have been returned. |  -  |


## pHPUpdateContactPhpPut

> pHPUpdateContactPhpPut(phPUpdateContactPhpPutRequest)

Update a contact

This endpoint allows users to update the details of an existing contact by providing the new information.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.ContactApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://poosd.com/api/v1");

        ContactApi apiInstance = new ContactApi(defaultClient);
        PHPUpdateContactPhpPutRequest phPUpdateContactPhpPutRequest = new PHPUpdateContactPhpPutRequest(); // PHPUpdateContactPhpPutRequest | 
        try {
            apiInstance.pHPUpdateContactPhpPut(phPUpdateContactPhpPutRequest);
        } catch (ApiException e) {
            System.err.println("Exception when calling ContactApi#pHPUpdateContactPhpPut");
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
| **phPUpdateContactPhpPutRequest** | [**PHPUpdateContactPhpPutRequest**](PHPUpdateContactPhpPutRequest.md)|  | |

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
| **200** | The contact has been successfully updated. |  -  |

