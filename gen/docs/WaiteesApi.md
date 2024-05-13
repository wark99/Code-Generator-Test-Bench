# WaiteesApi

All URIs are relative to *http://api.dodays.test/v1*

| Method | HTTP request | Description |
|------------- | ------------- | -------------|
| [**deleteWaitee**](WaiteesApi.md#deleteWaitee) | **DELETE** /waitees/{inviteCode} | Delete a waitee |
| [**getWaitee**](WaiteesApi.md#getWaitee) | **GET** /waitees/{inviteCode} | Get a waitee |
| [**postWaitee**](WaiteesApi.md#postWaitee) | **POST** /waitees | Create a waitee |



## deleteWaitee

> deleteWaitee(inviteCode)

Delete a waitee

Delete a waitee.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WaiteesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        WaiteesApi apiInstance = new WaiteesApi(defaultClient);
        String inviteCode = "inviteCode_example"; // String | 
        try {
            apiInstance.deleteWaitee(inviteCode);
        } catch (ApiException e) {
            System.err.println("Exception when calling WaiteesApi#deleteWaitee");
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
| **inviteCode** | **String**|  | |

### Return type

null (empty response body)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: Not defined


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **204** | Waitee deleted. |  -  |


## getWaitee

> GetWaitee200Response getWaitee(inviteCode)

Get a waitee

Retrieve the waitee.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WaiteesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");

        WaiteesApi apiInstance = new WaiteesApi(defaultClient);
        String inviteCode = "inviteCode_example"; // String | 
        try {
            GetWaitee200Response result = apiInstance.getWaitee(inviteCode);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WaiteesApi#getWaitee");
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
| **inviteCode** | **String**|  | |

### Return type

[**GetWaitee200Response**](GetWaitee200Response.md)

### Authorization

No authorization required

### HTTP request headers

- **Content-Type**: Not defined
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Returns a Waitee object. |  -  |
| **404** | Waitee not found. |  -  |


## postWaitee

> PostWaitee200Response postWaitee(postWaiteeRequest)

Create a waitee

Create a new waitee.

### Example

```java
// Import classes:
import org.openapitools.client.ApiClient;
import org.openapitools.client.ApiException;
import org.openapitools.client.Configuration;
import org.openapitools.client.auth.*;
import org.openapitools.client.models.*;
import org.openapitools.client.api.WaiteesApi;

public class Example {
    public static void main(String[] args) {
        ApiClient defaultClient = Configuration.getDefaultApiClient();
        defaultClient.setBasePath("http://api.dodays.test/v1");
        
        // Configure HTTP bearer authorization: Authorization
        HttpBearerAuth Authorization = (HttpBearerAuth) defaultClient.getAuthentication("Authorization");
        Authorization.setBearerToken("BEARER TOKEN");

        WaiteesApi apiInstance = new WaiteesApi(defaultClient);
        PostWaiteeRequest postWaiteeRequest = new PostWaiteeRequest(); // PostWaiteeRequest | Creates a new waitee. If a user is signed in, `students.id` is required and the waitee will be associated to the authenticated user. If no user is signed in, `first_name`, `last_name`, `email`, `telephone`, `students.first_name` and `students.last_name` are required.
        try {
            PostWaitee200Response result = apiInstance.postWaitee(postWaiteeRequest);
            System.out.println(result);
        } catch (ApiException e) {
            System.err.println("Exception when calling WaiteesApi#postWaitee");
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
| **postWaiteeRequest** | [**PostWaiteeRequest**](PostWaiteeRequest.md)| Creates a new waitee. If a user is signed in, &#x60;students.id&#x60; is required and the waitee will be associated to the authenticated user. If no user is signed in, &#x60;first_name&#x60;, &#x60;last_name&#x60;, &#x60;email&#x60;, &#x60;telephone&#x60;, &#x60;students.first_name&#x60; and &#x60;students.last_name&#x60; are required. | [optional] |

### Return type

[**PostWaitee200Response**](PostWaitee200Response.md)

### Authorization

[Authorization](../README.md#Authorization)

### HTTP request headers

- **Content-Type**: application/json
- **Accept**: application/json


### HTTP response details
| Status code | Description | Response headers |
|-------------|-------------|------------------|
| **200** | Waitee created. |  -  |

